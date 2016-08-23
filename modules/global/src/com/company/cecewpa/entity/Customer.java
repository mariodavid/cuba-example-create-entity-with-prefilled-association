package com.company.cecewpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "CECEWPA_CUSTOMER")
@Entity(name = "cecewpa$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 4188125240583431656L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}