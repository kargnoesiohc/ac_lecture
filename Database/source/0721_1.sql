show recyclebin;

flashback table deptd to before drop;

drop table deptd;

create table scott_t
( num number(4),
name varchar2(10));

desc scott_t;

alter table scott_t
add(address varchar2(30));

alter table scott_t read only;
insert into scott_t values(1111,'aaaa','aaaaa'); 
-- read only(갱신 불가능/테이블 갱신도 동일

alter table scott_t read write;
insert into scott_t values(1111,'name','add'); 
-- 갱신가능/테이블 갱신도 동일
alter table scott_t 
modify (address number(4));

alter table scott_t
rename column address to addr;

alter table scott_t
drop (addr);

alter table scott_t
add constraint scott_t_num_pk primary key(num);

alter table scott_t
modify (name varchar2(10) not null);

alter table emp 
add constraint emp_mgr_fk
foreign key(mgr) references emp(empno);

insert into scott_t values(1111, 1234);

select * from user_constraints
where table_name = 'emp';

alter table scott_t
drop constraint sys_c0011100;

alter table scott_t
drop primary key cascade;

alter table scott_t
add constraint scott_t_num_pk primary key(num);

alter table scott_t
modify(name varchar(10) not null);

select * from user_constraints
where table_name = 'SCOTT_T'; --제약조건 조회

alter table scott_t 
disable constraint scott_t_num_pk;

alter table scott_t 
enable constraint scott_t_num_pk;






