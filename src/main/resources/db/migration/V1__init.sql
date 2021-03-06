CREATE TABLE PERSON (
	id BIGINT not null,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	PRIMARY KEY(id)
);

CREATE TABLE CAR (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY,
	belongs_to BIGINT not null,
	model varchar(255) not null,
	brand varchar(255) not null,
	PRIMARY KEY(id),
	FOREIGN KEY (belongs_to) REFERENCES PERSON(id)
);


insert into PERSON (id, first_name, last_name) values (1, 'John', 'Travalto');
insert into PERSON (id, first_name, last_name) values (2, 'Tom', 'Hanks');
insert into CAR (belongs_to, model, brand) values (1, 'BMW', 'X1');
insert into CAR (belongs_to, model, brand) values (1, 'VW', 'Tiguan');
insert into CAR (belongs_to, model, brand) values (2, 'AUDI', 'Q5');
