-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 23, 2020 at 05:21 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `labredes`
--

-- --------------------------------------------------------

--
-- Table structure for table `alumno`
--

CREATE TABLE `alumno` (
  `id_a` int(12) NOT NULL,
  `correo` varchar(50) CHARACTER SET latin1 NOT NULL,
  `nombre` varchar(50) CHARACTER SET latin1 NOT NULL,
  `apellidos` varchar(50) CHARACTER SET latin1 NOT NULL,
  `sexo` varchar(15) CHARACTER SET latin1 NOT NULL,
  `telefono` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `codigo` varchar(150) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `asistencia`
--

CREATE TABLE `asistencia` (
  `id` int(11) NOT NULL,
  `id_alumno` varchar(50) DEFAULT NULL,
  `fecha` varchar(50) NOT NULL,
  `hora_entrada` varchar(50) NOT NULL,
  `hora_salida` varchar(30) DEFAULT NULL,
  `horas_permanencia` varchar(12) DEFAULT NULL,
  `fk_alumno` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `asistencia_maestro`
--

CREATE TABLE `asistencia_maestro` (
  `id` int(11) NOT NULL,
  `id_maestro` varchar(500) CHARACTER SET latin1 DEFAULT NULL,
  `fecha` varchar(50) CHARACTER SET latin1 NOT NULL,
  `hora_entrada` varchar(50) CHARACTER SET latin1 NOT NULL,
  `hora_salida` varchar(30) DEFAULT NULL,
  `hora_permanencia` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `maestro`
--

CREATE TABLE `maestro` (
  `id_m` int(12) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `huella` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`id_a`);

--
-- Indexes for table `asistencia`
--
ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_alumno` (`fk_alumno`);

--
-- Indexes for table `asistencia_maestro`
--
ALTER TABLE `asistencia_maestro`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_maestro` (`id_maestro`);

--
-- Indexes for table `maestro`
--
ALTER TABLE `maestro`
  ADD PRIMARY KEY (`id_m`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alumno`
--
ALTER TABLE `alumno`
  MODIFY `id_a` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `asistencia`
--
ALTER TABLE `asistencia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `asistencia_maestro`
--
ALTER TABLE `asistencia_maestro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `maestro`
--
ALTER TABLE `maestro`
  MODIFY `id_m` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `asistencia`
--
ALTER TABLE `asistencia`
  ADD CONSTRAINT `fk_alumno` FOREIGN KEY (`fk_alumno`) REFERENCES `alumno` (`id_a`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
