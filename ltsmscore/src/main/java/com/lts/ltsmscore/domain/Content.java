package com.lts.ltsmscore.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Column;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;



public abstract class Content extends EntityBase {

    private boolean isDeleted;

    protected Content() {
        CreatedOn = DateTimeOffset.Now;
        LatestUpdatedOn = DateTimeOffset.Now;
    }

    @Required(ErrorMessage="The {0} field is required.")
    @StringLength(450)
    private String name;

    @Required(ErrorMessage="The {0} field is required.")
    @StringLength(450)
    private String slug;

    @StringLength(450)
    private String metaTitle;

    @StringLength(450)
    private String metaKeyWords;

    private String metaDescription;

    private final boolean isPublished;

    public final DateTimeOffset? PublishedOn;

    public final boolean IsDeleted {
        get {
            return this.isDeleted;
        }
        set {
            this.isDeleted = value;
            if (value) {
                this.IsPublished = false;
            }

        }
    }

    private long createdById;

    private final User CreatedBy;

    private final DateTimeOffset createdOn;

    private final DateTimeOffset latestUpdatedOn;

    private final long latestUpdatedById;

    private User latestUpdatedBy;


}
