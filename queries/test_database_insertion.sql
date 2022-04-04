--Add admin and usual user
INSERT INTO registered_user(user_login, user_password, accessibility_type) VALUES
('mark123', 'hardpassword', 'ADMIN'),
('ghg543', 'veryhardpassword', 'USER')


--Add two building
INSERT INTO building(address, floors_number) VALUES 
('РФ, г. Москва, ул. Лесная, д.14, к.1', 5),
('РФ, г. Санкт-Петебург, пр. Косыгина, д.26', 1)


--Add floors of two buildings
INSERT INTO building_floor(fk_building_id, floor_number, floor_type) VALUES
(1, 1, 'OFFICE'),
(1, 2, 'OFFICE'),
(1, 3, 'OFFICE'),
(1, 4, 'OFFICE'),
(1, 5, 'TECHNICAL'),
(2, 1, 'OFFICE')


--Add employees
INSERT INTO employee(first_name, second_name, patronymic, email,
telephone_number, specialization, picture_link) VALUES
('Иван', 'Иванов', 'Иванович', 'iii@yandex.ru', '89991234567', 'бухгалтер', 'google.com'),
('Федор', 'Федоров', 'Федорович', 'fff@gmail.com', '89118765432', 'программист', 'yandex.ru')


--Add some zones to building in Moscow
INSERT INTO floor_zone(fk_floor_id, form, zone_number, zone_name) VALUES
--Add 343 cabinet with square form to 3 floor 
(3, '((10, 10), (10, 50), (50, 50), (50, 10))', 343, 'MAIN CABINET'),
--Add 423 cabinet with 5-gon form to 4 floor
(4, '((10, 10), (20, 10), (25, 20), (15, 30), (5, 20))', 423, 'IMPORTANT CABINET'),
--Add 301 cabinet with square form to 2 floor
(2, '((100, 100), (100, 150), (150, 150), (150, 100))', 301, 'SOMEONES CABINET')

--Add some zones to building in SPb
INSERT INTO floor_zone(fk_floor_id, form, zone_number, zone_name) VALUES
--Add 101 cabinet with square form to 1 floor 
(6, '((10, 10), (10, 50), (50, 50), (50, 10))', 101, 'IMPORTANT CABINET'),
--Add 102 cabinet with 4-gon form to 1 floor
(6, '((70, 30), (70, 100), (150, 110), (150, 20))', 102, 'VERY IMPORTANT CABINET')


--Add some walls to builing in Moscow
INSERT INTO wall(fk_floor_id, color, form, wall_type) VALUES
(1, 'black', '((10, 10), (10, 100), (11, 100), (11, 10))', 'VIRTUAL'),
(1, 'gray', '((20, 20), (100, 20), (100, 19), (20, 19))', 'PHYSICAL'),
(2, 'black', '((10, 10), (10, 100), (11, 100), (11, 10))', 'VIRTUAL'),
(2, 'white', '((20, 20), (100, 20), (100, 19), (20, 19))', 'PHYSICAL'),
(3, 'gray', '((10, 10), (10, 100), (11, 100), (11, 10))', 'VIRTUAL'),
(3, 'gray', '((20, 20), (100, 20), (100, 19), (20, 19))', 'PHYSICAL')

--Add some walls to builing in SPb
INSERT INTO wall(fk_floor_id, color, form, wall_type) VALUES
(6, 'yellow', '((10, 10), (10, 100), (11, 100), (11, 10))', 'VIRTUAL'),
(6, 'green', '((20, 20), (100, 20), (100, 19), (20, 19))', 'VIRTUAL'),
(6, 'black', '((0, 0), (10, 0), (10, 2), (0, 2))', 'VIRTUAL')


--Add some items with characteristic
INSERT INTO item_type(item_name, placement_type, form, picture_link) VALUES
('MFP', 'ON_ITEM', '((10, 10),(11, 10),(11, 11),(10, 11))', 'https://pc-1.ru/pic/medium/1450013.jpg'),
('ATM', 'ON_FLOOR', '((20, 20),(21, 20),(21, 21),(20, 21))', 'https://i.pinimg.com/originals/5f/e4/6e/5fe46e7644d4235fe727190883052cfd.jpg'),
('VENDING', 'ON_FLOOR', '((40, 40),(41, 40),(41, 41),(40, 41))', 'https://sc02.alicdn.com/kf/Hd6f391f95b51443f91cf4ab73bbadad6A/Popular-market-outdoor-big-juice-coffee-automatic.jpg'),
('COFFEE_MACHINE', 'ON_FLOOR', '((20, 20),(21, 20),(21, 21),(20, 21))', 'https://kofe.ru/images/thumbnails/2166/1772/detailed/2/Easy_Top_black_SST.jpg'),
('WORKPLACE_TABLE', 'ON_FLOOR', '((0, 0), (10, 0), (10, 10), (0, 10))', 'https://avatars.mds.yandex.net/i?id=347fdfc556f27c8a2b30690ac56cc242-5877601-images-thumbs&n=13&exp=1'),
('WORKPLACE_TABLE', 'ON_FLOOR', '((10, 10), (20, 10), (20, 20), (10, 20))', 'https://avatars.mds.yandex.net/i?id=347fdfc556f27c8a2b30690ac56cc242-5877601-images-thumbs&n=13&exp=1'),
('LED_PANEL', 'ON_WALL', '((0, 0), (10, 0))', 'https://static.lustram.ru/image/catalog/p/0a/ee/mebelnyy-svetilnik-paulmann-70807-6-v-interere.jpeg')


--Add non-interactive items to zones
INSERT INTO item(fk_zone_id, fk_item_type_id, pos, angle) VALUES
--MFP to zone with id = 2 to point (20, 20) with angle = 45
(2, 1, '(20, 20)', 45),
--VENDING to zone with id = 3 to point (120, 120) with angle = 60
(3, 3, '(120, 120)', 60),
--ATM to zone with id = 4 to point (125, 110) with angle = 0
(4, 2, '(125, 110)', 0),
--COFFEE_MACHINE to zone with id = 5 to point (100, 90) with angle = 0
(5, 4, '(100, 90)', 0)


--Add some workplace items and connect them with employees
INSERT INTO workplace_item(fk_zone_id, fk_item_type_id, array_fk_employee_id, pos, angle) VALUES
--WORKPLACE_TABLE to zone with id = 1 to point (15, 15) with angle = 0, which is occupied by employee with id = 1
(1, 5, '{1}', '(15, 15)', 0),
--WORKPLACE_TABLE to zone with id = 2 to point (15, 15) with angle = 30, which is occupied by employee with id = 2
(2, 6, '{2}', '(20, 20)', 30)
