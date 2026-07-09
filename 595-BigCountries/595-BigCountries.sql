-- Last updated: 09/07/2026, 15:09:40
SELECT 
      w.name,
      w.population,
      w.area
FROM World w
WHERE area >= 3000000
     OR population >= 25000000;