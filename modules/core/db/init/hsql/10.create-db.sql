-- begin CECEWPA_CUSTOMER
create table CECEWPA_CUSTOMER (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CECEWPA_CUSTOMER
-- begin CECEWPA_PRODUCT_CATEGORY
create table CECEWPA_PRODUCT_CATEGORY (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CECEWPA_PRODUCT_CATEGORY
-- begin CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION
create table CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_CATEGORY_ID varchar(36) not null,
    EVALUATION integer not null,
    CUSTOMER_EVALUATION_ID varchar(36),
    --
    primary key (ID)
)^
-- end CECEWPA_CUSTOMER_PRODUCT_CATEGORY_EVALUATION
-- begin CECEWPA_CUSTOMER_EVALUATION
create table CECEWPA_CUSTOMER_EVALUATION (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36) not null,
    COMMENT_ longvarchar,
    --
    primary key (ID)
)^
-- end CECEWPA_CUSTOMER_EVALUATION
