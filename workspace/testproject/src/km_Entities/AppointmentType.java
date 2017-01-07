-- -----------------------------------------------------
-- Table `Waterfall`.`AppointmentType`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`AppointmentType` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`AppointmentType` (
  `AppointmentTypID` INT NOT NULL ,
  `Name` VARCHAR(45) NULL ,
  `Description` VARCHAR(45) NULL ,
  PRIMARY KEY (`AppointmentTypID`) )
ENGINE = InnoDB;