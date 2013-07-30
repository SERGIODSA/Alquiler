SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `Peliculas` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;

USE `Peliculas`;

CREATE  TABLE IF NOT EXISTS `Peliculas`.`Clientes` (
  `Cedula` INT(11) NOT NULL ,
  `Nombre` VARCHAR(25) NOT NULL ,
  `Apellido` VARCHAR(25) NOT NULL ,
  `CodigoArea` VARCHAR(4) NOT NULL ,
  `Telefono` VARCHAR(7) NOT NULL ,
  `Direccion` VARCHAR(50) NOT NULL ,
  `Email` VARCHAR(30) NOT NULL ,
  `Socio` VARCHAR(2) NOT NULL ,
  `Num_Multas` SMALLINT(6) NOT NULL ,
  `Num_Peliculas_Alq` SMALLINT(6) NOT NULL ,
  PRIMARY KEY (`Cedula`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE  TABLE IF NOT EXISTS `Peliculas`.`Peliculas` (
  `idPelicula` INT(11) NOT NULL AUTO_INCREMENT ,
  `Titulo` VARCHAR(60) NOT NULL ,
  `Año` SMALLINT(6) NOT NULL ,
  `Genero` VARCHAR(15) NOT NULL ,
  `Censura` CHAR NOT NULL ,
  `Reparto` VARCHAR(170) NOT NULL ,
  `Uso` VARCHAR(15) NOT NULL ,
  `Condicion` VARCHAR(15) NOT NULL ,
  `Cantidad` SMALLINT(6) NOT NULL ,
  `Precio` INT(11) NOT NULL ,
  `Veces_Alquilada` SMALLINT(6) NOT NULL ,
  `Distribuidor` VARCHAR(50) NOT NULL ,
  `Precio_Pedido` INT(11) NOT NULL ,
  `Fecha_Solicitud` DATE NOT NULL ,
  `Fecha_Esperada` DATE NOT NULL ,
  `Fecha_Entrega` DATE NULL DEFAULT NULL ,
  `Estatus` VARCHAR(45) NOT NULL ,
  `idAuxiliar` INT(11) NULL DEFAULT NULL ,
  `Registro` VARCHAR(10) NOT NULL ,
  PRIMARY KEY (`idPelicula`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE  TABLE IF NOT EXISTS `Peliculas`.`Alquiler` (
  `idAlquiler` INT(11) NOT NULL AUTO_INCREMENT ,
  `idPelicula` INT(11) NOT NULL ,
  `Cedula` INT(11) NOT NULL ,
  `Fecha_Alquiler` DATE NOT NULL ,
  `Fecha_Entrega` DATE NULL DEFAULT NULL ,
  PRIMARY KEY (`idAlquiler`, `idPelicula`, `Cedula`) ,
  INDEX `Alquiler_Cedula` (`Cedula` ASC) ,
  CONSTRAINT `Alquiler_Cedula`
    FOREIGN KEY (`Cedula` )
    REFERENCES `Peliculas`.`Clientes` (`Cedula` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Alquiler_Pelicula`
    FOREIGN KEY (`idPelicula` )
    REFERENCES `Peliculas`.`Peliculas` (`idPelicula` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE  TABLE IF NOT EXISTS `Peliculas`.`Ventas` (
  `idVenta` INT(11) NOT NULL AUTO_INCREMENT ,
  `idPelicula` INT(11) NOT NULL ,
  `Cedula` INT(11) NOT NULL ,
  `Descuento` SMALLINT(6) NOT NULL ,
  `Fecha_Venta` DATE NOT NULL ,
  `Precio_Real` INT(11) NOT NULL ,
  PRIMARY KEY (`idVenta`, `idPelicula`, `Cedula`) ,
  INDEX `Venta_Cedula` (`Cedula` ASC) ,
  INDEX `Venta_Peliculas` (`idPelicula` ASC) ,
  CONSTRAINT `Venta_Cedula`
    FOREIGN KEY (`Cedula` )
    REFERENCES `Peliculas`.`Clientes` (`Cedula` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Venta_Peliculas`
    FOREIGN KEY (`idPelicula` )
    REFERENCES `Peliculas`.`Peliculas` (`idPelicula` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
