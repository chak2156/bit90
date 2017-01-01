----------------------------------
join
----------------------------------
--cart





from1 where2



--equijoin 
select last_name, department_name
from employees, departments
where employees.department_id = departments.department_id;

--join시 컬럼에 그 컬럼이 어디있는지 명확하게 표시하기 위하여 앞에 테이블명을 . 구분자를 포함하여 붙여준다
select employees.last_name, departments.department_name
from employees, departments
where employees.department_id = departments.department_id;

--테이블 명은 보통 길이가 길어 테이블명에 alias를 준다. from절에서 줌
select e.last_name, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

--부서의 정보 + 도시이름
select d.* , l.city
from departments d, locations l
where d.location_id = l.location_id;

--join이 아니어도 가능하지만 밑 예제의 경우 동일한 셀러리 컬럼이 두개가 생기므로 알리아스로 구분해준다
select e.salary as sal, e.*
from employees e;

-- canada 에 근무하는 사원의 지역명, 부서명, 사원명을 출력하시오

select l.city, d.department_name, e.last_name, c.country_name
from employees e, locations l, departments d, countries c
where d.location_id = l.location_id
and e.department_id = d.department_id
and l.country_id = c.country_id
and c.country_name = 'Canada';

--각 사원의 job_id 에 해당하는 최대 받을 수 있는 급여와 최소 급여가 얼마인지 출력하시오 
select e.last_name, e.job_id, j.job_title, j.min_salary,j.max_salary
from employees e,jobs j
where e.job_id = j.job_id;


--oracle 9i부터 지원
--table1 inner join table2 on 증거조건
select e.last_name, d.department_name
from employees e 
inner join departments d
on e.department_id = d.department_id;

select l.city, d.department_name, e.last_name, c.country_name
from
employees e
inner join departments d
on e.department_id = d.department_id
inner join locations l
on d.location_id = l.location_id
inner join countries c
on l.country_id = c.country_id
where c.country_name = 'Canada';

select e.last_name, e.job_id, j.job_title, j.min_salary,j.max_salary
from employees e
inner join jobs j
on e.job_id = j.job_id;

--non equi join
select e.last_name, e.salary, s.grade
from EMPLOYEES e, salgrade s
where e.salary between s.min_sal and s.max_sal;

select e.last_name, e.salary, s.grade
from EMPLOYEES e
inner join salgrade s
on e.salary between s.min_sal and s.max_sal;

--self join
select e.employee_id, m.last_name
from employees e,employees m
where e.manager_id = m.employee_id;

select e.employee_id, m.last_name
from employees e
inner join employees m
on e.manager_id = m.employee_id;

--outer join
--[full] outer join //양쪽 다 체울 수 있는 조건
--[right] outer join //왼쪽 체움
--[left] outer join //오른쪽 체움
--join+모자란 쪽에 추가하고 싶은걸 따로 추가해줌
--(+) 널값추가..?
select e.last_name, nvl(m.last_name,'관리자 없음')
--select e.last_name, case when m.last_name is null then '관리자 없음' else to_char(m.last_name) end
from employees e,employees m
where e.manager_id = m.employee_id(+);

select e.last_name, nvl(m.last_name,'관리자 없음')
from employees e
left outer join
employees m
on e.manager_id = m.employee_id;

----------------------------------
set 연산자 여러개의 sql문을 연결하여 조회
----------------------------------
--union 교집합 중복제거 자동 정렬 합집합
--union all 교집합 중복제거 안함. 통계에서 여러 결과값을 하나로 합칠때 주로 사용했음. 소계를 낸다던지
--intersect 교집합. 결과의 공통된 부분만 출력
--minus 차집합. 앞에서 뒤를 뺀 결과를 반환

--select절1
--set	연산자1
--select절2
--set	연산자2
--select절3
--...
--order by




 select no,data
 from tc_seta
--union,union all,minus,intersect
 intersect
 select no,data
 from tc_setb;
 
--set 연산자를 사용할 때 컬럼의 갯수가 동일해야 한다.
--같은 열에 있는 컬럼들은 연산자가 같아야 한다
--order by는 셋절 마지막에만 쓸 수 있다
--컬럼명은 첫번째 쿼리문의 컬럼명의 사용이 된다
 select last_name,salary
 from employees
 union all
 select department_id , department_name
 from departments;
 
--동일한 열의 위치데이터는 타입이 동일해야 한다.

 
----------------------------------
SubQuery
----------------------------------

--10번까지 사원의 평균급여
select avg(salary)
from employees
where department_id = 10;

--스칼라 서브쿼리 or Single Row SubQuery 서브쿼리의 결과행이 하나인것
--Chen 사원과 같은 부서에 있는 사원들의 평균 급여를 출력하시오
select avg(salary)
from employees
where department_id = (select department_id
						from employees
						where last_name = 'Chen');

--Chan 사원의 부서번호를 출력하시오
select department_id
from employees
where last_name = 'Chen';

--Multi Row SubQuery 서브쿼리의 결과행이 여러개일 경우에 사용
--Multi Row SubQuery 일 경우 관련된 연산자를 이용해야 한다
--King 사원과 같은 부서에 있는 사원들의 평균 급여를 출력하시오
--King이 두명 이상이므로 리턴값이 2개가 넘는데 이 경우 in으로 해서 두명의 평균값을 합침
select avg(salary)
from employees
where department_id in (select department_id
						from employees
						where last_name = 'King');

--30번 부서의 평균 급여보다 급여를 많이 받는 사원의 정보를 출력
select *
from employees
where salary >(
select avg(salary)
from employees
where department_id =30);

--30번 부서의 급여보다 급여를 많이 받는 사원의 정보를 출력
select *
from employees
where salary >(
select max(salary)
from employees
where department_id =30);

--30번 부서의 급여보다 급여를 많이 받는 사원의 정보를 출력
--all 뒤에 있는 모든것보다 크다. 행이 하나 이상일 때 사용
select *
from employees
where salary >all (
select salary
from employees
where department_id =30);

--30번 부서의 급여보다 급여를 많이 받는 사원의 정보를 출력
--any 뒤에 있는것중 하나만 만족해도 된다. 행이 하나 이상일 때 사용. 밑의 예제는 셀렉트의 셀러리가 min(salary) 와 같음
select *
from employees
where salary >any (
select salary
from employees
where department_id =30);

--각 부서에서 가장 작은 급여를 받는 사원의 정보를 출력하시오
--밑 예제는 오류난다. 비교하는 대상의 리턴값이 최소값들만 반환되기 때문에 어느 부서의 최소값인지 몰라 최소값과 같으면 모두 리턴이 되기 때문
select *
from employees
where salary in (
select min(salary)
from employees
group by department_id);

--multi column subquery : 서브쿼리의 결과가 여러개의 컬럼이 반환됨
select *
from employees
where (department_id,salary) in (
select department_id,min(salary)
from employees
group by department_id);

--서브쿼리가 사용되는 다양한 위치
insert into tb_board(no,title writer,content)
values (
	(select max(no) + 1 from tb_board), 
	't', 
	'w', 
	'c'
);
--서브쿼리 수행하는 순간 값이 상수로 바뀜. 예제의 서브쿼리 e.department_id부분이 상수
select e.last_name,
e.department_id,
(select department_name
from departments
where departmnet_id = e.department_id) as department_name
from employees s;
--inline view. from절에서의 서브쿼리


--top-n 서브쿼리
--오라클에서 제공하는것
--rownum 의 이해 화면의 숫자값을 1씩 올려서 넘겨줌
--추측: rownum , group by 알고리즘은 추측임
--rownum이 셀렉절에 가지 않으면 값이 증가되지 않음
--rownum은 결과값이 나오지 않으면 값이 증가하지 않음

select rownum, last_name, salary
from employees
where rownum < 5;


select rownum, last_name, salary
from employees
where rownum = 4;

--사원중에서 급여를 많이 받는 상위 5명을 출력하시오
--밑의 서브쿼리가 인라인 뷰
from>where>order by>select

select rownum,last_name,salary
from (select *
	from employees
	order by salary desc)
where rownum <6;



--페이징 쿼리 rownum의 이름을 임의의 이름으로 변경하여 메모리에 옮긴다음 부분범위 가져오기
select *
from(select rownum rnum, last_name, salary
									from (select *
											from employees
											order by salary desc))
where rnum between 3 and 4;

--서브쿼리를 이용한 테이블 생성
create table employees_copy
as
select * from employees;

drop table employees_copy;
select * from employees_copy;

--테이블 내용은 비우고 구조만 복사. 웨어절이 펄스값이면 셀렉트는 아무것도 반환하지 않음
create table employees_copy
as
select * from employees
where 1 != 1;

--테이블에 데이터를 서브쿼리를 이용하여 생성
insert into employees_copy
select * from employees;
