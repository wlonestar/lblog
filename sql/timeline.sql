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

-- 导出  表 lblog.timeline 结构
CREATE TABLE IF NOT EXISTS `timeline` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  lblog.timeline 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `timeline` DISABLE KEYS */;
INSERT INTO `timeline` (`id`, `create_time`, `modify_time`, `title`, `content`) VALUES
	(1, '2022-04-27 15:02:24', '2022-04-27 15:02:24', '10s0h0', '4mbnjp'),
	(2, '2022-04-27 15:02:24', '2022-04-27 15:02:24', '10s0h0', '4mbnjp'),
	(3, '2022-04-27 15:02:25', '2022-04-27 15:02:25', '10s0h0', '4mbnjp'),
	(5, '2022-04-27 15:02:59', '2022-04-27 15:02:59', '10s0fwfh0', '4mbwefefnjp'),
	(6, '2022-04-27 15:03:00', '2022-04-27 15:03:00', 'mkvv8n', 'kyqm1t'),
	(7, '2022-04-27 15:03:01', '2022-04-27 15:03:01', '10s0fwfh0', '4mbwefefnjp');
/*!40000 ALTER TABLE `timeline` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
