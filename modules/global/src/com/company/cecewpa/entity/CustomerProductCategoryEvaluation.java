package com.company.cecewpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION")
@Entity(name = "cecewpa$CustomerProductCategoryEvaluation")
public class CustomerProductCategoryEvaluation extends StandardEntity {
    private static final long serialVersionUID = 176528397775603201L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_CATEGORY_ID")
    protected ProductCategory productCategory;

    @Column(name = "EVALUATION", nullable = false)
    protected Integer evaluation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_EVALUATION_ID")
    protected CustomerEvaluation customerEvaluation;

    public void setCustomerEvaluation(CustomerEvaluation customerEvaluation) {
        this.customerEvaluation = customerEvaluation;
    }

    public CustomerEvaluation getCustomerEvaluation() {
        return customerEvaluation;
    }


    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setEvaluation(Integer evaluation) {
        this.evaluation = evaluation;
    }

    public Integer getEvaluation() {
        return evaluation;
    }


}