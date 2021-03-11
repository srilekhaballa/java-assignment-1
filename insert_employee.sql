INSERT INTO employee
(empid , "name")
VALUES(1, 'emp1');
update employee 
set email = 'emp1@gmail.com',phone = 7896543234,created_by ='srilekha',created_on ='11-03-2021'
where empid =1;
INSERT INTO employee
(empid , "name","email",phone,"created_by",created_on)
VALUES(2, 'emp2','emp2@gmail.com',6785467374,'srilekha','11-03-2021');
INSERT INTO employee
(empid , "name","email",phone,"created_by",created_on)
VALUES(3, 'emp3','emp3@gmail.com',6885447374,'srilekha','11-03-2021'),
(4, 'emp4','emp4@gmail.com',6215327374,'srilekha','11-03-2021'),
(5, 'emp5','emp5@gmail.com',7285347374,'srilekha','11-03-2021'),
(6, 'emp6','emp6@gmail.com',8885467374,'srilekha','11-03-2021'),
(7, 'emp7','emp7@gmail.com',6885427374,'srilekha','11-03-2021'),
(8, 'emp8','emp8@gmail.com',6435447374,'srilekha','11-03-2021'),
(9, 'emp9','emp9@gmail.com',6885654374,'srilekha','11-03-2021'),
(10, 'emp10','emp10@gmail.com',6765347374,'srilekha','11-03-2021');
