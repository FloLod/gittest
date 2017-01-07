-- -----------------------------------------------------
-- Table `Waterfall`.`ContentType`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`ContentType` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`ContentType` (
  `ContentTypeID` INT NOT NULL AUTO_INCREMENT ,
  `Name` VARCHAR(45) NULL ,
  `KarmaReward` VARCHAR(45) NULL ,
  `Class` INT NOT NULL ,
  PRIMARY KEY (`ContentTypeID`) ,
  INDEX `Class_idx` (`Class` ASC) ,
  CONSTRAINT `fk_Class`
    FOREIGN KEY (`Class` )
    REFERENCES `Waterfall`.`Class` (`ClassID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;