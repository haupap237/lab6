create database test
go
use test
go
create table tbluser(
id int primary key identity,
account nvarchar(50),
pass nvarchar(50),
fullname nvarchar(50),
email nvarchar(200)
)