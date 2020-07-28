select sum(sal), avg(sal) from emp;
select max(sal), min(sal) from emp;
select count(job), count(distinct job) from emp;
select sum(sal), avg(sal), max(sal), min(sal) 
from emp
where job like 'SAL%';
select count(*), count(comm), avg(comm), count(distinct deptno)
from emp;
select deptno, avg(sal) from emp group by deptno;

select deptno, count(empno), round(avg(sal),2), min(sal), max(sal), sum(sal)
from emp
group by deptno;

select deptno, count(empno), round(avg(sal),2), min(sal), max(sal), sum(sal)
from emp
group by deptno
order by sum(sal) desc;

select deptno, job, count(empno), round(avg(sal),2), sum(sal)
from emp
group by deptno, job
order by deptno;

select deptno, round(avg(sal),2), sum(sal)
from emp
group by deptno
having max(sal)>2900
order by deptno;

select job, avg(sal) ,sum(sal)
from emp
group by job
having avg(sal) >= 3000;

select job, sum(sal)
from emp
where job not like 'SALE%'
group by job
having sum(sal) > 5000
order by sum(sal) desc;

select deptno, sum(sal)
from emp
where sal > 800
group by deptno
having sum(sal) > 9000;
select sal from emp;