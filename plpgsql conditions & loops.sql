create or replace procedure check_number(num int)
language plpgsql as $$
begin
	if num%2=0 then
		raise notice 'Even Number';
	else
		raise notice 'Odd Number';
	end if;
end;
$$

call check_number(11);

create or replace function great_num(num1 int,num2 int,num3 int)
returns int language plpgsql as $$
declare
	greatest_num int;
begin
	if (num1>num2 and num1>num3) then
			greatest_num := num1;
	elsif (num2>num1 and num2>num3) then
			greatest_num := num2;
	else
		greatest_num := num3;
	end if;

	return greatest_num;
end;
$$

select great_num(17,87,10);

create or replace procedure check_age(age int)
language plpgsql as $$
begin
	if age>=18 then
		raise notice 'Eligible For Voting';
	else
		raise notice 'Not Eligible';
	end if;
end;
$$

call check_age(11);

create or replace function print_numbers()
returns void
language plpgsql as $$
declare
	i int :=1;
begin
	while i<11 loop
		raise notice 'print num : %',i;
		i:=i+1;
	end loop;
end;
$$

select print_num();

create or replace procedure sum_num()
language plpgsql as $$
declare
	total int :=0;
begin
	for i in 1..10 loop
		total := total+i;
	end loop;
	raise notice 'Sum of numbers from 1 to 10 is : %',total;
end;
$$;

call sum_num()


create or replace function mul_num()
returns void
language plpgsql as $$
declare
	num int := 5;
	i int;
begin
	for i in 1..10 loop
		raise notice '% x % = %',num,i,num*i;
		end loop;
end;
$$;

select mul_num();

create or replace procedure even_num()
language plpgsql as $$
declare
	i int;
begin
	for i in 1..20 loop
		if i%2=0 then
			raise notice 'Even Number : %',i;
		end if;
	end loop;
end;
$$;

call even_num()

create or replace procedure odd_number()
language plpgsql as $$
declare
	i int;
begin
	for i in 1..20 loop
		if i%2 !=0 then
			raise notice 'odd Number : %',i;
		end if;
	end loop;
end;
$$;

call odd_number()








