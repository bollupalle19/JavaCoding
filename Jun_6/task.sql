1) Write a query to find the salary of the employees whose salary is greater than the salary of the employee
whose id is 7566?

select ename,sal from emp where sal>(select sal from emp where empno=7566);
 
2) Write a query to find the employees who all are earning the highest salary?

select ename,sal from  emp where sal = (select max(sal) from emp);
 
second highest salary?

select max(sal) from  emp where sal< (select max(sal) from emp);
 
Multiple row subquery:
-- operators used here is IN , ANY, ALL
 
<ANY   => <MAX
> ANY => >MIN
=ANY  => IN
>ALL  =>  >MAX
<ALL  =>  <MIN
 
1) Write a query to find the employees whose salary is equal to the salary of atleast one employee in depart 30?
select empno,ename,deptno,sal from emp where sal in(select sal from emp where deptno=30);
 
2) Write a query to find the employees whose salary is greater than the salary of atleast one employee in depart 30?
select empno,ename,deptno,sal from emp where sal >ANY(select sal from emp where deptno=30);
 
select sal from emp where deptno=30;
 
3) Write a query to find the employees whose salary is less  than the salary of atleast one employee in depart 30?
select empno,ename,deptno,sal from emp where sal <ANY(select sal from emp where deptno=30);
 

4) Write a query to find the employees whose salary is less  than the salary of all of the employee in depart 30?

select empno,ename,deptno,sal from emp where sal <ALL(select sal from emp where deptno=30);

select empno,ename,deptno,sal from emp where sal >ALL(select sal from emp where deptno=30);

select empno,ename,deptno,sal from emp where sal <ANY(select sal from emp where deptno=30);

select empno,ename,deptno,sal from emp where sal >ANY(select sal from emp where deptno=30);


