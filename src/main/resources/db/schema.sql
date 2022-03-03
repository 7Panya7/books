create table genre(
    id bigint auto_increment,
    genre_name varchar(255) not null
);
create table publishing_house(
    id bigint auto_increment,
    name varchar(255) not null,
    city varchar(255) not null
);
create table sales(
    id bigint auto_increment,
    date date,
    name_book varchar(255) not null,
    author varchar(255) not null,
    year_of_publisher date not null,
    price decimal,
    genre_id bigint,
    publishing_house_id bigint,
    foreign key (genre_id) references genre(id),
    foreign key (publishing_house_id) references publishing_house(id)
);