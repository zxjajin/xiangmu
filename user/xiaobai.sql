/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.31 : Database - xiaobai
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`xiaobai` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `xiaobai`;

/*Table structure for table `node` */

DROP TABLE IF EXISTS `node`;

CREATE TABLE `node` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `creatime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `node` */

insert  into `node`(`id`,`uid`,`content`,`creatime`) values (1,1,'您好','2022-11-15 23:02:09'),(2,2,'阿金您好！','2022-11-15 23:02:09'),(4,8,'阿金您好！','2022-11-15 23:05:37'),(45,6,'aef','2022-11-18 10:14:28'),(46,6,'我是阿金','2022-11-18 19:23:20'),(47,6,'我爱你','2022-11-18 19:23:22'),(48,6,'afeaeffea','2022-11-18 19:23:24'),(49,6,'我是阿金','2022-11-19 07:43:54'),(51,6,'我是阿金','2022-11-19 07:47:36'),(53,7,'我是阿金','2022-11-19 08:17:02'),(54,7,'小白来了','2022-11-19 08:20:03'),(55,7,'我爱你','2022-11-19 08:20:38'),(56,7,'afeaeffea','2022-11-19 08:20:48'),(57,7,'我爱你','2022-11-19 08:20:53'),(58,7,'我是阿金','2022-11-19 08:20:56'),(59,7,'我是阿金','2022-11-19 08:20:58'),(60,6,'我是阿金','2022-11-19 08:28:01'),(61,6,'我爱你','2022-11-19 08:31:26'),(62,6,'111','2022-11-19 09:09:23'),(63,6,'我是阿金','2022-11-19 10:17:28'),(64,6,'222','2022-11-19 10:28:19'),(66,13,'呵呵呵','2022-11-19 10:42:06'),(68,6,'刚添加的','2022-11-19 11:29:01'),(69,6,'我爱你','2022-11-19 11:54:32'),(70,6,'我是阿金','2022-11-19 12:02:06'),(71,6,'阿尔法','2022-11-19 16:34:45'),(73,6,'我是阿金','2022-11-19 18:42:10'),(74,6,'我爱你','2022-11-19 18:57:42');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`phone`,`sex`,`password`) values (6,'AJin','10086','男','123456'),(7,'小白','1560','男','123456'),(8,'电鳗','1555','男','123456'),(9,'秀英','47101548','女','123456'),(10,'鸿绯','1005541','女','123456'),(12,'小辉','10086','男','123456'),(13,'浩然','111','男','123456'),(14,'xiaobai','123','男','123456'),(17,'啊','626','男','123456'),(18,'啊2','6226','男','123456'),(19,'啊','626','男','123456'),(20,'啊2','6226','男','123456'),(21,'a','d','s','a'),(22,'啊','626','男','123456'),(23,'xiaobai','123','男','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
