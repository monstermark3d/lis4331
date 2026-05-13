-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mtrombly
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mtrombly` ;

-- -----------------------------------------------------
-- Schema mtrombly
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mtrombly` DEFAULT CHARACTER SET utf8mb4 ;
SHOW WARNINGS;
USE `mtrombly` ;

-- -----------------------------------------------------
-- Table `mtrombly`.`customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mtrombly`.`customer` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `mtrombly`.`customer` (
  `cus_id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `cus_fname` VARCHAR(15) NOT NULL,
  `cus_lname` VARCHAR(30) NOT NULL,
  `cus_street` VARCHAR(30) NOT NULL,
  `cus_city` VARCHAR(30) NOT NULL,
  `cus_state` CHAR(2) NOT NULL,
  `cus_zip` CHAR(9) NOT NULL,
  `cus_phone` BIGINT UNSIGNED NOT NULL,
  `cus_email` VARCHAR(100) NOT NULL,
  `cus_balance` DECIMAL(8,2) NOT NULL,
  `cus_total_sales` DECIMAL(8,2) NOT NULL,
  `cus_notes` VARCHAR(255) NULL,
  PRIMARY KEY (`cus_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `mtrombly`.`petstore`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mtrombly`.`petstore` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `mtrombly`.`petstore` (
  `pst_id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `pst_name` VARCHAR(30) NOT NULL,
  `pst_street` VARCHAR(30) NOT NULL,
  `pst_city` VARCHAR(30) NOT NULL,
  `pst_state` CHAR(2) NOT NULL,
  `pst_zip` CHAR(9) NOT NULL,
  `pst_phone` BIGINT UNSIGNED NOT NULL,
  `pst_email` VARCHAR(100) NOT NULL,
  `pst_url` VARCHAR(100) NOT NULL,
  `pst_ytd_sales` DECIMAL(10,2) NOT NULL,
  `pst_notes` VARCHAR(255) NULL,
  PRIMARY KEY (`pst_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `mtrombly`.`pet`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mtrombly`.`pet` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `mtrombly`.`pet` (
  `pet_id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `pst_id` SMALLINT UNSIGNED NOT NULL,
  `cus_id` SMALLINT UNSIGNED NULL,
  `pet_type` VARCHAR(45) NOT NULL,
  `pet_sex` ENUM('m', 'f') NOT NULL,
  `pet_cost` DECIMAL(6,2) NOT NULL,
  `pet_price` DECIMAL(6,2) NOT NULL,
  `pet_age` TINYINT UNSIGNED NOT NULL COMMENT 'pet age in weeks.',
  `pet_color` VARCHAR(30) NOT NULL,
  `pet_sale_date` DATE NULL,
  `pet_vaccine` ENUM('y', 'n') NOT NULL,
  `pet_neuter` ENUM('y', 'n') NOT NULL,
  `pet_notes` VARCHAR(255) NULL,
  PRIMARY KEY (`pet_id`),
  INDEX `fk_pet_petstore_idx` (`pst_id` ASC) VISIBLE,
  INDEX `fk_pet_customer1_idx` (`cus_id` ASC) VISIBLE,
  CONSTRAINT `fk_pet_petstore`
    FOREIGN KEY (`pst_id`)
    REFERENCES `mtrombly`.`petstore` (`pst_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_pet_customer`
    FOREIGN KEY (`cus_id`)
    REFERENCES `mtrombly`.`customer` (`cus_id`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `mtrombly`.`customer`
-- -----------------------------------------------------
START TRANSACTION;
USE `mtrombly`;
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Olivia', 'Crane', '218-3763 Sit Av.', 'Juneau', 'MA', '896367380', 5935340879, 'est.ac@aol.org', 99810.00, 79500.00, 'Nunc mauris');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Joshua', 'Boyle', '2924 Ligula. St.', 'Milwaukee', 'VT', '886784484', 2160085088, 'ut.eros@icloud.net', 67264.00, 98451.00, 'Maecenas libero');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Cedric', 'Martinez', 'P.O. Box 829, 8550 Sit Avenue', 'Richmond', 'MS', '435860318', 8615101163, 'euismod.est.arcu@google.couk', 85244.00, 70908.00, 'arcu iaculis');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Chadwick', 'Morin', '436-6872 Etiam Rd.', 'Chattanooga', 'AR', '655149238', 5513561400, 'metus.urna@aol.ca', 69584.00, 20081.00, 'Nulla dignissim. Maecenas ornare egestas');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Jeremy', 'Small', '182-3686 Sem Road', 'Bellevue', 'OR', '152081800', 2854050587, 'fusce.feugiat@google.ca', 82219.00, 69710.00, 'magna sed dui. Fusce aliquam,');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Nathan', 'Mcmahon', '588 Varius Rd.', 'Laramie', 'OK', '503683943', 1849219891, 'arcu.curabitur.ut@outlook.org', 85318.00, 29336.00, 'elit erat');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Lael', 'Shields', '9175 Eros. Avenue', 'Hattiesburg', 'OH', '460524721', 5470265622, 'interdum.curabitur@outlook.edu', 2805.00, 29607.00, 'pharetra. Nam ac nulla. In');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Bevis', 'Kelley', '2154 Ullamcorper Ave', 'Sioux City', 'WI', '599473748', 4952231154, 'interdum.curabitur@yahoo.ca', 48342.00, 23198.00, 'Curabitur consequat, lectus sit amet');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Tyler', 'Banks', 'Ap #441-2073 Ipsum. St.', 'New Orleans', 'MO', '377714425', 8116021413, 'nec.tempus@icloud.edu', 68106.00, 9667.00, 'imperdiet');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Hector', 'Glass', '292-7657 Congue. Avenue', 'San Francisco', 'CT', '776632658', 8101992206, 'phasellus@yahoo.org', 97405.00, 30805.00, 'auctor quis, tristique');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Charles', 'Harrington', 'Ap #776-7293 Molestie Road', 'Duluth', 'VA', '136433598', 6772084651, 'sem.molestie.sodales@protonmail.com', 23243.00, 50036.00, 'elit, pellentesque a, facilisis');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Blake', 'Wallace', '807-3146 Nibh. Road', 'Auburn', 'VA', '631378845', 9104681080, 'vestibulum.accumsan.neque@google.net', 81932.00, 18400.00, 'elit. Etiam laoreet,');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Allistair', 'Lara', '649-7235 Est, St.', 'Tucson', 'KS', '754625862', 6187725087, 'nonummy@outlook.com', 58453.00, 84373.00, 'Nunc sed orci lobortis');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Jakeem', 'Winters', '500-5793 In Road', 'Lafayette', 'KS', '376665252', 1700513139, 'magna@hotmail.edu', 44522.00, 29499.00, 'erat. Vivamus');
INSERT INTO `mtrombly`.`customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_street`, `cus_city`, `cus_state`, `cus_zip`, `cus_phone`, `cus_email`, `cus_balance`, `cus_total_sales`, `cus_notes`) VALUES (DEFAULT, 'Dean', 'Ortega', 'P.O. Box 727', 'Montpelier', 'WI', '233793963', 3719889474, 'in@protonmail.org', 81406.00, 99765.00, 'lobortis. Class aptent taciti');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mtrombly`.`petstore`
-- -----------------------------------------------------
START TRANSACTION;
USE `mtrombly`;
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Ultrices Posuere Ltd', '4590 Pede, Rd.', 'Jacksonville', 'MS', '854776503', 7260507490, 'mus.proin@icloud.couk', 'https://ebay.com', 65837, 'ac urna. Ut tincidunt');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Adipiscing Corporation', '278-6108 Natoque St.', 'Henderson', 'AL', '406382451', 2574845380, 'lectus@google.net', 'https://twitter.com', 90031, 'urna. Vivamus molestie dapibus');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Accumsan LLP', 'P.O. Box 383', 'Lowell', 'MI', '383777569', 1431707295, 'rutrum.fusce.dolor@google.com', 'https://twitter.com', 60266, 'neque');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Luctus Associates', '7464 Lorem, Street', 'Springfield', 'DE', '501343120', 8293764080, 'ipsum.leo.elementum@yahoo.ca', 'http://walmart.com', 35046, 'sagittis augue, eu tempor erat');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Aliquet Nec Ltd', '6045 Sed Rd.', 'Gresham', 'TX', '510958258', 6242859915, 'mattis@yahoo.com', 'https://whatsapp.com', 54920, 'mus. Proin vel');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Velit Sed Consulting', '723-1222 Nec, Ave', 'Houston', 'IN', '481141643', 8308745245, 'cras.sed.leo@hotmail.com', 'http://zoom.us', 87646, 'senectus et netus et');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Ut Industries', 'P.O. Box 636', 'Fayetteville', 'WY', '479582619', 2182742891, 'lobortis.tellus@icloud.edu', 'http://wikipedia.org', 80987, 'quis diam. Pellentesque habitant');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Malesuada Ut Sem Ltd', '2389 Mauris Avenue', 'Lexington', 'IN', '823790178', 6689930832, 'magnis.dis@google.net', 'http://guardian.co.uk', 49411, 'blandit congue. In scelerisque');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Aliquam Tincidunt Inc.', 'Ap #310-3580 Sed Av.', 'Omaha', 'KY', '668160675', 4721058297, 'eu.dui@aol.com', 'https://wikipedia.org', 56153, 'fringilla cursus purus. Nullam scelerisque');
INSERT INTO `mtrombly`.`petstore` (`pst_id`, `pst_name`, `pst_street`, `pst_city`, `pst_state`, `pst_zip`, `pst_phone`, `pst_email`, `pst_url`, `pst_ytd_sales`, `pst_notes`) VALUES (DEFAULT, 'Eget Tincidunt Dui LLC', 'Ap #633-6558 Pede. Av.', 'Laramie', 'PA', '915541305', 8443894247, 'mi.tempor@outlook.net', 'http://guardian.co.uk', 99811, 'Curabitur massa. Vestibulum accumsan');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mtrombly`.`pet`
-- -----------------------------------------------------
START TRANSACTION;
USE `mtrombly`;
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 1, 5, 'lizard', 'm', 6473, 6182, 32, 'black', '2021-12-26', 'y', 'n', 'facilisi. Sed neque.');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 2, 1, 'snake', 'f', 488, 3272, 40, 'black', '2020-09-05', 'n', 'n', 'Donec egestas.');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 3, NULL, 'cat', 'm', 635, 9355, 68, 'golden', NULL, 'y', 'y', 'risus. Nulla eget metus');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 4, 3, 'dog', 'm', 1319, 6456, 63, 'brown', '2018-03-11', 'y', 'n', 'lacus. Aliquam rutrum lorem ac');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 5, 2, 'frog', 'm', 7054, 853, 88, 'grey', '2022-08-07', 'n', 'n', 'felis');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 6, NULL, 'lizard', 'm', 3861, 5023, 76, 'golden', NULL, 'n', 'n', 'Suspendisse aliquet, sem ut');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 7, 6, 'lizard', 'f', 8318, 9932, 22, 'grey', '2021-05-03', 'y', 'n', 'Fusce fermentum fermentum arcu. Vestibulum');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 8, 1, 'snake', 'm', 961, 323, 35, 'orange', '2021-09-12', 'y', 'y', 'Nunc ullamcorper, velit');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 9, 7, 'lizard', 'm', 5709, 9542, 25, 'black', '2019-11-21', 'n', 'y', 'facilisis facilisis,');
INSERT INTO `mtrombly`.`pet` (`pet_id`, `pst_id`, `cus_id`, `pet_type`, `pet_sex`, `pet_cost`, `pet_price`, `pet_age`, `pet_color`, `pet_sale_date`, `pet_vaccine`, `pet_neuter`, `pet_notes`) VALUES (DEFAULT, 10, 8, 'bird', 'f', 1857, 4048, 157, 'grey', '2019-02-25', 'n', 'n', 'metus. In lorem.');

COMMIT;

