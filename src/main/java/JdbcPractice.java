public class JdbcPractice {

/*
----> Here I am creating the customers table <-------


    create table customers(
    -> CustomerID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
            -> Name VARCHAR(128) DEFAULT NULL,
    -> Surname VARCHAR(128) DEFAULT NULL,
    -> Address VARCHAR(128) DEFAULT NULL,
    -> City VARCHAR(128) DEFAULT NULL,
    -> Country VARCHAR(128) DEFAULT NULL
    -> );

------>  Here I am filling out the table by data <-------


    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Antonio", "Morello", "Mataderos 2312","México D.F.", "Mexico");
    Query OK, 1 row affected (0.19 sec)

    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Teddy", "Hardisson", "120 Hanover Sq.","London", "UK");
    Query OK, 1 row affected (0.13 sec)

    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Christofer", "Bevco", "Berguvsvägen 8","Oslo", "Sweden");
    Query OK, 1 row affected (0.10 sec)

    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Maria", "Andersson", "Berguvsvägen 8","Oslo", "Sweden");
    Query OK, 1 row affected (0.33 sec)

    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Huan", "Trujillo", "Avda. de la Constitución 1333","Oslo", "Sweden");
    Query OK, 1 row affected (0.10 sec)

    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Ellis", "Boser", "Avda. de la Constitución 1333","México D.F.", "Mexico");
    Query OK, 1 row affected (0.07 sec)

    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Thomas", "Hardy", "12 Dawn Sq.","London", "UK");
    Query OK, 1 row affected (0.11 sec)

    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Ann", "Bloom", "Bergunstrasse, 18","Oslo", "Sweden");

    Query OK, 1 row affected (0.12 sec)

    INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Maria", "Anders", "Obere Str. 57","Berlin", "Germany");
    Query OK, 1 row affected (0.31 sec)

    mysql> INSERT INTO customers (Name, Surname, Address, City, Country) VALUES ("Anna", "Dawson", "Avda. de la Constitución 2222","México D.F.", "Mexico");
    Query OK, 1 row affected (0.17 sec)


    ----> Use select query <----

   SELECT * FROM customers;
   SELECT name FROM customers WHERE city = 'Berlin';
   SELECT DISTINCT country FROM customers;
   SELECT name, surname FROM customers WHERE city = 'Berlin' OR city = 'London' ;
   SELECT name, surname FROM customers ORDER BY name, surname;
   SELECT * FROM customers WHERE name  NOT LIKE "A%";


*/
}
