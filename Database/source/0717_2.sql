select sal 
from emp
where ename = 'SCOTT';

select ename 
from emp
where sal > 3000;

select ename
from emp
where sal > ( select sal
              from emp
              where ename = 'SCOTT');
              
select empno, ename, job, sal 
from emp
where deptno = (select deptno
             from emp
             where ename = 'SCOTT');
             
--sal 평균보다 월급이 더 높은사람 이름
select ename 
from emp
where sal > (select avg(sal)
             from emp);

select empno, ename, job, hiredate, sal
from emp
where job = (select job
             from emp
             where empno = 7521)
and   sal > (select sal
             from emp
             where empno = 7934);
             
--CLARK과 업무가 같고, CLARK보다 급여가 적은사람의 사번, 업무, 급여
select ename, job, sal
from emp 
where job = (select job
             from emp
             where ename = 'CLARK') 
and   sal > (select sal 
             from emp
             where ename = 'CLARK');
-- SCOTT과 같은 직업 사람들의 정보
select * from emp
where job = (select job from emp
             where ename ='SCOTT' or ename = 'CLARK');
            
select deptno, min(sal)
from emp
group by deptno
having min(sal) > (select min(sal) from emp where deptno = 20);

select job, avg(sal)
from emp
group by job
having avg(sal) = (select min(avg(sal))
                   from emp
                   group by job);
                   
select empno, ename, job, hiredate, sal, deptno
from emp
where sal in (select min(sal)
              from emp
              group by job);
              
select ename, sal
from emp 
where sal < all(select sal
                from emp
                where job = 'MANAGER'); 
                
select deptno, empno, ename, sal -- pairwise
from emp
where (deptno, sal) in (select deptno, max(sal)
                        from emp
                        group by deptno);
                        
select deptno, empno, ename, sal
from emp
where deptno in (select deptno
                from emp
                group by deptno)
and sal in (select max(sal)
            from emp
            group by deptno);
            
select e.deptno, total_sum, total_avg, cnt
from (select deptno, sum(sal) total_sum, avg(sal) total_avg, count(*) cnt 
      from emp
      group by deptno) e, dept d
where e.deptno = d.deptno;
                

             

             
