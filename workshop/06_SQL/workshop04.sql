show user;

-- 문제 16. 동명이인 찾기
select student_name as "동일이름", count(*) as "동명인 수"
from tb_student
group by student_name
having count(*)>1;

-- 문제 17. 주소지가 강원도|경기도인 1900년대 학번
select student_name as "학생이름", 
       student_no as "학번", 
       student_address as "거주지 주소"
from tb_student
where substr(ENTRANCE_DATE, 1, 1)=9 and 
      (substr(STUDENT_ADDRESS, 1, 3)='경기도' 
       or substr(STUDENT_ADDRESS, 1, 3)='강원도')
order by 1 asc;

SELECT STUDENT_NAME AS "학생이름",
       STUDENT_NO AS "학번",
			 STUDENT_ADDRESS AS "거주지 주소" 
FROM   TB_STUDENT
WHERE  ( STUDENT_ADDRESS LIKE '%강원도%'
        OR STUDENT_ADDRESS LIKE '%경기도%' )
AND   TO_CHAR(ENTRANCE_DATE, 'RRRR') LIKE '19%' 
ORDER BY 1 ;

-- 문제 18. 법학과 교수를 나이순으로 정렬
select professor_name, professor_ssn
from tb_professor join tb_department using (department_no)
where department_name='법학과'
order by 2 asc;

-- 문제 19. 과목 이름과 과목의 학과 이름
select class_name, department_name
from tb_class join tb_department using (department_no);

-- 문제 20. 과목별 교수 이름
select class_name, professor_name
from tb_class join tb_class_professor using (class_no) 
              join tb_professor using (professor_no);
              
-- 문제 21. 인문사회계열 소속 교수 이름
select class_name, professor_name
from tb_class join tb_class_professor using (class_no) 
              join tb_professor using (professor_no)
              join tb_department on tb_department.department_no=tb_professor.department_no
where category='인문사회';

-- 문제 22. 음악학과 학생들의 평점
select student_no as "학번", student_name as "학생 이름", round(avg(point), 1) as "전체 평점"
from tb_student join tb_grade using (student_no) 
join tb_department on tb_student.department_no=tb_department.department_no
where department_name='음악학과'
group by student_no, student_name
order by 1 asc;

-- 문제 23. 결석생 정보
select department_name as "학과이름", student_name as "학생이름", 
       professor_name as "지도교수이름"
from tb_student join tb_department using (department_no)
                join tb_professor on tb_student.coach_professor_no=tb_professor.professor_no
where student_no='A313047';

-- 문제 24. 07년 인간관계론 수강 학생
select student_name, term_no
from tb_student join tb_grade using (student_no)
join tb_class using (class_no)
where substr(term_no, 1, 4)=2007 and class_name='인간관계론';

-- 문제 25. 예체능계열 과목 중 담당교수가 없는 과목
select class_name, department_name
from tb_class join tb_department using (department_no)
left join tb_class_professor using(class_no)
where category='예체능' and professor_no is null;

select class_name, department_name
from tb_class join tb_department using (department_no)
where category='예체능' 
      and class_no not in (select distinct class_no
                           from tb_class_professor);

-- 문제 26. 서반아어학과 학생의 지도교수 찾기. 없으면 '지도교수 미지정'
select student_name as "학생이름", 
       nvl(professor_name, '지도교수 미지정') as "지도교수"
from tb_student left join tb_professor on tb_student.coach_professor_no=tb_professor.professor_no
join tb_department on tb_student.department_no=tb_department.department_no
where department_name='서반아어학과';

-- 문제 27. 환경조경학과 전공과목 과목별 평점
select class_no, class_name, round(avg(point), 3)
from tb_class join tb_grade using (class_no)
join tb_department on tb_class.department_no=tb_department.department_no
where department_name='환경조경학과' and substr(class_type, 1, 2)='전공'
group by class_no, class_name
order by 1 asc;

-- 문제 28. 환경조경학과와 같은 계열의 학과별 전공 과목 평점
select department_name as "계열 학과명", round(avg(point), 1) as "전공평점"
from tb_department join tb_class using (department_no)
join tb_grade on tb_class.class_no=tb_grade.class_no
where category in (select category 
                   from tb_department 
                   where department_name='환경조경학과')
group by department_name
order by 1 asc;











