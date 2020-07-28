select deptno, initcap(dname), initcap(loc) from dept;
select empno, ename, lower(job), deptno from emp where lower(ename) = 'scott';
select empno, ename, job, deptno from emp where ename = upper('scott');
select empno, ename, job, concat(ename,job) from emp where empno = 7369;
select ename, lpad(ename, 15, '*'), sal, lpad(sal, 10, '*') from emp where deptno = 10;
select ename, rpad(ename, 15, '*'), sal, rpad(sal, 10, '*') from emp where deptno = 10;
select ename, length(ename) "ename length" from emp order by "ename length" desc;
select * from emp;
select ename, '19'||substr(hiredate, 0, 2) "입사년도" from emp order by "입사년도";
select * from dual;
select substr('123456-1234567',0, 2)from dual;
select substr('123456-1234567',0,8) || '******' from dual;
select rpad(substr('123456-1234567',0,8),14,'*') from dual;
select replace('901020-1234567',substr('901020-1234567',-6),'*****') "주민번호" from dual;
select replace(student_ssn, substr(student_ssn,-6),'*****') from tb_student;
select replace(job, 'A', '$') from emp;
select instr('miller','l',1,2) from dual;
select ltrim('MILLER','M') from dual;
select '00012340', trim(leading '0' from '00012340' )
, trim(trailing '0' from '00012340' ) 
, trim('0' from '00012340') from dual;
select distinct job, trim(leading 'S' from job)
, trim(trailing 'N' from job) from emp;
select ceil(10.1) from dual;
select floor(10.1) from dual;
select sal, mod(sal, 30) "SAL/30" from emp order by "SAL/30";
select round(4567.648,-2) from dual;
select trunc(4567.648,1) from dual;
