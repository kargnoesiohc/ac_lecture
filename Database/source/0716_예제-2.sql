-- 1. 사원 테이블에서 부서별 인원수가 6명 이상인 부서코드
select deptno, count(empno) 
from emp
group by deptno
having count(empno) >=6;

-- 2. 사원 테이블로부터 년도별, 월별 급여합계를 출력하는 SQL문
select to_char(hiredate, 'yyyy') "년"
, to_char(hiredate, 'mm') "월", sum(sal) 
from emp
group by to_char(hiredate, 'yyyy'), to_char(hiredate, 'mm')
order by "년";

--3. 사원 테이블에서 job별 인원수와 총 인원수
select job, count(job), count(*)
from emp
group by job;

select decode(job,'CLERK', sum(1), 0) "CLERK" , 
       decode(job,'SALESMAN', sum(1),0) "SALESMAN",
       decode(job,'MANAGER', sum(1),0) "MANAGER",
       decode(job,'ANALYST', sum(1),0) "ANALYST",
       decode(job,'PRESIDENT', sum(1),0) "PRESIDENT",
       count(*)
from emp
group by job;


 


