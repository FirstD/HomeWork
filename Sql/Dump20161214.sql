CREATE DATABASE  IF NOT EXISTS `mis` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mis`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: mis
-- ------------------------------------------------------
-- Server version	5.7.13-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `pid` int(11) NOT NULL,
  `power` varchar(45) NOT NULL,
  PRIMARY KEY (`aid`),
  KEY `ap_idx` (`pid`),
  CONSTRAINT `ap` FOREIGN KEY (`pid`) REFERENCES `park` (`pid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Jie','Jie',1,''),(2,'Jie','Jie',2,''),(4,'123','111',10,'一般管理员');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manage`
--

DROP TABLE IF EXISTS `manage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manage` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `aid` int(11) DEFAULT NULL,
  `oid` int(11) NOT NULL,
  `vid` int(11) NOT NULL,
  `appTime` varchar(45) DEFAULT NULL,
  `startTime` varchar(45) DEFAULT NULL,
  `endTime` varchar(45) DEFAULT NULL,
  `yesNo` varchar(20) NOT NULL,
  PRIMARY KEY (`mid`),
  KEY `1_idx` (`aid`),
  KEY `2_idx` (`oid`),
  KEY `3_idx` (`vid`),
  CONSTRAINT `1` FOREIGN KEY (`aid`) REFERENCES `admin` (`aid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `2` FOREIGN KEY (`oid`) REFERENCES `orea` (`oid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `3` FOREIGN KEY (`vid`) REFERENCES `vip` (`vid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manage`
--

LOCK TABLES `manage` WRITE;
/*!40000 ALTER TABLE `manage` DISABLE KEYS */;
INSERT INTO `manage` VALUES (1,1,1,1,'2015-09-11 12:00:00','2015-09-11 13:00:00','2015-09-11 14:00:00','是'),(11,1,4,1,'2016-12-11 23:20:49',NULL,NULL,'预约中'),(12,1,5,1,'2016-12-11 23:24:07','2016-12-11 14:47:28','2016-12-12 15:20:53','离开'),(13,4,6,1,'2016-12-11 23:26:58','2016-12-12 14:47:28','2016-12-12 15:06:55','取消预约'),(14,1,21,1,NULL,'2016-12-12 15:33:07',NULL,'预约中'),(15,1,22,1,NULL,'2016-12-12 15:33:48',NULL,'预约中'),(16,1,23,1,'2016-12-11 16:40:10',NULL,NULL,'取消预约');
/*!40000 ALTER TABLE `manage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orea`
--

DROP TABLE IF EXISTS `orea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orea` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `ch` int(11) NOT NULL,
  `state` varchar(45) NOT NULL,
  PRIMARY KEY (`oid`),
  KEY `area-orea_idx` (`pid`),
  CONSTRAINT `oa` FOREIGN KEY (`pid`) REFERENCES `park` (`pid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orea`
--

LOCK TABLES `orea` WRITE;
/*!40000 ALTER TABLE `orea` DISABLE KEYS */;
INSERT INTO `orea` VALUES (1,3,1,'未停'),(4,10,1,'未停'),(5,10,2,'未停'),(6,10,3,'未停'),(7,10,4,'未停'),(8,10,5,'未停'),(9,10,6,'未停'),(10,10,7,'未停'),(11,10,8,'未停'),(12,10,9,'未停'),(13,10,10,'未停'),(14,10,11,'未停'),(15,10,12,'未停'),(16,10,13,'未停'),(17,10,14,'未停'),(18,10,15,'未停'),(19,10,16,'未停'),(20,10,17,'未停'),(21,10,18,'停放中'),(22,10,19,'停放中'),(23,10,20,'未停');
/*!40000 ALTER TABLE `orea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `park`
--

DROP TABLE IF EXISTS `park`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `park` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `maxSite` int(11) NOT NULL,
  `place` varchar(45) NOT NULL,
  PRIMARY KEY (`pid`,`name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `park`
--

LOCK TABLES `park` WRITE;
/*!40000 ALTER TABLE `park` DISABLE KEYS */;
INSERT INTO `park` VALUES (1,'徐1',100,'云龙区'),(2,'徐2',100,'云龙区'),(3,'徐3',100,'泉山区'),(4,'4',213,'九里区'),(5,'5',213,'九里区'),(6,'mis',50,'邳州市'),(7,'mis7',20,'贾汪区'),(8,'miss555',20,'鼓楼区'),(9,'miss777',20,'鼓楼区'),(10,'miss888',20,'泉山区');
/*!40000 ALTER TABLE `park` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `record` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) NOT NULL,
  `feed` bigint(100) NOT NULL,
  `billNumber` int(30) NOT NULL,
  PRIMARY KEY (`rid`),
  KEY `23123_idx` (`mid`),
  CONSTRAINT `23123` FOREIGN KEY (`mid`) REFERENCES `manage` (`mid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
INSERT INTO `record` VALUES (1,1,100,1000000),(2,13,10,172152),(3,13,0,172152),(4,13,5,172152),(5,12,240,172151),(6,16,0,172155),(7,16,5,172155);
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vip`
--

DROP TABLE IF EXISTS `vip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vip` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `identity` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `cost` double NOT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `phone` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vip`
--

LOCK TABLES `vip` WRITE;
/*!40000 ALTER TABLE `vip` DISABLE KEYS */;
INSERT INTO `vip` VALUES (1,'普通会员','735655615','123123',10,'2016-12-05','2017-12-05','0','正常','735655615@qq.com'),(3,'普通会员','123123','123123',10,'2016-12-05','2017-12-05','15711111111','正常','1123@qq.com');
/*!40000 ALTER TABLE `vip` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-14 12:34:54
