create table Student (stu_id int primary key,stu_name varchar(50),stu_age int check(stu_age>=0 AND stu_age<=120),stu_dob date not null);

insert into Student (stu_id,stu_name,stu_age,stu_dob) values (767,'karthika',20,'2006-10-30'),(763,'kalai',20,'2005-11-30'),(768,'keeth',20,'2006-08-10');

select * from Student;