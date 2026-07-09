-- Last updated: 09/07/2026, 15:11:08
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);