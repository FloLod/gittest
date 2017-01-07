-- -----------------------------------------------------
-- Table `Waterfall`.`Student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Student` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Student` (
  `StudentID` INT NOT NULL AUTO_INCREMENT ,
  `Karma` INT NULL ,
  `User` INT NOT NULL ,
  `Class` INT NOT NULL ,
  `CompanyPicture` INT NULL ,
  PRIMARY KEY (`StudentID`) ,
  INDEX `fkCompanyPicture_idx` (`CompanyPicture` ASC) ,
  INDEX `fkClass_idx` (`Class` ASC) ,
  INDEX `fkUser_idx` (`User` ASC) ,
  CONSTRAINT `fkClass`
    FOREIGN KEY (`Class` )
    REFERENCES `Waterfall`.`Class` (`ClassID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkUserStudent`
    FOREIGN KEY (`User` )
    REFERENCES `Waterfall`.`User` (`UserID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkCompanyPicture`
    FOREIGN KEY (`CompanyPicture` )
    REFERENCES `Waterfall`.`File` (`FileID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;