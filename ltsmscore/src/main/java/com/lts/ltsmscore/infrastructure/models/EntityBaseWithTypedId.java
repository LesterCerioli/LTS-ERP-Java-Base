package com.lts.ltsmscore.infrastructure.models;

import com.lts.ltsmscore.infrastructure.models.EntityBaseWithTypedId;


public abstract class EntityBaseWithTypedId<TId>  extends ValidatableObject, IEntityWithTypedId<TId> {

    public virtual TId Id;

    public virtual getTId() {
        return TId;
    }

    public void setTId(virtual TId) {
        this.TId = TId;
    }
}
