-- sys -- 
create user tester identified by tester; --계정 생성
alter user tester account unlock; -- lock 해제
grant connect, resource to tester; -- 권한 부여
alter user tester identified by tester; -- 패스워드 변경
-- 새 데이터베이스 접속하여 새로 생성

-- user01 --
select * from session_privs;
-- scott --
grant select --dept 테이블에 대한 select 권한부여
on dept
to user01;
-- user01 -- 
select * from dept; --사용자 지정 안해서 오류

select * from scott.dept;
-- scott --
grant update(dname) --dept 테이블에 대한 update 권한부여
on dept
to user01;

-- user01 --
update scott.dept -- loc권한 없어서 권한 불충분 에러
set loc = 'AAA'; 

update scott.dept
set dname = '인사'
where deptno = 40;


