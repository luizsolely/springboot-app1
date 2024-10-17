CREATE TABLE users(
	id BIGINT not null auto_increment,
	first_name VARCHAR (50) not null,
	last_name VARCHAR (50) not null,
	sex ENUM('MALE', 'FEMALE', 'OTHERS') not null,
	birth_date VARCHAR (50) not null,
	email VARCHAR (100) not null,
	
	primary key (id)
);