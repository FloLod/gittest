-- -----------------------------------------------------
-- Table `Waterfall`.`EducationDiary`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`EducationDiary` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`EducationDiary` (
  `EducationDiaryID` INT NOT NULL ,
  `Class` INT NULL ,
  `Content` INT NULL ,
  `Week` INT NULL ,
  `StartDate` DATE NULL ,
  `EndDate` DATE NULL ,
  PRIMARY KEY (`EducationDiaryID`) )
ENGINE = InnoDB;