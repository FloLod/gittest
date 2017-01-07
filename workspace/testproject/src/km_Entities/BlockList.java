-- -----------------------------------------------------
-- Table `Waterfall`.`BlockList`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`BlockList` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`BlockList` (
  `BlockListID` INT NOT NULL ,
  `Student` INT NULL ,
  `Reason` VARCHAR(45) NULL ,
  `EndDate` DATE NULL ,
  PRIMARY KEY (`BlockListID`) ,
  INDEX `StudentBlocked_idx` (`Student` ASC) ,
  CONSTRAINT `fkStudentBlocked`
    FOREIGN KEY (`Student` )
    REFERENCES `Waterfall`.`Student` (`StudentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;