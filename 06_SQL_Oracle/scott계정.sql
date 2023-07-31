show user;
-- 컬럼명을 지정해 레코드 추가
INSERT INTO dept( deptno, dname, loc )
VALUES ( 50 ,'개발','서울');

INSERT INTO dept( deptno, dname )
VALUES ( 51 ,'개발');

-- 컬럼명을 지정하지 않고 레코드 추가
INSERT INTO dept
VALUES ( 60, '인사', '경기');

INSERT INTO dept
VALUES ( 61, '인사'); -- 에러

-- null 값 저장
INSERT INTO dept(deptno, dname , loc )
VALUES ( 80, '인사', NULL );

-- 빈 테이블 생성
CREATE TABLE mydept
AS
SELECT * FROM dept
WHERE 1=2;

-- 데이터 포함 테이블 생성
CREATE TABLE mydept2
AS
SELECT * FROM dept;

-- mydept에 복수행 삽입
select *
from mydept;

INSERT INTO mydept
SELECT deptno, dname, loc
FROM dept;

-- 복수 테이블에 복수행 삽입
-- 무조건 insert all
CREATE TABLE myemp_hire
AS
SELECT empno, ename, hiredate, sal
FROM emp
WHERE 1=2;

CREATE TABLE myemp_mgr
AS
SELECT empno, ename, mgr
FROM emp
WHERE 1=2;

INSERT ALL
INTO myemp_hire VALUES ( empno, ename, hiredate, sal )
INTO myemp_mgr VALUES ( empno, ename, mgr )
SELECT empno, ename, hiredate, sal, mgr
FROM emp;

select *
from myemp_hire;
select *
from myemp_mgr;

-- 조건 insert all
CREATE TABLE myemp_hire2
AS
SELECT empno, ename, hiredate, sal
FROM emp
WHERE 1=2;

CREATE TABLE myemp_mgr2
AS
SELECT empno, ename, mgr, sal
FROM emp
WHERE 1=2;

INSERT ALL
WHEN sal = 800 THEN
 INTO myemp_hire2 VALUES ( empno, ename, hiredate, sal )
WHEN sal < 2500 THEN
 INTO myemp_mgr2 VALUES ( empno, ename, mgr, sal )
SELECT empno, ename, hiredate, sal, mgr
FROM emp;

select *
from myemp_hire2;
select *
from myemp_mgr2;

-- insert first
CREATE TABLE myemp_hire3
AS
SELECT empno, ename, hiredate, sal
FROM emp
WHERE 1=2;

CREATE TABLE myemp_mgr3
AS
SELECT empno, ename, mgr, sal
FROM emp
WHERE 1=2;

INSERT FIRST
WHEN sal = 800 THEN
 INTO myemp_hire3 VALUES ( empno, ename, hiredate, sal )
WHEN sal < 2500 THEN
 INTO myemp_mgr3 VALUES ( empno, ename, mgr, sal )
SELECT empno, ename, hiredate, sal, mgr
FROM emp;

select *
from myemp_hire3;
select *
from myemp_mgr3;

-- update
select *
from mydept;
UPDATE mydept
SET dname='영업',loc='경기' WHERE deptno = 50;
UPDATE mydept
SET dname='영업',loc='경기';
rollback;
-- subquery를 이용한 update
UPDATE mydept
SET dname= ( SELECT dname
             FROM dept
             WHERE deptno = 10)
 ,loc= ( SELECT loc
         FROM dept
         WHERE deptno=20)
WHERE deptno = 60;

-- delete
DELETE FROM mydept
WHERE deptno = 50;
DELETE FROM mydept;
rollback;

select *
from mydept;
-- subquery를 이용한 update
DELETE 
FROM mydept
WHERE loc = (SELECT loc
             FROM dept
             WHERE deptno = 20);

commit;

select *
from mydept;

-- 한글 바이트 확인
select *
from NLS_DATABASE_PARAMETERS;

-- table 생성
-- 일반적 방법 1
CREATE TABLE scott.employee
( empno NUMBER(4),
  ename VARCHAR2(20),
  hiredate DATE,
  sal NUMBER(7,2));

-- 일반적 방법 2. default
CREATE TABLE employee2
( empno NUMBER(4),
  ename VARCHAR2(20),
  hiredate DATE DEFAULT SYSDATE,
  sal NUMBER(7,2));
INSERT INTO employee2 (empno, ename, sal)
VALUES ( 10, '홍길동', 3000);
select *
from employee2;

-- 일반적 방법 3. 제약조건
-- 컬럼 레벨 primary key
CREATE TABLE department
(deptno NUMBER(2) CONSTRAINT department_deptno_pk PRIMARY KEY,
 dname VARCHAR2(15),
 loc VARCHAR2(15));
CREATE TABLE department10
(deptno NUMBER(2) PRIMARY KEY,
 dname VARCHAR2(15),
 loc VARCHAR2(15));
-- 제약 조건 확인
select *
from user_constraints
where table_name = 'DEPARTMENT10';

-- 테이블 레벨 primary key
CREATE TABLE department2
( deptno NUMBER(2), 
  dname VARCHAR2(15),
  loc VARCHAR2(15),
  CONSTRAINT department2_deptno_pk PRIMARY KEY(deptno)
);
select *
from user_constraints
where table_name = 'DEPARTMENT2';

-- 복합 컬럼의 제약 조건 지정
CREATE TABLE department3
( deptno NUMBER(2), 
  dname VARCHAR2(15),
  loc VARCHAR2(15),
  CONSTRAINT department3_deptno_pk PRIMARY KEY(deptno, loc)
);
select *
from user_constraints
where table_name = 'DEPARTMENT3';

-- 컬럼 레벨 unique
CREATE TABLE department4
( deptno NUMBER(2) CONSTRAINT department4_deptno_pk PRIMARY KEY,
  dname VARCHAR2(15) CONSTRAINT department4_dname_uk UNIQUE,
  loc VARCHAR2(15) );
insert into department4 (deptno, dname, loc) values (1, 'aa', 'bb');
insert into department4 (deptno, dname, loc) values (2, null, 'bb');

-- 테이블 레벨 unique
CREATE TABLE department5
(deptno NUMBER(2) CONSTRAINT department5_deptno_pk PRIMARY KEY,
 dname VARCHAR2(15), 
 loc VARCHAR2(15),
 CONSTRAINT department5_dname_uk UNIQUE(dname)
);

CREATE TABLE department11
(deptno NUMBER(2),
 dname VARCHAR2(15), 
 loc VARCHAR2(15),
 CONSTRAINT department11_deptno_pk PRIMARY KEY(deptno),
 CONSTRAINT department11_dname_uk UNIQUE(dname)
);

-- 컬럼 레벨 not null
CREATE TABLE department6
(deptno NUMBER(2) CONSTRAINT department6_deptno_pk PRIMARY KEY,
 dname VARCHAR2(15) CONSTRAINT department6_dname_uk UNIQUE,
 loc VARCHAR2(15) CONSTRAINT department6_loc_nn NOT NULL);

CREATE TABLE department12
(deptno NUMBER(2),
 dname VARCHAR2(15),
 loc VARCHAR2(15) CONSTRAINT department12_loc_nn NOT NULL,
 CONSTRAINT department12_deptno_pk PRIMARY KEY(deptno),
 CONSTRAINT department12_dname_uk UNIQUE(dname)
 );

-- 컬럼 레벨 check
CREATE TABLE department7
(deptno NUMBER(2),
 dname VARCHAR2(15)
 CONSTRAINT department7_dname_ck CHECK(dname IN('개발','인사')),
 loc VARCHAR2(15) 
);
insert into department7 (deptno, dname, loc) values (1, '개발', 'bb');
insert into department7 (deptno, dname, loc) values (2, '인사', 'bb');
insert into department7 (deptno, dname, loc) values (3, '관리', 'bb');

-- 테이블 레벨 check
CREATE TABLE department8
(deptno NUMBER(2),
 dname VARCHAR2(15),
 loc VARCHAR2(15),
 CONSTRAINT department8_dname_ck CHECK(dname IN('개발','인사')) 
);
insert into department8 (deptno, dname, loc) values (1, '개발', 'bb');
insert into department8 (deptno, dname, loc) values (2, '인사', 'bb');
-- insert into department8 (deptno, dname, loc) values (3, '관리', 'bb');

-- 컬럼 레벨 foreign key
-- master 테이블
create table m1
(no NUMBER(2) CONSTRAINT m1_no_pk PRIMARY KEY, 
 name VARCHAR2(10));
insert into m1 (no, name) values (10, 'aa');
insert into m1 (no, name) values (20, 'bb');
insert into m1 (no, name) values (30, 'cc');
commit;
select *
from m1;
-- slave 테이블
create table s1
(num NUMBER(4) CONSTRAINT s1_num_pk PRIMARY KEY,
 email VARCHAR(20),
 no NUMBER(2) CONSTRAINT s1_no_fk REFERENCES m1(no));
insert into s1 (num, email, no) values (100, 'xx', 10);
insert into s1 (num, email, no) values (200, 'xx2', 20);
insert into s1 (num, email, no) values (300, 'xx3', 30);
insert into s1 (num, email, no) values (400, 'xx4', null);
-- insert into s1 (num, email, no) values (500, 'xx5', 50);

-- 테이블 레벨 foreign key
-- master 테이블
create table m2
(no NUMBER(2) CONSTRAINT m2_no_pk PRIMARY KEY, 
 name VARCHAR2(10));
insert into m2 (no, name) values (10, 'aa');
insert into m2 (no, name) values (20, 'bb');
insert into m2 (no, name) values (30, 'cc');
commit;
select *
from m2;
-- slave 테이블
create table s2
(num NUMBER(4) CONSTRAINT s2_num_pk PRIMARY KEY,
 email VARCHAR(20),
 no NUMBER(2),
 CONSTRAINT s2_no_fk FOREIGN KEY(no) REFERENCES m2(no));
insert into s2 (num, email, no) values (100, 'xx', 10);
insert into s2 (num, email, no) values (200, 'xx2', 20);
insert into s2 (num, email, no) values (300, 'xx3', 30);
insert into s2 (num, email, no) values (400, 'xx4', null);
-- insert into s1 (num, email, no) values (500, 'xx5', 50);

-- ON DELETE CASCADE
-- fk가 참조하고 있는 것을 삭제할 수 있도록 함
create table m3
(no NUMBER(2) CONSTRAINT m3_no_pk PRIMARY KEY, 
 name VARCHAR2(10));
insert into m3 (no, name) values (10, 'aa');
insert into m3 (no, name) values (20, 'bb');
insert into m3 (no, name) values (30, 'cc');

create table s3
(num NUMBER(4) CONSTRAINT s3_num_pk PRIMARY KEY,
 email VARCHAR(20),
 no NUMBER(2),
 CONSTRAINT s3_no_fk FOREIGN KEY(no) REFERENCES m3(no)
 ON DELETE CASCADE);
insert into s3 (num, email, no) values (100, 'xx', 10);
insert into s3 (num, email, no) values (200, 'xx2', 20);
insert into s3 (num, email, no) values (300, 'xx3', 30);
insert into s3 (num, email, no) values (400, 'xx4', null);
commit;

select *
from m3;
select *
from s3;

delete from m3
where no = 10;

-- ON DELETE SET NULL
-- master 테이블의 삭제한 값을 null로 저장
create table m4
(no NUMBER(2) CONSTRAINT m4_no_pk PRIMARY KEY, 
 name VARCHAR2(10));
insert into m4 (no, name) values (10, 'aa');
insert into m4 (no, name) values (20, 'bb');
insert into m4 (no, name) values (30, 'cc');

create table s4
(num NUMBER(4) CONSTRAINT s4_num_pk PRIMARY KEY,
 email VARCHAR(20),
 no NUMBER(2),
 CONSTRAINT s4_no_fk FOREIGN KEY(no) REFERENCES m4(no)
 ON DELETE SET NULL);
insert into s4 (num, email, no) values (100, 'xx', 10);
insert into s4 (num, email, no) values (200, 'xx2', 20);
insert into s4 (num, email, no) values (300, 'xx3', 30);
insert into s4 (num, email, no) values (400, 'xx4', null);
commit;

select *
from m4;
select *
from s4;

delete from m4
where no=10;

-- 테이블 삭제
drop table mydept;
drop table mydept2;

-- m1과 s1의 제약 조건 확인
select *
from user_constraints
where table_name='S1';
-- 제약 조건, 테이블 삭제
drop table m1 CASCADE CONSTRAINT;

-- 테이블 생성 실습
-- 예제 1. subject 테이블
create table subject
(subno NUMBER(5) CONSTRAINT subject_subno_pk primary key,
 subname VARCHAR2(20) CONSTRAINT subject_subname_nn not null,
 term VARCHAR2(1) CONSTRAINT subject_term_ck check (term in ('1','2')),
 type VARCHAR2(4) CONSTRAINT subject_type_ck check (type in ('필수','선택')));
 
-- 예제 2. sugang 테이블
create table student
( studno number(5) constraint student_studno_pk PRIMARY KEY,
  stuname varchar2(10));
  
create table sugang
(studno number(5) constraint sugang_studno_fk references student(studno),
 subno number(5) constraint sugang_subno_fk references subject(subno),
 regdate date,
 result number(3),
 constraint sugang_studno_subno_pk primary key(studno, subno));
 













