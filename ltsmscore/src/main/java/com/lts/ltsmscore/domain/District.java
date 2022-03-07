package com.lts.ltsmscore.domain;

import java.util.Date;

public class District extends EntityBase {

    public long stateOrProvinceId;

    private StateOrProvince states;

    private String name;

    private String type;

    private String location;

    public District(long id, long stateOrProvinceId, StateOrProvince states, String name, String type, String location) {
        this.id = Id;
        this.stateOrProvinceId = stateOrProvinceId;
        this.states = states;
        this.name = name;
        this.type = type;
        this.location = location;
    }

    public long getStateOrProvinceId() {
        return stateOrProvinceId;
    }

    public StateOrProvince getStates() {
        return states;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public void setStateOrProvinceId(long stateOrProvinceId) {
        this.stateOrProvinceId = stateOrProvinceId;
    }

    public void setStates(StateOrProvince states) {
        this.states = states;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
