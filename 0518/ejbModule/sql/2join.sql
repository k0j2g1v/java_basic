select
from
where
order by


select * from emp;
select lower(ename),hiredate, to_char(hiredate,'yy'), substr(hiredate,1,2) from emp;

select round(55.55),trunc(55.55)
from dual;

select round(sal),trunc(sal)
from emp;

select * from emp order by deptno;

select ename,deptno,sal,sal*1.1 
from emp
where deptno=10;

select ename,deptno,sal,sal*1.2 
from emp
where deptno=20;

select ename,deptno,sal,sal*1.3 
from emp
where deptno=30;

select ename,deptno,sal, decode(deptno,10, sal*1.1,
                                                          20,sal*1.2,
                                                          ) as 수당
                                                          from emp;
select ename,nvl(to_char(mgr),'X')
from emp;
                                                          
select ename,nvl2(mgr,'00','Xxx')
from emp;

select *
from emp,dept
where emp.deptno = dept.deptno;

select ename,job,dname,loc
from emp,dept
where emp.deptno = dept.deptno;

select ename,job,emp.deptno,dname,loc
from emp,dept
where emp.deptno = dept.deptno;

select ename,job,d.deptno,dname,loc
from emp e,dept d
where e.deptno = d.deptno;

안시 표준    :   ,   =>    join    where  =>   on  
 
select ename,job,d.deptno,dname,loc
from emp e  join  dept d            
on e.deptno = d.deptno;

select ename,job,d.deptno,dname,loc
from emp e  inner join  dept d
on e.deptno = d.deptno;

select ename,job,dname
from emp e join dept d
on e.deptno = d.deptno
where sal > 2000;

select ename,job,dname,sal
from emp e, dept d
where e.deptno = d.deptno and sal >2000;

select ename,job,d.deptno,dname,loc
from emp e , dept d
where e.deptno(+) = d.deptno;

select ename,job,d.deptno,dname,loc
from emp e right outer join dept d       //오른쪽을 마스터로 조인한다.
on e.deptno = d.deptno;

select * from SALGRADE;

select ename,sal,grade
from emp , SALGRADE
where sal between losal and hisal;

select ename,sal, grade
from emp join SALGRADE
on sal between losal and hisal;

select e.ename 사원이름 ,nvl(m.ename,'CEO') 상사이름
from emp e left outer join emp m
on e.mgr = m.empno;

상사봐 입사일자가 빠른사원

select e.ename 사원이름 , e.hiredate , m.ename 상사이름 , m.hiredate
from emp e left outer join emp m
on e.mgr = m.empno
where e.hiredate < m.hiredate;

select e.ename , e.sal , m.ename, m.sal
from emp e left outer join emp m
on e.mgr = m.empno
where e.sal < m.sal;

select e.ename , e.sal , m.ename, m.sal
from emp e , emp m
where e.mgr = m.empno and e.sal > m.sal;

집계함수 

select round(sal) from emp;   //싱글로우 하나의 값이 들어가 처리되어 나옴
select avg(sal) from emp;      //멀티로우 여러값이 들어가 처리되어 나옴

select ename,round(sal) from emp;
select ename,avg(sal) from emp;
select count(sal),count(comm),count(*),count(mgr) from emp;

select count(job) from emp;
select count(distinct job) from emp;

select sum(sal),count(*), round(avg(sal),2)
from emp;

select sum(sal),count(*), round(avg(sal),2) 
from emp
where deptno=20;

select deptno, sum(sal),count(*), round(avg(sal),2) 
from emp
group by deptno; //집계 함수 외에 groub by 안에 포함되어야 사용가능하다

select deptno, max(sal),min(sal),count(*), round(avg(sal),2) 
from emp
group by deptno;

select e.deptno, dname, round(avg(sal),2) 평균
from emp e,dept d
where e.deptno=d.deptno
group by e.deptno,dname
order by 3;

select e.deptno, dname,count(*), round(avg(sal),2) 평균
from emp e,dept d
where e.deptno=d.deptno
group by e.deptno,dname
order by 평균;

select * from emp where ename='';
select * from emp where lower(ename) like '%'||'j'||'%';
select * from emp where lower(ename) like '%j%';

급여가 2000 이상인 부서의 평균 급여
select e.deptno, dname,count(*), round(avg(sal),2) 평균
from emp e join dept d
on e.deptno=d.deptno and  sal > 2000
group by e.deptno,dname
order by 평균;

평균 급여가 2000 이상인 부서 정보 출력

select e.deptno, dname,count(*), round(avg(sal),2) 평균
from emp e , dept d
where e.deptno=d.deptno  
group by e.deptno,dname
having avg(sal) > 2000    // 집계함수는 having 절에만 사용가능 
order by 평균;                 //  where 에는 사용 불가능

select ename,dname,sal,grade
from emp e, dept d, salgrade s 
where  e.deptno=d.deptno and sal between losal and hisal;

select ename,dname,sal,grade
from emp 
join dept
on emp.deptno=dept.deptno 
join salgrade  
on sal between losal and hisal;

select deptno,avg(sal)
from emp
having avg(sal) > 2000
group by deptno;

서브쿼리
select sal from emp where ename='FORD';
select * from emp where sal>3000;

select * 
from emp 
where sal>(select sal from emp where ename='FORD');

select *
from emp
where sal<(select rount(avg(sal),2) from emp );

select min(sal) from emp;

select *
from emp
where sal = (select min(sal) from emp );

select min(sal) from emp group by deptno;

select *
from emp
where sal in (select min(sal) from emp group by deptno );

자신이 속한 부서의 편균보다 급여가 적은 사람 리스트

select *
from emp outer
where sal < (select avg(sal) from emp where deptno=outer.deptno group by deptno)

select rownum,ename,job,sal
from emp

select rownum,ename,job,sal
from emp
order by sal;

select rownum,ename,job,sal
from (select * from emp order by sal desc)
where rownum<2;

select rownum,ename,job,sal
from (select * from emp order by sal desc)
where  rownum between 1 and 4;

select row#, ename,job,sal
from	
(
	select rownum row#,ename,job,sal
	from (select * from emp order by sal desc)
)
where  row# between 4 and 7;

81년도에 입사한 사람중 월금 상위 3명

select * from emp where giredate like '81%' order by sal desc;

select ename,sal
from(select rownum row#,ename,sal
        from (select * from emp where hiredate like '81%'  order by sal desc))
        where row# between 1 and 3;
        

select rownum, ename, job , sal, hiredate
from (select * from emp where hiredate like '81%' order by sal desc)
where rownum < 4;


select *
from emp
order by deptno,sal;

각부서별 최고 급여를 받는 사람 리스트
select *
from emp
where (deptno, sal) 
in (select deptno,max(sal) from emp group by deptno);


select rownum,ename,job,sal
from (select * from emp order by sal desc)
where rownum<2;


select rownum,ename,job,sal
