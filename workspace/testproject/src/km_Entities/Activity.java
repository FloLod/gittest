-- -----------------------------------------------------
-- Table `Waterfall`.`Activity`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Activity` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Activity` (
  `Activityid` INT NOT NULL ,
  `Description` VARCHAR(45) NULL ,
  `Duration` INT NULL ,
  PRIMARY KEY (`Activityid`) )
ENGINE = InnoDB;