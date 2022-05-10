--link to container
--https://hub.docker.com/repository/docker/krzhld/open-map-db

--Add admin and usual user
INSERT INTO registered_user(user_login, user_password, accessibility_type) VALUES
('mark123', 'hardpassword', 'ADMIN'),
('ghg543', 'veryhardpassword', 'USER')



--Add building
INSERT INTO building(address, floors_number) VALUES 
('РФ, г. Краснодар, ул. Солнечная, д.15/5', 6)

 

--Add floors of building
INSERT INTO building_floor(fk_building_id, floor_number, floor_type) VALUES
(1, 1, 'OFFICE'),
(1, 2, 'OFFICE'),
(1, 3, 'OFFICE'),
(1, 4, 'OFFICE'),
(1, 5, 'OFFICE'),
(1, 6, 'TECHNICAL')
 


--Add employees
INSERT INTO employee(first_name, second_name, patronymic, email,
telephone_number, specialization, picture_link) VALUES
('Иван', 'Иванов', 'Иванович', 'iii@magnit.ru', '11111', 'Директор финансового департамента', 'site1'),
('Евгений', 'Сидоров', 'Викторович', 'esv@magnit.ru', '11112', 'Начальник службы бухгалтерского и налогово учета', 'site2'),
('Лаврентий', 'Мухин', 'Павлович', 'lmp@magnit.ru', '11113', 'Начальник сектора расчетов', 'site3'),
('Игорь', 'Петров', 'Сергеевич', 'ips@magnit.ru', '11114', 'Начальник отдела по работе с претензиями', 'site4'),
('Эльвира', 'Ягодина', 'Леопольдовна', 'eyal@magnit.ru', '11115', 'Специалист отдела по работе с претензиями', 'site5'),
('Зоя', 'Воробьева', 'Александровна', 'zva@magnit.ru', '11116', 'Специалист отдела по работе с претензиями', 'site6'),
('Анастасия', 'Синичкина', 'Сергеевна', 'ass@magnit.ru', '11117', 'Специалист отдела по работе с претензиями', 'site7'),
('Семен', 'Коржиков', 'Иванович', 'ski@magnit.ru', '11118', 'Специалист отдела по работе с претензиями', 'site8'),
('Гарик', 'Лоскутов', 'Харламович', 'glh@magnit.ru', '11119', 'Специалист отдела по работе с претензиями', 'site9'),
('Дмитрий', 'Букин', 'Петрович', 'dbp@magnit.ru', '11120', 'Ведущий специалист отдела по работе с претензиями', 'site10'),
('Роман', 'Ремесленников', 'Абрамович', 'rra@magnit.ru', '11121', 'Ведущий специалист отдела по работе с претензиями', 'site11'),
('Григорий', 'Распутин', 'Ефимович', 'gre@magnit.ru', '11122', 'Ведущий специалист отдела по работе с претензиями', 'site12'),
('Василий', 'Бегунко', 'Абрамович', 'vba@magnit.ru', '11123', 'Ведущий специалист отдела по работе с претензиями', 'site13')



--Add zones to second floor of building
INSERT INTO floor_zone(fk_floor_id, form, zone_number, zone_name) VALUES
--Add 2201 cabinet 
(2, '((0, 0), (32, 0), (32, 18), (0, 18))', 2201, 'кабинет 2201'),
--Add subcabinets
(2, '((0, 0), (8, 0), (8, 10), (0, 10))', 2201, 'кабинет 2201/1'),
(2, '((8, 0), (16, 0), (16, 10), (8, 10))', 2201, 'кабинет 2201/2'),
(2, '((16, 0), (24, 0), (24, 10), (16, 10))', 2201, 'кабинет 2201/3'),
(2, '((24, 0), (32, 0), (32, 10), (24, 10))', 2201, 'кабинет 2201/4'),
--Add 2203 cabinet
(2, '((32, 0), (64, 0), (64, 18), (32, 18))', 2203, 'кабинет 2203'),
--Add subzones
(2, '((32, 0), (48, 0), (48, 10), (64, 10), (64, 18), (32, 18))', 2203, 'зона А'),
(2, '((48, 0), (64, 0), (64, 10), (48, 10))', 2203, 'зона Б'),
--Add 2204 cabinet
(2, '((0, 24), (32, 24), (32, 42), (0, 42))', 2204, 'кабинет 2204'),
--Add subcabinets
(2, '((0, 32), (8, 32), (8, 42), (0, 42))', 2204, 'кабинет 2204/1'),
(2, '((8, 32), (16, 32), (16, 42), (8, 42))', 2204, 'кабинет 2204/2'),
(2, '((16, 32), (24, 32), (24, 42), (16, 42))', 2204, 'кабинет 2204/3'),
(2, '((24, 32), (32, 32), (32, 42), (24, 42))', 2204, 'кабинет 2204/4'),
--Add 2206 cabinet
(2, '((32, 24), (64, 24), (64, 42), (32, 42))', 2206, 'кабинет 2206'),
--Add subcabinets
(2, '((32, 32), (40, 32), (40, 42), (32, 42))', 2206, 'кабинет 2206/1'),
(2, '((40, 32), (48, 32), (48, 42), (40, 42))', 2206, 'кабинет 2206/2'),
(2, '((48, 32), (56, 32), (56, 42), (48, 42))', 2206, 'кабинет 2206/3'),
(2, '((56, 32), (64, 32), (64, 42), (56, 42))', 2206, 'кабинет 2206/4')



--Add walls to zones
INSERT INTO wall(fk_floor_id, color, form, wall_type) VALUES
--Add walls for 2201 cabinet
(2, 'gray', '((0, 0), (32, 0))', 'PHYSICAL'),
(2, 'gray', '((32, 0), (32, 18))', 'PHYSICAL'),
(2, 'gray', '((32, 18), (0, 18))', 'PHYSICAL'),
(2, 'gray', '((0, 18), (0, 0))', 'PHYSICAL'),
--Add walls for subcabinets
--Add walls for 2201/1 cabinet
(2, 'gray', '((8, 0), (8, 10))', 'PHYSICAL'),
(2, 'gray', '((8, 10), (0, 10))', 'PHYSICAL'),
--Add walls for 2201/2 cabinet
(2, 'gray', '((16, 0), (16, 10))', 'PHYSICAL'),
(2, 'gray', '((16, 10), (8, 10))', 'PHYSICAL'),
--Add walls for 2201/3 cabinet
(2, 'gray', '((24, 0), (24, 10))', 'PHYSICAL'),
(2, 'gray', '((24, 10), (16, 10))', 'PHYSICAL'),
--Add wall for 2201/4 cabinet
(2, 'gray', '((32, 10), (24, 10))', 'PHYSICAL'),
--Add walls for 2203 cabinet
(2, 'gray', '((32, 0), (64, 0))', 'PHYSICAL'),
(2, 'gray', '((64, 0), (64, 18))', 'PHYSICAL'),
(2, 'gray', '((64, 18), (32, 18))', 'PHYSICAL'),
--Add virual walls for subzones
--Add virtual walls for zone B
(2, 'gray', '((64, 10), (48, 10))', 'VIRTUAL'),
(2, 'gray', '((48, 10), (48, 0))', 'VIRTUAL'),
--Add walls for 2204 cabinet
(2, 'gray', '((0, 24), (32, 24))', 'PHYSICAL'),
(2, 'gray', '((32, 24), (32, 42))', 'PHYSICAL'),
(2, 'gray', '((32, 42), (0, 42))', 'PHYSICAL'),
(2, 'gray', '((0, 42), (0, 24))', 'PHYSICAL'),
--Add walls for subcabinets
--Add walls for 2204/1 cabinet
(2, 'gray', '((0, 32), (8, 32))', 'PHYSICAL'),
(2, 'gray', '((8, 32), (8, 42))', 'PHYSICAL'),
--Add walls for 2204/2 cabinet
(2, 'gray', '((8, 32), (16, 32))', 'PHYSICAL'),
(2, 'gray', '((16, 32), (16, 42))', 'PHYSICAL'),
--Add walls for 2204/3 cabinet
(2, 'gray', '((16, 32), (24, 32))', 'PHYSICAL'),
(2, 'gray', '((24, 32), (24, 42))', 'PHYSICAL'),
--Add wall for 2204/4 cabinet
(2, 'gray', '((24, 32), (32, 32))', 'PHYSICAL'),
--Add walls for 2206 cabinet
(2, 'gray', '((32, 24), (64, 24))', 'PHYSICAL'),
(2, 'gray', '((64, 24), (64, 42))', 'PHYSICAL'),
(2, 'gray', '((64, 42), (32, 42))', 'PHYSICAL'),
--Add walls for subcabinets
--Add walls for 2206/1 cabinet
(2, 'gray', '((32, 32), (40, 32))', 'PHYSICAL'),
(2, 'gray', '((40, 32), (40, 42))', 'PHYSICAL'),
--Add walls for 2206/2 cabinet
(2, 'gray', '((40, 32), (48, 32))', 'PHYSICAL'),
(2, 'gray', '((48, 32), (48, 42))', 'PHYSICAL'),
--Add walls for 2206/3 cabinet
(2, 'gray', '((48, 32), (56, 32))', 'PHYSICAL'),
(2, 'gray', '((56, 32), (56, 42))', 'PHYSICAL'),
--Add wall for 2206/4 cabinet
(2, 'gray', '((56, 32), (64, 32))', 'PHYSICAL')



--Add some items with characteristic
INSERT INTO item_type(item_name, placement_type, form, picture_link) VALUES
('MFP', 'ON_FLOOR', '((0, 0), (2, 0), (2, 2), (0, 2))', 'link1'),
('VENDING', 'ON_FLOOR', '((0, 0), (2, 0), (2, 2), (0, 2))', 'link2'),
('COFFEE_MACHINE', 'ON_FLOOR', '((0, 0), (2, 0), (2, 2), (0, 2))', 'link3'),
('WORKPLACE_TABLE', 'ON_FLOOR', '((0, 0), (4, 0), (4, 2), (0, 2))', 'link4'),
('CONFERENCE_TABLE', 'ON_FLOOR', '(0, 0), (8, 0), (8, 4), (0, 4)', 'link5'),
('FIRE_HYDRANT', 'ON_FLOOR', '((0, 0), (2, 0), (2, 2), (0, 2))', 'link6'),
('TV', 'ON_WALL', '((0, 0), (4, 0))', 'link7'),
('DOOR', 'IN_WALL', '((0, 0), (2, 0))', 'link8')
 


--Add non-interactive items to zones and cabinets
INSERT INTO item(fk_zone_id, fk_item_type_id, pos, angle) VALUES
--items to 2201 cabinet 
--vending
(1, 2, '(30, 16)', 0),
--coffee machine
(1, 3, '(28, 16)', 0),
--door
(1, 8, '(24, 18)', 0),
--tv
(1, 7, '(6, 18)', 0),
--fire hydrant
(1, 6, '(0, 16)', 0),
--MFP, door to 2201/1 cabinet
(2, 1, '(0, 0)', 0),
(2, 8, '(2, 10)', 0),
--MFP, door to 2201/2 cabinet
(3, 1, '(8, 0)', 0),
(3, 8, '(12, 10)', 0),
--MFP, door to 2201/3 cabinet
(4, 1, '(16, 0)', 0),
(4, 8, '(18, 10)', 0),
--MFP, door to 2201/4 cabinet
(5, 1, '(24, 0)', 0),
(5, 8, '(28, 10)', 0),
--items to 2203 cabinet
--vending 
(6, 2, '(62, 16)', 0),
--coffee machine
(6, 3, '(60, 16)', 0),
--door 
(6, 8, '(56, 18)', 0),
--tv
(6, 7, '(38, 18)', 0),
--fire hydrant
(6, 6, '(32, 16)', 0),
--MFP
(6, 1, '(56, 0)', 0),
--items to 2204 cabinet 
--vending
(9, 2, '(0, 24)', 0),
--coffee machine
(9, 3, '(2, 24)', 0),
--door
(9, 8, '(6, 24)', 0),
--tv
(9, 7, '(22, 24)', 0),
--fire hydrant
(9, 6, '(30, 24)', 0),
--MFP, door to 2204/1 cabinet
(10, 1, '(6, 40)', 0),
(10, 8, '(2, 32)', 0),
--MFP, door to 2204/2 cabinet
(11, 1, '(14, 40)', 0),
(11, 8, '(12, 32)', 0),
--MFP, door to 2204/3 cabinet
(12, 1, '(22, 40)', 0),
(12, 8, '(18, 32)', 0),
--MFP, door to 2204/4 cabinet
(13, 1, '(30, 40)', 0),
(13, 8, '(28, 32)', 0),
--items to 2206 cabinet 
--vending
(14, 2, '(32, 24)', 0),
--coffee machine
(14, 3, '(34, 24)', 0),
--door
(14, 8, '(38, 24)', 0),
--tv
(14, 7, '(54, 24)', 0),
--fire hydrant
(14, 6, '(62, 24)', 0),
--MFP, door to 2206/1 cabinet
(15, 1, '(38, 40)', 0),
(15, 8, '(34, 32)', 0),
--MFP, door to 2206/2 cabinet
(16, 1, '(46, 40)', 0),
(16, 8, '(44, 32)', 0),
--MFP, door to 2206/3 cabinet
(17, 1, '(54, 40)', 0),
(17, 8, '(50, 32)', 0),
--MFP, door to 2206/4 cabinet
(18, 1, '(62, 40)', 0),
(18, 8, '(60, 32)', 0)
 


--Add connections between workplace items and employees
INSERT INTO workplace_item_employee_relation(fk_employee_id) VALUES 
(1), (2), (3), (4), (5), (6), (7), (8), (9), (10), (11), (12), (13)



--Add workplace tables to zones and cabinets
INSERT INTO workplace_item(fk_zone_id, fk_item_type_id, pos, angle, fk_relation_id) VALUES
--workplace table to 2201/1 cabinet
(2, 4, '(4, 0)', 0, 9),
--workplace table to 2201/2 cabinet
(3, 4, '(12, 0)', 0, 10),
--workplace table to 2201/3 cabinet
(4, 4, '(20, 0)', 0, 11),
--workplace table to 2201/4 cabinet
(5, 4, '(28, 0)', 0, 12),
--workplace table to 2203 cabinet, zone B
(8, 4, '(60, 0)', 0, 13),
--workplace table to 2204/1 cabinet
(10, 4, '(0, 40)', 0, 1),
--workplace table to 2204/2 cabinet
(11, 4, '(8, 40)', 0, 2),
--workplace table to 2204/3 cabinet
(12, 4, '(16, 40)', 0, 3),
--workplace table to 2204/4 cabinet
(13, 4, '(24, 40)', 0, 4),
--workplace table to 2206/1 cabinet
(15, 4, '(32, 40)', 0, 5),
--workplace table to 2206/2 cabinet
(16, 4, '(40, 40)', 0, 6),
--workplace table to 2206/3 cabinet
(17, 4, '(48, 40)', 0, 7),
--workplace table to 2206/4 cabinet
(18, 4, '(56, 40)', 0, 8)

--Add conference tables to zones and cabinets
INSERT INTO workplace_item(fk_zone_id, fk_item_type_id, pos, angle, fk_relation_id) VALUES
--conference table to 2201 cabinet 
(1, 5, '(4, 24)', 0, 1),
--conference table to 2204 cabinet 
(9, 5, '(20, 26)', 0, 2),
--conference table to 2206 cabinet 
(14, 5, '(52, 26)', 0, 3)
