-- Last updated: 09/07/2026, 15:09:37
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;