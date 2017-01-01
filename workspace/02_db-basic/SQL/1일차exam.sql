select *
from tb_user;
select *
from tb_text;

create table tb_text(
text_no number(5) not null,
title varchar2(500) not null,
content varchar2(4000) not null,
user_id varchar2(16),
reg_time date not null,
read_count number(5) not null,
recom_count number(5) not null
);

create table tb_user(
	user_id		varchar2(16)	not null,
	password	varchar2(16)	not null,
	email		varchar2(60)	
	
);
create table tb_read_recom(
	text_no		number(5)		not null,
	user_id		varchar2(16)	not null,
	the_time	date			not null

);
insert into tb_user (user_id ,password ,email)
values ('root','abcd1234','root@noname.com');
insert into tb_user(user_id ,password ,email)
values ('user1','abcd1234','user1@noname.com');
insert into tb_user(user_id ,password)
values ('user2','abcd1234');
insert into tb_user(user_id ,password )
values ('user3','abcd1234');

update tb_user
	set		password	=	12341234
	where	user_id		=	 'user1';
update tb_user
	set		email		=	'user3@noname.com'
	where	user_id		= 	'user3';

insert into tb_text(text_no,title,content,user_id,reg_time,read_count,recom_count)
values (1,'오늘하루','할 일 없었다','user1',sysdate,0,0);
insert into tb_text(text_no,title,content,user_id,reg_time,read_count,recom_count)
values (2,'오늘하루','할 일 많았다','user2',sysdate,0,0);
insert into tb_text(text_no,title,content,user_id,reg_time,read_count,recom_count)
values (3,'오늘하루','할 일이란 과연 무엇일까?','user3',sysdate,0,0);

select *
	from	tb_text
	where	text_no = 1;
update tb_text
	set	read_count = read_count+1
	where	user_id != 'user3' and text_no =1;
	
select *
	from	tb_text
	where	text_no = 1;
update tb_text
	set	read_count = read_count+1
	where	user_id != 'user1' and text_no =1;
	
	
	
select *
	from	tb_text
	where	text_no = 1;
update
	