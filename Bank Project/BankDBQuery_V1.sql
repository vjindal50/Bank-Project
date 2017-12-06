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
  `ANum` int(11) NOT NULL,
  `Balance` decimal(8,2) DEFAULT NULL,
  `WithdrawLimit` decimal(4,2) DEFAULT NULL,
  `OverDraft` decimal(5,2) DEFAULT NULL,
  `Interset` decimal(2,2) DEFAULT NULL,
  `LastAccess` datetime DEFAULT NULL,
  `EMI` decimal(4,2) DEFAULT NULL,
  `LastEMIPayed` datetime DEFAULT NULL,
  `EMICounter` int(11) DEFAULT NULL,
  `amountPayed` decimal(8,2) DEFAULT NULL,
  `OpenedOn` datetime DEFAULT NULL,
  `ClosedOn` datetime DEFAULT NULL,
  `Cust_ID` int(11) DEFAULT NULL,
  `Type` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountLog`
--

LOCK TABLES `AccountLog` WRITE;
/*!40000 ALTER TABLE `AccountLog` DISABLE KEYS */;
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
  `Balance` decimal(9,2) NOT NULL,
  `WithdrawLimit` decimal(3,2) NOT NULL,
  `Interset` decimal(2,2) NOT NULL,
  `LastAccess` datetime NOT NULL,
  UNIQUE KEY `Account_Number_UNIQUE` (`Account_Number`),
  KEY `Account_Number` (`Account_Number`),
  CONSTRAINT `Account_Number` FOREIGN KEY (`Account_Number`) REFERENCES `Accounts` (`AccountNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountSavings`
--

LOCK TABLES `AccountSavings` WRITE;
/*!40000 ALTER TABLE `AccountSavings` DISABLE KEYS */;
/*!40000 ALTER TABLE `AccountSavings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AccountStatus`
--

DROP TABLE IF EXISTS `AccountStatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AccountStatus` (
  `AccountNumber` int(11) NOT NULL,
  `Status` varchar(45) NOT NULL,
  UNIQUE KEY `AccountNumber_UNIQUE` (`AccountNumber`),
  CONSTRAINT `AccountNumber` FOREIGN KEY (`AccountNumber`) REFERENCES `Accounts` (`AccountNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountStatus`
--

LOCK TABLES `AccountStatus` WRITE;
/*!40000 ALTER TABLE `AccountStatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `AccountStatus` ENABLE KEYS */;
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
  PRIMARY KEY (`AccountNumber`),
  KEY `CustID_idx` (`Cust_ID`),
  CONSTRAINT `Cust_ID` FOREIGN KEY (`Cust_ID`) REFERENCES `Customers` (`CustID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accounts`
--

LOCK TABLES `Accounts` WRITE;
/*!40000 ALTER TABLE `Accounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `Accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AccountsChecking`
--

DROP TABLE IF EXISTS `AccountsChecking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AccountsChecking` (
  `AccNumber` int(11) NOT NULL,
  `Balance` decimal(9,2) NOT NULL,
  `OverDraft` decimal(4,2) NOT NULL,
  `Interest` decimal(1,1) NOT NULL,
  `LastAccessed` datetime NOT NULL,
  KEY `AccNumber_idx` (`AccNumber`),
  CONSTRAINT `AccNumber` FOREIGN KEY (`AccNumber`) REFERENCES `Accounts` (`AccountNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountsChecking`
--

LOCK TABLES `AccountsChecking` WRITE;
/*!40000 ALTER TABLE `AccountsChecking` DISABLE KEYS */;
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
  `Balance` decimal(8,2) NOT NULL,
  `EMI` decimal(4,2) NOT NULL,
  `LastEMIPayed` datetime NOT NULL,
  `Interest` decimal(2,2) NOT NULL,
  `EMICounter` int(11) NOT NULL DEFAULT '0',
  `amountPayed` decimal(8,2) NOT NULL DEFAULT '0.00',
  KEY `ACC_NUM_idx` (`ACC_NUM`),
  CONSTRAINT `ACC_NUM` FOREIGN KEY (`ACC_NUM`) REFERENCES `Accounts` (`AccountNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccountsLoan`
--

LOCK TABLES `AccountsLoan` WRITE;
/*!40000 ALTER TABLE `AccountsLoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `AccountsLoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CustomerLog`
--

DROP TABLE IF EXISTS `CustomerLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CustomerLog` (
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
  `DelDate` datetime DEFAULT NULL,
  `JoinDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CustomerLog`
--

LOCK TABLES `CustomerLog` WRITE;
/*!40000 ALTER TABLE `CustomerLog` DISABLE KEYS */;
/*!40000 ALTER TABLE `CustomerLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CustomerStatus`
--

DROP TABLE IF EXISTS `CustomerStatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CustomerStatus` (
  `CustID` int(11) NOT NULL,
  `Status` varchar(45) NOT NULL,
  UNIQUE KEY `CustID_UNIQUE` (`CustID`),
  KEY `CustID_idx` (`CustID`),
  CONSTRAINT `CustID` FOREIGN KEY (`CustID`) REFERENCES `Customers` (`CustID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CustomerStatus`
--

LOCK TABLES `CustomerStatus` WRITE;
/*!40000 ALTER TABLE `CustomerStatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `CustomerStatus` ENABLE KEYS */;
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
  `JoinDate` datetime DEFAULT NULL,
  PRIMARY KEY (`CustID`),
  UNIQUE KEY `UserName_UNIQUE` (`UserName`),
  UNIQUE KEY `Email_UNIQUE` (`Email`),
  UNIQUE KEY `Phone_UNIQUE` (`Phone`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customers`
--

LOCK TABLES `Customers` WRITE;
/*!40000 ALTER TABLE `Customers` DISABLE KEYS */;
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
  `JoinDate` datetime DEFAULT NULL,
  PRIMARY KEY (`EmpID`),
  UNIQUE KEY `UserName_UNIQUE` (`UserName`),
  UNIQUE KEY `Email_UNIQUE` (`Email`),
  UNIQUE KEY `Phone_UNIQUE` (`Phone`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employee`
--

LOCK TABLES `Employee` WRITE;
/*!40000 ALTER TABLE `Employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `Employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EmployeeLog`
--

DROP TABLE IF EXISTS `EmployeeLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EmployeeLog` (
  `EmpID` int(11) DEFAULT NULL,
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
  `LeftDate` datetime DEFAULT NULL,
  `JoinDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EmployeeLog`
--

LOCK TABLES `EmployeeLog` WRITE;
/*!40000 ALTER TABLE `EmployeeLog` DISABLE KEYS */;
/*!40000 ALTER TABLE `EmployeeLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EmployeeStatus`
--

DROP TABLE IF EXISTS `EmployeeStatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EmployeeStatus` (
  `EmpID` int(11) NOT NULL,
  `Status` varchar(45) NOT NULL,
  UNIQUE KEY `CustID_UNIQUE` (`EmpID`),
  KEY `EmpID_idx` (`EmpID`),
  CONSTRAINT `EmpID` FOREIGN KEY (`EmpID`) REFERENCES `Employee` (`EmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EmployeeStatus`
--

LOCK TABLES `EmployeeStatus` WRITE;
/*!40000 ALTER TABLE `EmployeeStatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `EmployeeStatus` ENABLE KEYS */;
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

-- Dump completed on 2017-12-06 15:52:10
