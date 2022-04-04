CREATE TYPE accessibility_type AS ENUM('ADMIN', 'USER')

--DROP TYPE accessibility_type CASCADE

CREATE TABLE registered_user(
pk_user_id SERIAL PRIMARY KEY,
user_login TEXT NOT NULL,
user_password TEXT NOT NULL,
accessibility_type accessibility_type NOT NULL
)

--DROP TABLE registered_user CASCADE



CREATE TABLE employee(
pk_employee_id SERIAL PRIMARY KEY,
first_name TEXT NOT NULL,
second_name TEXT NOT NULL,
patronymic TEXT NOT NULL,
email TEXT NOT NULL,
telephone_number TEXT NOT NULL,
specialization TEXT NOT NULL,
picture_link TEXT NOT NULL
)

--DROP TABLE employee CASCADE



CREATE TABLE building(
pk_building_id SERIAL PRIMARY KEY,
address TEXT NOT NULL,
floors_number INT NOT NULL
)

--DROP TABLE building CASCADE



CREATE TYPE floor_type AS ENUM('TECHNICAL', 'OFFICE')

--DROP TYPE floor_type CASCADE

CREATE TABLE building_floor(
pk_floor_id SERIAL PRIMARY KEY,
fk_building_id INT NOT NULL,
floor_number INT NOT NULL,
floor_type floor_type NOT NULL,
FOREIGN KEY (fk_building_id) REFERENCES building(pk_building_id) ON DELETE RESTRICT
)

--DROP TABLE building_floor CASCADE



CREATE TABLE wall(
pk_wall_id SERIAL PRIMARY KEY,
fk_floor_id INT NOT NULL,
wall_floor INT NOT NULL,
color TEXT,
form POLYGON NOT NULL,
FOREIGN KEY (fk_floor_id) REFERENCES building_floor(pk_floor_id) ON DELETE RESTRICT
)

--DROP TABLE wall CASCADE



CREATE TABLE floor_zone(
pk_zone_id SERIAL PRIMARY KEY,
fk_floor_id INT NOT NULL,
form POLYGON NOT NULL,
zone_number INT NOT NULL,
zone_name TEXT NOT NULL,
description TEXT,
FOREIGN KEY (fk_floor_id) REFERENCES building_floor(pk_floor_id) ON DELETE RESTRICT
)

--DROP TABLE floor_zone CASCADE



CREATE TYPE placement_type AS ENUM('ON_FLOOR', 'ON_ITEM', 'ON_WALL', 'IN_WALL')

--DROP TYPE placement_type CASCADE

CREATE TABLE item_type(
pk_item_type_id SERIAL PRIMARY KEY,
item_name TEXT NOT NULL,
placement_type placement_type NOT NULL,
form POLYGON NOT NULL,
picture_link TEXT NOT NULL,
description TEXT
)

--DROP TABLE item_type CASCADE



CREATE TABLE item(
pk_item_id SERIAL PRIMARY KEY,
fk_zone_id INT NOT NULL,
fk_item_type_id INT NOT NULL,
pos POINT NOT NULL,
angle INT,
FOREIGN KEY (fk_zone_id) REFERENCES floor_zone(pk_zone_id) ON DELETE RESTRICT,
FOREIGN KEY (fk_item_type_id) REFERENCES item_type(pk_item_type_id) ON DELETE RESTRICT
)

--DROP TABLE item CASCADE



CREATE TABLE workplace_item(
pk_workplace_item_id SERIAL PRIMARY KEY,
fk_zone_id INT NOT NULL,
fk_item_type_id INT NOT NULL,
array_fk_employee_id INT[],
pos POINT NOT NULL,
angle INT NOT NULL,
FOREIGN KEY (fk_zone_id) REFERENCES floor_zone,
FOREIGN KEY (fk_item_type_id) REFERENCES item_type
--FOREIGN KEY (EACH ELEMENT OF array_fk_employee_id) REFERENCES employee
)

--DROP TABLE workplace_item CASCADE
