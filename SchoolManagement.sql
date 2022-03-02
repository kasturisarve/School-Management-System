-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: schoolmanagement
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `marksheet`
--

DROP TABLE IF EXISTS `marksheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marksheet` (
  `SId` bigint NOT NULL,
  `sName` varchar(100) NOT NULL,
  `English` bigint NOT NULL,
  `Marathi` bigint NOT NULL,
  `Science` bigint NOT NULL,
  `Math` bigint NOT NULL,
  `History` bigint NOT NULL,
  `Geogharphy` bigint NOT NULL,
  `Total` bigint NOT NULL,
  `Percentag` bigint NOT NULL,
  PRIMARY KEY (`SId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marksheet`
--

LOCK TABLES `marksheet` WRITE;
/*!40000 ALTER TABLE `marksheet` DISABLE KEYS */;
INSERT INTO `marksheet` VALUES (1,'kasturi',76,45,65,78,90,55,409,68),(2,'pankuri',55,43,51,67,41,56,301,52),(3,'raj',55,43,51,88,41,44,322,53);
/*!40000 ALTER TABLE `marksheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `sId` bigint NOT NULL,
  `sName` varchar(200) DEFAULT NULL,
  `Password` varchar(100) NOT NULL,
  `Phone` bigint NOT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Gender` varchar(50) NOT NULL,
  `sAddress` varchar(100) NOT NULL,
  `Branch` varchar(100) NOT NULL,
  PRIMARY KEY (`sId`),
  UNIQUE KEY `Phone` (`Phone`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'kasturi','123',9988774455,'sarve@gmail.com','male','mohadi','Art'),(2,'pankuri','9876',778899478,'panku@gmail.com','Female','nagpur','Science'),(3,'raj','654',9988665512,'raj@gmail.com','Male','nasik','Commerce'),(8,'rani','1234',7845965874,'r@gamil.com','female','dheli','science');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachar`
--

DROP TABLE IF EXISTS `teachar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teachar` (
  `t_Id` int NOT NULL AUTO_INCREMENT,
  `tName` varchar(200) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Branch` enum('Science','Art','Commerce') DEFAULT NULL,
  `Gender` enum('Female','Male','Other') DEFAULT NULL,
  `Salary` bigint NOT NULL,
  `tId` bigint NOT NULL,
  PRIMARY KEY (`t_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachar`
--

LOCK TABLES `teachar` WRITE;
/*!40000 ALTER TABLE `teachar` DISABLE KEYS */;
INSERT INTO `teachar` VALUES (1,'Shweta','123','Science','Female',20000,0),(2,'jayesh','123','Science','Male',20000,0),(3,'Lata','12346','Art','Female',18000,0),(4,'Shard','12346','Art','Male',18000,0),(5,'Parchi','1238','Commerce','Female',19000,0),(6,'Raju','9876','Commerce','Male',19000,0);
/*!40000 ALTER TABLE `teachar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `time_table1`
--

DROP TABLE IF EXISTS `time_table1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `time_table1` (
  `day` varchar(50) NOT NULL,
  `Sub1` varchar(200) NOT NULL,
  `Sub2` varchar(200) NOT NULL,
  `Sub3` varchar(200) NOT NULL,
  `Sub4` varchar(200) NOT NULL,
  `Sub5` varchar(200) NOT NULL,
  `Sub6` varchar(200) NOT NULL,
  PRIMARY KEY (`day`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `time_table1`
--

LOCK TABLES `time_table1` WRITE;
/*!40000 ALTER TABLE `time_table1` DISABLE KEYS */;
INSERT INTO `time_table1` VALUES ('Friday','marathi','math','geogharphy','history','english','science'),('Monday','math','marathi','geogharphy','history','english','science'),('Saturday','marathi','math','geogharphy','history','english','science'),('Thursday','marathi','math','geogharphy','history','english','science'),('Tuesday','math','marathi','geogharphy','history','english','science'),('Wednesday','marathi','math','geogharphy','history','english','science');
/*!40000 ALTER TABLE `time_table1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-02 15:20:13
