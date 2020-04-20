DROP TABLE IF EXISTS files;
 
CREATE TABLE files (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  file_decimal DECIMAL(4,2) NOT NULL,
  file_name VARCHAR(250) NOT NULL,
  file_creation DATETIME NOT NULL
);

INSERT INTO files 
	(`file_decimal`, 
	`file_name`,
	`file_creation`) 
VALUES ('78.33', 'txt4', '2020-04-18');