show user;

-- ���� 1. 01�г� ���а� �л� ��
select department_name, department_no
from tb_department;

select count(*) as "�л� ��"
from tb_student
where department_no=003 AND substr(entrance_date, 1, 2)='01';

-- ���� 2. '����'�迭 �� ������ 20�̻� 30������ �а�
select category as "�迭", department_name as "�а��̸�", capacity as "����"
from tb_department
where category='����' and capacity between 20 and 30
order by 2 asc;

-- ���� 3. '��'�� �� �迭�� �а� ��
select category as "�迭", count(*) as "�а���"
from tb_department
where category like '%��%'
group by category
order by 2 desc;

-- ���� 4. �����а� ���� ��ȸ
select department_name, department_no
from tb_department;

select professor_name as "�����̸�", substr(professor_ssn, 1, 2) as "����⵵", professor_address as "�ּ�"
from tb_professor
where department_no=002
order by 2 asc;

-- ���� 5. �����а� �л� ��ȸ
select department_name, department_no
from tb_department;

select department_no as "�а���ȣ", student_name as "�л��̸�", 
       case absence_yn when 'Y' then '����' 
       when 'N' then '����' end
       as "���п���"
from tb_student
where department_no=001 and substr(student_address, 1, 2)='����'
order by 2 asc;

-- ���� 6. 80��� ���л� �� '��'�� ���� �л�
select substr(student_ssn, 1, 8)||'******' as "�ֹι�ȣ", student_name as "�̸�"
from tb_student
where student_ssn like '80_____2%' and substr(student_name, 1, 1)='��'
order by 2 asc;

-- ���� 7. ��ü�ɰ迭 �а� ���� ���� ���ǽ� ����
select department_name as "�а��̸�", capacity as "��������", 
       case when capacity>=40 then '�밭�ǽ�'
            when capacity>=30 then '�߰��ǽ�'
            else '�Ұ��ǽ�'
       end as "���ǽ�ũ��"
from tb_department
where category='��ü��'
order by 2 desc;

-- ���� 8. 2005~2006�� ���л� �� �ּҰ� ��ϵ��� ���� ���л�
select department_no as "�а���ȣ", student_name as "�л��̸�", 
       coach_professor_no as "����������ȣ", to_char(entrance_date, 'YYYY"��"') as ���г⵵
from tb_student
where (substr(entrance_date, 1, 2)=05 or substr(entrance_date, 1, 2)=06) 
       and student_address is null 
       and substr(student_ssn, 8, 1)=1
order by 4 asc;










