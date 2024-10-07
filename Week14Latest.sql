create database studentsdb1;
use studentsdb1;
/*
@Column(name="id")
	int id;
	
	@Column(name="employeeName")
	String employeeName;
	
	@Column(name="employeeAddress")
	String employeeAddress;
	
	@Column(name="employeePhone")
	String employeePhone;
	
	@Column(name="employeeSalary")
	int employeeSalary;
*/
create table employee
(
id int primary key auto_increment,
employeeName varchar(100),
employeeAddress varchar(150),
employeePhone varchar(50),
employeeSalary int
);
insert into employee
values(1,'Harsha','RTNagar','9838383883',10000);
use studentsdb1;
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
