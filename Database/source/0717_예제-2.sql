-- 1. 사원 테이블에서 BLAKE보다 급여가 많은 사원들의 사번, 이름, 급여 
select empno, ename, sal
from emp 
where sal > (select sal 
             from emp
             where ename ='BLAKE');
-- 2. 사원 테이블에서 MILLER보다 늦게 입사한 사원들의 사번, 이름, 입사일         
select empno, ename, hiredate
from emp 
where hiredate > (select hiredate 
             from emp
             where ename ='MILLER');
-- 3. 사원 테이블에서 사원 전체 평균 급여보다 급여가 많은 사원들의 사번, 이름, 급여              
select empno, ename, sal
from emp 
where sal > (select avg(sal) 
             from emp);
             
-- 4.사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여
select empno, ename, deptno, sal
from emp 
where sal in (select max(sal)
              from emp
              group by deptno);

-- 5. Salgrade가 2등급인 사원들의 평균 급여보다 적게 받는 사원 정보를 검색
select * 
from emp
where sal <= (select avg(sal)
              from emp e join salgrade s
              on e.sal between s.losal and s.hisal
              where s.grade = 2);
            
              
      
             
             