CREATE SCHEMA `estacio` ;

CREATE TABLE `estacio`.`usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user` VARCHAR(20) NULL,
  `password` VARCHAR(6) NULL,
  PRIMARY KEY (`id`));

SELECT * FROM estacio.usuarios;

INSERT INTO `estacio`.`usuarios` (`user`, `password`) VALUES ('adm', '1234ab');
INSERT INTO `estacio`.`usuarios` (`user`, `password`) VALUES ('alu', '4321zx');
INSERT INTO `estacio`.`usuarios` (`user`, `password`) VALUES ('prof', 'f2xe0');

