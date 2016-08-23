-- begin CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION
alter table CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION add constraint FK_CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION_PRODUCT_CATEGORY_ID foreign key (PRODUCT_CATEGORY_ID) references CECEWPA_PRODUCT_CATEGORY(ID)^
alter table CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION add constraint FK_CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION_CUSTOMER_EVALUATION_ID foreign key (CUSTOMER_EVALUATION_ID) references CECEWPA_CUSTOMER_EVALUATION(ID)^
create index IDX_CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION_CUSTOMER_EVALUATION on CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION (CUSTOMER_EVALUATION_ID)^
create index IDX_CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION_PRODUCT_CATEGORY on CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION (PRODUCT_CATEGORY_ID)^
-- end CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION
-- begin CECEWPA_CUSTOMER_EVALUATION
alter table CECEWPA_CUSTOMER_EVALUATION add constraint FK_CECEWPA_CUSTOMER_EVALUATION_CUSTOMER_ID foreign key (CUSTOMER_ID) references CECEWPA_CUSTOMER(ID)^
create index IDX_CECEWPA_CUSTOMER_EVALUATION_CUSTOMER on CECEWPA_CUSTOMER_EVALUATION (CUSTOMER_ID)^
-- end CECEWPA_CUSTOMER_EVALUATION
