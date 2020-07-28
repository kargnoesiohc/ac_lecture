 create table student
  ( studno number(5) constraint student_studno_pk PRIMARY KEY,
    stuname varchar2(10) );

create table subject
(
subno number(5) primary key,
subname varchar2(20) not null,
term varchar2(1) constraint subject_term_check check(term in('1','2')),
type varchar2(4) constraint subject_type_check check(type in('필수','선택'))
);

create table sugang
(
studno number(5),
subno number(5),
regdate date,
result number(3),
constraints sugang_fk foreign key (subno) 
references subject(subno));

alter table sugang
add constraint sugang_fk2 foreign key (studno)
references student(studno);

alter table sugang
add constraint sugang_pk primary key(studno, subno);

select * from user_constraints
where table_name = 'SUGANG';

 create table student1
  ( studno number(5) constraint student1_studno_pk PRIMARY KEY,
    stuname varchar2(10) );
    
create table subject1
(
subno number(5) primary key,
subname varchar2(20) not null,
term varchar2(1) constraint subject1_term_check check(term in('1','2')),
type varchar2(4) constraint subject1_type_check check(type in('필수','선택'))
);

create table sugang1
(
studno number(5) constraint sugang1_fk1 foreign key (studno) references student1(studno),
subno number(5) constraints sugang1_fk2 foreign key (subno) references subject1(subno),
regdate date,
result number(3),
constraints sugang1_pk primary key(studno, subno) 
);

