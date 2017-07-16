/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.48 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `s_user` (
	`id` int (20),
	`user_code` varchar (90),
	`user_name` varchar (90),
	`email` varchar (150),
	`phone` varchar (90),
	`password` varchar (600),
	`department_id` varchar (60),
	`address` varchar (600),
	`create` datetime ,
	`update` datetime 
); 
insert into `s_user` (`id`, `user_code`, `user_name`, `email`, `phone`, `password`, `department_id`, `address`, `create`, `update`) values('1','123','test','123@qq.com','13800013800','123','1','广东','2017-06-01 18:47:10','2017-07-16 18:47:36');
