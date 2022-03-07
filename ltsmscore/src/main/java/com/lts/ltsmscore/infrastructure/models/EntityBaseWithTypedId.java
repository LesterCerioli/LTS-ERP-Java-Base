package com.lts.ltsmscore.infrastructure.models/


public abstract class EntityBaseWithTypedId<TId>  extends ValidatableObject, IEntityWithTypedId<TId> {

    public virtual TId Id {
        get {
        }
        set {
        }
    }
}
