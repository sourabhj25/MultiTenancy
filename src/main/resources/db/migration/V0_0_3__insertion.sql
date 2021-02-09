CREATE TABLE `tenancy_test`.`employee` (
  `employeeId` INT NOT NULL AUTO_INCREMENT,
  `employeeName` VARCHAR(45) NOT NULL,
  `employeeRole` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`employeeId`));

  
 INSERT INTO `tenancy_test`.`employee` (`employeeId`, `employeeName`, `employeeRole`) VALUES ('1', 'Saurabh', 'Admin');