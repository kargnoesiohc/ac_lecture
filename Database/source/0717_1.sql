select empno, ename, job, dept.deptno, dname, loc
from dept, emp
order by empno;

select empno, ename, dept.dname, loc
from emp, dept
where emp.deptno = dept.deptno;

select empno, ename, d.dname, loc
from emp e, dept d
where e.deptno = d.deptno;

select e.empno, e.ename, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno and e.empno = 7900;

select ename, sal, grade
from emp, salgrade 
where sal between losal and hisal;

select e.empno, e.ename, e.job, e.sal, s.grade, s.losal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and s.hisal and e.deptno=10;
select * from salgrade;

select e.empno, e.ename, e.job, e.deptno
, d.deptno, d.dname, d.loc
from dept d, emp e
where d.deptno = e.deptno(+);

select * from emp;

select e1.ename "사원", e2.ename "관리자"
from emp e1, emp e2
where e1.mgr = e2.empno(+);

select empno, ename, dname, loc 
from emp
natural join dept
order by loc;

select empno, ename, dname, loc
from emp
join dept
using(deptno);

select empno, ename, dname, loc
from emp e, dept d
where e.deptno = d.deptno;

SELECT empno, ename, dname, loc
FROM emp e 
JOIN dept d
ON e.deptno = d.deptno
where d.deptno = 10;

SELECT e.empno, e.ename, d.dname, d.deptno, e.sal, s.grade
FROM emp e 
JOIN dept d
ON e.deptno = d.deptno
JOIN salgrade s
ON e.sal BETWEEN losal and hisal;

SELECT e.empno, e.ename, d.dname, sal
FROM emp e
JOIN dept d
ON e.deptno = d.deptno
AND SAL IN(800);

SELECT e1.ename, e2.ename
FROM emp e1
JOIN emp e2
ON e1.mgr = e2.empno; 

SELECT empno, ename, dname
FROM dept d left OUTER JOIN emp e 
ON d.deptno = e.deptno;

insert into emp
values(9000, 'TEST', 'SALES', 7499, '90/01/01', 400, NULL, NULL);

select * from emp;

SELECT empno, ename, dname
FROM dept d left OUTER JOIN emp e 
ON d.deptno = e.deptno;

SELECT empno, ename, dname
FROM dept d full OUTER JOIN emp e 
ON d.deptno = e.deptno;



