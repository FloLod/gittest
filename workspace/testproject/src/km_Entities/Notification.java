-- -----------------------------------------------------
-- Table `Waterfall`.`Notification`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Notification` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Notification` (
  `NotificationID` INT NOT NULL ,
  `Student` INT NULL ,
  `NotificationType` INT NULL ,
  `Text` INT NULL ,
  PRIMARY KEY (`NotificationID`) ,
  INDEX `Student_idx` (`Student` ASC) ,
  INDEX `NotificationType_idx` (`NotificationType` ASC) ,
  INDEX `Text_idx` (`Text` ASC) ,
  CONSTRAINT `fkStudentNotification`
    FOREIGN KEY (`Student` )
    REFERENCES `Waterfall`.`Student` (`StudentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkNotificationType`
    FOREIGN KEY (`NotificationType` )
    REFERENCES `Waterfall`.`NotificationType` (`NotificationTypeID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkTextNotification`
    FOREIGN KEY (`Text` )
    REFERENCES `Waterfall`.`Text` (`TextID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;