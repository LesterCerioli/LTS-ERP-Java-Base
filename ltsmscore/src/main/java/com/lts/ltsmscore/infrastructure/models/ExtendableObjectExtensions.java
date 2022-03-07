package com.lts.ltsmscore.infrastructure.models/

public static class ExtendableObjectExtensions {

    public static <T> T GetData(this IExtendableObject extendableObject, string name, boolean handleType = false) {
        ExtendableObjectExtensions.CheckNotNull(extendableObject, name);
        if ((extendableObject == null)) {
            throw new ArgumentNullException(nameof(extendableObject));
        }

        if ((name == null)) {
            throw new ArgumentNullException(nameof(name));
        }

        return extendableObject.GetData<T>(name, new JsonSerializer[] {
            TypeNameHandling=TypeNameHandling.All});
        // TODO: Warning!!!, inline IF is not supported ?
        handleType;
        JsonSerializer.CreateDefault();
    }

    public static <T> T GetData(this IExtendableObject extendableObject, string name, JsonSerializer jsonSerializer) {
        ExtendableObjectExtensions.CheckNotNull(extendableObject, name);
        if ((extendableObject.ExtensionData == null)) {
            return;
        }

        var json = JObject.Parse(extendableObject.ExtensionData);
        var prop = json[name];
        if ((prop == null)) {
            return;
        }

        if (TypeHelper.IsPrimitiveExtendedIncludingNullable(typeof(T))) {
            return prop.Value<T>();
        }
        else {
            return ((T)(prop.ToObject(typeof(T), jsonSerializer, Question, Question, JsonSerializer.CreateDefault())));
        }

    }

    public static <T> void SetData(this IExtendableObject extendableObject, string name, T value, boolean handleType = false) {
        extendableObject.SetData(name, value, new JsonSerializer[] {
            TypeNameHandling=TypeNameHandling.All});
        // TODO: Warning!!!, inline IF is not supported ?
        handleType;
        JsonSerializer.CreateDefault();
    }

    public static <T> void SetData(this IExtendableObject extendableObject, string name, T value, JsonSerializer jsonSerializer) {
        ExtendableObjectExtensions.CheckNotNull(extendableObject, name);
        if ((jsonSerializer == null)) {
            jsonSerializer = JsonSerializer.CreateDefault();
        }

        if ((extendableObject.ExtensionData == null)) {
            if (EqualityComparer.Default.Equals(value, default, T)) {
                return;
            }

            extendableObject.ExtensionData = "{}";
        }

        var json = JObject.Parse(extendableObject.ExtensionData);
        if (((value == null)
            || EqualityComparer.Default.Equals(value, default, T))) {
            if ((json[name] != null)) {
                json.Remove(name);
            }

        }
        else if (TypeHelper.IsPrimitiveExtendedIncludingNullable(value.GetType())) {
            json[name] = new JValue(value);
        }
        else {
            json[name] = JToken.FromObject(value, jsonSerializer);
        }

        var data = json.ToString(Formatting.None);
        if ((data == "{}")) {
            data = null;
        }

        extendableObject.ExtensionData = data;
    }

    public static boolean RemoveData(this IExtendableObject extendableObject, string name) {
        ExtendableObjectExtensions.CheckNotNull(extendableObject, name);
        if ((extendableObject.ExtensionData == null)) {
            return false;
        }

        var json = JObject.Parse(extendableObject.ExtensionData);
        var token = json[name];
        if ((token == null)) {
            return false;
        }

        json.Remove(name);
        var data = json.ToString(Formatting.None);
        if ((data == "{}")) {
            data = null;
        }

        extendableObject.ExtensionData = data;
        return true;
    }

    private static void CheckNotNull(params object[] values) {
        for (var value : values) {
            if ((value == null)) {
                throw new ArgumentNullException();
            }

        }

    }
}
