# Write your MySQL query statement below
SELECT a.name as Employee
FROM EMPLOYEE a JOIN EMPLOYEE b
ON b.id=a.managerId
and a.salary > b.salary;