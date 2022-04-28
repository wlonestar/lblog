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

-- 导出  表 lblog.article_tag 结构
CREATE TABLE IF NOT EXISTS `article_tag` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `aid` bigint DEFAULT NULL,
  `tid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  lblog.article_tag 的数据：~27 rows (大约)
/*!40000 ALTER TABLE `article_tag` DISABLE KEYS */;
INSERT INTO `article_tag` (`id`, `aid`, `tid`) VALUES
	(75, 4, 3),
	(76, 4, 9),
	(77, 4, 6),
	(85, 0, 5),
	(86, 0, 6),
	(87, 0, 7),
	(89, 0, 9),
	(90, 1, 5),
	(91, 1, 6),
	(92, 1, 7),
	(94, 1, 9),
	(95, 2, 5),
	(96, 2, 6),
	(97, 2, 7),
	(99, 2, 9),
	(100, 3, 5),
	(101, 3, 6),
	(102, 3, 7),
	(104, 3, 9),
	(105, 4, 5),
	(106, 4, 6),
	(107, 4, 7),
	(109, 4, 9),
	(110, 6, 12),
	(111, 6, 13),
	(112, 14, 25),
	(113, 7, 26),
	(114, 15, 28);
/*!40000 ALTER TABLE `article_tag` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
