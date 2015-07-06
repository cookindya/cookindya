/* *************************************************************************************** */

/* TABLE USER REGISTRATION */

CREATE TABLE CI_USER_REGISTRATION(
USER_REGISTRATION_ID INT NOT NULL,
USER_NAME VARCHAR(60),
PASSWORD  VARCHAR(60),
START_DATE DATE,
EXPIRY DATE,
BLOCKED VARCHAR(10),
IS_ADMIN VARCHAR(10),
CONSTRAINT pk_user_registration_id PRIMARY KEY(USER_REGISTRATION_ID)
);


INSERT INTO CI_USER_REGISTRATION values(100000,'UDAY','UDAY','2015-06-29','2017-06-29','N','Y');
INSERT INTO CI_USER_REGISTRATION values(100001,'PRITISH','PRITISH','2015-06-29','2017-06-29','N','Y');
INSERT INTO CI_USER_REGISTRATION values(100002,'PRABATH','PRABATH','2015-06-29','2017-06-29','N','Y');


/******************************************************/

/* TABLE DIET  */

CREATE TABLE CI_DIET(
 DIET_ID INT NOT NULL,
 DESCRIPTION VARCHAR(200),
 CONSTRAINT pk_diet_id PRIMARY KEY(DIET_ID)
);


INSERT INTO CI_DIET values ( 10101, 'Veg' );
INSERT INTO CI_DIET values ( 10102, 'Jain Veg' );
INSERT INTO CI_DIET values ( 10103, 'Vegan' );
INSERT INTO CI_DIET values ( 10104, 'Chicken' );	
INSERT INTO CI_DIET values ( 10105, 'Sea Food' );

/***********************************************************/

/* TABLE USER KITCHEN */ 

CREATE TABLE CI_USER_KITCHEN(
KITCHEN_ID INT NOT NULL,
CERTIFIED VARCHAR(10),
START_DATE DATE,
END_DATE DATE,
CERTIFIED_BY VARCHAR(50),
CONSTRAINT pk_kitchen_id PRIMARY KEY(KITCHEN_ID)
);

INSERT INTO CI_USER_KITCHEN Values(10000,'Y','2015-04-29','2015-05-29','UDAY');
INSERT INTO CI_USER_KITCHEN Values(10001,'Y','2015-04-29','2015-05-29','PRITISH');
INSERT INTO CI_USER_KITCHEN Values(10002,'Y','2015-04-29','2015-05-29','PRABAT');

/******************************************************************/

/* TABLE RATING */

CREATE TABLE CI_RATING(
RATING_ID INT NOT NULL,
HYGIENE INT,
TASTE INT,
FRESHNESS INT,
DELIVERY INT,
CONSTRAINT pk_rating_id PRIMARY KEY(RATING_ID)
);


INSERT INTO CI_RATING values(20000,7,7,6,5);
INSERT INTO CI_RATING values(20001,5,7,4,5);
INSERT INTO CI_RATING values(20002,8,2,6,7);

/*******************************************************************/

/* TABLE ADDRESS */

CREATE TABLE CI_ADDRESS(
ADDRESS_ID INT NOT NULL,
BILLING VARCHAR(200),
SHIPPING_ADDR1 VARCHAR(200),
SHIPPING_ADDR2 VARCHAR(200),
SHIPPING_ADDR3 VARCHAR(200),
SHIPPING_ADDR4 VARCHAR(200),
SHIPPING_ADDR5 VARCHAR(200),
SHIPPING_ADDR6 VARCHAR(200),
SHIPPING_ADDR7 VARCHAR(200),
SHIPPING_ADDR8 VARCHAR(200),
SHIPPING_ADDR9 VARCHAR(200),
SHIPPING_ADDR10 VARCHAR(200),
CONSTRAINT pk_address_id PRIMARY KEY(ADDRESS_ID)
);


INSERT INTO CI_ADDRESS values(30000,'TEST ADR','TEST ADR','TEST ADR','TEST ADR','TEST ADR',
'TEST ADR','TEST ADR','TEST ADR','TEST ADR','TEST ADR','TEST ADR');


INSERT INTO CI_ADDRESS values(30001,'TEST ADR2','TEST ADR2','TEST ADR2','TEST ADR2','TEST ADR2',
'TEST ADR2','TEST ADR2','TEST ADR2','TEST ADR2','TEST ADR2','TEST ADR2');


/********************************************************************************/

/* TABLE PAYMENT TYPES */

CREATE TABLE CI_PAYMENT_TYPES(
PAYMENT_TYPE_ID INT NOT NULL,
THIRD_PARTY VARCHAR(60),
CASH_ON_DELIVERY VARCHAR(60),
MEAL_COUPN VARCHAR(60),
CONSTRAINT pk_payment_type_id PRIMARY KEY(PAYMENT_TYPE_ID)
);

INSERT INTO CI_PAYMENT_TYPES Values(40000,'pay-u','N','N');
INSERT INTO CI_PAYMENT_TYPES Values(40001,'N','Y','N');
INSERT INTO CI_PAYMENT_TYPES Values(40002,'N','N','Sodexo');

/**************************************************************************************/

/* TABLE USER ROLES */

CREATE TABLE CI_USER_ROLES(
ROLE_ID INT NOT NULL,
DESCRIPTION VARCHAR(100),
CONSTRAINT pk_role_id PRIMARY KEY(ROLE_ID)
);

INSERT INTO CI_USER_ROLES Values(100,'ADMIN');
INSERT INTO CI_USER_ROLES Values(101,'SUPER_ADMIN');

/***************************************************************************************/

/* TABLE CATEGORY */

CREATE TABLE CI_CATEGORY(
CATEGORY_ID INT NOT NULL,
CATEGORY VARCHAR(100),
CONSTRAINT pk_category_id PRIMARY KEY(CATEGORY_ID)
); 

INSERT INTO CI_CATEGORY Values(200,'SOUTH');
INSERT INTO CI_CATEGORY Values(201,'NORTH');
INSERT INTO CI_CATEGORY Values(202,'INDIAN');
INSERT INTO CI_CATEGORY Values(203,'CHINEESE');

/*****************************************************************************/

/* TABLE FAME */

CREATE TABLE CI_FAME(
FAME_ID INT NOT NULL,
QUOTIENT VARCHAR(100),
POINTS INT,
CONSTRAINT pk_fame_id PRIMARY KEY(FAME_ID)
);

INSERT INTO CI_FAME values(50000,'TEST1',1000);
INSERT INTO CI_FAME values(50001,'TEST2',900);
INSERT INTO CI_FAME values(50002,'TEST3',500);

/****************************************************************/

/* TABLE AUTHORIZATION */


CREATE TABLE CI_AUTHORIZATION(
AUTHORIZATION_ID INT NOT NULL,
USER_REG_ID INT,
ROLE_ID INT,
PRIMARY KEY(AUTHORIZATION_ID),
FOREIGN KEY(USER_REG_ID) REFERENCES CI_USER_REGISTRATION(USER_REGISTRATION_ID),
FOREIGN KEY(ROLE_ID) REFERENCES CI_USER_ROLES(ROLE_ID)
);


INSERT INTO CI_AUTHORIZATION Values(200000,100000,100);
INSERT INTO CI_AUTHORIZATION Values(200001,100001,101);


/***************************************************************************/


/* TABLE BILL */


CREATE TABLE CI_BILL(
BILL_ID INT NOT NULL,
QUANTITY INT,
DISCOUNT INT,
TAX INT,
ADDRESS_ID INT,
TOTAL_PAYABLE INT,
PAYMENT_ID INT,
PRIMARY KEY(BILL_ID),
FOREIGN KEY(ADDRESS_ID) REFERENCES CI_ADDRESS(ADDRESS_ID),
FOREIGN KEY(PAYMENT_ID) REFERENCES CI_PAYMENT_TYPES(PAYMENT_TYPE_ID)
);

INSERT INTO CI_BILL VALUES(60000,2,14,15,30000,500,40001);
INSERT INTO CI_BILL VALUES(60001,3,10,11,30001,500,40002);


/**************************************************************/



/* TABLE RECIPE */

CREATE TABLE CI_RECIPE(
RECIPE_ID INT NOT NULL,
RECIPE_NAME VARCHAR(50),
RECIPE_PRICE INT,
RECIPE_DIET INT,
RECIPE_INGREDIENTS VARCHAR(200),
RECIPE_IMAGE MEDIUMBLOB,
RECIPE_ADDED_BY INT ,
RECIPE_ADDED_ON DATE,
PRIMARY KEY(RECIPE_ID),
FOREIGN KEY(RECIPE_DIET) REFERENCES CI_DIET(DIET_ID),
FOREIGN KEY(RECIPE_ADDED_BY) REFERENCES CI_USER_REGISTRATION(USER_REGISTRATION_ID)
);


INSERT INTO CI_RECIPE VALUES(70000,'PAKODA',20,10101,'ONIONS ETC','TEST BYTE CODE',100000,'2015-06-06');
INSERT INTO CI_RECIPE VALUES(70001,'KOVA',100,10101,'SWEET','TEST BYTE CODE',100001,'2015-03-06');


/*****************************************************************************/


/* TABLE REFERRAL */

CREATE TABLE CI_REFERRAL(
REFERRAL_ID INT NOT NULL,
REFERRED_BY INT,
REFERRED_ON DATE,
PRIMARY KEY(REFERRAL_ID),
FOREIGN KEY(REFERRED_BY) REFERENCES CI_USER_REGISTRATION(USER_REGISTRATION_ID)
);

INSERT INTO CI_REFERRAL VALUES(5000,100000,'2015-02-02');
INSERT INTO CI_REFERRAL VALUES(5001,100001,'2015-03-05');


/******************************************************************/

/* TABLE WALLET */

CREATE TABLE CI_WALLET(
WALLET_ID INT NOT NULL,
USER_ID INT,
BALANCE INT,
PRIMARY KEY(WALLET_ID),
FOREIGN KEY(USER_ID) REFERENCES CI_USER_REGISTRATION(USER_REGISTRATION_ID)
);

INSERT INTO CI_WALLET VALUES(70000,100000,2000);
INSERT INTO CI_WALLET VALUES(70001,100001,500);


/***********************************************************************/


/* TABLE FAVOURITIES */


CREATE TABLE CI_FAVOURITIES(
FAVOURITE_ID INT NOT NULL,
RECIPE_ID INT,
USER_ID INT,
PRIMARY KEY(FAVOURITE_ID),
FOREIGN KEY(RECIPE_ID) REFERENCES CI_RECIPE(RECIPE_ID),
FOREIGN KEY(USER_ID) REFERENCES CI_USER_REGISTRATION(USER_REGISTRATION_ID)
);


INSERT INTO CI_FAVOURITIES VALUES(65000,70000,100000);
INSERT INTO CI_FAVOURITIES VALUES(65001,70001,100001);

/****************************************************************************/

/* TABLE OFFERS */
 
CREATE TABLE CI_OFFERS(
OFFER_ID INT NOT NULL,
OFFER_CODE VARCHAR(30),
CATEGORY VARCHAR(30),
PERCENTAGE INT,
CASH INT,
RECIPE_ID INT,
PRIMARY KEY(OFFER_ID),
FOREIGN KEY(RECIPE_ID) REFERENCES CI_RECIPE(RECIPE_ID)
);


INSERT INTO CI_OFFERS VALUES(75000,'CIOF001','TEST',20,100,70000);
INSERT INTO CI_OFFERS VALUES(75001,'CIOF002','TEST2',40,800,70001);


/****************************************************************************/

/* TABLE COUPON */

CREATE TABLE CI_COUPON(
COUPON_ID INT NOT NULL,
COUPON_CODE VARCHAR(20),
START_DATE DATE,
END_DATE DATE,
OFFER_ID INT,
PRIMARY KEY(COUPON_ID),
FOREIGN KEY(OFFER_ID) REFERENCES CI_OFFERS(OFFER_ID)
);


INSERT INTO CI_COUPON VALUES(45000,'CICPN001','2105-05-01','2015-06-09',75000);
INSERT INTO CI_COUPON VALUES(45001,'CICPN002','2105-04-05','2015-07-10',75001);



/*****************************************************************************/


/* TABLE FEEDBACK */


CREATE TABLE CI_FEEDBACK(
FEEDBACK_ID INT NOT NULL,
RATING_ID INT,
COMMENT VARCHAR(200),
FEED_BACK_BY INT,
FEED_BACK_ON DATE,
RECIPE_ID INT,
PRIMARY KEY(FEEDBACK_ID),
FOREIGN KEY(FEED_BACK_BY) REFERENCES CI_USER_REGISTRATION(USER_REGISTRATION_ID),
FOREIGN KEY(RECIPE_ID) REFERENCES CI_RECIPE(RECIPE_ID),
FOREIGN KEY(RATING_ID) REFERENCES CI_RATING(RATING_ID)
);


INSERT INTO CI_FEEDBACK VALUES(85000,20000,'VERY GOOD',100000,'2105-05-01',70000);
INSERT INTO CI_FEEDBACK VALUES(85001,20001,'AWSOME',100001,'2105-05-01',70001);


/************************************************************************************/


/* TABLE ORDER  */

CREATE TABLE CI_ORDER(
ORDER_ID INT NOT NULL,
ORDERED_RECIPE INT,
ORDERED_BY INT,
SELLER_ID INT,
BILL_ID INT,
COUPON_ID INT,
REQUEST_DESC VARCHAR(200),
PRIMARY KEY(ORDER_ID),
FOREIGN KEY(ORDERED_RECIPE) REFERENCES CI_RECIPE(RECIPE_ID),
FOREIGN KEY(ORDERED_BY) REFERENCES CI_USER_REGISTRATION(USER_REGISTRATION_ID),
FOREIGN KEY(BILL_ID) REFERENCES CI_BILL(BILL_ID),
FOREIGN KEY(COUPON_ID) REFERENCES CI_COUPON(COUPON_ID)
);


INSERT INTO CI_ORDER VALUES(950000,70000,100000,100000,60000,45000,'ADD MORE SUGAR');
INSERT INTO CI_ORDER VALUES(950001,70001,100001,100000,60001,45001,'ADD MORE CHILLI');


/**********************************************************************************/


/* TABLE DELIVERY */ 


CREATE TABLE CI_DELIVERY(
DELIVERY_ID INT NOT NULL,
DELIVERED_BY VARCHAR(200),
DELIVERED_ON DATE,
ORDER_ID INT,
PRIMARY KEY(DELIVERY_ID),
FOREIGN KEY(ORDER_ID) REFERENCES  CI_ORDER(ORDER_ID)
);


INSERT INTO CI_DELIVERY VALUES(350000,'DELIVER','2015-05-06',950000);
INSERT INTO CI_DELIVERY VALUES(350001,'SWIGGY','2015-01-07',950001);


/*****************************************************************************/



/* TABLE USER INFO */

CREATE TABLE CI_USER_INFO(
USER_INFO_ID INT NOT NULL,
USER_NAME VARCHAR(100),
USER_REG_ID INT,
USER_ADDRESS INT,
PH_NUM_PRIMARY INT,
PH_NUM_SECONDARY INT,
FEEDBACK_ID INT,
FAME_ID INT,
KITCHEN_ID INT,
IS_SELLER VARCHAR(10),
IS_MOBILE_APP_USER VARCHAR(10),
PREFERRED_SHIPPING VARCHAR(220),
PRIMARY KEY(USER_INFO_ID),
FOREIGN KEY(USER_REG_ID) REFERENCES CI_USER_REGISTRATION(USER_REGISTRATION_ID),
FOREIGN KEY(USER_ADDRESS) REFERENCES CI_ADDRESS(ADDRESS_ID),
FOREIGN KEY(FEEDBACK_ID) REFERENCES  CI_FEEDBACK(FEEDBACK_ID),
FOREIGN KEY(FAME_ID) REFERENCES CI_FAME(FAME_ID),
FOREIGN KEY(KITCHEN_ID) REFERENCES CI_USER_KITCHEN(KITCHEN_ID)
);


INSERT INTO CI_USER_INFO VALUES(650000,'UDAY',100000,30000,1234567891,1234567891,85000,50000,10000,'Y','Y','BANGALORE');
INSERT INTO CI_USER_INFO VALUES(650001,'PRITISH',100001,30001,1234561111,1234567891,85001,50001,10001,'Y','Y','BANGALORE');


/************************************************************************************************/

