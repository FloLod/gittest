
-- -----------------------------------------------------
-- Table `Waterfall`.`EducationDiaryDay`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`EducationDiaryDay` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`EducationDiaryDay` (
  `EducationDiaryDayID` INT NOT NULL ,
  `Day` INT NULL ,
  `Activity` INT NULL ,
  PRIMARY KEY (`EducationDiaryDayID`) ,
  INDEX `Day_idx` (`Day` ASC) ,
  INDEX `Activity_idx` (`Activity` ASC) ,
  CONSTRAINT `fkDay`
    FOREIGN KEY (`Day` )
    REFERENCES `Waterfall`.`Day` (`DayID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkActivity`
    FOREIGN KEY (`Activity` )
    REFERENCES `Waterfall`.`Activity` (`Activityid` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
