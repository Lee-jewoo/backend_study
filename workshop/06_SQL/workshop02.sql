show user;

-- 문제 1. 정렬, 날짜
select STUDENT_NO as "학번", STUDENT_NAME as "이름",
       to_char(ENTRANCE_DATE, 'RRRR-MM-DD') as 입학년도
from TB_STUDENT
WHERE DEPARTMENT_NO = 002
ORDER BY 3 ASC;

-- 문제 2. 문자 길이
select professor_name, professor_ssn
from tb_professor
where length(professor_name)!=3;

-- 문제 3. 정렬
select professor_name as "교수이름",
to_number(to_char(sysdate, 'YYYY'))-to_number('19'||substr(professor_ssn, 1, 2)) as "나이"
from tb_professor
where substr(PROFESSOR_SSN, 8, 1)=1
order by 2 asc;

-- 문제 4. 이름에서 성을 제외
select substr(PROFESSOR_NAME, 2)
from tb_professor;

-- 문제 5. 재수생 찾기
select student_no, student_name
from TB_STUDENT
where to_number(to_char(ENTRANCE_DATE, 'YYYY'))-to_number(to_char(to_date(substr(student_ssn, 1, 2), 'RR'), 'YYYY'))>19
order by 1 asc;

-- 문제 6. 크리스마스 요일
select to_char(to_date('2020/12/25'), 'YYYYMMDD DAY')
from dual;

-- 문제 8. 2000년도 이전 입학 학생
select student_no, student_name
from tb_student
where substr(student_no, 1, 1)!='A'
order by 1 asc;

-- 문제 9. 그룹 함수 (평균)
select round(avg(point), 1)
from tb_grade
where student_no='A517178';

-- 문제 10. 학과별 학생 수
select department_no as "학과번호", count(*) as "학생수(명)"
from tb_student
group by department_no
order by 1 asc;

-- 문제 11. is null
select COUNT(*)
from tb_student
where coach_professor_no is null;

-- 문제 12. 연도별 평점
select substr(term_no, 1, 4) as "년도", round(avg(point), 1) as "년도 별 평점"
from tb_grade
where student_no='A112113'
group by substr(term_no, 1, 4)
order by 1 asc;

-- 문제 13. 휴학생 수
-- select department_no as "학과코드명", count(*) as "휴학생 수"
-- where absence_yn = 'Y'
-- => 휴학생이 없는 학과는 출력되지 않음
select department_no as "학과코드명", sum(case when absence_yn='Y' then 1 else 0 end) as "휴학생 수"
from tb_student
group by department_no
order by 1 asc;

-- 문제 14. 동명이인
select student_name as "동일이름", count(*) as "동명인 수"
from tb_student
group by student_name
having count(*)>1;



