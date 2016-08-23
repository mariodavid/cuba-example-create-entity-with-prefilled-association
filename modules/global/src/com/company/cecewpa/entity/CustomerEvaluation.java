package com.company.cecewpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "CECEWPA_CUSTOMER_EVALUATION")
@Entity(name = "cecewpa$CustomerEvaluation")
public class CustomerEvaluation extends StandardEntity {
    private static final long serialVersionUID = 1391084045736806643L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "customerEvaluation")
    protected Set<CustomerProductCategoryEvaluation> productCategorieEvaluations;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setProductCategorieEvaluations(Set<CustomerProductCategoryEvaluation> productCategorieEvaluations) {
        this.productCategorieEvaluations = productCategorieEvaluations;
    }

    public Set<CustomerProductCategoryEvaluation> getProductCategorieEvaluations() {
        return productCategorieEvaluations;
    }


}