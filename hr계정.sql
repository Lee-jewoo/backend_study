show user;

-- ��� �÷� ����
SELECT * FROM employees;
select * from employees;
SELECT * FROM departments;

-- Ư�� �÷� ����
SELECT employee_id, last_name, hire_date, salary
FROM employees;

-- ��� ����
SELECT last_name, salary, salary * 12
FROM employees;

-- ��Ī ���
SELECT last_name as �̸�, salary ����, salary * 12 as ����
FROM employees;

-- ���� " "
SELECT last_name as "��� �̸�", salary "��� ����", salary * 12 as "�� ��"
FROM employees;

-- null
SELECT last_name �̸�, salary ����, commission_pct ������,
      salary* 12+commission_pct as ����
FROM employees;

-- NVL
SELECT last_name �̸�, salary ����, commission_pct ������,
      salary * 12+NVL(commission_pct,0) as ����
FROM employees;

-- ���� ����
SELECT last_name || salary as "�̸� ����" FROM employees;
SELECT last_name || ' ���' FROM employees;
SELECT last_name || '�� ������ ' || job_id || ' �Դϴ�' as "����� ����" FROM employees;

-- �ߺ� ����
SELECT DISTINCT job_id FROM employees;

-- �� ����
SELECT employee_id,last_name,job_id, salary -- 3. ���
FROM employees -- 1. ���̺���
WHERE salary >= 10000; -- 2. ���ǿ� �´� ���ڵ带

SELECT employee_id,last_name,job_id, salary
FROM employees
WHERE last_name = 'King';

-- ��¥
SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE hire_date > '07/12/31';

-- ���� ã��
SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE salary BETWEEN 7000 AND 8000;

-- IN
SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE employee_id IN ( 100,200,300 );

SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE last_name IN ( 'King','Abel','Jones');

SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE hire_date IN ( '01/01/13','07/02/07');

-- LIKE ������
 -- �̸��� �빮�� J�� ����
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE 'J%';

 -- �̸��� 'ai' ���ڸ� ����
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '%ai%';

 -- �̸��� 'in' ���� ����
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '%in';

 -- �� ��° ���ڰ� b
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '_b%';

 -- d�� ������ 6����
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '_____d';

-- EXCAPE
SELECT employee_id,last_name,salary,job_id
FROM employees
WHERE job_id LIKE '%E___' ESCAPE 'E';

-- ��������
SELECT last_name,job_id,salary
FROM employees
WHERE job_id = 'IT_PROG' AND salary >= 5000;

SELECT last_name,job_id,salary
FROM employees
WHERE job_id = 'IT_PROG' OR salary >= 5000;

SELECT last_name,job_id,salary
FROM employees
WHERE NOT salary < 20000;

-- NOT SQL ������
SELECT last_name,job_id,salary
FROM employees
WHERE salary NOT IN (9000,8000,6000 );

SELECT last_name,job_id,salary
FROM employees
WHERE last_name NOT LIKE 'J%';

SELECT last_name,job_id,salary
FROM employees
WHERE salary NOT BETWEEN 2400 AND 20000;

-- IS NULL
SELECT last_name,job_id,salary
FROM employees
WHERE commission_pct IS NULL;

SELECT last_name,job_id,salary
FROM employees
WHERE manager_id IS NOT NULL;

-- ���� (ORDER BY)
 -- salary�� �������� �������� ����
SELECT employee_id,last_name,job_id,salary
FROM employees
ORDER BY salary DESC;

 -- ��Ī ����
SELECT employee_id,last_name,job_id,salary as "����"
FROM employees
ORDER BY ���� DESC;

 -- select ������ ������ �÷� �� 4��°
SELECT employee_id,last_name,job_id,salary as "����"
FROM employees
ORDER BY 4 DESC;

 -- ���� ���� ���� (�ƽ�Ű�ڵ�)
SELECT employee_id,last_name as �̸�,job_id,salary 
FROM employees
ORDER BY last_name ASC;

 -- ��¥ ���� ����
SELECT employee_id,last_name,salary,hire_date as �Ի���
FROM employees
ORDER BY hire_date DESC;

 -- ���� ����
SELECT employee_id,last_name,salary,hire_date
FROM employees
ORDER BY salary DESC, hire_date;

SELECT 123*123
FROM dual;

SELECT sysdate -- ���� ��¥
FROM dual;

-- ���ڿ� �Լ�
-- INITCAP : ù ���ڸ� �빮�ڷ� ��ȯ
SELECT INITCAP('ORACLE SQL')
FROM dual;

SELECT email, INITCAP(email)
FROM employees;

-- UPPER : ��� �빮�ڷ� ��ȯ
SELECT UPPER('Oracle Sql')
FROM dual;

SELECT last_name, UPPER(last_name)
FROM employees;

SELECT last_name, salary
FROM employees
WHERE UPPER(last_name)='KING';

-- LOWER : ��� �ҹ��ڷ� ��ȯ
SELECT LOWER('Oracle Sql')
FROM dual;

SELECT last_name, LOWER(last_name)
FROM employees;

-- CONCAT : ���ڿ� ����
SELECT 'Oracle'||'Sql'
FROM dual;

SELECT CONCAT('Oracle','Sql')
FROM dual;

SELECT CONCAT( last_name, salary)
FROM employees;

-- LENGTH : ���ڿ��� ����
SELECT LENGTH('Oracle')
FROM dual;

SELECT last_name, LENGTH(last_name)
FROM employees;

-- INSTR : Ư�� ������ ��ġ
-- ù°�ڸ����� �����ؼ� 2��°�� ������ L
-- �����ϸ� ù°�ڸ����� ����, ù ��° ������ ��
SELECT INSTR('MILLER' , 'L', 1 , 2 ), INSTR('MILLER' , 'X', 1 , 2 )
FROM dual;

-- SUBSTR : �κп�
-- 8��°���� �����ؼ� 1���� ����
SELECT SUBSTR('900303-1234567' , 8 , 1 ) 
FROM dual;

-- 8��°���� �����ؼ� ��� ����
SELECT SUBSTR('900303-1234567' , 8) 
FROM dual;

SELECT hire_date �Ի���, SUBSTR(hire_date,1,2) �Ի�⵵
FROM employees;

-- REPLACE : ġȯ
SELECT REPLACE('JACK and JUE' , 'J' , 'BL' ) 
FROM dual;

-- LPAD/RPAD : ���ڿ��� ����/�����ʿ� �߰�
-- �� ���̴� 10��, ������ ���鿡 * �߰�
SELECT LPAD('MILLER' , 10 , '*' ) 
FROM dual;

SELECT RPAD(SUBSTR('900303-1234567',1,8),14,'*' ) �ֹι�ȣ 
FROM dual;

-- LTRIM : ù ���ں��� ������ ���ڿ� �ٸ� ���ڰ� ���� ������ Ư�� ���� ����
--  (�������� ������ ���� ����)
SELECT LTRIM('MMMMILLERM', 'M')
FROM dual;

SELECT LTRIM('     MILLER     '), LENGTH(LTRIM('     MILLER     '))
FROM dual;

-- RTRIM : ������ ���ں��� ������ ���ڿ� �ٸ� ���ڰ� ���� ������ Ư�� ���� ����
SELECT RTRIM('MILLER', 'R')
FROM dual;

SELECT RTRIM('     MILLER     '), LENGTH(RTRIM('     MILLER     '))
FROM dual;

-- TRIM : ���� ���� -> LEADING / ������ ���� -> TRAILING
-- ���� ���� -> both �Ǵ� ������

SELECT TRIM( '0' FROM '0001234567000' ) 
FROM dual;

SELECT TRIM( LEADING '0' FROM '0001234567000' ) 
FROM dual;

SELECT TRIM( TRAILING '0' FROM '0001234567000' ) 
FROM dual;

-- ��ġ �Լ�
-- ROUND : ���� �ڸ������� �ݿø�
-- �������� ������ �Ҽ��� ù ° �ڸ����� �ݿø�
-- ������ �����ϸ� ���� �ڸ����� �ݿø�
SELECT ROUND( 456.789, 2) 
FROM dual;

SELECT ROUND( 456.789 ) 
FROM dual;

SELECT ROUND( 456.789, -1 ) 
FROM dual;

-- TRUNC : ���� �ڸ������� ����
-- �������� ������ �Ҽ��� ����
-- ������ �����ϸ� ���� �ڸ����� ����
SELECT TRUNC( 456.789, 2 ) 
FROM dual;

SELECT TRUNC( 456.789 ) 
FROM dual;

SELECT TRUNC( 456.789, -1 ) 
FROM dual;

-- MOD : ������ ��ȯ
SELECT MOD( 10 , 3 ) , MOD( 10 , 0 ) 
FROM dual;
-- Ȧ�� ���ϱ�
SELECT employee_id,last_name,salary 
FROM employees
WHERE MOD(employee_id,2)=1;

-- CEIL/FLOOR : Ư�� ������ ũ�ų�/�۰ų� ���� ���� �� �ּҰ�/�ִ밪
-- Ư�� ���� ���� ����� ���� �� ū/���� ��
SELECT CEIL(10.6), CEIL(-10.6) 
FROM dual;

SELECT FLOOR(10.6), FLOOR(-10.6) 
FROM dual;

-- SIGN : ����̸� 1, �����̸� -1, 0�̸� 0�� ��ȯ
SELECT SIGN( 100 ) , SIGN(-20) , SIGN(0) 
FROM dual;

SELECT employee_id,last_name,salary 
FROM employees
WHERE SIGN(salary-15000)=1;

