CREATE DATABASE mistep;

GRANT ALL ON mistep.* TO mistepuser@'%' IDENTIFIED BY 'pmistepuser';
GRANT ALL ON mistep.* TO mistepuser@localhost IDENTIFIED BY 'pmistepuser';

USE mistep;

CREATE TABLE offices (
  id INTEGER PRIMARY KEY,
  description varchar(255),
  localCost decimal(15,4),
  utilitiesCost decimal(15,4),
  employeeCost decimal(15,4)
);
CREATE INDEX offices_description ON offices(description);