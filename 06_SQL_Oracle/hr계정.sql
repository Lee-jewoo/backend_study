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

-- 날짜 함수
-- 현재 날짜
SELECT SYSDATE
FROM dual;
SELECT systimestamp
FROM dual;

-- 날짜 연산
SELECT last_name, hire_date, TRUNC((sysdate-hire_date)/365) "년"
FROM employees
ORDER BY 3 desc;

-- 날짜 사이의 개월 수
SELECT last_name, hire_date, 
trunc(MONTHS_BETWEEN(sysdate, hire_date)) "근무 월수"
FROM employees
ORDER BY 3 desc;

-- 월 연산
SELECT sysdate 현재, ADD_MONTHS(sysdate,1) 다음달, ADD_MONTHS(sysdate,-1) 이전달
FROM dual;

SELECT last_name, hire_date, ADD_MONTHS(hire_date , 5)
FROM employees
ORDER BY 3 desc;

-- 가장 가까운 특정 요일의 날짜
SELECT sysdate, next_day(sysdate, '토')
from dual;

-- 월의 마지막 날짜
SELECT sysdate, last_day(sysdate), last_day(add_months(sysdate, 1))
from dual;

-- 날짜 반올림
SELECT last_name, hire_date, 
 ROUND(hire_date,'YEAR'),
 ROUND(hire_date,'MONTH')
FROM employees;

-- 날짜 절삭
SELECT last_name, hire_date, 
 TRUNC(hire_date,'YEAR'),
 TRUNC(hire_date,'MONTH')
FROM employees;

-- 변환 함수
-- 자동 형 변환
SELECT last_name, salary
FROM employees
WHERE salary = '17000';

SELECT last_name, salary
FROM employees
WHERE hire_date = '03/06/17';

-- 명시적 형 변환
-- TO_CHAR : 숫자, 날짜를 문자로 변환
-- 날짜 -> 문자
select sysdate, to_char(sysdate, 'YYYY/MM/DD MON DAY DY')
from dual;
select sysdate, to_char(sysdate, 'YYYY"년" MM"월" DD"일"')
from dual;

select sysdate, to_char(sysdate, 'AM HH"시" MI"분" SS"초"')
from dual;

SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD,(AM) DY HH24:MI:SS')
FROM dual;

select sysdate, extract(year from sysdate),
                extract(month from sysdate),
                extract(day from sysdate),
                extract(hour from systimestamp),
                extract(minute from systimestamp),
                extract(second from systimestamp)
from dual;

SELECT last_name,hire_date, salary
FROM employees
WHERE extract(month from hire_date)='09';

-- 숫자 -> 문자
SELECT last_name, salary, 
 TO_CHAR(salary, '$999,999') 달러,
 TO_CHAR(salary, 'L999,999') 원화
FROM employees;

select to_char(123456678, 'L999,999,999')
from dual;

-- 문자 -> 숫자
SELECT TO_NUMBER('123') + 100 
FROM dual;

SELECT TO_NUMBER('123,456', '999,999') + 100 
FROM dual;

SELECT TO_NUMBER('$123,456', '$999,999') + 100 
FROM dual;

-- 문자 -> 날짜
select to_date('20230727', 'YYYYMMDD')
from dual;

-- NLS_DATE_FORMAT 파라미터값 변경
ALTER SESSION SET NLS_DATE_FORMAT='RR/MM/DD';

SELECT TO_DATE( '20170802181030' , 'YYYYMMDDHH24MISS' )
FROM dual;

SELECT TO_DATE( '2017년08월02일' , 'YYYY"년"MM"월"DD"일"' )
FROM dual;

SELECT SYSDATE, SYSDATE-TO_DATE( '20170801' , 'YYYYMMDD' )
FROM dual;

-- 조건 함수 : 조건에 대해서 선택적으로 SQL문을 실행
-- DECODE : 조건이 반드시 일치해야 되는 경우에 사용
SELECT last_name,salary,
 DECODE(salary, 24000, salary*0.3,
                17000, salary*0.2,
                salary) as 보너스
FROM employees
ORDER BY 2 desc;

-- 입사연도 별 사원 수
SELECT COUNT(*) "총인원수",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2001, 1, 0)) "2001",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2002, 1, 0)) "2002",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2003, 1, 0)) "2003",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2004, 1, 0)) "2004",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2005, 1, 0)) "2005",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2006, 1, 0)) "2006",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2007, 1, 0)) "2007",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2008, 1, 0)) "2008"
FROM employees;

-- DECODE 실습
--문제 1.  각각의 사원번호에 대해 휴가 시작일과 휴가 종료일을 보여주되,
-- 오전 오후의 속성인 SMA_VC와 EMA_VC를 이용하여 1일 경우는 오전, 2일 경우는 오후로 출력하시오.
select EMPNO_VC as 사원번호, STDATE_VC as 휴가시작일,
       decode(SMA_VC, 1, '오전',
                      2, '오후') as 오전오후, 
       EDDATE_VC as 휴가종료일,
       decode(SMA_VC, 1, '오전',
                      2, '오후') as 오전오후
from T_HOLHISTORY
order by 1 asc;


-- 문제 2. 사원번호와 휴가신청 상태를 표시하되 상태(STATE_VC)의 
-- 현재상태 코드가 0일 경우 허가 , 10일 경우대기 , 20일 경우 불허가로 표시하시오.
select EMPNO_VC as 사원번호, decode(STATE_VC, 0, '허가',
                                            10, '대기',
                                            20, '불허가') as "현재 상태"
from T_HOLHISTORY
order by 1 asc;

-- CASE : 다양한 비교 연산자를 이용하여 조건을 설정
-- 동등 연산자
SELECT last_name,salary,
 CASE salary WHEN 24000 THEN salary*0.3
             WHEN 17000 THEN salary*0.2
             ELSE salary 
 END as 보너스
FROM employees
ORDER BY 2 desc;

-- 부등 연산자
SELECT last_name,salary,
 CASE WHEN salary >=20000 THEN 1000
      WHEN salary >=15000 THEN 2000
      WHEN salary >=10000 THEN 3000
      ELSE 4000 
 END as 보너스
FROM employees
ORDER BY 2 desc;

-- BETWEEN a AND b
SELECT last_name,salary,
 CASE WHEN salary BETWEEN 20000 AND 25000 THEN '상'
      WHEN salary BETWEEN 10000 AND 20001 THEN '중'
      ELSE '하'
 END as 등급
FROM employees
ORDER BY 2 desc;

-- IN
SELECT last_name,salary,
 CASE WHEN salary IN ( 24000, 17000 , 14000) THEN '상'
      WHEN salary IN ( 13500, 13000) THEN '중'
      ELSE '하'
 END as 등급
FROM employees
ORDER BY 2 desc;

-- 그룹 함수
-- SUM, AVG, MAX, MIN, COUNT
SELECT SUM(DISTINCT salary), SUM(salary),
       AVG(salary), 
       MAX(salary), MIN(salary),
       COUNT (*)
FROM employees;

-- 명시적 그룹핑 : GROUP BY
select department_id, max(salary), min(salary), 
                      avg(salary), sum(salary),
                      count(*)
from employees
group by department_id
order by 1 asc;

SELECT department_id, SUM(salary)
FROM employees
GROUP BY department_id
HAVING SUM(salary) >= 20000
ORDER BY 2;

-- 제약조건 검색
select *
from user_constraints;

select *
from user_constraints
where table_name='EMPLOYEES';

select *
from user_constraints
where table_name='DEPARTMENTS';

-- equi 조인
SELECT last_name, department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id;

SELECT employees.last_name, departments.department_name
FROM employees, departments
WHERE employees.department_id = departments.department_id;

-- 공통 컬럼은 테이블명을 생략할 수 없음
SELECT last_name, department_name, department_id
FROM employees, departments
WHERE employees.department_id = departments.department_id;

-- 테이블 별칭을 사용할 수 있음
SELECT emp.last_name, department_name, emp.department_id
FROM employees emp, departments dept
WHERE emp.department_id = dept.department_id;

-- 검색 조건을 추가할 수 있음
-- 오라클조인은 where절에 조인 조건과 검색 조건을 함께 지정
SELECT emp.last_name, salary, department_name 
FROM employees emp, departments dept
WHERE emp.department_id = dept.department_id AND last_name='Whalen';

SELECT d.department_name 부서명, COUNT(e.employee_id) 인원수
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND TO_CHAR( hire_date , 'YYYY') <= 2005
GROUP BY d.department_name
order by 2 asc;

-- non equi 조인
SELECT last_name, salary, grade_level
FROM employees e, job_grades g
WHERE e.salary BETWEEN g.lowest_sal AND g.highest_sal;

SELECT last_name, salary, department_name, grade_level
FROM employees e, departments d, job_grades g
WHERE e.department_id = d.department_id
AND e.salary BETWEEN g.lowest_sal AND g.highest_sal;

-- self 조인
SELECT e.last_name as e, m.last_name as m, m2.last_name as m2 
FROM employees e, employees m, employees m2
WHERE e.manager_id = m.employee_id AND m.manager_id = m2.employee_id;

-- outer 조인
SELECT emp.last_name, department_name, emp.department_id
FROM employees emp, departments dept
WHERE emp.department_id = dept.department_id(+);

SELECT e.last_name 사원명, m.last_name 관리자명 
FROM employees e, employees m
WHERE e.manager_id = m.employee_id(+);

SELECT e.last_name 사원명,
 m.last_name 관리자명, mm.last_name "관리자의 관리자명" 
FROM employees e, employees m , employees mm
WHERE e.manager_id = m.employee_id(+) 
AND m.manager_id = mm.employee_id(+);

-- cartesian product 조인
-- 조인 조건이 없을 때 : 모든 데이터를 출력
SELECT emp.last_name, department_name, emp.department_id
FROM employees emp, departments dept;

--ANSI 조인
-- Natural join
-- 공통 컬럼에는 테이블명, 별칭을 사용할 수 없음
SELECT last_name, department_name, department_id
FROM employees NATURAL JOIN departments;

SELECT last_name, department_name, department_id
FROM employees e NATURAL JOIN departments d
WHERE department_id=90;

-- using join
SELECT last_name, department_name, department_id
FROM employees e JOIN departments d USING(department_id);

SELECT last_name, department_name, department_id
FROM employees e JOIN departments d USING(department_id)
WHERE department_id = 90;

-- ON 절
SELECT last_name, department_name, e.department_id
FROM employees e JOIN departments d ON e.department_id = d.department_id;

SELECT last_name, department_name, e.department_id
FROM employees e INNER JOIN departments d ON e.department_id = d.department_id
WHERE d.department_id = 90;

SELECT last_name, salary, grade_level
FROM employees e INNER JOIN job_grades g ON e.salary BETWEEN g.lowest_sal AND g.highest_sal;

SELECT e.last_name as e, m.last_name as m
FROM employees e INNER JOIN employees m ON e.manager_id = m.employee_id;

SELECT e.last_name 사원명, d.department_name 부서명,
 g.grade_level 등급
FROM employees e INNER JOIN departments d 
ON e.department_id = d.department_id
 INNER JOIN job_grades g
ON e.salary BETWEEN g.lowest_sal AND g.highest_sal;

-- cross join
SELECT last_name, department_name, e.department_id
FROM employees e CROSS JOIN departments d;

-- outer join
SELECT last_name, department_name, department_id
FROM employees e LEFT OUTER JOIN departments d USING(department_id);

SELECT last_name, department_name, e.department_id
FROM departments d RIGHT OUTER JOIN employees e ON e.department_id = d.department_id;

-- 서브쿼리 (subquery)
-- 서브쿼리 사용 전
SELECT salary
FROM employees
WHERE last_name='Whalen';

SELECT last_name,salary
FROM employees
WHERE salary >= 4400;

-- 서브쿼리 사용 후
SELECT last_name,salary
FROM employees
WHERE salary >= (SELECT salary
                 FROM employees
                 WHERE last_name='Whalen');
                 
-- 단일행 서브쿼리
-- 평균 월급보다 더 많은 월급을 받는 사원
select *
from employees
where salary>(select avg(salary)
              from employees);

-- 부서번호가 100인 사원들 중에서 최대 월급을 받는 사원과 동일한 월급을 받는 사원
select last_name, salary
from employees
where salary = (select max(salary)
               from employees
               where department_id=100);

-- 100번 부서의 최대 월급보다 많은 모든 부서 정보를 출력
SELECT department_id, MAX(salary)
FROM employees
GROUP BY department_id
HAVING MAX(salary) > (SELECT MAX(salary)
                      FROM employees
                      WHERE department_id=100);

-- 복수행 서브쿼리
-- IN
-- Whalen 또는 Fay 사원과 같은 월급을 받는 모든 사원들의 정보를 출력
SELECT last_name, salary
FROM employees
WHERE salary IN (SELECT salary
                 FROM employees
                 WHERE last_name IN ('Whalen','Fay'));

-- >ALL
SELECT last_name, department_id, salary
FROM employees
WHERE salary > ALL (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG');
                    
SELECT last_name, department_id, salary
FROM employees
WHERE salary > (SELECT max(salary)
                FROM employees
                WHERE job_id = 'IT_PROG');
                  
-- <ALL
SELECT last_name, department_id, salary
FROM employees
WHERE salary < ALL (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG');
SELECT last_name, department_id, salary
FROM employees
WHERE salary < (SELECT min(salary)
                FROM employees
                WHERE job_id = 'IT_PROG');

-- >ANY
SELECT last_name, department_id, salary
FROM employees
WHERE salary > ANY (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG');
SELECT last_name, department_id, salary
FROM employees
WHERE salary > (SELECT min(salary)
                FROM employees
                WHERE job_id = 'IT_PROG');
                
-- <ANY
SELECT last_name, department_id, salary
FROM employees
WHERE salary < ANY (SELECT salary
               FROM employees
               WHERE job_id = 'IT_PROG');
               
SELECT last_name, department_id, salary
FROM employees
WHERE salary < (SELECT max(salary)
                FROM employees
                WHERE job_id = 'IT_PROG');

-- EXISTS
SELECT last_name, department_id, salary
FROM employees
WHERE EXISTS (SELECT employee_id
              FROM employees
              WHERE commission_pct IS NOT NULL);

SELECT last_name, department_id, salary
FROM employees
WHERE EXISTS (SELECT employee_id
              FROM employees
              WHERE salary<0);
              
-- 다중 컬럼 서브쿼리
SELECT last_name, department_id, salary
FROM employees
WHERE (department_id, salary) IN (SELECT department_id, MAX(salary)
                                  FROM employees
                                  GROUP BY department_id)
ORDER BY 2;

-- 인라인 뷰(in-line view) 
SELECT e.department_id, 합계, 평균, 인원수
FROM (SELECT department_id, SUM(salary) 합계, AVG(salary) 평균 ,
      COUNT(*) 인원수 
      FROM employees
      GROUP BY department_id) e, departments d
WHERE e.department_id = d.department_id
ORDER By 1;
