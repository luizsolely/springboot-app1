CREATE TABLE users(
	id bigint not null auto_increment,
	first_name varchar (100) not null,
	last_name varchar (100) not null,
	sex varchar (100) not null,
	age int not null,
	email varchar (100) not null,
	
	primary key (id)
);