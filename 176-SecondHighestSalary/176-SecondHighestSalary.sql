-- Last updated: 09/07/2026, 15:11:20
SELECT (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
)As SecondHighestSalary;