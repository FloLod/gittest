-- -----------------------------------------------------
-- Table `Waterfall`.`EducationDiaryList`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`EducationDiaryList` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`EducationDiaryList` (
  `EducationDiaryListID` INT NOT NULL ,
  `Week` INT NULL ,
  `Class` INT NULL ,
  `StudentResponsible` INT NULL ,
  `EducationDiary` INT NULL ,
  PRIMARY KEY (`EducationDiaryListID`) )
ENGINE = InnoDB;