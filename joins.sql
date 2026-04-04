create table dept
(dept_id int primary key,
dept_name varchar(30) not null,
location varchar(30) not null)

insert into dept values(10,'HR','chennai'),
(20,'IT','Madurai'),(30,'Finance','trichy'),
(40,'sales','comibatore')

select * from dept


create table emp(emp_id int primary key,
emp_name varchar(30) not null,
age int not null,salary int not null,
dept_id int references dept(dept_id),
job_role varchar(30) not null)

select * from emp

insert into emp values(101,'yazh',20,30000,10,'assistant'),
(102,'bala',30,40000,10,'recruiter'),(103,'charan',27,35000,20,'tester'),
(104,'kalai',20,50000,30,'accountant'),(105,'farhana',26,28000,40,'sales executive'),
(106,'avinash',29,30000,20,'developer'),(107,'gokul',31,45000,30,'analyst'),
(108,'hari',24,22000,10,'assitant')

select e.emp_name,d.dept_name from emp e join dept d on e.dept_id=d.dept_id;

select e.emp_name,e.salary,d.location from emp e join dept d on e.dept_id=d.dept_id;

select e.emp_name,d.dept_name from emp e join dept d on e.dept_id=d.dept_id where d.dept_name='IT'

select e.emp_name,d.location from emp e join dept d on e.dept_id=d.dept_id where d.location='chennai'

select  e.emp_name,e.salary,d.dept_name from emp e join dept d on e.dept_id=d.dept_id where e.salary>30000;

select  d.dept_name,count(e.emp_id) as total_emp from emp e join dept d on e.dept_id=d.dept_id group by d.dept_name;

select d.dept_name,count(e.emp_id) as totale_emp from emp e join dept d on e.dept_id=d.dept_id group by d.dept_name having count(e.emp_id)>1
