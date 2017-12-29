-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2016 at 08:25 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `timetable`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `email_id` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`email_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email_id`, `password`) VALUES
('jalpaparekh124@gmail.com', '123');

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE IF NOT EXISTS `class` (
  `class_no` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`class_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`class_no`) VALUES
(202),
(501);

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `course_id` int(11) NOT NULL,
  `course_name` varchar(35) NOT NULL,
  `sub_no` int(11) NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`course_id`, `course_name`, `sub_no`) VALUES
(1, 'MSCIT', 7),
(2, 'MBA', 7);

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE IF NOT EXISTS `schedule` (
  `schedule_id` int(11) NOT NULL,
  `schedule_day` text NOT NULL,
  `subject_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE IF NOT EXISTS `subject` (
  `sub_id` int(11) NOT NULL,
  `sub_name` varchar(35) NOT NULL,
  `course_id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `lecture_week` int(11) DEFAULT NULL,
  PRIMARY KEY (`sub_id`),
  UNIQUE KEY `sub_id` (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`sub_id`, `sub_name`, `course_id`, `teacher_id`, `lecture_week`) VALUES
(0, 'AI', 1, 1, 3),
(1, 'ERP', 1, 1, 3),
(2, 'OR', 1, 1, 3),
(3, 'SPM', 1, 1, 3),
(4, 'AN', 1, 1, 3),
(5, 'ES', 1, 1, 2),
(6, 'CS', 1, 1, 2),
(7, 'PPM', 2, 1, 3),
(8, 'QTM', 2, 1, 3),
(9, 'OB', 2, 1, 3),
(10, 'ME', 2, 1, 3),
(11, 'MIS', 2, 1, 3),
(12, 'FAM', 2, 1, 2),
(13, 'MC', 2, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `teacher_id` int(11) NOT NULL,
  `teacher_name` varchar(35) NOT NULL,
  `mobile_no` varchar(10) NOT NULL,
  `mail_id` varchar(50) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`teacher_id`, `teacher_name`, `mobile_no`, `mail_id`) VALUES
(1, 'Chintal Shah', '9089773749', 'jrhrjedrjb@gmail.com'),
(2, 'Vidhi Patel', '0930478789', 'hfhfh@gmail.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
