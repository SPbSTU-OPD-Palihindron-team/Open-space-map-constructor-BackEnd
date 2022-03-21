CREATE TYPE AccessibilityType AS ENUM('ADMIN', 'USER')

CREATE TABLE RegistratedUsers(
pk_user_id SERIAL PRIMARY KEY,
login TEXT NOT NULL,
pass TEXT NOT NULL,
accessibility AccessibilityType NOT NULL
)

--DROP TABLE RegistratedUsers CASCADE



CREATE TYPE StatusType AS ENUM('FREE', 'EMPLOYED')

CREATE TABLE Employees(
pk_employee_id SERIAL PRIMARY KEY,
first_name TEXT NOT NULL,
second_name TEXT NOT NULL,
patronymic TEXT NOT NULL,
email TEXT NOT NULL,
number_telephone TEXT NOT NULL,
employee_status StatusType NOT NULL,
specialization TEXT NOT NULL -- some checks?
)

--DROP TABLE Employees CASCADE



CREATE TABLE Buildings(
pk_building_id SERIAL PRIMARY KEY,
address TEXT NOT NULL,
number_floors INT NOT NULL
)

--DROP TABLE Buildings cascade



CREATE TYPE ZoneType AS ENUM('CABINET', 'OPENAREA')

CREATE TABLE Zones(
pk_zone_id SERIAL PRIMARY KEY,
fk_building_id INT NOT NULL,
zone_floor INT NOT NULL,
form POLYGON NOT NULL,
number_zone INT NOT NULL UNIQUE,
zone_type ZoneType NOT NULL,
description TEXT,
FOREIGN KEY (fk_building_id) REFERENCES Buildings(pk_building_id) ON DELETE RESTRICT
)

--DROP TABLE Zones cascade



CREATE TABLE Timetable(
pk_session_id SERIAL PRIMARY KEY,
fk_employee_id INT NOT NULL,
fk_zone_id INT NOT NULL,
beginning_session DATE NOT NULL,
duration_session INT NOT NULL, -- how calculate date with minutes
FOREIGN KEY (fk_employee_id) REFERENCES Employees(pk_employee_id) ON DELETE RESTRICT,
FOREIGN KEY (fk_zone_id) REFERENCES Zones(pk_zone_id) ON DELETE RESTRICT
)

--DROP TABLE Timetable cascade



CREATE TABLE Walls(
pk_wall_id SERIAL PRIMARY KEY,
fk_building_id INT NOT NULL,
wall_floor INT NOT NULL,
color TEXT, -- default: gray
form POLYGON NOT NULL,
FOREIGN KEY (fk_building_id) REFERENCES Buildings(pk_building_id) ON DELETE RESTRICT
)

--DROP TABLE Walls cascade



CREATE TYPE PlacementType AS ENUM('ON_FLOOR', 'ON_ITEM', 'ON_WALL', 'IN_WALL')

CREATE TABLE ItemType(
pk_item_type_id SERIAL PRIMARY KEY,
item_name TEXT NOT NULL,
placement PlacementType NOT NULL,
form POLYGON NOT NULL,
picture_link TEXT NOT NULL,
description TEXT
)

--DROP TABLE ItemType cascade



CREATE TABLE Items(
pk_item_id SERIAL PRIMARY KEY,
fk_zone_id INT NOT NULL,
fk_item_type_id INT NOT NULL,
pos POINT NOT NULL,
angle INT, -- default: 0
FOREIGN KEY (fk_item_type_id) REFERENCES ItemType(pk_item_type_id) ON DELETE RESTRICT
)

--DROP TABLE Items cascade
