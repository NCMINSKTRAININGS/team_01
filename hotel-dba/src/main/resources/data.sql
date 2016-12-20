insert into type(type_id, type_en, type_ru) VALUES(1 ,'Single', 'Один');
insert into type(type_id, type_en, type_ru) VALUES(2 ,'Twin', 'Два');
-- maybe more

insert into status(status_id, status_en, status_ru) VALUES(1 ,'Free', 'Свободен');
insert into status(status_id, status_en, status_ru) VALUES(2 ,'Booked', 'Забронирован');
-- maybe more

insert into equipment(id, name_en, name_ru) VALUES(1, 'TV', 'Телевизор');
insert into equipment(id, name_en, name_ru) VALUES(2, 'Air conditioning', 'Кондиционер');
-- maybe more

insert into USER(id, login, password, name, surname, email, phone, money, role , enabled)
  VALUES(100, 'valeria', 'password', 'Valeria', 'Shpakovskaya', 'shpakovskaya.valeriya.14@gmail.com', '+375257245180', '500', 'ROLE_ADMIN', true);

insert into ROOM(id, coast, seats, status_id, type_id) VALUES (100500, 82, 2, 1, 2);
