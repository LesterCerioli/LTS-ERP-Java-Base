package com.lts.ltsmscore.domain;

import com.lts.ltsmscore.infrastructure.models.EntityBase;

import java.util.List;

public class Customer extends EntityBase {

    public String firstName;

    public String middleName;

    public String lastName;

    public List<CustomerAddress> CustomerAddresses;



}
