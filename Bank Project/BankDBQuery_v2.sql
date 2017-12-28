CREATE DATABASE  IF NOT EXISTS `Bank_Project` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `Bank_Project`;
-- MySQL dump 10.13  Distrib 5.6.17, for osx10.6 (i386)
--
-- Host: localhost    Database: Bank_Project
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `AccountLog`
--

DROP TABLE IF EXISTS `AccountLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AccountLog` (
  `AccLogID` int(11) NOT NULL AUTO_INCREMENT,
  `ANum` int(11) NOT NULL,
  `Balance` decimal(18,5) DEFAULT NULL,
  `WithdrawLimit` decimal(14,5) DEFAULT NULL,
  `OverDraft` decimal(15,5) DEFAULT NULL,
  `Interset` decimal(12,2) DEFAULT NULL,
  `LastAccess` varchar(45) DEFAULT NULL,
  `EMI` decimal(14,2) DEFAULT NULL,
  `LastEMIPayed` varchar(45) DEFAULT NULL,
  `EMICounter` int(11) DEFAULT NULL,
  `amountPayed` decimal(18,2) DEFAULT NULL,
  `OpenedOn` varchar(45) DEFAULT NULL,
  `ClosedOn` varchar(45) DEFAULT NULL,
  `Cust_ID` int(11) DEFAULT NULL,
  `Type` varchar(45) DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`AccLogID`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountLog`
--

LOCK TABLES `AccountLog` WRITE;
/*!40000 ALTER TABLE `AccountLog` DISABLE KEYS */;
INSERT INTO `AccountLog` VALUES (8,5,1249.23000,0.00000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'2017-12-20 11:31:12',NULL,2,'savings','update'),(9,5,1269.45000,0.00000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'2017-12-20 11:31:12',NULL,2,'savings','update'),(11,8,4366.22000,23.43000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'Thu Dec 21 13:09:54 EST 2017',NULL,2,'savings','update'),(12,8,4666.22000,23.43000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'Thu Dec 21 13:09:54 EST 2017',NULL,2,'savings','update'),(13,5,3269.45000,0.00000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'2017-12-20 11:31:12',NULL,2,'savings','update'),(14,10,1224.00000,12.34000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'Thu Dec 21 23:09:33 EST 2017',NULL,2,'savings','update'),(15,8,4644.22000,23.43000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'Thu Dec 21 13:09:54 EST 2017',NULL,2,'savings','update'),(16,5,3503.45000,0.00000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'2017-12-20 11:31:12',NULL,2,'savings','update'),(17,17,567.00000,0.00000,91.34000,0.00,NULL,0.00,NULL,0,0.00,NULL,NULL,2,'checking','update'),(18,23,678.00000,0.00000,0.00000,0.00,NULL,33.00,NULL,0,0.00,'Sun Dec 24 16:16:14 EST 2017',NULL,2,'loan','Created'),(19,24,345.00000,0.00000,0.00000,0.00,NULL,17.00,NULL,0,0.00,'Sun Dec 24 16:18:53 EST 2017',NULL,2,'loan','Created'),(20,25,1234.00000,0.00000,0.00000,0.00,NULL,61.00,NULL,0,0.00,'Sun Dec 24 16:52:48 EST 2017',NULL,2,'loan','Created'),(21,26,234.00000,0.00000,0.00000,0.00,NULL,11.00,NULL,0,0.00,'Sun Dec 24 16:56:35 EST 2017',NULL,2,'loan','Created'),(22,27,245.00000,0.00000,4.90000,0.00,NULL,0.00,NULL,0,0.00,'Sun Dec 24 16:57:00 EST 2017',NULL,2,'checking','Created'),(23,28,245.00000,0.00000,4.90000,0.00,NULL,0.00,NULL,0,0.00,'Sun Dec 24 17:01:21 EST 2017',NULL,2,'checking','Created'),(24,29,245.00000,0.00000,4.90000,0.00,NULL,0.00,NULL,0,0.00,'Sun Dec 24 17:02:21 EST 2017',NULL,2,'checking','Created'),(25,30,299.00000,0.00000,5.98000,0.00,NULL,0.00,NULL,0,0.00,'Sun Dec 24 17:02:30 EST 2017',NULL,2,'checking','Created'),(26,31,1234.00000,0.00000,0.00000,0.00,NULL,61.00,NULL,0,0.00,'Sun Dec 24 17:02:37 EST 2017',NULL,2,'loan','Created'),(27,10,1214.00000,12.34000,0.00000,0.00,NULL,0.00,NULL,0,0.00,'Thu Dec 21 23:09:33 EST 2017',NULL,2,'savings','update'),(28,12,345.00000,0.00000,46.90000,0.00,NULL,0.00,NULL,0,0.00,NULL,NULL,2,'checking','update'),(29,32,234.00000,0.00000,4.68000,0.00,NULL,0.00,NULL,0,0.00,'Sun Dec 24 17:11:38 EST 2017',NULL,2,'checking','Created'),(30,34,234.00000,0.00000,4.68000,0.00,NULL,0.00,NULL,0,0.00,'Sun Dec 24 17:12:55 EST 2017',NULL,2,'checking','Created'),(31,35,213.00000,0.00000,0.00000,0.00,NULL,10.00,NULL,0,0.00,'Sun Dec 24 17:13:07 EST 2017',NULL,2,'loan','Created'),(32,16,7.80000,0.00000,13.56000,0.00,NULL,0.00,NULL,0,0.00,NULL,NULL,2,'checking','update'),(33,36,234.00000,0.00000,4.68000,0.00,NULL,0.00,NULL,0,0.00,'Tue Dec 26 09:53:50 EST 2017',NULL,2,'checking','Created'),(34,39,234.00000,0.00000,4.68000,0.00,NULL,0.00,NULL,0,0.00,'Tue Dec 26 09:56:10 EST 2017',NULL,2,'checking','Created'),(35,43,1234.00000,0.00000,0.00000,0.00,NULL,30.85,NULL,0,0.00,'Tue Dec 26 09:57:50 EST 2017',NULL,2,'loan','Created'),(36,44,21324.00000,0.00000,426.48000,0.00,NULL,0.00,NULL,0,0.00,'Tue Dec 26 16:03:03 EST 2017',NULL,2,'checking','Created'),(37,45,1234.00000,0.00000,24.68000,5.00,NULL,0.00,NULL,0,0.00,'Tue Dec 26 16:03:42 EST 2017',NULL,2,'checking','Created'),(38,46,23454.00000,234.54000,0.00000,5.00,NULL,0.00,NULL,0,0.00,'Tue Dec 26 16:03:50 EST 2017',NULL,2,'savings','Created'),(39,47,2443323.00000,0.00000,0.00000,5.00,NULL,61083.08,NULL,0,0.00,'Tue Dec 26 16:03:54 EST 2017',NULL,2,'loan','Created');
/*!40000 ALTER TABLE `AccountLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AccountSavings`
--

DROP TABLE IF EXISTS `AccountSavings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AccountSavings` (
  `Account_Number` int(11) NOT NULL,
  `Balance` decimal(19,2) NOT NULL,
  `WithdrawLimit` decimal(14,2) DEFAULT NULL,
  `Interset` decimal(14,2) DEFAULT NULL,
  `LastAccess` varchar(45) DEFAULT NULL,
  `SNo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`SNo`),
  UNIQUE KEY `Account_Number_UNIQUE` (`Account_Number`),
  KEY `Account_Number` (`Account_Number`),
  CONSTRAINT `Account_Number` FOREIGN KEY (`Account_Number`) REFERENCES `Accounts` (`AccountNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountSavings`
--

LOCK TABLES `AccountSavings` WRITE;
/*!40000 ALTER TABLE `AccountSavings` DISABLE KEYS */;
INSERT INTO `AccountSavings` VALUES (5,3503.45,0.00,5.00,NULL,1),(8,4644.22,23.43,5.00,NULL,2),(10,1214.00,12.34,5.00,NULL,3),(46,23454.00,234.54,5.00,NULL,5);
/*!40000 ALTER TABLE `AccountSavings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Accounts`
--

DROP TABLE IF EXISTS `Accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Accounts` (
  `AccountNumber` int(11) NOT NULL AUTO_INCREMENT,
  `OpenedOn` varchar(45) NOT NULL,
  `ClosedOn` varchar(45) DEFAULT NULL,
  `Cust_ID` int(11) NOT NULL,
  `Type` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  PRIMARY KEY (`AccountNumber`),
  KEY `CustID_idx` (`Cust_ID`),
  CONSTRAINT `Cust_ID` FOREIGN KEY (`Cust_ID`) REFERENCES `Customers` (`CustID`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accounts`
--

LOCK TABLES `Accounts` WRITE;
/*!40000 ALTER TABLE `Accounts` DISABLE KEYS */;
INSERT INTO `Accounts` VALUES (5,'2017-12-20 11:31:12',NULL,2,'savings','active'),(8,'Thu Dec 21 13:09:54 EST 2017',NULL,2,'savings','active'),(10,'Thu Dec 21 23:09:33 EST 2017',NULL,2,'savings','active'),(11,'Sun Dec 24 15:51:57 EST 2017',NULL,2,'checking','active'),(12,'Sun Dec 24 15:54:24 EST 2017',NULL,2,'checking','active'),(15,'Sun Dec 24 15:56:52 EST 2017',NULL,2,'checking','active'),(16,'Sun Dec 24 15:58:57 EST 2017',NULL,2,'checking','active'),(17,'Sun Dec 24 16:00:53 EST 2017',NULL,2,'checking','active'),(23,'Sun Dec 24 16:16:14 EST 2017',NULL,2,'loan','active'),(24,'Sun Dec 24 16:18:53 EST 2017',NULL,2,'loan','active'),(25,'Sun Dec 24 16:52:48 EST 2017',NULL,2,'loan','active'),(26,'Sun Dec 24 16:56:35 EST 2017',NULL,2,'loan','active'),(27,'Sun Dec 24 16:57:00 EST 2017',NULL,2,'checking','active'),(28,'Sun Dec 24 17:01:21 EST 2017',NULL,2,'checking','active'),(29,'Sun Dec 24 17:02:21 EST 2017',NULL,2,'checking','active'),(30,'Sun Dec 24 17:02:30 EST 2017',NULL,2,'checking','active'),(31,'Sun Dec 24 17:02:37 EST 2017',NULL,2,'loan','active'),(32,'Sun Dec 24 17:11:38 EST 2017',NULL,2,'checking','active'),(34,'Sun Dec 24 17:12:55 EST 2017',NULL,2,'checking','active'),(35,'Sun Dec 24 17:13:07 EST 2017',NULL,2,'loan','active'),(36,'Tue Dec 26 09:53:50 EST 2017',NULL,2,'checking','active'),(39,'Tue Dec 26 09:56:10 EST 2017',NULL,2,'checking','active'),(43,'Tue Dec 26 09:57:50 EST 2017',NULL,2,'loan','active'),(44,'Tue Dec 26 16:03:03 EST 2017',NULL,2,'checking','active'),(45,'Tue Dec 26 16:03:42 EST 2017',NULL,2,'checking','active'),(46,'Tue Dec 26 16:03:50 EST 2017',NULL,2,'savings','active'),(47,'Tue Dec 26 16:03:54 EST 2017',NULL,2,'loan','active');
/*!40000 ALTER TABLE `Accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AccountsChecking`
--

DROP TABLE IF EXISTS `AccountsChecking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AccountsChecking` (
  `AccNumber` int(11) unsigned NOT NULL,
  `Balance` decimal(19,2) NOT NULL,
  `OverDraft` decimal(14,2) NOT NULL,
  `Interest` decimal(11,1) NOT NULL,
  `LastAccessed` varchar(45) NOT NULL,
  `SNo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`SNo`),
  KEY `AccNumber_idx` (`AccNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountsChecking`
--

LOCK TABLES `AccountsChecking` WRITE;
/*!40000 ALTER TABLE `AccountsChecking` DISABLE KEYS */;
INSERT INTO `AccountsChecking` VALUES (11,2345.00,46.90,0.0,'Sun Dec 24 15:51:58 EST 2017',1),(12,345.00,46.90,0.0,'Sun Dec 24 15:54:24 EST 2017',2),(15,657.00,13.14,0.0,'Sun Dec 24 15:56:52 EST 2017',3),(16,7.80,13.56,0.0,'Sun Dec 24 15:58:57 EST 2017',4),(17,567.00,91.34,0.0,'Sun Dec 24 16:00:53 EST 2017',5),(27,245.00,4.90,0.0,'Sun Dec 24 16:57:00 EST 2017',6),(28,245.00,4.90,0.0,'Sun Dec 24 17:01:21 EST 2017',7),(29,245.00,4.90,0.0,'Sun Dec 24 17:02:21 EST 2017',8),(30,299.00,5.98,0.0,'Sun Dec 24 17:02:30 EST 2017',9),(32,234.00,4.68,0.0,'Sun Dec 24 17:11:38 EST 2017',10),(34,234.00,4.68,0.0,'Sun Dec 24 17:12:55 EST 2017',11),(36,234.00,4.68,0.0,'Tue Dec 26 09:53:50 EST 2017',12),(39,234.00,4.68,0.0,'Tue Dec 26 09:56:10 EST 2017',13),(44,21324.00,426.48,0.0,'Tue Dec 26 16:03:04 EST 2017',14),(45,1234.00,24.68,5.0,'Tue Dec 26 16:03:42 EST 2017',15);
/*!40000 ALTER TABLE `AccountsChecking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AccountsLoan`
--

DROP TABLE IF EXISTS `AccountsLoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AccountsLoan` (
  `ACC_NUM` int(11) NOT NULL,
  `Balance` decimal(13,2) DEFAULT NULL,
  `EMI` decimal(13,2) DEFAULT NULL,
  `LastEMIPayed` varchar(45) DEFAULT NULL,
  `Interset` decimal(13,3) DEFAULT NULL,
  `EMICounter` int(11) DEFAULT '0',
  `amountPayed` decimal(18,2) DEFAULT '0.00',
  `SNo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`SNo`),
  KEY `ACC_NUM_idx` (`ACC_NUM`),
  CONSTRAINT `ACC_NUM` FOREIGN KEY (`ACC_NUM`) REFERENCES `Accounts` (`AccountNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountsLoan`
--

LOCK TABLES `AccountsLoan` WRITE;
/*!40000 ALTER TABLE `AccountsLoan` DISABLE KEYS */;
INSERT INTO `AccountsLoan` VALUES (23,678.00,33.00,NULL,0.000,0,0.00,3),(24,345.00,17.00,NULL,0.000,0,0.00,4),(25,1234.00,61.00,NULL,0.000,0,0.00,5),(26,234.00,11.00,NULL,0.000,0,0.00,6),(31,1234.00,61.00,NULL,0.000,0,0.00,7),(35,2133456.00,10777.00,NULL,0.000,0,0.00,8),(43,1234.00,30.85,NULL,0.000,0,0.00,13),(47,2443323.00,61083.08,NULL,5.000,0,0.00,14);
/*!40000 ALTER TABLE `AccountsLoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CustomerLog`
--

DROP TABLE IF EXISTS `CustomerLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CustomerLog` (
  `CustLogID` int(11) NOT NULL AUTO_INCREMENT,
  `CustID` int(11) DEFAULT NULL,
  `FirstName` varchar(45) DEFAULT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `MiddleName` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  `AlternatePhone` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `UserName` varchar(45) DEFAULT NULL,
  `Command` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `DelDate` varchar(45) DEFAULT NULL,
  `JoinDate` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CustLogID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CustomerLog`
--

LOCK TABLES `CustomerLog` WRITE;
/*!40000 ALTER TABLE `CustomerLog` DISABLE KEYS */;
INSERT INTO `CustomerLog` VALUES (1,11,'Asd','Dsfgdf','Def','1234','43','sadsd@as.sadeaas','Qwerfds','dsaf32dsf','Adfqefdc3ds','Created new','active',NULL,'2017-12-19 13:17:59','1111-11-11 00:00:00'),(7,2,'vj','vj','vj','1','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:25:25','2017-12-16 22:52:20'),(8,2,'vj','vj','vj','9','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:25:50','2017-12-16 22:52:20'),(9,2,'vj','vj','vj','1','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:27:03','2017-12-16 22:52:20'),(10,2,'vj','vj','vj','8','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:28:20','2017-12-16 22:52:20'),(11,2,'vj','vj','vj','5','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:31:16','2017-12-16 22:52:20'),(12,2,'vj','vj','vj','59','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:33:12','2017-12-16 22:52:20'),(13,2,'vj','vj','vj','7','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:35:07','2017-12-16 22:52:20'),(14,2,'vj','vj','vj','73242','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(15,2,'vj','vj','vj','12','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(16,12,'Ndfcid','Bob','Ngn','132',' ','a@v.v','Afdsf','fdsf','Sf','Created new','active',NULL,'2017-12-20 15:51:06','1111-11-11 00:00:00'),(17,13,'fsgbgdfbg','gbdfgb','bgfbgfbf','32453564','3243245','4vbfdsb@fd.fdsf','dsfgdsggfdg','njn','fgdgfdgd','Created new','active',NULL,'Thu Dec 21 12:20:40 EST 2017','2017-12-05'),(18,14,'Tyhgrfdcs','Fdvdf','vfdvdf','435435','534534','vfsdf@s.s','Fdvfdvd','cdcsd','Dvdv','Created new','active',NULL,'Thu Dec 21 13:06:58 EST 2017','11/11/1111'),(19,1,'',' ',' ','',' ','','','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(20,1,'',' ',' ','43243',' ','','','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(21,2,'vj','vj','vj','12','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(22,2,'vj','vj','vj','12','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(23,1,'',' ',' ','43243',' ','','Feeds','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(24,1,'',' ','Ewfwe','43243',' ','','Feeds','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(25,1,'',' ','Ewfwe','43243',' ','','Feeds','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(26,1,'','Ihhbj','Ewfwe','43243',' ','','Feeds','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(27,1,'iouuii','Ihhbj','Ewfwe','43243',' ','','Feeds','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(28,1,'iouuii','Ihhbj','Ewfwe','43243','1234322 ','','Feeds','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(29,1,'iouuii','Ihhbj','Ewfwe','43243','1234322 ','','Feedscx','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(30,2,'vj','vj','vj','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(31,2,'vj','vj','vj','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(32,1,'iouuii',' ',' ','43243','1234322 ','','Feedscx','','','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(33,2,'vj','vj','Vjjj','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(34,2,'vj','vj','Vjjj','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(35,2,'vj','vj','Vjjj','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(36,15,'Vsf','Cds','Cds','45346765',' ','cds@sad.d','dafdsfs','cdscsdcdsc','Cssdcsdcdsc','Created new','active',NULL,'Sat Dec 23 02:28:39 EST 2017','11/11/1111'),(37,2,'vj','vj','Vjjjs','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(38,2,'vj','Vjdg','Vjjjs','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(39,2,'vj','Vjdg','Vj','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20'),(40,1,'iouuii','jdskfj',' ','43243','1234322 ','s@s.d','Feedscx','xzczx','zxcz','update','active',NULL,'2017-12-16 00:00:00','2017-12-16 00:00:00'),(41,2,'vj','Vjdg','Vj','12345','0000000','v@v.v','perry','vj','vj','update','current',NULL,'2017-12-20 12:56:00','2017-12-16 22:52:20');
/*!40000 ALTER TABLE `CustomerLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customers`
--

DROP TABLE IF EXISTS `Customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customers` (
  `CustID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `MiddleName` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) NOT NULL,
  `AlternatePhone` varchar(45) DEFAULT NULL,
  `Email` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `JoinDate` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  PRIMARY KEY (`CustID`),
  UNIQUE KEY `UserName_UNIQUE` (`UserName`),
  UNIQUE KEY `Email_UNIQUE` (`Email`),
  UNIQUE KEY `Phone_UNIQUE` (`Phone`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customers`
--

LOCK TABLES `Customers` WRITE;
/*!40000 ALTER TABLE `Customers` DISABLE KEYS */;
INSERT INTO `Customers` VALUES (1,'iouuii','jdskfj',' ','43243','1234322 ','s@s.d','Feedscx','xzczx','zxcz','2017-12-16 00:00:00','2017-12-16 00:00:00','active'),(2,'vj','Vjdg','Vj','12345','0000000','v@v.v','perry','vj','vj','2017-12-20 12:56:00','2017-12-16 22:52:20','current'),(3,'vj','Hhytndgf','','N54564',' ','df@s.c','Eghtefre','rftebgtgerf','Agefegerg','2017-12-17 09:05:38','2017-11-11 00:00:00','active'),(4,'vj','vj','vj','vj',NULL,'x@x.x','qws','vj2','vj1','2017-12-17 09:05:38','2017-11-11 00:00:00','active'),(5,'vj','Hhytndgf','vj','000','00','x@x.c','sdd','sad','dssd','2017-12-17 09:05:38','2017-11-11 00:00:00','active'),(8,'rgregf','fsdfs','sfddsfds','fsdgsf','fdsfdsfds','vsadasdasdsad@v.v','Dsfsdf','sdadsad','dfsd','2017-12-19 11:22:06','1111-11-11 00:00:00','active'),(11,'Asd','Dsfgdf','Def','1234','43','sadsd@as.sadeaas','Qwerfds','dsaf32dsf','Adfqefdc3ds','2017-12-19 13:17:59','1111-11-11 00:00:00','active'),(12,'Ndfcid','Bob','Ngn','132',' ','a@v.v','Afdsf','fdsf','Sf','2017-12-20 15:51:06','1111-11-11 00:00:00','active'),(13,'fsgbgdfbg','gbdfgb','bgfbgfbf','32453564','3243245','4vbfdsb@fd.fdsf','dsfgdsggfdg','njn','fgdgfdgd','Thu Dec 21 12:20:40 EST 2017','2017-12-05','active'),(14,'Tyhgrfdcs','Fdvdf','vfdvdf','435435','534534','vfsdf@s.s','Fdvfdvd','cdcsd','Dvdv','Thu Dec 21 13:06:58 EST 2017','11/11/1111','active'),(15,'Vsf','Cds','Cds','45346765',' ','cds@sad.d','dafdsfs','cdscsdcdsc','Cssdcsdcdsc','Sat Dec 23 02:28:39 EST 2017','11/11/1111','active');
/*!40000 ALTER TABLE `Customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Employee`
--

DROP TABLE IF EXISTS `Employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Employee` (
  `EmpID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `MiddleName` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) NOT NULL,
  `AlternatePhone` varchar(45) DEFAULT NULL,
  `Email` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `JoinDate` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  `Status` varchar(45) NOT NULL,
  PRIMARY KEY (`EmpID`),
  UNIQUE KEY `UserName_UNIQUE` (`UserName`),
  UNIQUE KEY `Email_UNIQUE` (`Email`),
  UNIQUE KEY `Phone_UNIQUE` (`Phone`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employee`
--

LOCK TABLES `Employee` WRITE;
/*!40000 ALTER TABLE `Employee` DISABLE KEYS */;
INSERT INTO `Employee` VALUES (3,'Vaibhav','Jindal','','0000000',' ','v@v.v','12','vj','vj','Tue Dec 26 09:47:11 EST 2017','1111-11-11','current'),(4,'asdkmdkn','gtgrefdssd','fdghrg','32454343','43543543','fdfw@dwfdf.dfs','fsdfdca','asdcasdcasdc','csdaccsdc','Thu Dec 21 12:57:29 EST 2017','2017-12-05','current'),(5,'Fvfvd','Vfdvvfdv','','456765756','67567546754','bfsd@asdasdaf.dc','Vsdfvfdv','cdasdcds','casdcdcasccs','Sat Dec 23 02:29:34 EST 2017','11/11/1111','current');
/*!40000 ALTER TABLE `Employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EmployeeLog`
--

DROP TABLE IF EXISTS `EmployeeLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EmployeeLog` (
  `EmpLogID` int(11) NOT NULL AUTO_INCREMENT,
  `EmpID` int(11) NOT NULL,
  `FirstName` varchar(45) DEFAULT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `MiddleName` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  `AlternatePhone` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `UserName` varchar(45) DEFAULT NULL,
  `Command` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `LeftDate` varchar(45) DEFAULT NULL,
  `JoinDate` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`EmpLogID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EmployeeLog`
--

LOCK TABLES `EmployeeLog` WRITE;
/*!40000 ALTER TABLE `EmployeeLog` DISABLE KEYS */;
INSERT INTO `EmployeeLog` VALUES (1,5,'Fvfvd','Vfdvvfdv','','456765756','67567546754','bfsd@asdasdaf.dc','Vsdfvfdv','cdasdcds','casdcdcasccs','Created new','current',NULL,'Sat Dec 23 02:29:34 EST 2017','11/11/1111'),(2,3,'Vaibhav','Jindal','','123455',' ','v@v.v','12','vj','vj','update','current',NULL,'Sat Dec 23 04:35:21 EST 2017','1111-11-11'),(3,3,'Vaibhav','Jindal','','0000000',' ','v@v.v','12','vj','vj','update','current',NULL,'Tue Dec 26 09:44:26 EST 2017','1111-11-11'),(4,3,'Vaibhav','Jindal','','0000000',' ','v@v.v','12','vj','vj','update','current',NULL,'Tue Dec 26 09:47:11 EST 2017','1111-11-11');
/*!40000 ALTER TABLE `EmployeeLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'Bank_Project'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-26 16:07:04
