create table pk_tab1(
id  number(2) constraint pk_tab1_id_pk primary key,
name varchar(10)); --column level

create table pk_tab2(
id number(2),
name varchar2(10),
constraint pk_tab2_id_pk primary key(id)); --table level

commit;

alter table dept_2 drop constraint emp_2_deptno_fk cascade; -- 제약조건 삭제

alter table dept_2 
add constraint dept_2_deptno_pk primary key(deptno); -- 제약조건 추가

insert into dept_2 values(10, '인사', '서울');
insert into dept_2 values(20, '경리', '부산');
insert into dept_2 values(30, '관리', '대구');

select * from dept_2;

create table emp_2
( empno number(4) constraint emp_2_empno_pk primary key,
ename varchar2(10),
sal number(10),
deptno number(2) constraint emp_2_deptno_fk references dept_2(deptno));--부모(참조)테이블

insert into emp_2 values(1111,'홍길동', 2000, 1);
select * from emp_2;

create table emp_3
( empno number(4) constraint emp_3_empno_pk primary key,
ename varchar2(10),
sal number(10),
deptno number(2),
constraint emp_3_deptno_fk foreign key (deptno) references dept_2(deptno));--부모(참조)테이블

commit;

create table sawon_4
(
s_no number(2) constraint sawon_4_pk primary key,
s_name varchar2(10),
s_email varchar2(20),
constraint sawon_4_uk unique(s_name, s_email));

insert into sawon_4 values(1,'홍길동','abc@abc.com');
insert into sawon_4 values(2,'홍길동','abc@abc.com'); --uk 위반(s_email)
insert into sawon_4 values(3,'이순신',null);
insert into sawon_4 values(4,'유관순',null);
insert into sawon_4 values(5,'유관순',null); -- uk위반(s_name)
insert into sawon_4 values(6,null,null);
insert into sawon_4 values(7,null,null);

create table sawon_7
(
s_no number(2),
s_name varchar(10),
s_sal number(10) constraint sawon_7_s_sal_ck check(s_sal <500));

insert into sawon_7 values(1,'홍길동',600); --ck위반
insert into sawon_7 values(1,'홍길동',400);




