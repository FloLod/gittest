-- -----------------------------------------------------
-- Table `Waterfall`.`File`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`File` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`File` (
  `FileID` INT NOT NULL ,
  `FileName` VARCHAR(45) NULL ,
  `Content` INT NULL ,
  `Text` INT NULL ,
  PRIMARY KEY (`FileID`) ,
  INDEX `Content_idx` (`Content` ASC) ,
  INDEX `Text_idx` (`Text` ASC) ,
  CONSTRAINT `fkContent`
    FOREIGN KEY (`Content` )
    REFERENCES `Waterfall`.`Content` (`ContentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkText`
    FOREIGN KEY (`Text` )
    REFERENCES `Waterfall`.`Text` (`TextID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;