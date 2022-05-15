CREATE TYPE access_type AS ENUM('ADMIN', 'USER');

CREATE TYPE floor_type AS ENUM('TECHNICAL', 'OFFICE');

CREATE TYPE wall_type AS ENUM('VIRTUAL', 'PHYSICAL');

CREATE TYPE placement_type AS ENUM('ON_FLOOR', 'ON_ITEM', 'ON_WALL', 'IN_WALL');

CREATE TABLE registered_user(
id SERIAL PRIMARY KEY,
login TEXT NOT NULL,
"password" TEXT NOT NULL,
"access" access_type NOT NULL
);

drop table registered_user;

CREATE TABLE employee(
id SERIAL PRIMARY KEY,
"name" TEXT NOT NULL,
surname TEXT NOT NULL,
patronymic TEXT NOT NULL,
email TEXT NOT NULL,
phone_number TEXT NOT NULL,
specialization TEXT NOT NULL,
photo_link TEXT NOT NULL
);

drop table employee;

CREATE TABLE building(
id SERIAL PRIMARY KEY,
address TEXT NOT NULL,
floors_number INT NOT NULL
);

drop table building;

CREATE TABLE building_floor(
id SERIAL PRIMARY KEY,
building_id INT NOT NULL,
floor_number INT NOT NULL,
"type" floor_type NOT NULL,
FOREIGN KEY (building_id) REFERENCES building(id) ON DELETE RESTRICT
);

drop table building_floor;

CREATE TABLE wall(
id SERIAL PRIMARY KEY,
floor_id INT NOT NULL,
color TEXT,
form geometry(POLYGON) NOT NULL,
"type" wall_type NOT NULL,
FOREIGN KEY (floor_id) REFERENCES building_floor(id) ON DELETE RESTRICT
);

drop table wall;

CREATE TABLE floor_zone(
id SERIAL PRIMARY KEY,
floor_id INT NOT NULL,
form geometry(POLYGON) NOT NULL,
"number" INT NOT NULL,
"name" TEXT NOT NULL,
description TEXT,
FOREIGN KEY (floor_id) REFERENCES building_floor(id) ON DELETE RESTRICT
);

drop table floor_zone;

CREATE TABLE item_type(
id SERIAL PRIMARY KEY,
"name" TEXT NOT NULL,
"type" placement_type NOT NULL,
form geometry(POLYGON) NOT NULL,
picture_link TEXT NOT NULL,
description TEXT
);

drop table item_type;

CREATE TABLE item(
id SERIAL PRIMARY KEY,
zone_id INT NOT NULL,
item_type_id INT NOT NULL,
pos geometry(POINT) NOT NULL,
angle INT NOT NULL,
"scale" REAL NOT NULL,
is_workplace BOOLEAN NOT NULL,
FOREIGN KEY (zone_id) REFERENCES floor_zone(id) ON DELETE RESTRICT,
FOREIGN KEY (item_type_id) REFERENCES item_type(id) ON DELETE RESTRICT
);

drop table item;

CREATE TABLE workplace_item_employee_relation(
id SERIAL PRIMARY KEY,
employee_id INT NOT NULL,
item_id INT NOT NULL,
FOREIGN KEY (employee_id) REFERENCES employee(id) ON DELETE RESTRICT,
FOREIGN KEY (item_id) REFERENCES item(id) ON DELETE RESTRICT
);

drop table workplace_item_employee_relation;
