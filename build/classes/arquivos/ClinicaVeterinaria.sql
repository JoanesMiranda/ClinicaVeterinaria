CREATE DATABASE  IF NOT EXISTS `clinicaveterinaria` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clinicaveterinaria`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: clinicaveterinaria
-- ------------------------------------------------------
-- Server version	5.7.14-log

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idcliente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `cpf` varchar(14) NOT NULL UNIQUE,
  PRIMARY KEY (`idcliente`),
  UNIQUE KEY `idcliente_UNIQUE` (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnostico`
--

DROP TABLE IF EXISTS `diagnostico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagnostico` (
  `iddiagnostico` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `prescricao` varchar(150) DEFAULT NULL,
  `data` varchar(15) NOT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `fk_pet` int(10) unsigned NOT NULL,
  `fk_veterinario` int(10) unsigned NOT NULL,
  PRIMARY KEY (`iddiagnostico`,`fk_pet`,`fk_veterinario`),
  UNIQUE KEY `iddiagnostico_UNIQUE` (`iddiagnostico`),
  KEY `fk_diagnostico_pet1_idx` (`fk_pet`),
  KEY `fk_diagnostico_veterinario1_idx` (`fk_veterinario`),
  CONSTRAINT `fk_diagnostico_pet1` FOREIGN KEY (`fk_pet`) REFERENCES `pet` (`idpet`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_diagnostico_veterinario1` FOREIGN KEY (`fk_veterinario`) REFERENCES `veterinario` (`idveterinario`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnostico`
--

LOCK TABLES `diagnostico` WRITE;
/*!40000 ALTER TABLE `diagnostico` DISABLE KEYS */;
/*!40000 ALTER TABLE `diagnostico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pet`
--

DROP TABLE IF EXISTS `pet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pet` (
  `idpet` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(70) NOT NULL,
  `nascimento` varchar(10) DEFAULT NULL,
  `especie` varchar(45) NOT NULL,
  `peso` float DEFAULT NULL,
  `raca` varchar(70) NOT NULL,
  `cor` varchar(45) DEFAULT NULL,
  `sexo` varchar(12) NOT NULL,
  `fk_cliente` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idpet`,`fk_cliente`),
  UNIQUE KEY `idpet_UNIQUE` (`idpet`),
  KEY `fk_pet_cliente_idx` (`fk_cliente`),
  CONSTRAINT `fk_pet_cliente` FOREIGN KEY (`fk_cliente`) REFERENCES `cliente` (`idcliente`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pet`
--

LOCK TABLES `pet` WRITE;
/*!40000 ALTER TABLE `pet` DISABLE KEYS */;
/*!40000 ALTER TABLE `pet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veterinario`
--

DROP TABLE IF EXISTS `veterinario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veterinario` (
  `idveterinario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `crmv` varchar(8) NOT NULL,
  `cpf` VARCHAR (14) NOT NULL UNIQUE,
  `telefone` VARCHAR(14),
  PRIMARY KEY (`idveterinario`),
  UNIQUE KEY `idveterinario_UNIQUE` (`idveterinario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veterinario`
--

LOCK TABLES `veterinario` WRITE;
/*!40000 ALTER TABLE `veterinario` DISABLE KEYS */;
/*!40000 ALTER TABLE `veterinario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-16  6:18:33
