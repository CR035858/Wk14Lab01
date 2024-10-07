use studentsdb1;
/*
	int id;//text
	String userName;
	String password;
	String studentName;//text
	String studentAddress;//textarea
	String parentMobile;//text
	String parentFname;//text
	String parentMname;//text
	String studentEmail; //text
	String grade;//drop down
	String section; // drop down
	String gender;//radio
	String[] hobbies;//checkBox
*/
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

/* 
	StudentDetails
	id int primary key
	studentfName varchar
	studentlName varchar
	grade varchar
	section varchar
	classTeacher varchar, 
	subjects varchar,
	MaxScore int,
	Totalscore int
	*/
    
create table studentDetails
(
id int primary key auto_increment,
studentfName varchar(100),
studentlName varchar(100),
grade varchar(20),
section varchar(20),
classTeacher varchar(100),
subjects varchar(250),
maxScore int,
totalScore int
);
create table Login
(
id int primary key auto_increment,
userName varchar(100),
password varchar(100)
);