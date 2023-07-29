show user;

-- ���� 1. ����, ��¥
select STUDENT_NO as "�й�", STUDENT_NAME as "�̸�",
       to_char(ENTRANCE_DATE, 'RRRR-MM-DD') as ���г⵵
from TB_STUDENT
WHERE DEPARTMENT_NO = 002
ORDER BY 3 ASC;

-- ���� 2. ���� ����
select professor_name, professor_ssn
from tb_professor
where length(professor_name)!=3;

-- ���� 3. ����
select professor_name as "�����̸�",
to_number(to_char(sysdate, 'YYYY'))-to_number('19'||substr(professor_ssn, 1, 2)) as "����"
from tb_professor
where substr(PROFESSOR_SSN, 8, 1)=1
order by 2 asc;

-- ���� 4. �̸����� ���� ����
select substr(PROFESSOR_NAME, 2)
from tb_professor;

-- ���� 5. ����� ã��
select student_no, student_name
from TB_STUDENT
where to_number(to_char(ENTRANCE_DATE, 'YYYY'))-to_number(to_char(to_date(substr(student_ssn, 1, 2), 'RR'), 'YYYY'))>19
order by 1 asc;

-- ���� 6. ũ�������� ����
select to_char(to_date('2020/12/25'), 'YYYYMMDD DAY')
from dual;

-- ���� 8. 2000�⵵ ���� ���� �л�
select student_no, student_name
from tb_student
where substr(student_no, 1, 1)!='A'
order by 1 asc;

-- ���� 9. �׷� �Լ� (���)
select round(avg(point), 1)
from tb_grade
where student_no='A517178';

-- ���� 10. �а��� �л� ��
select department_no as "�а���ȣ", count(*) as "�л���(��)"
from tb_student
group by department_no
order by 1 asc;

-- ���� 11. is null
select COUNT(*)
from tb_student
where coach_professor_no is null;

-- ���� 12. ������ ����
select substr(term_no, 1, 4) as "�⵵", round(avg(point), 1) as "�⵵ �� ����"
from tb_grade
where student_no='A112113'
group by substr(term_no, 1, 4)
order by 1 asc;

-- ���� 13. ���л� ��
-- select department_no as "�а��ڵ��", count(*) as "���л� ��"
-- where absence_yn = 'Y'
-- => ���л��� ���� �а��� ��µ��� ����
select department_no as "�а��ڵ��", sum(case when absence_yn='Y' then 1 else 0 end) as "���л� ��"
from tb_student
group by department_no
order by 1 asc;

-- ���� 14. ��������
select student_name as "�����̸�", count(*) as "������ ��"
from tb_student
group by student_name
having count(*)>1;



