show databases;
create database students_management2;
use students_management2;

create table students(
std_id int primary key ,
std_name varchar(50),
std_roll int,
std_email varchar(40),
std_class_room int
);
desc students;
insert into students(std_id,std_name,std_roll,std_email)
values (1, 'Nivi', 108, 'nivi@gmail.com');

select*from students;
select std_name,std_email from students;
alter table students
add column std_class_room varchar(20)default'cs108';
desc students;
alter table students
drop column std_class_room;
insert into students(std_id,std_name,std_roll,std_email, std_class_room)
values 
(2, 'Aarav', 109, 'aarav@gmail.com', 'cs107'),
(3, 'Meera', 110, 'meera@gmail.com', 'cs109'),
(4, 'Raj', 111, 'raj@gmail.com', 'cs110'),
(5, 'Diya', 112, 'diya@gmail.com', 'cs105');
select*from students;
select std_class_room from students;
desc students;
