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

insert into USER(id, login, password, name, surname, email, phone, money, role , enabled)
  VALUES(100, 'valeria', 'password', 'Valeria', 'Shpakovskaya', 'shpakovskaya.valeriya.14@gmail.com', '+375257245180', '500', 'ROLE_ADMIN', true);

insert into USER(id, login, password, name, surname, email, phone, money, role , enabled)
  VALUES(1, 'valeria123', 'password', 'Valeria', 'Shpakovskaya', 'shpakovskaya.valeriya.14@gmail.com', '+375257245180', '50000', 'ROLE_USER', true);
