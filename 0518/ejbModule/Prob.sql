select e.employee_id 사번 ,e.first_name 직원이름,department_name 부서명,m.first_name 부서명 
from employees e,employees m,departments
where e.manager_id = m.employee_id;

select distinct e.last_name 성,e.salary 연봉
from employees e join employees m
on e.employee_id = m.manager_id and e.salary > m.salary;

select first_name,last_name,salary
from jobs,employees
where job_title='Sales Representative' and
between salary >= 9000 and salary<=10000;

select  e.employee_id, e.last_name, e.hire_date
from employees e , employees m
where  e.manager_id = m.employee_id and e.hire_date < m.hire_date;

select distinct job_title, department_name
from jobs j,departments d,employees e
where j.job_id=e.job_id 
and e.department_id = d.department_id;
   
select to_char(hire_date,'mm') 월 , to_char(count(*)) 임사자수
from employees
group by to_char(hire_date,'mm')
order by 1 ;


select e.first_name, e.hire_date, m.employee_id,m.first_name
from employees e left outer join employees m
on e.manager_id = m.employee_id 
where to_char(e.hire_date,'yy') = '08'
or to_char(e.hire_date,'yy') = '08' and e.manager_id is null;


select first_name,salary,department_name
from  employees e, departments d
where e.department_id = d.department_id and department_name = 'Sales';

select e.employee_id,e.first_name, e.last_name, nvl2(e.manager_id,d.department_name,'<NOT ASSIGNED>') 
from employees e left outer join departments d
on e.department_id = d.department_id
where to_char(e.hire_date,'yyyy' ) = '2004' 
or to_char(e.hire_date,'yyyy' ) = '2004' and e.manager_id is null;


select e.first_name, e.hire_date,m.employee_id,m.first_name
from employees e left outer join employees m 
on e.manager_id = m.employee_id
where to_char(e.hire_date,'yyyy') = '2005' 
or to_char(e.hire_date,'yyyy') = '2005' and e.manager_id is null;



