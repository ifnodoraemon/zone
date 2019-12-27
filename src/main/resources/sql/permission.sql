DROP TABLE IF EXISTS `permission`;
CREATE TABLE IF NOT EXISTS `permission`
(
    `id`          BIGINT UNSIGNED AUTO_INCREMENT,
    `url`         VARCHAR(255)    NOT NULL,
    `name`        VARCHAR(255)    NOT NULL,
    `description` VARCHAR(255)    NOT NULL,
    `pid`         BIGINT UNSIGNED NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;