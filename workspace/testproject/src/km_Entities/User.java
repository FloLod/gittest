-- -----------------------------------------------------
-- Table `Waterfall`.`User`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`User` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`User` (
  `UserID` INT NOT NULL ,
  `FirstName` VARCHAR(45) NULL ,
  `LastName` VARCHAR(45) NULL ,
  `EMail` VARCHAR(45) NULL ,
  `LastLogin` DATETIME NULL ,
  `Password` VARCHAR(45) NULL ,
  PRIMARY KEY (`UserID`) )
ENGINE = InnoDB;