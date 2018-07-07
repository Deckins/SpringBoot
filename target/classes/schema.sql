create table student
(
   id integer not null,
   name varchar(255) not null,
   course varchar(255) not null,
   primary key(id)
);

create table customers
(
    id integer not null,
    orders integer not null,
    primary key(id,orders)
);