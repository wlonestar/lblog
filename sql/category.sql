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

-- 导出  表 lblog.category 结构
CREATE TABLE IF NOT EXISTS `category` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  lblog.category 的数据：~24 rows (大约)
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`id`, `create_time`, `modify_time`, `name`) VALUES
	(1, '2022-04-24 21:13:55', '2022-04-24 21:13:55', 'category0'),
	(2, '2022-04-24 21:13:55', '2022-04-24 21:13:55', 'category1'),
	(3, '2022-04-24 21:13:55', '2022-04-24 21:13:55', 'category2'),
	(4, '2022-04-24 21:13:55', '2022-04-24 21:13:55', 'category3'),
	(5, '2022-04-24 21:13:55', '2022-04-25 15:39:10', 'hauh9o'),
	(6, '2022-04-24 21:13:55', '2022-04-24 21:13:55', 'category5'),
	(8, '2022-04-24 21:13:55', '2022-04-24 21:13:55', 'category7'),
	(9, '2022-04-24 21:13:55', '2022-04-24 21:13:55', 'category8'),
	(10, '2022-04-24 21:13:55', '2022-04-24 21:13:55', 'category9'),
	(11, '2022-04-25 09:11:01', '2022-04-25 09:11:01', 'category00'),
	(12, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category11'),
	(13, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category22'),
	(14, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category33'),
	(15, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category44'),
	(16, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category55'),
	(17, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category66'),
	(18, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category77'),
	(19, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category88'),
	(20, '2022-04-25 09:11:02', '2022-04-25 09:11:02', 'category99'),
	(21, '2022-04-25 14:56:57', '2022-04-25 14:56:57', 'category121'),
	(22, '2022-04-25 14:58:31', '2022-04-25 14:58:31', 'category12'),
	(23, '2022-04-25 15:35:55', '2022-04-25 15:35:55', '8mqiuz'),
	(24, '2022-04-25 15:36:42', '2022-04-25 15:36:42', '2c79yg'),
	(25, '2022-04-25 15:38:51', '2022-04-25 15:38:51', 'tmbvtu'),
	(26, '2022-04-27 14:23:37', '2022-04-27 14:23:37', 'trzcqk'),
	(27, '2022-04-27 14:37:05', '2022-04-27 14:37:05', '2bq725');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
