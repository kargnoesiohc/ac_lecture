-- 1. 부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명 검색(사원명 오름차순)

--Oracle Join
select e.empno, e.ename, d.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno
order by e.ename;

--ANSI Join
select empno, ename, deptno, dname
from emp
natural join dept;

-- 2. 부서 테이블과 사원테이블에서 사번, 사원명, 급여, 부서명 검색 
--    단, 급여가 2000이상인 사원에 대하여 급여기준으로 내림차순 

--Oracle Join
select e.empno, e.ename, e.sal, d.dname
from emp e, dept d
where e.deptno = d.deptno and e.sal >= 2000
order by sal desc;

--ANSI Join
select empno, ename, sal, dname
from emp
natural join dept
where sal >= 2000
order by sal desc;

-- 3. 부서 테이블과 사원 테이블에서 사번, 사원명, 업무, 급여, 부서명을 검색하시오. 
-- 단, 업무가 Manager이며 급여가 2500 이상인 사원에 대하여 사번을 기준으로 오름차순

--Oracle Join
select e.empno, e.ename, e.job, e.sal, d.dname
from emp e, dept d
where e.deptno = d.deptno 
and e.job = 'MANAGER' and e.sal>= 2500
order by e.empno;

--ANSI Join
select empno, ename, job, sal, dname
from emp 
natural join dept  
where job = 'MANAGER' and sal>= 2500
order by empno;

-- 4. 사원 테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색
--    단, 등급은 급여가 하한값,상한값 범위에 포함, 등급이 4이며 급여를 기준으로 내림차순

--Oracle Join
select e.empno, e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal between losal and hisal 
and s.grade = 4
order by e.sal desc;

--ANSI Join
select e.empno, e.ename, e.sal, s.grade
from emp e
join salgrade s
on e.sal between s.losal and s.hisal 
where s.grade = 4
order by e.sal desc;

-- 5. 부서 테이블, 사원 테이블, 급여등급 테이블에서 사번, 사원명,부서명, 급여, 등급 검색
--    단, 등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순

--Oracle Join
select e.empno, e.ename, d.dname, e.sal, s.grade
from emp e, dept d, salgrade s 
where e.deptno = d.deptno and e.sal between losal and hisal
order by s.grade desc;

--ANSI Join
select empno, ename, dname, sal, grade
from emp e
join dept d  
on e.deptno = d.deptno 
join salgrade s
on e.sal between losal and hisal
order by s.grade desc;
-- 6. 사원 테이블에서 사원명과 해당 사원의 관리자명을 검색

--Oracle Join
select e1.ename, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;

--ANSI Join
select e1.ename, e2.ename
from emp e1
join emp e2
on e1.mgr = e2.empno;
-- 7. 사원테이블에서 사원명, 해당 사원의 관리자명, 해당 사원의 관리자의 관리자명을 검색

--Oracle Join
select e1.ename, e2.ename, e3.ename
from emp e1, emp e2, emp e3
where e1.mgr = e2.empno and e2.mgr = e3.empno;

--ANSI Join
select e1.ename, e2.ename, e3.ename
from emp e1
join emp e2
on e1.mgr = e2.empno 
join emp e3
on e2.mgr = e3.empno;
-- 8. 7번 결과에서 상위 관리자가 없는 모든 사원의 이름도 사원명에 출력되도록 수정

--Oracle Join
select e1.ename, e2.ename, e3.ename
from emp e1, emp e2, emp e3
where e1.mgr = e2.empno(+) and e2.mgr = e3.empno(+);

--ANSI Join
select e1.ename, e2.ename, e3.ename
from emp e1 
left outer join emp e2
on e1.mgr = e2.empno
left outer join emp e3
on e2.mgr = e3.empno;
-- 9. 20번 부서의 이름과 그 부서에 근무하는 사원의 이름을 출력

--Oracle Join
select d.dname, e.ename
from emp e, dept d
where e.deptno = d.deptno
and d.deptno = 20 and e.deptno = 20;

--ANSI Join
select d.dname, e.ename
from emp e, dept d
where e.deptno = d.deptno
and d.deptno = 20 and e.deptno = 20;

-- 10. 커미션을 받는 사원의 이름, 커미션, 부서이름 출력

--Oracle Join
select e.ename, e.comm, d.dname
from emp e, dept d
where e.deptno = d.deptno
and e.comm is not null;

--ANSI Join
select e.ename, e.comm, d.dname
from emp e
join dept d
on e.deptno = d.deptno
where e.comm is not null;

-- 11. 이름에 A가 들어가는 사원들의 이름, 부서이름 출력

--Oracle Join
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
and e.ename like '%A%';

--ANSI Join
select e.ename, d.dname
from emp e
join dept d
on e.deptno = d.deptno
where e.ename like '%A%';

-- 12. DALLAS 지역에서 근무하는 사원 중 급여 1500이상인 사원의 이름, 급여, 입사일,
--     보너스(comm)를 출력

--Oracle Join
select ename, sal, hiredate, comm
from emp e, dept d
where e.deptno = d.deptno
and loc = 'DALLAS' and sal>=1500;

--ANSI Join
select ename, sal, hiredate, comm
from emp e
join dept d
on e.deptno = d.deptno
where loc = 'DALLAS' and sal>=1500;

-- 13. 자신의 관리자보다 연봉(sal)을 많이 받는 사원의 이름과 연봉을 출력

--Oracle Join
select e1.ename, e1.sal
from emp e1, emp e2
where e1.mgr = e2.empno
and e1.sal > e2.sal;

--ANSI Join
select e1.ename, e1.sal
from emp e1
join emp e2
on e1.mgr = e2.empno
where e1.sal > e2.sal;

-- 14. 직원 중 현재시간 기준으로 근무 개월 수가 30년(12*30)보다 많은 사람의 이름,
--     급여, 입사일, 부서명 출력

--Oracle Join
select e.ename, e.sal, e.hiredate, d.dname
from emp e, dept d
where e.deptno = d.deptno 
and (sysdate-e.hiredate)/365 >= 30;

select e.ename, e.sal, e.hiredate, d.dname
from emp e, dept d
where e.deptno = d.deptno 
and months_between(sysdate, hiredate) > (12*30);

--ANSI Join
select e.ename, e.sal, e.hiredate, d.dname
from emp e
join dept d
on e.deptno = d.deptno 
where (sysdate-e.hiredate)/365 >= 30;

select e.ename, e.sal, e.hiredate, d.dname
from emp e
join dept d
on e.deptno = d.deptno 
where months_between(sysdate, hiredate) > (12*30);

-- 15. 각 부서별로 1982년 이전에 입사한 직원들의 인원수를 출력

--Oracle Join
select count(empno)
from emp e, dept d
where e.deptno = d.deptno
and to_char(e.hiredate, 'yyyy') < 1982
group by d.deptno;

--ANSI Join
select count(empno)
from emp e
join dept d
on e.deptno = d.deptno
where to_char(e.hiredate, 'yyyy') < 1982
group by d.deptno;

