-- notice 테이블 생성
create table notice
( no NUMBER(4) CONSTRAINT notice_no_pk PRIMARY KEY,
  title VARCHAR2(200) CONSTRAINT notice_title_nn NOT NULL,
  author VARCHAR2(20) CONSTRAINT notice_author_nn NOT NULL,
  content VARCHAR2(400),
  writeday DATE DEFAULT SYSDATE,
  readcnt NUMBER(4) DEFAULT 0);
  
create sequence notice_seq;

insert into notice (no, title, author, content)
values (notice_seq.nextval, '테스트', '춘식이', '테스트입니다.');
commit;
