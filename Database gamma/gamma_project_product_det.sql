-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: gamma_project
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `product_det`
--

DROP TABLE IF EXISTS `product_det`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_det` (
  `product_name` varchar(255) DEFAULT NULL,
  `product_description` varchar(255) DEFAULT NULL,
  `product_price` int DEFAULT NULL,
  `product_quantity` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_det`
--

LOCK TABLES `product_det` WRITE;
/*!40000 ALTER TABLE `product_det` DISABLE KEYS */;
INSERT INTO `product_det` VALUES ('Mixer Grinder','AmazonBasics Alpha Mixer Grinder 750W, 3 Jars + 1 Juicer Jar, White',8900,30,1),('Laptop','HP Pavilion 14 12th Gen Intel Core i5 16GB SDRAM/512GB SSD 14 inch(35.6cm) IPS Micro-Edge FHD Laptop/Intel UHD Graphics/B&O/Win 11/Alexa Built-in/Backlit KB/FPR/MSO 2021/Natural Silver, 14-dv2014TU',65000,10,2),('Refrigerator',' Whirlpool 340 L 3 Star Inverter Frost-Free Double Door Refrigerator (INTELLIFRESH INV CNV 355 3S, German Steel, Convertible)',54440,105,3),('Washing Machine','LG FrontLoading Smart Washing Machine',25000,25,4),('HeadPhones','boAt Rockerz 550 Over Ear Bluetooth Headphones with Upto 20 Hours Playback, 50MM Drivers, Soft Padded Ear Cushions and Physical Noise Isolation, Without Mic (Black)',1600,24,5),(' Microwave oven','Samsung 28 L Convection Microwave Oven (MC28A5013AK/TL, Black, Curd Anytime)',18000,34,6),('Digital Camera','Sony Cybershot DSC-W810/B 20.1MP Digital Camera Memory Card 16GB (Black) + Bag',12000,15,7),('LED','OnePlus 80 cm (32 inches) Y Series HD Ready LED Smart Android TV 32Y1 (Black)',55000,50,8),('Smart Watch','Noise ColorFit Pulse Grand Smart Watch with 1.69\" HD Display, 60 Sports Modes, 150 Watch Faces, Spo2 Monitoring, Call Notification, Quick Replies to Text & Calls (Rose Pink)',1565,25,9),('Home Theatre','Infinity (JBL) Sonic B200WL, 160W Soundbar with Wireless Subwoofer, 2.1 Channel Home Theatre with Remote, Bluetooth, Optical Input, USB & AUX Connectivity (Black)\r\n',8400,46,10),('Cooler','Bajaj PMH 25 DLX 24L Personal Air Cooler with Honeycomb Pads, Turbo Fan Technology, Powerful Air Throw and 3-Speed Control, White,PMH25 DLX',10000,25,11);
/*!40000 ALTER TABLE `product_det` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-07 10:01:15
