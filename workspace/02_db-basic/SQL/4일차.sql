-----------------------------------
시퀀스(sequence):고유번호 생성기
공용객체
어느 테이블에서나 시퀀스 사용이 가능함
일반적으로는 특정 테이블의 특정 컬럼에서 사용
게시글 프라이머리 키 주기에 용이

-----------------------------------
--t_ or tb_는 테이블의 약자로 주로 사용, s_ 는 시퀀스
--시퀀스 생성하기
--생성 옵션을 설정하지 않은 경우
--시작:1,증가:1

create sequence s_board_no;

--생성된 시퀀스에서 고유번호 얻기:nextVal
--시퀀스명.nextVal
select s_board_no.nextVal from dual;

--시퀀스 삭제하기
drop sequence s_board_no;

--시퀀스를 이용한 게시글 등록
insert into tb_board(no,title,writer,content)
values(s_board_no.nextVal,'제목','글쓴이','내용');

-----------------------------------
alter : 테이블 변경
--컬럼 추가,컬럼 삭제,컬럼 변경(타입,크기,디펄트,낫 널)
--add:컬럼 추가
--drop:컬럼 삭제
--modify:컬럼 변경
alter table 테이블
add (컬럼...)

alter table 테이블
drop (컬럼...)
--드랍시 많은 데이터를 전부 지워야 해서 오래걸리니 업무시간 종료 후 하는게 좋음
--set unused coulumn 컬럼명 하면 실제 데이터는 삭제하지 않고 사용만 안하게 바꿈 . 휴지통 기능 
--drop unused coulumn 나중에 언유즈드 컬럼 삭제할때 씀. 휴지통 비우기 기능실제 데이터는 삭제하지 않고 
alter table 테이블
modify (컬럼...)

9i부터 컬럼명 변경가능
alter table 테이블
rename column A to B;
-----------------------------------

create table t_alter(
nama varchar2(10),
age varchar2(3)
);
--email 컬럼 추가
alter table t_alter
add (email varchar2(30) not null);

desc t_alter;

alter table t_alter
rename column nama to name;

alter table t_alter
drop (email);

--컬럼 변경
alter table t_alter
modify (age number(3));
--낫 널 삭제는 어떻게?

insert  into t_alter (name, age)
values ('test',22);

alter table t_alter
modify (age number(5));

--컬럼이 비어있을때만 축소가 가능
--값이 있을때 줄어들면 문제가 생길 수 있고 이걸 전부 확인하기 힘드므로
alter table t_alter
modify (age number(3));