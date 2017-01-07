-- -----------------------------------------------------
-- Table `Waterfall`.`Admin`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Admin` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Admin` (
  `AdminID` INT NOT NULL ,
  `User` INT NULL ,
  PRIMARY KEY (`AdminID`) ,
  INDEX `User_idx` (`User` ASC) ,
  CONSTRAINT `fkUser`
    FOREIGN KEY (`User` )
    REFERENCES `Waterfall`.`User` (`UserID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;