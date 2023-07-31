show user;

-- 문제 34. 학과 정원 10% 증가
update tb_department
set capacity=round(capacity*1.1);

rollback;
select capacity
from tb_department;

-- 문제 35. 학생의 주소 변경
update tb_student
set student_address='서울시 종로구 숭인동 181-21'
where student_no='A413042';

rollback;
select student_name, student_no, student_address
from tb_student
where student_no='A413042';

-- 문제 36. 주민등록번호 자르기
update tb_student
set student_ssn = substr(student_ssn, 1, 6);

rollback;
select student_ssn
from tb_student;

-- 문제 37. 성적 수정
update tb_grade
set point=3.5
where term_no=200501
      and class_no = (select class_no
                      from tb_class
                      where class_name = '피부생리학')
      and student_no = (select student_no
                        from tb_student join tb_department using (department_no)
                        where department_name='의학과' and student_name='김명훈');

rollback;
select point
from tb_grade join tb_student using (student_no)
join tb_department using (department_no)
join tb_class using (department_no)
where department_name='의학과' and student_name='김명훈'
and class_name='피부생리학' and term_no=200501;

-- 문제 38. 휴학생 성적 제거
delete
from tb_grade
where student_no in (select student_no
                     from tb_student
                     where absence_yn='Y');
                     
rollback;
















