-- -----------------------------------------------------
-- Table `Waterfall`.`Question`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Question` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Question` (
  `QuestionID` INT NOT NULL ,
  `Content` INT NULL ,
  `Text` INT NULL ,
  `Category` INT NULL ,
  PRIMARY KEY (`QuestionID`) ,
  INDEX `Content_idx` (`Content` ASC) ,
  INDEX `Text_idx` (`Text` ASC) ,
  INDEX `Category_idx` (`Category` ASC) ,
  CONSTRAINT `fkContentQuestion`
    FOREIGN KEY (`Content` )
    REFERENCES `Waterfall`.`Content` (`ContentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkTextQuestion`
    FOREIGN KEY (`Text` )
    REFERENCES `Waterfall`.`Text` (`TextID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkCategoryQuestion`
    FOREIGN KEY (`Category` )
    REFERENCES `Waterfall`.`Category` (`CategoryID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;