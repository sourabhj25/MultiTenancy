USE tenancy_test;

DROP TABLE IF EXISTS `tenancy_test`.`tenant_info`;
CREATE TABLE `tenancy_test`.`tenant_info` (
  `id_tenant` INT NOT NULL AUTO_INCREMENT,
  `tenant_name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_tenant`));

