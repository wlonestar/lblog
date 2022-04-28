-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.28 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 导出  表 lblog.comment 结构
CREATE TABLE IF NOT EXISTS `comment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `content` longtext,
  `username` varchar(255) DEFAULT NULL,
  `avatar` varchar(1000) DEFAULT NULL,
  `site` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=651 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  lblog.comment 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` (`id`, `create_time`, `content`, `username`, `avatar`, `site`, `email`) VALUES
	(1, '2022-04-27 14:37:46', 'm100tr', 'lavon.oreilly', 'bhbq5b', 'zu33xg', 'leola.abernathy@gmail.com'),
	(644, '2022-04-27 14:42:25', 'eaox56', 'lavon.oreilly', 'c1tktw', 'ta048s', 'leola.abernathy@gmail.com'),
	(645, '2022-04-27 14:42:26', 'ew', 'lavon.oreilly', 'c1tktw', 'ta048s', 'leola.abernathy@gmail.com'),
	(646, '2022-04-27 14:42:27', 'eaox56', 'lavon.oreilly', 'c1tktw', 'ta048s', 'leola.abernathy@gmail.com'),
	(647, '2022-04-27 14:42:27', 'eaox56', 'lavon.oreilly', 'c1tktw', 'ta048s', 'leola.abernathy@gmail.com'),
	(648, '2022-04-27 14:42:28', 'ewewfewfwefw', 'lavon.oreilly', 'c1tktw', 'ta048s', 'leola.abernathy@gmail.com'),
	(649, '2022-04-27 14:42:29', 'eaox56', 'lavon.oreilly', 'c1tktw', 'ta048s', 'leola.abernathy@gmail.com'),
	(650, '2022-04-27 14:51:05', 'eaox56', 'lavon.oreilly', 'c1tktw', 'ta048s', 'leola.abernathy@gmail.com');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
