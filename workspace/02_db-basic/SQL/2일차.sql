---------------------------------
where
---------------------------------

-- 

-- 급여가 10000이상이고 15000 이하인 사원의 정보
select *
from employees
where salary >= 10000
and salary <= 15000

--between 사용. between and b : a 와 b 사이의 값을 선택한다 (a,b포함) 앞부분이 작은수여야 한다
select *
from employees
where salary between 10000 and 15000;

--사원의 부서가 90,100,110,120,130,150에 소속된 사원의 정보를 출력

select *
from employees
where department_id =90
or department_id =100
or department_id =110
or department_id =120
or department_id =130
or department_id =150;

--in(컬럼,...) 사용.
select *
from employees
where department_id in(90,100,110,120,130,150);

--like 사용. 컬럼명 like '패턴',%(0개 이상 문자),_(한개 문자) // 김% =김 김형 김형태 김형태놈 등등 .. _병_ = 김병갑 이병을 박병정 등등..

--사원의 이름이 L로 시작하는 사원 정보를 출력
select *
from employees
where last_name like'L%';
--사원의 메일이 D로 시작하고 T로 끝나는 사원 정보를 출력
select *
from employees
where email like'D%T';
--이름이 네글자면서 K로 시작하는 사원
select *
from employees
where last_name ='K___';
--이름이 'King' 인 사원
select *
from employees
where last_name ='King';


select last_name, salary, commission_pct
from employees;
--is null
--null은 미정의 값.
--null과의 산술연산의 결과는 null.
--null과의 비교연산의 결과는 false 해가 정해지지 않은 함수와 비슷. null + 숫자 = null

--커미션을 받지 않는 사원의 정보를 출력
select last_name, salary, commission_pct
from employees
where commission_pct is null;
--커미션을 받는 사원의 정보를 출력
select last_name, salary, commission_pct
from employees
where commission_pct is not null;
--사원의 연봉을 출력합니다.
--연봉은 급여 * 15 + 급여 * 15 * 커미션
--nvl(null이 들어있을 수 있는 컬럼, 널 대신 넣을 값)
select last_name, salary * 15 + salary * 15 * nvl(commission_pct,0) as year_sel
from employees;

---------------------------------
order by : asc(오름차순) desc(내림차순)
order by 표현식 컬럼명 정렬순서,표현식 컬럼명 정렬순서,...//정렬,정렬된 리스트 내에서 2차정렬,...
---------------------------------
--급여가 높은 사원부터 화면에 출력하시오
select last_name, salary
from employees
order by salary desc;
--급여가 낮은 사원부터 화면에 출력하시오
select last_name, salary
from employees
order by salary asc;

--사원의 정보를 출력합니다(이름,부서번호,급여)
--부서번호 순으로
select last_name,department_id,salary
from employees
order by department_id;
--사원의 정보를 출력합니다(이름,부서번호,급여)
--부서번호 순으로 출력하시오. 부서번호가 같은 사원들은 급여순으로 출력합니다.
select last_name,department_id,salary
from employees
order by department_id,salary;

--사원의 정보 출력. 단, 연봉이 많은 사원부터 출력
select last_name, salary, salary * 15 + salary * 15 * nvl(commission_pct,0) as year_sel
from employees
order by year_sel desc;

--중복제거
select distinct department_id
from employees;

---------------------------------
group by : 데이터를 소그룹으로 묶는다. //거진 통계정보에서 사용
그룹 함수 : 여러개의 데이터를 받아서 하나의 결과를 반환. 널값은 자동제외함
		  : count(표현식 컬럼명), sum(표현식 컬럼명) , max(표현식 컬럼명),
		    min(표현식 컬럼명), avg(표현식 컬럼명) ...
---------------------------------

--사원의 수를 반환,사원 월급의 총합,연봉의 총합,최소급여?,최대급여?,평균급여,커미션 총합
select count(last_name),sum(salary),sum(salary, salary * 15 + salary * 15 * nvl(commission_pct,0) as year_sel),min(salary),max(salary),avg(salary),sum(commission_pct)
from employees;
--50번 부서 사원들의 급여중 가장 많은 급여
select max(salary)
from employees
where department_id = 50;
--각 부서별 최대 급여를 화면에 출력하시오
select department_id, max(salary)
from employees
group by department_id;

--그룹바이로 묶으면 select절에서 함수없이 넣을 수 있는 컬럼은 거의 그룹바이로 묶은 값 뿐

create table t86_group (
    id varchar2(3),
    sal number,
    job_id varchar2(2),
    dept_id number
);  
  
insert into t86_group values('a', 1000, 'SA', 10);  
insert into t86_group values('b', 2000, 'CM', 30);  
insert into t86_group values('c', 3000, 'CM', 20);  
insert into t86_group values('d', 4000, 'LA', 10);  
insert into t86_group values('e', 3000, 'SA', 30);  
insert into t86_group values('f', 2000, 'SA', 10);  

select * 
from t86_group;

--각 직무별 사원수
select job_id,count(*)
from t86_group
group by job_id;

--
select dept_id,job_id,max(sal)
from t86_group
group by dept_id, job_id
order by dept_id, job_id;


---------------------------------
having where이 group by 전에 실행되므로 그룹바이로 묶으면 이걸로 제약조건 처리함
---------------------------------
--각 부서별 최대급여를 급여가 높은 순서대로 출력. 10000 밑은 거름

select department_id, max(salary) 최대급여
from employees
group by department_id
having max(salary) >= 10000
order by max(salary) desc ;

-- 100번보다 작은 부서중 최대급여를 급여가 높은 순서대로 출력. 5000 밑은 거름

select department_id, avg(salary)
from employees
where department_id < 100
group by department_id
having avg(salary) >= 5000
order by department_id;


실행순서 from(어느 장소에서) -> where(어떤 조건 하에) -> group by(무슨 그룹 안에서) -> having(어떤 조건 하에) -> select(무엇을 출력하나) -> order by(어떻게 정렬해서)

---------------------------------
내장함수 : DBMS에서 기본적으로 제공되는 함수(단일행,그룹행)
--------------------------------
단일행 - 문자,숫자,변환형,기타

--문자함수
--함수는 중첩가능
--lower = 소문자로, upper = 대문자로, concat 합성연산자와 비슷. last_name || '사원'와 같은 기능
select last_name, lower(last_name),upper(last_name),concat(last_name,'사원'),last_name || '사원'
from employees;
--ㅎㅎ
select last_name, first_name, concat(upper(last_name),first_name)
from employees;

--substr 라스트네임은 첫번째 인덱스부터 2개까지. 즉 Agel이면 Ab만 출력
select last_name,
substr(last_name,1,2)
from employees;


select last_name,
substr('20161229',1,4),substr('20161229',5,2),substr('20161229',7,2)
from employees;


-- lpad rpad 매개변수를 입력한 값만큼 매개변수로 치환
select last_name,length(last_name), lpad(last_name,10,'*'),rpad(last_name,10,'*')
from employees;

--translate 문자단위 변화, replace 단어단위 변화
select last_name,
translate(last_name,'Ab','uk'),replace(last_name,'Ab','uk')
from employees;

-- 숫자형 함수
--abs(매개변수)//절대값 반환 , sign(매개변수) //음수 양수 구분 음수면 -1 ,
--ceil 입력된 값보다 크거나 같으면서 가장 작은 정수값,
--floor 입력된 값보다 작거나 같으면서 가장 큰 정수값을 반환
--round 반올림. 두번째 인자 주면 소수점 이동
--trunc 버림. 두번째 인자 주면 소수점 이동
--dual 오라클에서 제공한 함수 테스트 하라고 주는 컬럼 하나짜리 더미 테이블


-- 임플로이스의 수만큼 a 출력
select ceil(1.1),floor(1.1),sign(-12),sign(0)
from dual;

select round(73.727),round(73.727,2),round(73.727,-2),
	   trunc(73.727),trunc(73.727,2),trunc(73.727,-2)
from dual;

-- 날짜형 함수
--sysdate 현재 날짜와 시각
--add_months(날짜,n) 날짜에 n개월을 더 한 날짜
--months_between(날짜1,날짜2) 날짜1과 날짜2 사이의 월수 반환. 소수점 포함,음수도 가능
--last_day 현재날짜를 포함한 달의 마지막날짜 반환
--날자+숫자 하면 날자타입이 됨
--날자-날자 하면 숫자됨
select sysdate,add_months(sysdate,-1)
from dual;

--각 사원의 입사일로부터 1년이 되는 날짜를 출력하시오 
select last_name,hire_date,add_months(hire_date,12)
from employees;

select last_name, months_between(sysdate,hire_date)
from EMPLOYEES;

select sysdate,last_day(sysdate)
from dual;

select sysdate + 7,sysdate - 7 , sysdate + 5/24
from dual;

--각 사원의 근무일수를 출력하시오
select last_name,hire_date,trunc(sysdate-hire_date)
from employees;

--변환형 함수
--to_date 문자를 날자로
--to_number 문자를 숫자로
--to_char 날자를 문자로,숫자를 문자로

select to_char (sysdate,'yyyy-mm-dd  hh24 : mi : ss')
from dual;

select to_char(to_date ('2016-11-20','yyyy-mm-dd'),'yyyy-mm-dd hh24 : mi : ss')
from dual;

insert into tb_board(no,title,writer,content,reg_date)
values(4,'a','b','c',to_date('2015-11-01','yyyy-mm-dd'));

select * from tb_board;

--to_char 의 패턴문자: 9(자리수),0(자리수-남는 자리에 0을 표시),","
--to_char(숫자,'패턴')
select to_char(10000000,'999,999,999,999')
from dual;

--to_number(문자,'패턴')
select to_number('54,2','99,9')
from dual;

--사원중에서 5월에 입사한 사원들의 정보만 출력하시오
from employees
where to_char(hire_date,'mm') = '05';

--현재 월과 동일한 월에 입사한 사원의 정보를 출력하시오
from employees
where to_char(hire_date,'mm') = to_char(sysdate,'mm');

--기타함수 - 기본적인 통계정보 추출시 사용
--decode 스위치문과 비슷. decode(컬럼,찾을 값1,넣을 값1,찾을 값2,넣을 값2,...,디폴트)
--case~end if와 비슷 . case 컬럼 when 찾을 값1 then 넣을 값1 when 찾을 값2 then 넣을 값2 else 디폴트 end
--case~end if와 비슷 . case when 컬럼 찾을 값1 then 넣을 값1 when 컬럼 찾을 값2 then 넣을 값2 else 디폴트 end

select job_id, decode(job_id, 'IT_PROG','개발자'
							, 'SA_MAN','세일즈','그냥 직원') as job_type
from employees;



select job_id,
	   case job_id when 'IT_PROG' then '개발자'
				   when 'SA_MAN'  then '세일즈'
				   else '그냥 직원'
	  end as job_type
from employees;


select job_id,
	   case when job_id = 'IT_PROG' then '개발자'
			when job_id = 'SA_MAN'  then '세일즈'
				   else '그냥 직원'
	  end as job_type
from employees;

--사원의 급여에 따라 다음과 같이 출력
--급여가 10000 이상 "굿"
--5000이상 노말
--5000이하 ㅉㅉ

select salary,
	   case when salary >= 10000 then '우후...'
			when salary >= 5000  then '아이...'
				   else '에이...'
	  end salary_type
from employees;