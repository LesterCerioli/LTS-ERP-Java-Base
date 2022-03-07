package com.lts.ltsmscore.infrastructure.models/

public interface IEntityWithTypedId<TId>  {

    TId Id {
        get;
    }
}
