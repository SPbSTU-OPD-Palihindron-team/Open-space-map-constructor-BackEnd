--Add admin and usual user
INSERT INTO RegistratedUsers(login, pass, accessibility) VALUES
('krzhd', '12345', 'ADMIN'),
('chel', '67890', 'USER')

--Add two building
INSERT INTO Buildings(address, number_floors) VALUES 
('РФ, г. Москва, ул. Лесная, д.14, к.1', 5),
('РФ, г. Санкт-Петебург, пр. Косыгина, д.26', 1)

--Add some employees
INSERT INTO Employees(first_name, second_name, patronymic, email,
number_telephone, employee_status, specialization) VALUES
('Иван', 'Иванов', 'Иванович', 'iii@yandex.ru', '89991234567', 'FREE', 'бухгалтер'),
('Федор', 'Федоров', 'Федорович', 'fff@gmail.com', '89118765432', 'EMPLOYED', 'программист')

--Add some zones to building in Moscow
INSERT INTO Zones(fk_building_id, zone_floor, form, number_zone, zone_type) VALUES
--Add 343 cabinet with square form to 3 floor 
(1, 3, '((10, 10), (10, 50), (50, 50), (50, 10))', 343, 'CABINET'),
--Add 423 cabinet with 5-gon form to 4 floor
(1, 4, '((10, 10), (20, 10), (25, 20), (15, 30), (5, 20))', 423, 'CABINET')
--Add 301 open area with square form to 3 floor
(1, 3, '((100, 100), (100, 150), (150, 150), (150, 100))', 301, 'OPENAREA')

--Add some zones to building in SPb
INSERT INTO Zones(fk_building_id, zone_floor, form, number_zone, zone_type) VALUES
--Add 101 cabinet with square form to 1 floor 
(2, 1, '((10, 10), (10, 50), (50, 50), (50, 10))', 101, 'CABINET'),
--Add 102 open area with 4-gon form to 1 floor
(2, 1, '((70, 30), (70, 100), (150, 110), (150, 20))', 102, 'OPENAREA')

--Add some walls to builing in Moscow
INSERT INTO Walls(fk_building_id, wall_floor, color, form) VALUES
(1, 1, 'black', '((10, 10), (10, 100), (11, 100), (11, 10))'),
(1, 1, 'gray', '((20, 20), (100, 20), (100, 19), (20, 19))'),
(1, 2, 'black', '((10, 10), (10, 100), (11, 100), (11, 10))'),
(1, 2, 'white', '((20, 20), (100, 20), (100, 19), (20, 19))'),
(1, 3, 'gray', '((10, 10), (10, 100), (11, 100), (11, 10))'),
(1, 3, 'gray', '((20, 20), (100, 20), (100, 19), (20, 19))')

--Add some walls to builing in SPb
INSERT INTO Walls(fk_building_id, wall_floor, color, form) VALUES
(2, 1, 'yellow', '((10, 10), (10, 100), (11, 100), (11, 10))'),
(2, 1, 'green', '((20, 20), (100, 20), (100, 19), (20, 19))'),
(2, 2, 'black', '((0, 0), (10, 0), (10, 2), (0, 2))')

--Add some tasks to accountant
INSERT INTO Timetable(fk_employee_id, fk_zone_id, beginning_session, duration_session) VALUES
(1, 7, '2022-04-22 12:00:00', 120),
(1, 8, '2022-04-25 14:00:00', 180)

--Add some tasks to programmist
INSERT INTO Timetable(fk_employee_id, fk_zone_id, beginning_session, duration_session) VALUES
(1, 2, '2022-04-15 12:00:00', 60),
(1, 4, '2022-04-17 12:00:00', 90),
(1, 6, '2022-04-28 12:00:00', 150)

--Add some items with characteristic
INSERT INTO ItemType(item_name, placement, form, picture_link) VALUES
('MFP', 'ON_ITEM', '((10, 10),(11, 10),(11, 11),(10, 11))', 'https://pc-1.ru/pic/medium/1450013.jpg'),
('ATM', 'ON_FLOOR', '((20, 20),(21, 20),(21, 21),(20, 21))', 'https://i.pinimg.com/originals/5f/e4/6e/5fe46e7644d4235fe727190883052cfd.jpg'),
('VENDING', 'ON_FLOOR', '((40, 40),(41, 40),(41, 41),(40, 41))', 'https://sc02.alicdn.com/kf/Hd6f391f95b51443f91cf4ab73bbadad6A/Popular-market-outdoor-big-juice-coffee-automatic.jpg'),
('COFFEE_MACHINE', 'ON_FLOOR', '((20, 20),(21, 20),(21, 21),(20, 21))', 'https://kofe.ru/images/thumbnails/2166/1772/detailed/2/Easy_Top_black_SST.jpg'),
('WORKPLACE', 'ON_FLOOR', '((0, 0), (10, 0), (10, 10), (0, 10))', 'https://avatars.mds.yandex.net/i?id=347fdfc556f27c8a2b30690ac56cc242-5877601-images-thumbs&n=13&exp=1'),
('LED_PANEL', 'ON_WALL', '((0, 0), (10, 0))', 'https://static.lustram.ru/image/catalog/p/0a/ee/mebelnyy-svetilnik-paulmann-70807-6-v-interere.jpeg')

--Add items to zones
INSERT INTO Items(fk_zone_id, fk_item_type_id, pos, angle) VALUES
(2, 1, '(20, 20)', 45),
(6, 3, '(120, 120)', 60),
(7, 5, '(125, 110)', 0),
(8, 6, '(100, 90)', 0)
