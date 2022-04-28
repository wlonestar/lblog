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

-- 导出  表 lblog.article 结构
CREATE TABLE IF NOT EXISTS `article` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `summary` varchar(1000) DEFAULT NULL,
  `image` varchar(1000) DEFAULT NULL,
  `content` longtext,
  `category_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  lblog.article 的数据：~12 rows (大约)
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` (`id`, `create_time`, `modify_time`, `title`, `summary`, `image`, `content`, `category_id`) VALUES
	(1, '2022-04-24 21:15:18', '2022-04-24 21:15:18', 'title0', 'summary0...', 'sdvvdusgkyetrwyujgre0', 'content0', 1),
	(2, '2022-04-24 21:15:18', '2022-04-24 21:15:18', 'title1', 'summary1...', 'sdvvdusgkyetrwyujgre1', 'content1', 1),
	(3, '2022-04-24 21:15:18', '2022-04-24 21:15:18', 'title2', 'summary2...', 'sdvvdusgkyetrwyujgre2', 'content2', 1),
	(4, '2022-04-24 21:15:18', '2022-04-25 15:09:06', 'article1wrw0', 'summsdary2r2', 'imafbsd', 'conegnreedsu', 22),
	(5, '2022-04-24 21:15:18', '2022-04-24 21:15:18', 'title4', 'summary4...', 'sdvvdusgkyetrwyujgre4', 'content4', 1),
	(6, '2022-04-24 21:15:18', '2022-04-25 15:25:44', 'article1wrw0', 'summsdary2r2', 'imafbsd', 'conegnreedsu', 22),
	(8, '2022-04-24 21:15:18', '2022-04-24 21:15:18', 'title7', 'summary7...', 'sdvvdusgkyetrwyujgre7', 'content7', 1),
	(9, '2022-04-24 21:15:18', '2022-04-24 21:15:18', 'title8', 'summary8...', 'sdvvdusgkyetrwyujgre8', 'content8', 1),
	(10, '2022-04-24 21:15:18', '2022-04-24 21:15:18', 'title9', 'summary9...', 'sdvvdusgkyetrwyujgre9', 'content9', 1),
	(11, '2022-04-25 14:52:09', '2022-04-25 14:52:09', 'article100', 'summary222222', 'imafbegee', 'conegnreeufwfwe', 12),
	(13, '2022-04-25 15:25:44', '2022-04-25 15:25:44', 'article101210', 'summsdary222222', 'imafbsdegee', 'conegnreedsufwfwe', 21),
	(14, '2022-04-25 15:35:55', '2022-04-25 15:35:55', 's7nyge', '27yc8n', 'mchjq9', '5vga6e', 23),
	(15, '2022-04-27 14:23:37', '2022-04-27 14:23:37', 'xg90my', '3jaib9', 'https://mypic-1305118058.cos.ap-hongkong.myqcloud.com/lblog/6228900379ce478db834521ec08af641.jpg', 'p05on2', 26);
/*!40000 ALTER TABLE `article` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
