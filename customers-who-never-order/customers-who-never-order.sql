# Write your MySQL query statement below
SELECT name as Customers
FROM Customers c WHERE ID NOT IN (SELECT customerId FROM orders);