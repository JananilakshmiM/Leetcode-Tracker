-- Last updated: 09/07/2026, 15:10:57
DELETE p1
FROM Person p1
JOIN person p2
ON p1.email = p2.email
AND p1.id > p2.id;
