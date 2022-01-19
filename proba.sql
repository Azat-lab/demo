-- MySQL Script generated by MySQL Workbench
-- Tue Jan 18 02:00:36 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Handbook
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Handbook
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Handbook` DEFAULT CHARACTER SET utf8 ;
USE `Handbook` ;

-- -----------------------------------------------------
-- Table `Handbook`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Handbook`.`country` (
  `country_area_code_id` INT NOT NULL AUTO_INCREMENT,
  `country_name` VARCHAR(50) NULL,
  `address` VARCHAR(120) NOT NULL,
  PRIMARY KEY (`country_area_code_id`),
  UNIQUE INDEX `idcountry_UNIQUE` (`country_area_code_id` ASC) VISIBLE,
  UNIQUE INDEX `country_name_UNIQUE` (`country_name` ASC) VISIBLE,
  UNIQUE INDEX `address_UNIQUE` (`address` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Handbook`.`operator_id`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Handbook`.`operator_id` (
  `telekom_operator` VARCHAR(60) NOT NULL,
  `operator_name_id` INT NOT NULL,
  `operator_code` INT NOT NULL AUTO_INCREMENT,
  `operator_country` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`telekom_operator`),
  UNIQUE INDEX `telekom_operator_UNIQUE` (`telekom_operator` ASC) VISIBLE,
  UNIQUE INDEX `operator_id_UNIQUE` (`operator_name_id` ASC) VISIBLE,
  UNIQUE INDEX `operator_code_UNIQUE` (`operator_code` ASC) VISIBLE,
  UNIQUE INDEX `operator_country_UNIQUE` (`operator_country` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Handbook`.`handbook`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Handbook`.`handbook` (
  `person_id` INT NOT NULL,
  `person_name` VARCHAR(50) NOT NULL,
  `person_surname` VARCHAR(50) NOT NULL,
  `phone_number` INT NOT NULL AUTO_INCREMENT,
  `operator_id_telekom_operator` VARCHAR(60) NOT NULL,
  `country_country_area_code_id` INT NOT NULL,
  PRIMARY KEY (`person_id`, `operator_id_telekom_operator`, `country_country_area_code_id`),
  UNIQUE INDEX `person_id_UNIQUE` (`person_id` ASC) VISIBLE,
  UNIQUE INDEX `person_name_UNIQUE` (`person_name` ASC) VISIBLE,
  UNIQUE INDEX `person_surname_UNIQUE` (`person_surname` ASC) VISIBLE,
  UNIQUE INDEX `phone_number_UNIQUE` (`phone_number` ASC) VISIBLE,
  INDEX `fk_handbook_operator_id_idx` (`operator_id_telekom_operator` ASC) VISIBLE,
  INDEX `fk_handbook_country1_idx` (`country_country_area_code_id` ASC) VISIBLE,
  CONSTRAINT `fk_handbook_operator_id`
    FOREIGN KEY (`operator_id_telekom_operator`)
    REFERENCES `Handbook`.`operator_id` (`telekom_operator`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_handbook_country1`
    FOREIGN KEY (`country_country_area_code_id`)
    REFERENCES `Handbook`.`country` (`country_area_code_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;