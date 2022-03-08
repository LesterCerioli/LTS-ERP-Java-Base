package com.lts.ltsmscore.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Column;

import com.lts.ltsmscore.infrastructure.models.EntityBase;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;




public class Address extends EntityBase {


    @StringLength(450)
    public String contactName;

    @StringLength(450)
    public String phone;

    @StringLength(450)
    public String addressLine1;

    @StringLength(450)
    public String addressLine2;

    @StringLength(450)
    public String city;

    @StringLength(20)
    public String zipCode;

    public long DistrictId;

    public District district;

    public long StateOrProvinceId;

    public StateOrProvince stateOrProvince;

    public StateOrProvincservices:

    public long CountryId;

    public Address(String contactName, String phone, String addressLine1, String city, String zipCode) {
        this.contactName = contactName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public long getDistrictId() {
        return districtId;
    }

    public District getDistrict() {
        return district;
    }

    public long getStateOrProvinceId() {
        return stateOrProvinceId;
    }

    public StateOrProvince getStateOrProvince() {
        return stateOrProvince;
    }

    public long getCountryId() {
        return CountryId;
    }
}
