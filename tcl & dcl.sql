create table bankaccount(
account_id serial primary key,
holder_name varchar(50) not null,
balance decimal not null
)

select * from bankaccount

insert into bankaccount(holder_name,balance) values('karthika',10000)
insert into bankaccount(holder_name,balance) values('janani',20000)
insert into bankaccount(holder_name,balance) values('sahhana',30000)

begin 
update bankaccount set balance=balance+5000 where holder_name='karthika'

rollback

create table employee(
emp_id serial primary key,
emp_name varchar(50) not null,
salary decimal not null
)

select * from employee


insert into employee(emp_name,salary) values('karthika',10000)
insert into employee(emp_name,salary) values('janani',20000)
insert into employee(emp_name,salary) values('sahhana',30000)

create view employee_names as select emp_name from employee

select * from employee_names

create user guest

grant select on employee_names to guest;


