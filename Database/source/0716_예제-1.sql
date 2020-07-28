-- 1. 사원테이블에서 입사일이 12월인 사원의 사번, 사원명, 입사일 
select empno, ename, hiredate
from emp where to_char(hiredate, 'mm') = '12';

-- 2. 다음과 같은 결과를 검색할 수 있는 SQL문
--    (사번, 이름, 급여 10자리(빈 자리는 '*' 채움)
select empno, ename, lpad(sal, 10, '*') from emp;

-- 3. 다음과 같은 결과를 검색할 수 있는 SQL문
--    (사번, 이름, 입사일(YYYY-MM-DD)형식
select empno, ename, to_char(hiredate, 'yyyy-mm-dd')"입사일" 
from emp;

-- 4. 사원테이블에서 영업사원과 일반사원 구분하여 출력
--CASE문
select empno, ename, comm, 
 case when comm is null then '일반사원'
      else '영업사원' end "사원종류" 
from emp;
--DECODE문 
select empno, ename, comm, 
 decode(comm, null, '일반사원', '영업사원') "사원종류"
from emp;

-- 5. 부서 테이블에서 부서 위치를 미국의 동부, 서부, 중부로 구분
select * from dept;
--CASE문
select loc
, case loc when 'NEW YORK' then 'EAST'
           when 'BOSTON' then 'EAST' else 'CENTER' end "AREA"
from dept;

--DECODE문
select loc
, decode (loc, 'NEW YORK', 'EAST'
           ,'BOSTON', 'EAST', 'CENTER') "AREA"
from dept;

-- 6. 사원테이블에서 급여가 2000이상이면 보너스를 1000, 
--    1000이상이면 500, 1000미만이면 0으로 계산하여 출력
--CASE문
select ename, sal
, case when sal>=2000 then 1000
       when sal>=1000 then 500
       else 0 end "BONUS" 
from emp;

-- 7. 사원 테이블에서 급여에 따라 사번, 이름, 급여, 등급을 검색하는 SQL문
--    (CASE함수와 DECODE 각각 구현, DECODE 사용시 SIGN함수 사용)
--CASE문
select * from emp;
select empno, ename, sal
, case when sal<=5000 and sal>4000 then 'A'
       when sal<=4000 and sal>3000 then 'B'
       when sal<=3000 and sal>2000 then 'C'
       when sal<=2000 and sal>1000 then 'D'
       else 'E' end "등급" 
from emp order by sal desc;

--DECODE문 / 미완성
select empno, ename, sal
, decode (-1,sign(sal-1001), 'E',
             sign(sal-2001), 'D',
             sign(sal-3001), 'C',
             sign(sal-4001), 'B', 'A')
from emp;