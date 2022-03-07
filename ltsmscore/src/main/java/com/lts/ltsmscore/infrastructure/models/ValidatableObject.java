package com.lts.ltsmscore.infrastructure.models/

    public abstract class ValidatableObject {

    public virtual boolean IsValid() {
        return (this.Validate().Count == 0);
    }

    public virtual IList<ValidationResult> Validate() {
        IList<ValidationResult> validationResults = new List<ValidationResult>();
        Validator.TryValidateObject(this, new ValidationContext(this, null, null), validationResults, true);
        return validationResults;
    }
}
