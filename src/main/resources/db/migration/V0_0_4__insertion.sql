CREATE TABLE `students` (
  `studentId` INT NOT NULL AUTO_INCREMENT,
  `studentName` VARCHAR(45) NOT NULL,
  `subject` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`studentId`));

  
 INSERT INTO `students` (`studentId`, `studentName`, `subject`) VALUES ('1', 'Agile', 'MultiTenancy');