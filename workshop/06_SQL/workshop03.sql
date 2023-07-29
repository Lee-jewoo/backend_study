show user;

-- 문제 1. 01학년 사학과 학생 수
select department_name, department_no
from tb_department;

select count(*) as "학생 수"
from tb_student
where department_no=003 AND substr(entrance_date, 1, 2)='01';

-- 문제 2. '공학'계열 중 정원이 20이상 30이하인 학과
select category as "계열", department_name as "학과이름", capacity as "정원"
from tb_department
where category='공학' and capacity between 20 and 30
order by 2 asc;

-- 문제 3. '학'이 들어간 계열의 학과 수
select category as "계열", count(*) as "학과수"
from tb_department
where category like '%학%'
group by category
order by 2 desc;

-- 문제 4. 영문학과 교수 조회
select department_name, department_no
from tb_department;

select professor_name as "교수이름", substr(professor_ssn, 1, 2) as "출생년도", professor_address as "주소"
from tb_professor
where department_no=002
order by 2 asc;

-- 문제 5. 국문학과 학생 조회
select department_name, department_no
from tb_department;

select department_no as "학과번호", student_name as "학생이름", 
       case absence_yn when 'Y' then '휴학' 
       when 'N' then '정상' end
       as "휴학여부"
from tb_student
where department_no=001 and substr(student_address, 1, 2)='서울'
order by 2 asc;

-- 문제 6. 80년생 여학생 중 '김'씨 성의 학생
select substr(student_ssn, 1, 8)||'******' as "주민번호", student_name as "이름"
from tb_student
where student_ssn like '80_____2%' and substr(student_name, 1, 1)='김'
order by 2 asc;

-- 문제 7. 예체능계열 학과 정원 기준 강의실 배정
select department_name as "학과이름", capacity as "현재정원", 
       case when capacity>=40 then '대강의실'
            when capacity>=30 then '중강의실'
            else '소강의실'
       end as "강의실크기"
from tb_department
where category='예체능'
order by 2 desc;

-- 문제 8. 2005~2006년 입학생 중 주소가 등록되지 않은 남학생
select department_no as "학과번호", student_name as "학생이름", 
       coach_professor_no as "지도교수번호", to_char(entrance_date, 'YYYY"년"') as 입학년도
from tb_student
where (substr(entrance_date, 1, 2)=05 or substr(entrance_date, 1, 2)=06) 
       and student_address is null 
       and substr(student_ssn, 8, 1)=1
order by 4 asc;










