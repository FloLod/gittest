-- -----------------------------------------------------
-- Table `Waterfall`.`TimeTable`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`TimeTable` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`TimeTable` (
  `TimeTableID` INT NOT NULL ,
  `StartingDate` DATE NULL ,
  `EndDate` DATE NULL ,
  `File` INT NULL ,
  `Class` INT NULL ,
  PRIMARY KEY (`TimeTableID`) ,
  INDEX `File_idx` (`File` ASC) ,
  INDEX `Class_idx` (`Class` ASC) ,
  CONSTRAINT `fkFileTimeTable`
    FOREIGN KEY (`File` )
    REFERENCES `Waterfall`.`File` (`FileID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkClassTimeTable`
    FOREIGN KEY (`Class` )
    REFERENCES `Waterfall`.`Class` (`ClassID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;