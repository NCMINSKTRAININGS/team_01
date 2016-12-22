insert into type(type_id, type_en, type_ru) VALUES(1 ,'Single', 'Один');
insert into type(type_id, type_en, type_ru) VALUES(2 ,'Twin', 'Два');
insert into type(type_id, type_en, type_ru) VALUES(3 ,'Lux', 'Люкс');
insert into type(type_id, type_en, type_ru) VALUES(4 ,'DoubleLux', 'Двойной люкс');
insert into type(type_id, type_en, type_ru) VALUES(5 ,'Premium', 'Премиум');
-- maybe more

insert into status(status_id, status_en, status_ru) VALUES(1 ,'Free', 'Свободен');
insert into status(status_id, status_en, status_ru) VALUES(2 ,'Booked', 'Забронирован');
-- maybe more

insert into equipment(id, name_en, name_ru) VALUES(1, 'TV', 'Телевизор');
insert into equipment(id, name_en, name_ru) VALUES(2, 'Air conditioning', 'Кондиционер');
-- maybe more

INSERT INTO USER(id, login, password, name, surname, email, phone, money, role , enabled)
  VALUES(100, 'valeria', 'password', 'Valeria', 'Shpakovskaya', 'shpakovskaya.valeriya.14@gmail.com', '+375257245180', '500', 'ROLE_ADMIN', true);

INSERT INTO USER(id, login, password, name, surname, email, phone, money, role , enabled)
  VALUES(1, 'valeria123', 'password', 'Valeria', 'Shpakovskaya', 'shpakovskaya.valeriya.14@gmail.com', '+375257245180', '50000', 'ROLE_USER', true);

INSERT INTO CLAIM(id, check_in_date, check_out_date, status, type_id, user_id)
VALUES(55, '31.12.2016', '02.01.2017', 1, 3, 1);

INSERT INTO ADDRESS(id, street_en, street_ru , number_house)
VALUES (10,'max_privet','макс_пока',228);