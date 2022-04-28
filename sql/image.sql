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

-- 导出  表 lblog.image 结构
CREATE TABLE IF NOT EXISTS `image` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  lblog.image 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
INSERT INTO `image` (`id`, `create_time`, `name`, `url`) VALUES
	(4, '2022-04-27 15:11:27', '6228900379ce478db834521ec08af641.jpg', 'https://mypic-1305118058.cos.ap-hongkong.myqcloud.com/lblog/6228900379ce478db834521ec08af641.jpg'),
	(5, '2022-04-27 15:14:49', '483850ff-576b-4941-9595-cde286070364.jpg', 'https://mypic-1305118058.cos.ap-hongkong.myqcloud.com/lblog/483850ff-576b-4941-9595-cde286070364.jpg'),
	(6, '2022-04-27 15:15:00', 'b924ce27-b536-4ec0-9b3c-0f86f7779beb.jpg', 'https://mypic-1305118058.cos.ap-hongkong.myqcloud.com/lblog/b924ce27-b536-4ec0-9b3c-0f86f7779beb.jpg'),
	(7, '2022-04-27 15:15:05', 'cddfd2bf-1f79-45dc-b650-2840300735d8.jpg', 'https://mypic-1305118058.cos.ap-hongkong.myqcloud.com/lblog/cddfd2bf-1f79-45dc-b650-2840300735d8.jpg'),
	(8, '2022-04-27 15:15:10', 'e590db1f-9d83-4af3-b49c-b0c9b9ffd9bc.jpg', 'https://mypic-1305118058.cos.ap-hongkong.myqcloud.com/lblog/e590db1f-9d83-4af3-b49c-b0c9b9ffd9bc.jpg'),
	(9, '2022-04-27 15:15:43', 'e590db1f-9d83-4af3-b49c-b0c9b9ffd9bc.jpg', 'https://mypic-1305118058.cos.ap-hongkong.myqcloud.com/lblog/e590db1f-9d83-4af3-b49c-b0c9b9ffd9bc.jpg');
/*!40000 ALTER TABLE `image` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
