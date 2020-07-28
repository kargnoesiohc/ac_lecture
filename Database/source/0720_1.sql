select * from emp;
INSERT INTO dept(deptno, dname, loc)
values(90,'인사과','서울');
select * from dept;

INSERT INTO dept(loc, dname, deptno)
values('서울', '인사과', 70);

INSERT INTO dept(deptno, dname)
values(91,'인사과');

INSERT INTO dept
values(92,'인사과', '');

INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(9001, user, '연구원', 7839, SYSDATE, 5000, null, 90);

desc emp;

INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(9002, '홍길동', 'MANAGER', 7839, '2000/01/01', 2000, null, 30);

INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(9003, '임꺽정', 'MANAGER', 7839, to_date('1999-12-13','yyyy/mm/dd'), 2000, null, 30);

create table copy_emp
as select empno, ename from emp --필드명 카피
where 1=2;

select * from copy_emp;

INSERT INTO copy_emp
select empno, ename from emp;

delete from copy_emp;

create table sal_history
as select empno, hiredate, sal from emp
where 1=2;

create table mgr_history
as select empno, mgr, sal from emp
where 1=2;

create table test_history
as select empno, sal from emp
where 1=2;

INSERT ALL
INTO sal_history VALUES(empno, hiredate,sal)
INTO mgr_history VALUES(empno, mgr, sal)
select empno, hiredate,sal,mgr from emp;

select * from sal_history;

drop table sal_history;
drop table mgr_history;

INSERT ALL 
    WHEN sal < 2500 THEN
        INTO sal_history VALUES(empno, hiredate, sal)
    WHEN sal > 2500 THEN
        INTO mgr_history VALUES(empno, mgr, sal)
    SELECT empno, hiredate, mgr, sal
    from emp;
select * from sal_history;
select * from mgr_history;
select * from test_history;

INSERT FIRST
    WHEN sal = 800 THEN
        INTO sal_history values(empno, hiredate, sal)
    WHEN sal < 2500 THEN
        INTO mgr_history VALUES(empno, mgr, sal)
    ELSE 
        INTO test_history VALUES(empno, sal)
    SELECT empno, hiredate, mgr, sal
    from emp;

select * from dept;
update dept
set dname = '경리과'
where deptno = 90;

update dept 
set loc = case deptno when 91 then 'BUSAN' 
    when 92 then 'INCHEN' else loc end;

update dept 
set dname = case loc when 'SEOUL' then '인사과' 
    when 'INCHEN' then '기획과' else dname end;
    
select job, sal, empno from emp;

update emp 
set job = (select job from emp where empno = 7900),
    sal = (select sal from emp where empno = 7844)
where empno = 9001;

delete from dept where deptno = 70;

create table pt_01 
    ( 판매번호 varchar2(8),
      제품번호 number,
      수량 number,
      금액 number);
create table pt_02 
    ( 판매번호 varchar2(8),
      제품번호 number,
      수량 number,
      금액 number);
create table p_total 
    ( 판매번호 varchar2(8),
      제품번호 number,
      수량 number,
      금액 number);
      
insert into pt_01 values('20150101', 1000, 10, 500);
insert into pt_01 values('20150102', 1001, 10, 400);
insert into pt_01 values('20150103', 1002, 10, 300);

insert into pt_02 values('20150201', 1003, 5, 500);
insert into pt_02 values('20150202', 1004, 5, 400);
insert into pt_02 values('20150203', 1005, 5, 300);
commit;

select * from pt_01;
select * from pt_02;
select * from p_total;

merge into p_total total
using pt_01 p01 
on(total.판매번호 = p01.판매번호)
    when matched then 
        update set total.수량 = 10
    when not matched then
        insert values(p01.판매번호, p01.제품번호, p01.수량, p01.금액);
        
merge into p_total total
using pt_02 p02
on(total.판매번호 = p02.판매번호)
    when matched then 
        update set total.수량 = p02.수량
    when not matched then
        insert values(p02.판매번호, p02.제품번호, p02.수량, p02.금액);
commit;

create table emp_m2
as select empno, job, sal from emp where 1=2;

merge into emp_m2 m2
using emp e
on(e.empno = m2.empno)
when matched then 
    update 
    set m2.job = e.job,
        m2.sal = e.sal
    where e.job = 'CLERK'
when not matched then
    insert (m2.empno, m2.job, m2.sal)
    values (e.empno, e.job, e.sal)
    where e.job = 'CLERK';
select * from emp_m2;
commit;
rollback;

delete from pt_02 where 판매번호 = '20150202';

select * from pt_01;
select * from pt_02;

update pt_02
set 제품번호 = 1006
where 판매번호 = '20150203';

delete from pt_02 where 금액 = 500;

update pt_01
set 판매번호 = '20150104'
where 제품번호 = 1002;

select * from dept;
delete from dept where deptno = 92;
select * from dept;
rollback;
commit;
delete from emp;

select * from emp;
rollback;
update emp
set ename = 'HONG' where empno = 9001;
commit;

-- lock경합
select * from dept; --1

update dept
set dname ='경리과'
where deptno = 90;

select * from dept;

--sys계정
select * from scott.dept; --  업데이트 적용 안되어있음
update scott.dept
set loc = '서울' 
where deptno = 90; -- scott계정에서 트랜잭션 종료 전까지 업데이트 안됨
