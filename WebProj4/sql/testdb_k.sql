<<<<<<< HEAD
drop database if exists testdb_kk;
create database testdb_kk;
use testdb_kk;
=======
<<<<<<< HEAD
drop database if exists testdb_kk;
create database testdb_kk;
use testdb_kk;
=======
drop database if exists testdb_k;
create database testdb_k;
use testdb_k;
>>>>>>> 2c89a72b1dd336a7665736b003c83f03b4a106a9
>>>>>>> 7ee33564aa18078133ae73c7015b9ce16c3cf728


create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users values(1,"taro","123");
insert into users values(2,"jiro","456");
insert into users values(3,"hanako","789");


create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);