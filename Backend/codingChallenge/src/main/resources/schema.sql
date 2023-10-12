INSERT INTO customer (id, name) VALUES(1, 'John Smith'),
(2, 'Jane Doe'),
(3, 'Michael Johnson'),
(4, 'Emily Wilson'),
(5, 'David Brown');

-- Transactions for John Smith (Customer ID: 1)
INSERT INTO transaction (id, customer_id, amount, transaction_date) VALUES
(1, 1, 75.00, DATE '2023-01-15'),
(2, 1, 120.00, DATE '2023-02-20'),
(3, 1, 50.50, DATE '2023-03-10'),
(4, 1, 90.75, DATE '2023-04-05'),
(5, 1, 110.25, DATE '2023-05-12');



-- Transactions for Jane Doe (Customer ID: 2)
INSERT INTO transaction (id, customer_id, amount, transaction_date) VALUES
(6, 2, 60.00, DATE '2023-02-18'),
(7, 2, 85.25, DATE '2023-03-22'),
(8, 2, 40.75, DATE '2023-04-14'),
(9, 2, 70.30, DATE '2023-05-09'),
(10, 2, 105.50, DATE '2023-06-07');



-- Transactions for Michael Johnson (Customer ID: 3)
INSERT INTO transaction (id, customer_id, amount, transaction_date) VALUES
(11, 3, 95.00, DATE '2023-03-06'),
(12, 3, 75.80, DATE '2023-04-11'),
(13, 3, 120.75, DATE '2023-05-18'),
(14, 3, 55.40, DATE '2023-06-25'),
(15, 3, 70.90, DATE '2023-07-30');



-- Transactions for Emily Wilson (Customer ID: 4)
INSERT INTO transaction (id, customer_id, amount, transaction_date) VALUES
(16, 4, 110.50, DATE '2023-04-08'),
(17, 4, 65.25, DATE '2023-05-13'),
(18, 4, 80.75, DATE '2023-06-20'),
(19, 4, 95.30, DATE '2023-07-27'),
(20, 4, 45.60, DATE '2023-08-31');



-- Transactions for David Brown (Customer ID: 5)
INSERT INTO transaction (id, customer_id, amount, transaction_date) VALUES
(21, 5, 70.75, DATE '2023-05-03'),
(22, 5, 110.60, DATE '2023-06-08'),
(23, 5, 50.25, DATE '2023-07-15'),
(24, 5, 85.20, DATE '2023-08-20'),
(25, 5, 75.40, DATE '2023-09-25');



