show user;

-- ���� 16. �������� ã��
select student_name as "�����̸�", count(*) as "������ ��"
from tb_student
group by student_name
having count(*)>1;

-- ���� 17. �ּ����� ������|��⵵�� 1900��� �й�
select student_name as "�л��̸�", 
       student_no as "�й�", 
       student_address as "������ �ּ�"
from tb_student
where substr(ENTRANCE_DATE, 1, 1)=9 and 
      (substr(STUDENT_ADDRESS, 1, 3)='��⵵' 
       or substr(STUDENT_ADDRESS, 1, 3)='������')
order by 1 asc;

SELECT STUDENT_NAME AS "�л��̸�",
       STUDENT_NO AS "�й�",
			 STUDENT_ADDRESS AS "������ �ּ�" 
FROM   TB_STUDENT
WHERE  ( STUDENT_ADDRESS LIKE '%������%'
        OR STUDENT_ADDRESS LIKE '%��⵵%' )
AND   TO_CHAR(ENTRANCE_DATE, 'RRRR') LIKE '19%' 
ORDER BY 1 ;

-- ���� 18. ���а� ������ ���̼����� ����
select professor_name, professor_ssn
from tb_professor join tb_department using (department_no)
where department_name='���а�'
order by 2 asc;

-- ���� 19. ���� �̸��� ������ �а� �̸�
select class_name, department_name
from tb_class join tb_department using (department_no);

-- ���� 20. ���� ���� �̸�
select class_name, professor_name
from tb_class join tb_class_professor using (class_no) 
              join tb_professor using (professor_no);
              
-- ���� 21. �ι���ȸ�迭 �Ҽ� ���� �̸�
select class_name, professor_name
from tb_class join tb_class_professor using (class_no) 
              join tb_professor using (professor_no)
              join tb_department on tb_department.department_no=tb_professor.department_no
where category='�ι���ȸ';

-- ���� 22. �����а� �л����� ����
select student_no as "�й�", student_name as "�л� �̸�", round(avg(point), 1) as "��ü ����"
from tb_student join tb_grade using (student_no) 
join tb_department on tb_student.department_no=tb_department.department_no
where department_name='�����а�'
group by student_no, student_name
order by 1 asc;

-- ���� 23. �Ἦ�� ����
select department_name as "�а��̸�", student_name as "�л��̸�", 
       professor_name as "���������̸�"
from tb_student join tb_department using (department_no)
                join tb_professor on tb_student.coach_professor_no=tb_professor.professor_no
where student_no='A313047';

-- ���� 24. 07�� �ΰ������ ���� �л�
select student_name, term_no
from tb_student join tb_grade using (student_no)
join tb_class using (class_no)
where substr(term_no, 1, 4)=2007 and class_name='�ΰ������';

-- ���� 25. ��ü�ɰ迭 ���� �� ��米���� ���� ����
select class_name, department_name
from tb_class join tb_department using (department_no)
left join tb_class_professor using(class_no)
where category='��ü��' and professor_no is null;

select class_name, department_name
from tb_class join tb_department using (department_no)
where category='��ü��' 
      and class_no not in (select distinct class_no
                           from tb_class_professor);

-- ���� 26. ���ݾƾ��а� �л��� �������� ã��. ������ '�������� ������'
select student_name as "�л��̸�", 
       nvl(professor_name, '�������� ������') as "��������"
from tb_student left join tb_professor on tb_student.coach_professor_no=tb_professor.professor_no
join tb_department on tb_student.department_no=tb_department.department_no
where department_name='���ݾƾ��а�';

-- ���� 27. ȯ�������а� �������� ���� ����
select class_no, class_name, round(avg(point), 3)
from tb_class join tb_grade using (class_no)
join tb_department on tb_class.department_no=tb_department.department_no
where department_name='ȯ�������а�' and substr(class_type, 1, 2)='����'
group by class_no, class_name
order by 1 asc;

-- ���� 28. ȯ�������а��� ���� �迭�� �а��� ���� ���� ����
select department_name as "�迭 �а���", round(avg(point), 1) as "��������"
from tb_department join tb_class using (department_no)
join tb_grade on tb_class.class_no=tb_grade.class_no
where category in (select category 
                   from tb_department 
                   where department_name='ȯ�������а�')
group by department_name
order by 1 asc;











