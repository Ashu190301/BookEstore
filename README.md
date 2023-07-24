# Book-E-Store
# A Simple Online Book Store With Features
- Login/Logout
- Redgistration
- Search
- Add to Cart
- Order

# Used Language / Frameworks
- Java
- Mavan
- Spring
- Thymleaf
- MySQL Workbanch

# MySQL DATABASE Tables

-- create table customer (
-- fname varchar(50),
-- lname varchar(50),
-- addrs varchar(50),
-- email varchar(50) PRIMARY KEY,
-- pass varchar(50)
-- );

-- create table book (
-- barcode varchar(50) PRIMARY KEY,
-- bookname varchar(50),
-- author varchar(20),
-- price decimal(10,2),
-- quantity int
-- );

-- create table Cart (
-- cartId varchar(50) PRIMARY KEY,
-- bookname varchar(50),
-- author varchar(20),
-- price decimal(10,2),
-- quantity int
-- );

-- create table orderbook(
-- serial_no int NOT NULL auto_increment,
-- email varchar(50),
-- barcode varchar(50),
-- bookname varchar(50),
-- author varchar(50),
-- quantity int NOT NULL,
-- primary key (serial_no),
-- foreign key (barcode) references book(barcode),
-- FOREIGN KEY (email) REFERENCES customer(email)
-- );

-- alter table orderbook add column orderdate date;
-- alter table orderbook add column deliverydate date;
-- alter table orderbook add column ordertime time;


