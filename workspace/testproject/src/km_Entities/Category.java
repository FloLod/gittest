-- -----------------------------------------------------
-- Table `Waterfall`.`Category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Category` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Category` (
  `CategoryID` INT NOT NULL ,
  `Text` INT NULL ,
  PRIMARY KEY (`CategoryID`) ,
  INDEX `Text_idx` (`Text` ASC) ,
  CONSTRAINT `fkTextCategory`
    FOREIGN KEY (`Text` )
    REFERENCES `Waterfall`.`Text` (`TextID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;