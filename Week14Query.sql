drop table login;
drop table studentregn;
create table studentRegn
(
id int primary key auto_increment,
userName varchar(50),
password varchar(50),
studentName varchar(50),
studentAddress varchar(150),
parentMobile varchar(20),
parentFname varchar(50),
parentMname varchar(50),
studentEmail varchar(50),
grade varchar(10),
section varchar(10),
gender varchar(10),
hobbies varchar(150)
);
create table Login
(
id int primary key auto_increment,
userName varchar(100),
password varchar(100)
);