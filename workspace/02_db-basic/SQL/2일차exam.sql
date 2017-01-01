CREATE TABLE s_emp
(id             NUMBER(7) primary key,
 name           VARCHAR2(25),
 mailid         VARCHAR2(8),
 start_date     DATE,
 manager_id     NUMBER(7),
 title          VARCHAR2(25),
 dept_id        NUMBER(7),
 salary         NUMBER(11, 2),
 commission_pct NUMBER(4, 2)
);



select *
from s_emp;

select *
from s_emp
where id =11;

--1.
select name,title,salary,dept_id
from s_emp
where dept_id in(112,118) and (salary>=1500 and salary<=4000) and (title = '과장' or title = '사원') ;

--2.
select name,title,salary
from s_emp
where manager_id is null;

--3.
select name,title,salary
from s_emp
where title like '%부장' and salary>=3000;

--4.
select name,title,salary
from s_emp
where dept_id in(112,113,117,118) and (title like '%부장' or title = '과장') and salary<=3000 and salary>=2300;

--5.
select name,title,start_date
from s_emp
where (title like '%부장' or title = '과장') and (to_char(start_date,'mm')='03');

--6
select (salary * 16) * 1000 as 연봉
from s_emp;

--7
select name || ' ' || title || '의 급여 ' || salary  as 직원급여
from s_emp
where commission_pct is null and salary>=3000;

--8
select *
from s_emp
where (commission_pct is not null or manager_id is not null)  and salary>=2500 ;

--9
select dept_id,min(salary)
from s_emp
group by dept_id
order by dept_id;

--10
select title,min(salary)
from s_emp
where not title like '%부장'
group by title;

--11
select title,avg(salary)
from s_emp
group by title;

--12
select title,count(id)
from s_emp
group by title;

--13
select title,max(salary)
from s_emp
group by title
having max(salary)>=2000;

--14
select title,min(salary)
from s_emp
where not title like '%부장'
group by title
order by min(salary) desc;

--15
select title,sum(salary)
from s_emp
where not title like '사원' 
group by title
order by sum(salary);

--16
select title,sum(salary)
from s_emp
where not title like '사원' 
group by title
having sum(salary)>=2000
order by sum(salary) desc;

--17
select upper(substr(mailid,1,1))||lower(substr(mailid,2))
from s_emp;

--18
select name
from s_emp
where not name like '__' and not name like'_';

--19
select name,round(MONTHS_BETWEEN(sysdate,start_date)+0.5)*salary
from s_emp
where title ='사원';

--20
select name, case when commission_pct is null then '커미션없음' else to_char(commission_pct) end
from s_emp
where title ='사원';

--21
select name,case when title = '사원' then salary+(salary*0.1) when title = '과장' then salary+(salary*0.2) else salary+(salary*0.1) end as 월급
from s_emp;

--22
select name,rpad(salary,floor(salary/100),'*')
from s_emp
where title = '사원';

--23
select min(salary)
from s_emp
group by title;
having 

select dept_id,sum(salary) as 부서합계
from s_emp
group by dept_id
order by dept_id;


select dept_id ,
from s_emp
group by dept_id
having  
order by dept_id;