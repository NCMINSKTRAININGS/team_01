-- create database hotel
-- mysql -uroot hotel<hotel.sql

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `hotel` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `hotel`.`user` (
  `id` BIGINT(8) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `surname` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  `money` DOUBLE NULL DEFAULT NULL,
  `role` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `hotel`.`room` (
  `id` BIGINT(8) NOT NULL AUTO_INCREMENT,
  `seats` INT(11) NULL DEFAULT NULL,
  `status_id` INT(11) NOT NULL,
  `type_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Room_Status1_idx` (`status_id` ASC),
  INDEX `fk_Room_Type1_idx` (`type_id` ASC),
  CONSTRAINT `fk_Room_Status1`
    FOREIGN KEY (`status_id`)
    REFERENCES `hotel`.`status` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Room_Type1`
    FOREIGN KEY (`type_id`)
    REFERENCES `hotel`.`type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `hotel`.`status` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `status_en` VARCHAR(45) NULL DEFAULT NULL,
  `status_ru` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `hotel`.`type` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `type_en` VARCHAR(45) NULL DEFAULT NULL,
  `type_ru` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `hotel`.`user_room` (
  `user_id` BIGINT(8) NOT NULL,
  `room_id` BIGINT(8) NOT NULL,
  `check-in_date` TIMESTAMP(0) NULL DEFAULT NULL,
  `check-out_date` TIMESTAMP(0) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`, `room_id`),
  INDEX `fk_User_has_Room_Room1_idx` (`room_id` ASC),
  INDEX `fk_User_has_Room_User1_idx` (`user_id` ASC),
  CONSTRAINT `fk_User_has_Room_User1`
    FOREIGN KEY (`user_id`)
    REFERENCES `hotel`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_Room_Room1`
    FOREIGN KEY (`room_id`)
    REFERENCES `hotel`.`room` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `hotel`.`claim` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `check-in_date` TIMESTAMP(0) NULL DEFAULT NULL,
  `check-out_date` TIMESTAMP(0) NULL DEFAULT NULL,
  `type_id` INT(11) NOT NULL,
  `user_id` BIGINT(8) NOT NULL,
  PRIMARY KEY (`id`, `user_id`),
  INDEX `fk_claim_type1_idx` (`type_id` ASC),
  INDEX `fk_claim_user1_idx` (`user_id` ASC),
  CONSTRAINT `fk_claim_type1`
    FOREIGN KEY (`type_id`)
    REFERENCES `hotel`.`type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_claim_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `hotel`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
