select * from EMPLOYEES;

--1
select job_id,max(salary),min(salary)
from employees
where job_id in ('SA_MAN','SA_REP')
group by job_id;

--2
select job_id,max(salary)
from employees
group by job_id
order by max(salary) desc;

--3
select e.employee_id,e.first_name,e.salary
from employees e
inner join jobs j
on e.job_id=j.job_id
where e.salary between (select j.min_salary
from jobs j
where j.job_title = 'Programmer') and (
select j.max_salary
from jobs j
where j.job_title = 'Programmer'
);

--4
select e.first_name as 이름, e.last_name as 성,salary as 연봉 
from jobs j
inner join EMPLOYEES e
on e.job_id = j.job_id
where j.job_title = 'Sales Representative' and salary between 9000 and 10000;

--5
select e.employee_id as 사번, e.first_name as 이름, j.job_title as 업무명, d.department_name as 부서명
from employees e
inner join DEPARTMENTS d
on e.department_id = d.department_id
inner join locations l
on d.location_id = l.location_id
inner join jobs j
on e.job_id = j.job_id
where city = 'Seattle';

--6
select j.job_title as 업무명,sum(e.salary) as 연봉
from employees e
inner join jobs j
on e.job_id = j.job_id
group by j.job_title
having sum(e.salary) >= 30000
order by sum(e.salary) desc;

--7

select e.last_name,e.salary
from employees e
inner join EMPLOYEES m
on e.manager_id = m.employee_id
where e.salary>m.salary;



select e.last_name,e.salary
from EMPLOYEES e
inner join employees m
on e.email = m.email
where e.salary > (select m.salary
from employees m
where e.manager_id = m.employee_id);

--8
select e.employee_id,e.first_name,d.department_name,m.first_name
from employees e
inner join departments d 
on e.department_id = d.department_id
inner join employees m
on e.manager_id = m.employee_id
inner join jobs j
on e.job_id = j.job_id;

--9
select e.EMPLOYEE_id, e.First_name, nvl(m.First_name,'관리자 없음')
from employees e
left outer join employees m
on e.manager_id =m.employee_id
where e.First_name like '%v%';

--10
select e.EMPLOYEE_id, e.last_name, e.hire_date, m.hire_date
from employees e
left outer join employees m
on e.manager_id =m.employee_id
where e.hire_date < m.hire_date
order by e.hire_date ;

--11
select manager_id,first_name,count(*)
from employees
group by manager_id

select *
from employees

--22

select m.employee_id,count(*)
from employees e
inner join EMPLOYEES m
on e.manager_id = m.employee_id
inner join departments d 
on e.department_id = d.department_id
inner join LOCATIONS l
on d.location_id = l.location_id
inner join countries c
on l.country_id = c.country_id
group by m.employee_id

select *
from employees e
inner join EMPLOYEES m
on e.manager_id = m.employee_id

select c.country_name,count(*)
from employees e
inner join EMPLOYEES m
on e.manager_id = m.employee_id
inner join departments d 
on e.department_id = d.department_id
inner join LOCATIONS l
on d.location_id = l.location_id
inner join countries c
on l.country_id = c.country_id
group by c.country_name
