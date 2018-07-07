package com.yourname.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer {

    @EmbeddedId
    private CompoundedKey compoundedKey;


    public CompoundedKey getCompoundedKey() {
        return compoundedKey;
    }

    public void setCompoundedKey(CompoundedKey compoundedKey) {
        this.compoundedKey = compoundedKey;
    }

    public Customer(){

    }
    public Customer(CompoundedKey compoundedKey) {
        this.compoundedKey = compoundedKey;
    }
}