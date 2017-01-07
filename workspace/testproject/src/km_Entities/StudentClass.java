-- -----------------------------------------------------
-- Table `Waterfall`.`Class`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Class` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Class` (
  `ClassID` INT NOT NULL ,
  `EducationPath` VARCHAR(45) NULL ,
  `Year` YEAR NULL ,
  PRIMARY KEY (`ClassID`) ,
  CONSTRAINT `fkClassSpeaker`
    FOREIGN KEY (`ClassID` )
    REFERENCES `Waterfall`.`Student` (`StudentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;