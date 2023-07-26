show user;

-- 모든 컬럼 보기
SELECT * FROM employees;
select * from employees;
SELECT * FROM departments;

-- 특정 컬럼 보기
SELECT employee_id, last_name, hire_date, salary
FROM employees;

-- 산술 연산
SELECT last_name, salary, salary * 12
FROM employees;

-- 별칭 사용
SELECT last_name as 이름, salary 월급, salary * 12 as 연봉
FROM employees;

-- 공백 " "
SELECT last_name as "사원 이름", salary "사원 월급", salary * 12 as "연 봉"
FROM employees;

-- null
SELECT last_name 이름, salary 월급, commission_pct 수수료,
      salary* 12+commission_pct as 연봉
FROM employees;

-- NVL
SELECT last_name 이름, salary 월급, commission_pct 수수료,
      salary * 12+NVL(commission_pct,0) as 연봉
FROM employees;

-- 연결 연산
SELECT last_name || salary as "이름 월급" FROM employees;
SELECT last_name || ' 사원' FROM employees;
SELECT last_name || '의 직업은 ' || job_id || ' 입니다' as "사원별 직급" FROM employees;

-- 중복 제거
SELECT DISTINCT job_id FROM employees;

-- 비교 연산
SELECT employee_id,last_name,job_id, salary -- 3. 출력
FROM employees -- 1. 테이블에서
WHERE salary >= 10000; -- 2. 조건에 맞는 레코드를

SELECT employee_id,last_name,job_id, salary
FROM employees
WHERE last_name = 'King';

-- 날짜
SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE hire_date > '07/12/31';

-- 범위 찾기
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

-- LIKE 연산자
 -- 이름이 대문자 J로 시작
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE 'J%';

 -- 이름이 'ai' 글자를 포함
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '%ai%';

 -- 이름이 'in' 으로 끝남
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '%in';

 -- 두 번째 글자가 b
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '_b%';

 -- d로 끝나는 6글자
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '_____d';

-- EXCAPE
SELECT employee_id,last_name,salary,job_id
FROM employees
WHERE job_id LIKE '%E___' ESCAPE 'E';

-- 논리연산자
SELECT last_name,job_id,salary
FROM employees
WHERE job_id = 'IT_PROG' AND salary >= 5000;

SELECT last_name,job_id,salary
FROM employees
WHERE job_id = 'IT_PROG' OR salary >= 5000;

SELECT last_name,job_id,salary
FROM employees
WHERE NOT salary < 20000;

-- NOT SQL 연산자
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

-- 정렬 (ORDER BY)
 -- salary를 기준으로 내림차순 정렬
SELECT employee_id,last_name,job_id,salary
FROM employees
ORDER BY salary DESC;

 -- 별칭 가능
SELECT employee_id,last_name,job_id,salary as "월급"
FROM employees
ORDER BY 월급 DESC;

 -- select 절에서 지정된 컬럼 중 4번째
SELECT employee_id,last_name,job_id,salary as "월급"
FROM employees
ORDER BY 4 DESC;

 -- 문자 적용 가능 (아스키코드)
SELECT employee_id,last_name as 이름,job_id,salary 
FROM employees
ORDER BY last_name ASC;

 -- 날짜 적용 가능
SELECT employee_id,last_name,salary,hire_date as 입사일
FROM employees
ORDER BY hire_date DESC;

 -- 다중 정렬
SELECT employee_id,last_name,salary,hire_date
FROM employees
ORDER BY salary DESC, hire_date;

SELECT 123*123
FROM dual;

SELECT sysdate -- 현재 날짜
FROM dual;

-- 문자열 함수
-- INITCAP : 첫 글자를 대문자로 변환
SELECT INITCAP('ORACLE SQL')
FROM dual;

SELECT email, INITCAP(email)
FROM employees;

-- UPPER : 모두 대문자로 변환
SELECT UPPER('Oracle Sql')
FROM dual;

SELECT last_name, UPPER(last_name)
FROM employees;

SELECT last_name, salary
FROM employees
WHERE UPPER(last_name)='KING';

-- LOWER : 모두 소문자로 변환
SELECT LOWER('Oracle Sql')
FROM dual;

SELECT last_name, LOWER(last_name)
FROM employees;

-- CONCAT : 문자열 연결
SELECT 'Oracle'||'Sql'
FROM dual;

SELECT CONCAT('Oracle','Sql')
FROM dual;

SELECT CONCAT( last_name, salary)
FROM employees;

-- LENGTH : 문자열의 길이
SELECT LENGTH('Oracle')
FROM dual;

SELECT last_name, LENGTH(last_name)
FROM employees;

-- INSTR : 특정 문자의 위치
-- 첫째자리부터 시작해서 2번째로 나오는 L
-- 생략하면 첫째자리부터 시작, 첫 번째 나오는 것
SELECT INSTR('MILLER' , 'L', 1 , 2 ), INSTR('MILLER' , 'X', 1 , 2 )
FROM dual;

-- SUBSTR : 부분열
-- 8번째부터 시작해서 1개의 문자
SELECT SUBSTR('900303-1234567' , 8 , 1 ) 
FROM dual;

-- 8번째부터 시작해서 모든 문자
SELECT SUBSTR('900303-1234567' , 8) 
FROM dual;

SELECT hire_date 입사일, SUBSTR(hire_date,1,2) 입사년도
FROM employees;

-- REPLACE : 치환
SELECT REPLACE('JACK and JUE' , 'J' , 'BL' ) 
FROM dual;

-- LPAD/RPAD : 문자열을 왼쪽/오른쪽에 추가
-- 총 길이는 10자, 왼쪽의 공백에 * 추가
SELECT LPAD('MILLER' , 10 , '*' ) 
FROM dual;

SELECT RPAD(SUBSTR('900303-1234567',1,8),14,'*' ) 주민번호 
FROM dual;

-- LTRIM : 첫 문자부터 지정된 문자와 다른 문자가 나올 때까지 특정 문자 제거
--  (지정하지 않으면 공백 제거)
SELECT LTRIM('MMMMILLERM', 'M')
FROM dual;

SELECT LTRIM('     MILLER     '), LENGTH(LTRIM('     MILLER     '))
FROM dual;

-- RTRIM : 마지막 문자부터 지정된 문자와 다른 문자가 나올 때까지 특정 문자 제거
SELECT RTRIM('MILLER', 'R')
FROM dual;

SELECT RTRIM('     MILLER     '), LENGTH(RTRIM('     MILLER     '))
FROM dual;

-- TRIM : 왼쪽 삭제 -> LEADING / 오른쪽 삭제 -> TRAILING
-- 양쪽 삭제 -> both 또는 미지정

SELECT TRIM( '0' FROM '0001234567000' ) 
FROM dual;

SELECT TRIM( LEADING '0' FROM '0001234567000' ) 
FROM dual;

SELECT TRIM( TRAILING '0' FROM '0001234567000' ) 
FROM dual;

-- 수치 함수
-- ROUND : 지정 자리수까지 반올림
-- 지정하지 않으면 소수점 첫 째 자리에서 반올림
-- 음수로 지정하면 정수 자리에서 반올림
SELECT ROUND( 456.789, 2) 
FROM dual;

SELECT ROUND( 456.789 ) 
FROM dual;

SELECT ROUND( 456.789, -1 ) 
FROM dual;

-- TRUNC : 지정 자리수까지 버림
-- 지정하지 않으면 소수점 버림
-- 음수로 지정하면 정수 자리에서 버림
SELECT TRUNC( 456.789, 2 ) 
FROM dual;

SELECT TRUNC( 456.789 ) 
FROM dual;

SELECT TRUNC( 456.789, -1 ) 
FROM dual;

-- MOD : 나머지 반환
SELECT MOD( 10 , 3 ) , MOD( 10 , 0 ) 
FROM dual;
-- 홀수 구하기
SELECT employee_id,last_name,salary 
FROM employees
WHERE MOD(employee_id,2)=1;

-- CEIL/FLOOR : 특정 수보다 크거나/작거나 같은 정수 중 최소값/최대값
-- 특정 수와 가장 가까운 정수 중 큰/작은 값
SELECT CEIL(10.6), CEIL(-10.6) 
FROM dual;

SELECT FLOOR(10.6), FLOOR(-10.6) 
FROM dual;

-- SIGN : 양수이면 1, 음수이면 -1, 0이면 0을 반환
SELECT SIGN( 100 ) , SIGN(-20) , SIGN(0) 
FROM dual;

SELECT employee_id,last_name,salary 
FROM employees
WHERE SIGN(salary-15000)=1;

