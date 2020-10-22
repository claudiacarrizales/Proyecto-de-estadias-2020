-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 22, 2020 at 02:52 AM
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
  `correo` varchar(50) CHARACTER SET latin1 NOT NULL,
  `nombre` varchar(50) CHARACTER SET latin1 NOT NULL,
  `apellidos` varchar(50) CHARACTER SET latin1 NOT NULL,
  `sexo` varchar(15) CHARACTER SET latin1 NOT NULL,
  `telefono` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `codigo` varchar(150) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `alumno`
--

INSERT INTO `alumno` (`correo`, `nombre`, `apellidos`, `sexo`, `telefono`, `codigo`) VALUES
('1730048', 'Claudia', 'Carrizales', 'Femenino', '83419371966', 'a1730048'),
('1730049', 'Jesús Alberto', 'Ruíz', 'Masculino', '8341482210', 'a1730049');

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
  `horas_permanencia` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asistencia`
--

INSERT INTO `asistencia` (`id`, `id_alumno`, `fecha`, `hora_entrada`, `hora_salida`, `horas_permanencia`) VALUES
(30, 'a1730048', '16/10/2020', '17:37:37', '00:00:00', '0'),
(32, 'a1730048', '19/10/2020', '18:10:24', '18:11:26', '0'),
(33, 'a1730048', '19/10/2020', '12:00:00', '23:19:15', '2'),
(35, 'a1730048', '21/10/2020', '12:00:00', '19:05:01', '7'),
(37, 'a1730048', '20/10/2020', '15:24:00', '0', '0'),
(39, 'a1730048', '21/10/2020', '12:00:00', '19:39:42', '7'),
(40, 'a1730049', '20/10/2020', '15:24:00', '0', '0'),
(41, 'a1730049', '21/10/2020', '19:39:54', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `asistencia_maestro`
--

CREATE TABLE `asistencia_maestro` (
  `id` int(11) NOT NULL,
  `id_maestro` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `fecha` varchar(50) CHARACTER SET latin1 NOT NULL,
  `hora_entrada` varchar(50) CHARACTER SET latin1 NOT NULL,
  `hora_salida` varchar(30) DEFAULT NULL,
  `hora_permanencia` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `asistencia_maestro`
--

INSERT INTO `asistencia_maestro` (`id`, `id_maestro`, `fecha`, `hora_entrada`, `hora_salida`, `hora_permanencia`) VALUES
(8, '2222', '2020-07-27', '15:24:00', '17:30:07', '2'),
(11, '2222', '14/10/2020', '15:24:00', '00:00:00', '0'),
(14, '2222', '19/10/2020', '12:00:00', '23:20:07', '2'),
(19, '2222', '21/10/2020', '00:04:41', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `maestro`
--

CREATE TABLE `maestro` (
  `correo` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `huella` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `maestro`
--

INSERT INTO `maestro` (`correo`, `nombre`, `apellidos`, `sexo`, `telefono`, `huella`) VALUES
('hherrerar', 'Hiram', 'HerreraRivas', 'Masculino', '8341234567', '2222'),
('jhernandeza', 'Jorge Arturo', 'Hernández Almazán', 'Masculino', '8341118822', ''),
('marinaF', 'Marina Cristal', 'Flores Flores', 'Femenino', '8341235496', '123456789');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`correo`);

--
-- Indexes for table `asistencia`
--
ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_alumno` (`id_alumno`),
  ADD KEY `id_alumno_2` (`id_alumno`),
  ADD KEY `id_alumno_3` (`id_alumno`),
  ADD KEY `id_alumno_4` (`id_alumno`);

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
  ADD PRIMARY KEY (`correo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `asistencia`
--
ALTER TABLE `asistencia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `asistencia_maestro`
--
ALTER TABLE `asistencia_maestro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
