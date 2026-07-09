-- Last updated: 09/07/2026, 15:09:48
SELECT
      e.name,
      b.bonus
FROM Employee e
LEFT JOIN bonus b
ON e.empId = b.empId
WHERE b.bonus < 1000
      OR b.bonus IS NULL;

