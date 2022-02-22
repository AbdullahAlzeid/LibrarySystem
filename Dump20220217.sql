-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `audiobook`
--

LOCK TABLES `audiobook` WRITE;
/*!40000 ALTER TABLE `audiobook` DISABLE KEYS */;
INSERT INTO `audiobook` VALUES ('1300000001','08:30');
/*!40000 ALTER TABLE `audiobook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `authenticator`
--

LOCK TABLES `authenticator` WRITE;
/*!40000 ALTER TABLE `authenticator` DISABLE KEYS */;
INSERT INTO `authenticator` VALUES ('Abdul@gmail.com','Abdul','L'),('Ahmed@gmail.com','Ahmed','L'),('Ali@gmail.com','Ali','L'),('Anas@gmail.com','Anas','M'),('Fares@gmail.com','Fares','L'),('gg@gmail.com','gg','M'),('Majed@gmail.com','Majed','M'),('Sam@gmail.com','Sam','M'),('Zack@gmail.com','Zack','M');
/*!40000 ALTER TABLE `authenticator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES ('1','Omar','Alghmdi'),('2','Yaroub','Alokaily'),('3','Osama','Alrzak'),('4','Talal','Alhrbi');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('1300000001','The Holy Quran','2015-05-15','001','King Fahad Complex','Arabic','A'),('1300000002','DB in a uuttshell','2018-06-12','003','KSU','English','N'),('1300000003','DBMS 101','2016-12-20','004','KFUPM','English','N'),('1300000004','Spider-Man ch34','2020-04-04','001','Jarir','English','N'),('1300000005','Java in a nutshell','2014-05-12','003','KFUPM','English','A'),('1302258746','DBS','2017-05-03','02','KSU','English','A'),('1321485720','C/C++','2008-02-25','02','KSU','English','A'),('1472583695','Starwars','2021-02-12','02','KFUPM','Arabic','A'),('1478965412','ddd','2009-03-01','333','KSU','Arabic','A');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `borrowes`
--

LOCK TABLES `borrowes` WRITE;
/*!40000 ALTER TABLE `borrowes` DISABLE KEYS */;
INSERT INTO `borrowes` VALUES ('1300000002',6,'2021-12-05','2022-02-05',0.00),('1300000003',6,'2021-12-19','2022-02-19',0.00),('1300000004',6,'2021-09-01','2021-12-13',130.00);
/*!40000 ALTER TABLE `borrowes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES ('Action'),('Comedy'),('Comic'),('Drama'),('Education'),('Fantacy'),('Romance'),('Sci-Fi');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `languge`
--

LOCK TABLES `languge` WRITE;
/*!40000 ALTER TABLE `languge` DISABLE KEYS */;
INSERT INTO `languge` VALUES ('Arabic'),('English'),('French'),('Spanish'),('Sweedish');
/*!40000 ALTER TABLE `languge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `librarian`
--

LOCK TABLES `librarian` WRITE;
/*!40000 ALTER TABLE `librarian` DISABLE KEYS */;
INSERT INTO `librarian` VALUES (1,8000,08.0),(2,9000,09.0),(3,5000,05.0),(4,7000,07.0);
/*!40000 ALTER TABLE `librarian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lmember`
--

LOCK TABLES `lmember` WRITE;
/*!40000 ALTER TABLE `lmember` DISABLE KEYS */;
INSERT INTO `lmember` VALUES (6,'0000000006','nob','yes',10),(8,'0000000008','nob','no',0),(9,'1111111174','nob','no',0),(10,'11478895','nob','no',0),(11,'1457896523','nob','no',0);
/*!40000 ALTER TABLE `lmember` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (4,'2'),(1,'3');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'Fares','Alsqeer','0555000555','2000-11-11','Fares@gmail.com','2018-04-09'),(2,'Ali','Albkari','0504698756','1999-04-17','Ali@gmail.com','2019-11-24'),(3,'Abdul','Aljber','0559648752','1991-02-08','Abdul@gmail.com','2016-08-27'),(4,'Ahmed','Alhamdi','0563214780','1980-12-02','Ahmed@gmail.com','2012-12-12'),(6,'Majed','Almklafi','0554896520','2000-04-06','Majed@gmail.com','2020-07-28'),(8,'Anas','Almalki','0554598632','2002-04-03','Anas@gmail.com','2021-12-30'),(9,'Zack','Selver','0555554872','2002-05-03','Zack@gmail.com','2021-12-20'),(10,'sam','sam','0554784596','2000-07-27','Sam@gmail.com','2021-12-22'),(11,'gg','gg','0554878965','2000-12-30','gg@gmail.com','2021-12-22');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `physicalbook`
--

LOCK TABLES `physicalbook` WRITE;
/*!40000 ALTER TABLE `physicalbook` DISABLE KEYS */;
INSERT INTO `physicalbook` VALUES ('1300000002','0000000002','01','0324','05'),('1300000003','0000000003','02','0325','02'),('1300000004','0000000004','01','654','01'),('1300000001','1','1','1','1'),('1302258746','1111111487','02','214','214'),('1321485720','12548','02','25','25'),('1472583695','147258369','02','125','125'),('1478965412','1477','333','33','33'),('1300000005','148','58','98','2');
/*!40000 ALTER TABLE `physicalbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `provider`
--

LOCK TABLES `provider` WRITE;
/*!40000 ALTER TABLE `provider` DISABLE KEYS */;
INSERT INTO `provider` VALUES ('1','KFUPM','Dharan'),('2','KSU','Riyadh'),('3','King Fahad Complex','Almadina'),('4','Ekadh','Riyadh');
/*!40000 ALTER TABLE `provider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `provides`
--

LOCK TABLES `provides` WRITE;
/*!40000 ALTER TABLE `provides` DISABLE KEYS */;
INSERT INTO `provides` VALUES ('2','1300000000003','2021-12-15','2022-02-15'),('4','1300000000004','2021-12-17','2022-02-17');
/*!40000 ALTER TABLE `provides` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES ('Jarir'),('KFUPM'),('King Fahad Complex'),('KSU');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `requests`
--

LOCK TABLES `requests` WRITE;
/*!40000 ALTER TABLE `requests` DISABLE KEYS */;
INSERT INTO `requests` VALUES (8,'2021-12-11','Spider man ch34','A'),(9,'2021-12-20','Chem102','N'),(9,'2021-12-11','Easy java ','A');
/*!40000 ALTER TABLE `requests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `reserve`
--

LOCK TABLES `reserve` WRITE;
/*!40000 ALTER TABLE `reserve` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `searches`
--

LOCK TABLES `searches` WRITE;
/*!40000 ALTER TABLE `searches` DISABLE KEYS */;
INSERT INTO `searches` VALUES ('word2',6,2),('word4',6,3),('word1',8,6);
/*!40000 ALTER TABLE `searches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `under`
--

LOCK TABLES `under` WRITE;
/*!40000 ALTER TABLE `under` DISABLE KEYS */;
INSERT INTO `under` VALUES ('Education','1300000001'),('Education','1300000002'),('Education','1300000003'),('Action','1300000004'),('Comic','1300000004'),('Sci-Fi','1300000004'),('Education','1300000005'),('Action','1302258746'),('Sci-Fi','1472583695');
/*!40000 ALTER TABLE `under` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `word_fillter`
--

LOCK TABLES `word_fillter` WRITE;
/*!40000 ALTER TABLE `word_fillter` DISABLE KEYS */;
INSERT INTO `word_fillter` VALUES ('word1'),('word2'),('word3'),('word4');
/*!40000 ALTER TABLE `word_fillter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `wrote`
--

LOCK TABLES `wrote` WRITE;
/*!40000 ALTER TABLE `wrote` DISABLE KEYS */;
INSERT INTO `wrote` VALUES ('1','1300000001'),('2','1300000002'),('1','1300000003'),('2','1300000003'),('3','1300000003'),('4','1300000003'),('1','1300000004'),('4','1300000005'),('2','1302258746'),('2','1321485720'),('2','1472583695'),('2','1478965412');
/*!40000 ALTER TABLE `wrote` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-17 19:21:50
