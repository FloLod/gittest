-- -----------------------------------------------------
-- Table `Waterfall`.`Content`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Content` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Content` (
  `ContentID` INT NOT NULL ,
  `ContentType` INT NULL ,
  `CreatorStudent` INT NULL ,
  `Created` DATETIME NULL ,
  `Changed` DATETIME NULL ,
  PRIMARY KEY (`ContentID`) ,
  INDEX `Creator_idx` (`CreatorStudent` ASC) ,
  CONSTRAINT `fkContentType`
    FOREIGN KEY (`ContentID` )
    REFERENCES `Waterfall`.`ContentType` (`ContentTypeID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkCreator`
    FOREIGN KEY (`CreatorStudent` )
    REFERENCES `Waterfall`.`Student` (`StudentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;