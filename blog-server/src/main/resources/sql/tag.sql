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

-- 导出  表 lblog.tag 结构
CREATE TABLE IF NOT EXISTS `tag` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  lblog.tag 的数据：~16 rows (大约)
/*!40000 ALTER TABLE `tag` DISABLE KEYS */;
INSERT INTO `tag` (`id`, `create_time`, `modify_time`, `name`) VALUES
	(1, '2022-04-25 12:09:26', '2022-04-25 12:09:26', 'tag0'),
	(2, '2022-04-25 12:09:26', '2022-04-25 12:09:26', 'tag1'),
	(3, '2022-04-25 12:09:26', '2022-04-25 12:09:26', 'tag2'),
	(4, '2022-04-25 12:09:26', '2022-04-25 15:25:44', 'tag3'),
	(5, '2022-04-25 12:09:26', '2022-04-25 12:09:26', 'tag4'),
	(6, '2022-04-25 12:09:26', '2022-04-25 12:09:26', 'tag5'),
	(7, '2022-04-25 12:09:26', '2022-04-25 12:09:26', 'tag6'),
	(9, '2022-04-25 12:09:26', '2022-04-25 12:09:26', 'tag8'),
	(10, '2022-04-25 12:09:26', '2022-04-25 12:09:26', 'tag9'),
	(11, '2022-04-25 14:52:09', '2022-04-25 14:52:09', 'tagg5'),
	(12, '2022-04-25 15:11:23', '2022-04-25 15:11:23', 'tag23'),
	(13, '2022-04-25 15:11:23', '2022-04-25 15:11:23', 'tag38'),
	(14, '2022-04-25 15:11:23', '2022-04-25 15:11:23', 'tags232'),
	(25, '2022-04-25 15:35:55', '2022-04-25 15:35:55', '2p64ee'),
	(26, '2022-04-25 15:36:42', '2022-04-25 15:36:42', 'vlrd2a'),
	(27, '2022-04-25 15:49:20', '2022-04-25 15:49:20', 'tora.aufderhar'),
	(28, '2022-04-27 14:23:37', '2022-04-27 14:23:37', 'bba7od'),
	(29, '2022-04-27 14:52:02', '2022-04-27 14:52:02', 'lavon.oreilly');
/*!40000 ALTER TABLE `tag` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
