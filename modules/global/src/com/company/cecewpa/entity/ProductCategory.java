package com.company.cecewpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "CECEWPA_PRODUCT_CATEGORY")
@Entity(name = "cecewpa$ProductCategory")
public class ProductCategory extends StandardEntity {
    private static final long serialVersionUID = 2585205069160492035L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}