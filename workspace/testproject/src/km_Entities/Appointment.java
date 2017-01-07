-- -----------------------------------------------------
-- Table `Waterfall`.`Appointment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Appointment` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Appointment` (
  `AppointmentID` INT NOT NULL ,
  `AppointmentType` INT NULL ,
  `Text` INT NULL ,
  `Content` INT NULL ,
  `Start` DATETIME NULL ,
  `End` DATETIME NULL ,
  PRIMARY KEY (`AppointmentID`) ,
  INDEX `AppointmentType_idx` (`AppointmentType` ASC) ,
  INDEX `Text_idx` (`Text` ASC) ,
  INDEX `Content_idx` (`Content` ASC) ,
  CONSTRAINT `fkAppointmentType`
    FOREIGN KEY (`AppointmentType` )
    REFERENCES `Waterfall`.`AppointmentType` (`AppointmentTypID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkTextAppointment`
    FOREIGN KEY (`Text` )
    REFERENCES `Waterfall`.`Text` (`TextID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkContentAppointment`
    FOREIGN KEY (`Content` )
    REFERENCES `Waterfall`.`Content` (`ContentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;