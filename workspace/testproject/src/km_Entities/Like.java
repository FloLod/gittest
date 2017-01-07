-- -----------------------------------------------------
-- Table `Waterfall`.`Like`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Like` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Like` (
  `StudentID` INT NOT NULL ,
  `ContentID` INT NOT NULL ,
  PRIMARY KEY (`StudentID`, `ContentID`) ,
  INDEX `Student_idx` (`StudentID` ASC) ,
  INDEX `Content_idx` (`ContentID` ASC) ,
  CONSTRAINT `fkStudent`
    FOREIGN KEY (`StudentID` )
    REFERENCES `Waterfall`.`Student` (`StudentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkContentLike`
    FOREIGN KEY (`ContentID` )
    REFERENCES `Waterfall`.`Content` (`ContentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;