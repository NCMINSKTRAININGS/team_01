insert into type(type_id, type_en, type_ru) VALUES(1 ,'Single', 'Один');
insert into type(type_id, type_en, type_ru) VALUES(2 ,'Twin', 'Два');
insert into type(type_id, type_en, type_ru) VALUES(3 ,'Lux', 'Люкс');
insert into type(type_id, type_en, type_ru) VALUES(4 ,'DoubleLux', 'Двойной люкс');
insert into type(type_id, type_en, type_ru) VALUES(5 ,'Premium', 'Премиум');
-- -- maybe more

insert into claim_status(claim_id, claim_status_en, claim_status_ru) VALUES(1 ,'in progress', 'В обработке');
insert into claim_status(claim_id, claim_status_en, claim_status_ru) VALUES(2 ,'accepted', 'принято');
insert into claim_status(claim_id, claim_status_en, claim_status_ru) VALUES(3 ,'reject', 'отклонено');
--
insert into status(status_id, status_en, status_ru) VALUES(1 ,'Free', 'Свободен');
insert into status(status_id, status_en, status_ru) VALUES(2 ,'Booked', 'Забронирован');
-- -- maybe more
--
insert into equipment(id, name_en, name_ru) VALUES(1, 'TV', 'Телевизор');
insert into equipment(id, name_en, name_ru) VALUES(2, 'Air conditioning', 'Кондиционер');
-- -- maybe more
--
INSERT INTO USER(id, login, password, name, surname, email, phone, money, role , enabled)
VALUES(100, 'valeria', 'password', 'Valeria', 'Shpakovskaya', 'shpakovskaya.valeriya.14@gmail.com', '+375257245180', '500', 'ROLE_ADMIN', true);
--
INSERT INTO USER(id, login, password, name, surname, email, phone, money, role , enabled)
VALUES(1, 'samantha', 'password', 'Samantha', 'Gefferson', 'sammy.14@gmail.com', '80256418430', '50000', 'ROLE_USER', true);
--
INSERT INTO USER(id, login, password, name, surname, email, phone, money, role , enabled)
VALUES(2, 'derek', 'password', 'Derek', 'Willson', 'derek.14@gmail.com', '80299614860', '10000', 'ROLE_LANDLORD', true);
--
--
INSERT INTO ADDRESS(id, street_en, street_ru , number_house) VALUES (1,'Petrovhina','Петровщина',1);
INSERT INTO ADDRESS(id, street_en, street_ru , number_house) VALUES (2,'Dzerginskogo','Дзержинского',95);
INSERT INTO ADDRESS(id, street_en, street_ru , number_house) VALUES (3,'Gicalo','Гикало',9);
INSERT INTO ADDRESS(id, street_en, street_ru , number_house) VALUES (4,'Dzerginskogo','Дзержинского',57);
INSERT INTO ADDRESS(id, street_en, street_ru , number_house) VALUES (5,'Prospect','Независимости',2);
