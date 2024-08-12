use hr;

-- 1. 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.

select *
from locations;

select *
from employees;

-- 1. 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.
select last_name
from employees
where last_name like "________";

 

-- 3. 사원의 성의 2번째 문자가 'c'인 사원의 이름과 이름의 길이를 출력하세요.
select first_name , LENGTH(first_name)
from employees
where first_name like "_c%";

-- 4. 주소 중 거리의 이름의 문자가 길이가 최소인 지역(locations)을 출력하세요.
select street_address , length(street_address)
from locations
where length(street_address) in (select min(length(street_address))
from locations);


-- 5. 이름이 'A','J', 'M'으로 시작하는 사원의 이름과 이름의 길이를 출력하세요.
select last_name , length(last_name)
from employees
where last_name like 'A%' or last_name like 'J%' or last_name like 'M%'
order by last_name;

select last_name
from employees
where hire_date = 