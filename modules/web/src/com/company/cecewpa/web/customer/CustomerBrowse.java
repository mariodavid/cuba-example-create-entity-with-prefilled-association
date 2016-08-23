package com.company.cecewpa.web.customer;

import com.company.cecewpa.entity.Customer;
import com.company.cecewpa.entity.CustomerEvaluation;
import com.company.cecewpa.entity.CustomerProductCategoryEvaluation;
import com.company.cecewpa.entity.ProductCategory;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Table;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerBrowse extends AbstractLookup {

    @Inject
    Metadata metadata;

    @Inject
    DataManager dataManager;


    @Inject
    Table<Customer> customersTable;

    public void createCustomerEvaluation() {

        Customer customer = customersTable.getSingleSelected();
        CustomerEvaluation customerEvaluation = metadata.create(CustomerEvaluation.class);

        LoadContext loadContext = LoadContext.create(ProductCategory.class)
                .setQuery(LoadContext.createQuery("select e from cecewpa$ProductCategory e"));

        List<ProductCategory> productCategoryList = dataManager.loadList(loadContext);

        Set<CustomerProductCategoryEvaluation> customerProductCategoryEvaluationSet = new HashSet<CustomerProductCategoryEvaluation>();

        for (ProductCategory productCategory : productCategoryList) {
            CustomerProductCategoryEvaluation customerProductCategoryEvaluation = metadata.create(CustomerProductCategoryEvaluation.class);
            customerProductCategoryEvaluation.setProductCategory(productCategory);
            customerProductCategoryEvaluation.setCustomerEvaluation(customerEvaluation);

            customerProductCategoryEvaluationSet.add(customerProductCategoryEvaluation);
        }

        customerEvaluation.setComment("This is a customer evaluation from " + customer.getName());
        customerEvaluation.setCustomer(customer);
        customerEvaluation.setProductCategorieEvaluations(customerProductCategoryEvaluationSet);

        openEditor(customerEvaluation, WindowManager.OpenType.DIALOG);
    }


    public void createCustomerEvaluationTwo() {

        //openEditor(, WindowManager.OpenType.DIALOG);
    }
}