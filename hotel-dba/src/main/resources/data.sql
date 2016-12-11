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
  VALUES(1, 'PETRUS', 'bigboss', 'Stas', 'Petrusev', 'petius96@gmail.com', '+375447425182', '100500', 'ROLE_ADMIN', true)
