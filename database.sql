/*
SQLyog Job Agent v11.24 (32 bit) Copyright(c) Webyog Inc. All Rights Reserved.


MySQL - 5.5.48 : Database - frameworkdemo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`frameworkdemo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `frameworkdemo`;

/*Table structure for table `s_department` */

DROP TABLE IF EXISTS `s_department`;

CREATE TABLE `s_department` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `dep_name` varchar(200) NOT NULL COMMENT '部门名称',
  `description` varchar(200) DEFAULT NULL COMMENT '部门描述',
  `order` int(11) DEFAULT NULL COMMENT '排序',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `mobile` varchar(200) DEFAULT NULL COMMENT '电话',
  `create` datetime DEFAULT NULL COMMENT '创建时间',
  `update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `s_department` */

/*Table structure for table `s_user` */

DROP TABLE IF EXISTS `s_user`;

CREATE TABLE `s_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_code` varchar(30) CHARACTER SET latin1 DEFAULT NULL COMMENT '用户账号',
  `user_name` varchar(30) CHARACTER SET latin1 DEFAULT NULL COMMENT '用户名称',
  `email` varchar(50) CHARACTER SET latin1 DEFAULT NULL COMMENT '用户邮箱',
  `phone` varchar(30) CHARACTER SET latin1 DEFAULT NULL COMMENT '用户电话',
  `password` varchar(200) CHARACTER SET latin1 DEFAULT NULL COMMENT '用户密码',
  `department_id` varchar(20) DEFAULT NULL COMMENT '部门ID',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `create` datetime DEFAULT NULL COMMENT '创建时间',
  `update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
