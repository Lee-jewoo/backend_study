show user;

create table location
( loc VARCHAR2(20) CONSTRAINT loc1_pk PRIMARY KEY,
  city1 NUMBER(3) NOT NULL,
  city2 NUMBER(3));
  
insert into location (loc, city1)
values ('서울특별시', '1');
insert into location (loc, city1)
values ('경기도', '2');
insert into location (loc, city1, city2)
values ('강동구', '1', '1');
insert into location (loc, city1, city2)
values ('강남구', '1', '2');
insert into location (loc, city1, city2)
values ('강서구', '1', '3');
insert into location (loc, city1, city2)
values ('성남시', '2', '1');
insert into location (loc, city1, city2)
values ('하남시', '2', '2');

commit;

create table momo
(momoid NUMBER(4) CONSTRAINT momo_pk PRIMARY KEY,
momoName VARCHAR(10) NOT NULL,
momoLoc1 VARCHAR(20), CONSTRAINT momoLoc1_fk FOREIGN KEY(momoLoc1) references location(loc),
momoLoc2 VARCHAR(20), CONSTRAINT momoLoc2_fk FOREIGN KEY(momoLoc2) references location(loc));

CREATE SEQUENCE momo_seq START WITH 1 INCREMENT BY 1 NOCYCLE NOCACHE;

insert into momo (momoid, momoName, momoLoc1, momoLoc2)
values (momo_seq.NEXTVAL, '운동', '서울특별시', '강동구');
insert into momo (momoid, momoName, momoLoc1, momoLoc2)
values (momo_seq.NEXTVAL, '음식', '서울특별시', '강남구');
insert into momo (momoid, momoName, momoLoc1, momoLoc2)
values (momo_seq.NEXTVAL, '여행', '경기도', '하남시');

select momo.momoid, momo.momoName
from momo left outer join location
on momo.city2=location.loc ;

ALTER TABLE momo RENAME COLUMN momoLoc2 TO city2;

commit;
