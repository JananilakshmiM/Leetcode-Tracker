-- Last updated: 09/07/2026, 15:08:42
SELECT
    p.product_name,
    s.year,
    s.price
FROM Sales s
JOIN Product p
    ON s.product_id = p.product_id;