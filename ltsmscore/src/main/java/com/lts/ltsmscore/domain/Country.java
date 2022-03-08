package com.lts.ltsmscore.domain;

import com.lts.ltsmscore.infrastructure.models.EntityBaseWithTypedId;

import java.util.List;

public class Country extends EntityBaseWithTypedId<String> {


    private List<StateOrProvince> _states;


    private String name;

    private String code3;

    private boolean isBillingEnabled;

    private boolean isShippingEnabled;

    private boolean isZipCodeEnabled;

    public List<StateOrProvince> States;

    public Country(String id, String name, String code3, boolean isBillingEnabled, boolean isShippingEnabled, boolean isZipCodeEnabled, List<StateOrProvince> states) {
        this.id = id;
        this.name = name;
        this.code3 = code3;
        this.isBillingEnabled = isBillingEnabled;
        this.isShippingEnabled = isShippingEnabled;
        this.isZipCodeEnabled = isZipCodeEnabled;


    }

    public String getName() {
        return name;
    }

    public String getCode3() {
        return code3;
    }

    public boolean isBillingEnabled() {
        return isBillingEnabled;
    }

    public boolean isShippingEnabled() {
        return isShippingEnabled;
    }

    public boolean isZipCodeEnabled() {
        return isZipCodeEnabled;
    }

    public List<StateOrProvince> getStates() {
        return States;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    public void setBillingEnabled(boolean billingEnabled) {
        isBillingEnabled = billingEnabled;
    }

    public void setShippingEnabled(boolean shippingEnabled) {
        isShippingEnabled = shippingEnabled;
    }

    public void setZipCodeEnabled(boolean zipCodeEnabled) {
        isZipCodeEnabled = zipCodeEnabled;
    }


}
