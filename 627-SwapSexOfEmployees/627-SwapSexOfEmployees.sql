-- Last updated: 09/07/2026, 15:09:23
UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;