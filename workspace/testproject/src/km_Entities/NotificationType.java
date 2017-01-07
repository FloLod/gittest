-- -----------------------------------------------------
-- Table `Waterfall`.`NotificationType`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`NotificationType` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`NotificationType` (
  `NotificationTypeID` INT NOT NULL ,
  `Name` VARCHAR(45) NULL ,
  PRIMARY KEY (`NotificationTypeID`) )
ENGINE = InnoDB;
