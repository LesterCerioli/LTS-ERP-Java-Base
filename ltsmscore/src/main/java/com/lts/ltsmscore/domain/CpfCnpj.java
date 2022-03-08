package com.lts.ltsmscore.domain;

import com.lts.ltsmscore.infrastructure.models.EntityBase;
import com.lts.ltsmscore.infrastructure.models.EntityBase;

public class CpfCnpj extends EntityBase {

    public CpfCnpj(String cpf, String cnpj) {
        this.cpf = cpf;
        this.cnpj = cnpj;
    }

    public static boolean isValid(String cpf, String cnpj)
    {
        return (IsCpf(cpf) || IsCnpj(cnpj));
    }





}
