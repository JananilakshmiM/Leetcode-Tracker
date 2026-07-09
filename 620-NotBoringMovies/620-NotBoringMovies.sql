-- Last updated: 09/07/2026, 15:09:26
SELECT 
      c.id,
      c.movie,
      c.description,
      c.rating
FROM Cinema c
WHERE c.id % 2 = 1
      AND description <> "boring"
ORDER BY rating DESC;