-- -----------------------------------------------------
-- Table `Waterfall`.`Text`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Text` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Text` (
  `TextID` INT NOT NULL ,
  `Heading` VARCHAR(45) NULL ,
  `Text` VARCHAR(400) NULL ,
  PRIMARY KEY (`TextID`) )
ENGINE = InnoDB;