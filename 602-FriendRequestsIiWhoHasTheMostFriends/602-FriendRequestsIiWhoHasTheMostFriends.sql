-- Last updated: 09/07/2026, 15:09:35
SELECT id, COUNT(*) AS num
FROM (
    SELECT requester_id AS id
    FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id
    FROM RequestAccepted
) AS friends
GROUP BY id
ORDER BY num DESC
LIMIT 1;