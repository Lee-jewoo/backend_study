show user;

-- ���� 34. �а� ���� 10% ����
update tb_department
set capacity=round(capacity*1.1);

rollback;
select capacity
from tb_department;

-- ���� 35. �л��� �ּ� ����
update tb_student
set student_address='����� ���α� ���ε� 181-21'
where student_no='A413042';

rollback;
select student_name, student_no, student_address
from tb_student
where student_no='A413042';

-- ���� 36. �ֹε�Ϲ�ȣ �ڸ���
update tb_student
set student_ssn = substr(student_ssn, 1, 6);

rollback;
select student_ssn
from tb_student;

-- ���� 37. ���� ����
update tb_grade
set point=3.5
where term_no=200501
      and class_no = (select class_no
                      from tb_class
                      where class_name = '�Ǻλ�����')
      and student_no = (select student_no
                        from tb_student join tb_department using (department_no)
                        where department_name='���а�' and student_name='�����');

rollback;
select point
from tb_grade join tb_student using (student_no)
join tb_department using (department_no)
join tb_class using (department_no)
where department_name='���а�' and student_name='�����'
and class_name='�Ǻλ�����' and term_no=200501;

-- ���� 38. ���л� ���� ����
delete
from tb_grade
where student_no in (select student_no
                     from tb_student
                     where absence_yn='Y');
                     
rollback;
















