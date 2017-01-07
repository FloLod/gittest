-- -----------------------------------------------------
-- Table `Waterfall`.`Reply`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Waterfall`.`Reply` ;

CREATE  TABLE IF NOT EXISTS `Waterfall`.`Reply` (
  `ReplyID` INT NOT NULL ,
  `Content` INT NULL ,
  `Text` INT NULL ,
  `Question` INT NULL ,
  PRIMARY KEY (`ReplyID`) ,
  INDEX `Content_idx` (`Content` ASC) ,
  INDEX `Text_idx` (`Text` ASC) ,
  INDEX `Question_idx` (`Question` ASC) ,
  CONSTRAINT `fkContentReply`
    FOREIGN KEY (`Content` )
    REFERENCES `Waterfall`.`Content` (`ContentID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkTextReply`
    FOREIGN KEY (`Text` )
    REFERENCES `Waterfall`.`Text` (`TextID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkQuestionReply`
    FOREIGN KEY (`Question` )
    REFERENCES `Waterfall`.`Question` (`QuestionID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;