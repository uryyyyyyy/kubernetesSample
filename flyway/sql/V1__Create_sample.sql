CREATE TABLE `sample` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(200) NOT NULL COMMENT '名前',
  `created_at` datetime(3) NOT NULL COMMENT '登録日時',
  PRIMARY KEY (`id`)
) /*! ENGINE=InnoDB DEFAULT CHARSET=utf8 */ COMMENT='sample';
