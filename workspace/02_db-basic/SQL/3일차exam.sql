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
select last_name,salary
from EMPLOYEES e,employees m
outer join

select e.last_name, nvl(m.last_name,'관리자 없음')
from employees e
left outer join
employees m
on e.manager_id = m.employee_id;
