package com.yourname.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompoundedKey implements Serializable {

    @Column(name = "Id")
    private int id;

    @Column(name = "Orders")
    private int orders;

    public CompoundedKey(){

    }
    public CompoundedKey(int id, int orders) {
        this.id = id;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof CompoundedKey)) return false;
        CompoundedKey that = (CompoundedKey) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getOrders(), that.getOrders());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOrders());
    }

}


