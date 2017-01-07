-- -----------------------------------------------------
-- Table `Waterfall`.`StudentAppointment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`StudentAppointment` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`StudentAppointment` (
  `StudentAppointmentID` INT NOT NULL AUTO_INCREMENT ,
  `Student` INT NULL ,
  `Class` INT NULL ,
  `Appointment` INT NOT NULL ,
  PRIMARY KEY (`StudentAppointmentID`) ,
  INDEX `Student_idx` (`Student` ASC) ,
  INDEX `Class_idx` (`Class` ASC) ,
  INDEX `Appointment_idx` (`Appointment` ASC) ,
  CONSTRAINT `fkStudentAppointment`
    FOREIGN KEY (`Student` )
    REFERENCES `Waterfall`.`Student` (`StudentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkClassAppointment`
    FOREIGN KEY (`Class` )
    REFERENCES `Waterfall`.`Class` (`ClassID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkAppointment`
    FOREIGN KEY (`Appointment` )
    REFERENCES `Waterfall`.`Appointment` (`AppointmentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `Waterfall` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;