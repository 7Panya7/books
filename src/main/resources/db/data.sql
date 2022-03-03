insert into genre(genre_name) values ('комедия');
insert into genre(genre_name) values ('приключения');
insert into publishing_house(name, city) values ('аст','москва');
insert into publishing_house(name, city) values ('Питер','Питер');
insert into sales (date, name_book, author, year_of_publisher, price, genre_id, publishing_house_id) VALUES ( DATE '2022-02-17','12 стульев','Ильф и Петров',
                                                                                                           DATE '2004-12-31',450,1,1);
insert into sales (date, name_book, author, year_of_publisher, price, genre_id, publishing_house_id) VALUES ( DATE '2022-02-17','Шерлок Холмс','Конан Дойл',
                                                                                                           DATE '2004-12-31',600,2,2);