purge recyclebin;
select * from tab;

drop table book;
create table book(
	bookno number(5),
	title     varchar2(12),
	author  varchar2(12),
	pubdate date
);

select *from book;

insert into book values(1,'java','kim',sysdate);
insert into book values(1,'java','kim',sysdate);
insert into book values(2,null,null,'19/05/15');


insert into book (bookno,title,author,pubdate)
					values(3,'sql','lee',null);

insert into book (bookno,title,author)
					values(4,'db','lee');
commit();
rollback();


delete from book;
delete from book where title is null;
delete from book where author = 'kim';

alter table book add(price number(7));

update book set price=0
update book set price=0,title where bookno =1;

alter table book modify(price number(7,2));

alter table book drop column price;

rename book to book2;
rename boo2 tobook;

delete from book;

truncate table book;
drop tabelbook;

select * from emp;

create table emp2
  as select * from emp;
  
create table emp3
  as select * from emp where deptno = 10;
  
 create table dept2
  as select * from dept;
  
  insert into dept values(50,'EDU',null);
  insert into dept2 values(50,'EDU',null);
  commit;
  
  insert into dept values(10,'EDU','SEOUL');
  insert into dept2 values(10,'EDU','SEOUL');
  
  drop table book;
create table book(
	bookno number(5) CONSTRAINT scott_book_pk primary key,
	title     varchar2(12) CONSTRAINT book_title_unique unique,
	author  varchar2(12)CONSTRAINT,
	price    number(5) CONSTRAINT book_price_check check(price>0),
	pubdate date default sysdate
);
  
  commit;
  rollback;
  select * from book;
  
  
  
  
  insert into book(bookno,title,author,price,pubdate) 
  				  values(1,'java 1','마크',3000,sysdate);
  
  insert into book(bookno,title,author,price,pubdate) 
  				  values(2,'java 2','마크',3000,sysdate);
  
  insert into book(bookno,title,author,price,pubdate) 
  				  values(3,null,'마크',3000,sysdate);
  				  
  insert into book(bookno,title,author,price,pubdate) 
  				  values(4,'java 4','완섭',3000,default);
  				  
  insert into book(bookno,title,author,price) 
  				  values(5,'java 5','완섭',3000);
  				  
  				  
select * from book;  
  				  
select CONSTRAINT_name from user_cons_columns;
select CONSTRAINT_name
from user_cons_columns
where table_name='BOOK';
  				  
drop table book;
purge recyclebin;
drop table book cascade CONSTRAINT;

drop table book;
create table book(
	bookno number(5) ,
	title     varchar2(12) unique,
	author  varchar2(12),
	price    number(5)  check(price>0),
	pubdate date default sysdate
);
alter table book add CONSTRAINT scott_bookno_pk primary key(bookno);


create table dept2
  as select * from dept;
  
  //dept2 테이블에 deptno 컬럼에 pk 설정
alter table  dept2 add CONSTRAINT dept2_deptno_pk primary key(deptno);
  
  
create table emp2
as select * from emp;

   //emp2 테이블에 empno 컬럼에 pk 설정
alter table  emp2 add CONSTRAINT emp2_deptno_pk primary key(empno);
  
   //emp2 테이블에 mgr 컬럼에 fk 설정
alter table emp2 add CONSTRAINT emp2_mgr_fk foreign key (mgr) references emp2;
alter table emp2 add foreign key (deptno) references dept2;
  

  
create or replace view emp_detail
as
select ename,dname,sal,grade
from emp 
	join dept
	on emp.deptno=dept.deptno 
	join salgrade  
	on sal between losal and hisal;
    
select * from emp_detail;
  
drop view emp_detail;

insert into dept2
select deptno, dname
from dept2
where country = 'USA';
  
update emp set sal = sal *1.1 where deptno=10;

update book set title=BigData , price=50000 where bookno = 1;

create table book(
	bookno number(5) ,
	title     varchar2(12),
	author  varchar2(12),
	price    number(5)  check(price>0),
	pubdate date default sysdate
);
alter table book add CONSTRAINT scott_bookno_pk primary key(bookno);
alter table book drop constraint book_bookno_pk ;

create sequence bookno;
drop sequence bookno;

insert into book(bookno,title,price) 
values(bookno.nextval,'SQL',7000);

insert into book(bookno,title,price) 
values(bookno.nextval,'java',7000);

insert into book(bookno,title,price) 
values(bookno.nextval,'hrml',7000);

select bookno.currval from dual;

insert into book(bookno,title,price) 
values((select nvl(max(bookno), 0 )+1 from book),'spring',7000);

select nvl(max(bookno), 0 )+1 from book;

select * from book;

set autotrace on;


create index book_title on book(title);
drop index book_title;


select 직속부하직원수 , 관리자사번 , 관리자이름
from (
select  m.employee_id 관리자사번 ,m.last_name 관리자이름,count(*) 직속부하직원수 
from employees e, employees m 
where e.manager_id = m.employee_id 
group by m.employee_id,m.last_name) 
where 직속부하직원수 > 7 
order by 직속부하직원수; 


select employee_id 사번,first_name 이름, salary 연봉 from employees e join jobs j on e.job_id = j.job_id where e.job_id in (select job_id from jobs where job_title =  'Stock Clerk'  or job_title = 'Programmer'); 


select count(*) 직속부하직원수 , m.employee_id 관리자사번 , m.last_name 관리자이름
from employees e
join employees m
on e.manager_id = m.employee_id
group by m.employee_id,m.last_name
having count(*) >= 8
order by 1

select e.employee_id , e.fist_name, e.salary
from employees e
join jobs j
on e.job_id = j.job_id
where lower(j.job_title) in(?,?)





