package com.lts.ltsmscore.domain;



import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Column;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


public class AppSetting extends EntityBaseWithTypedId<string> {

    @StringLength(450)
    private final String value;

    @StringLength(450)
    private final String module;

    private final boolean isVisibleInCommonSettingPage;

    public AppSetting(string id, String value, String module, boolean isVisibleInCommonSettingPage) {
        this.id = id;
        this.value = value;
        this.module = module;
        this.isVisibleInCommonSettingPage = isVisibleInCommonSettingPage;
    }

    public String getValue() {
        return value;
    }

    public String getModule() {
        return module;
    }

    public boolean isVisibleInCommonSettingPage() {
        return isVisibleInCommonSettingPage;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public void setVisibleInCommonSettingPage(boolean visibleInCommonSettingPage) {
        isVisibleInCommonSettingPage = visibleInCommonSettingPage;
    }
}
