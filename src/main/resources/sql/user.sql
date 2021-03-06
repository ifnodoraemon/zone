DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user`
(
    `id`       BIGINT UNSIGNED AUTO_INCREMENT,
    `username` VARCHAR(128)  NOT NULL,
    `password` VARCHAR(1024) NOT NULL,
    `email`    VARCHAR(64)   NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;