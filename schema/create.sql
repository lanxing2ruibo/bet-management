CREATE DATABASE IF NOT EXISTS bet DEFAULT CHARSET utf8;

CREATE TABLE IF NOT EXISTS  `bet_record`(
	`id` INT AUTO_INCREMENT,
	`user` VARCHAR(64) NOT NULL,
	`money` INT NOT NULL,
	`create_time` DATE NOT NULL,
	`income` DECIMAL(6,2) NOT NULL,
	`result` INT NOT NULL,
    PRIMARY KEY ( `id` )
) ENGINE=InnoDB DEFAULT CHARSET=utf8;