create database if not exists Game_Character;

use Game_Character;

drop table if  exists Game_Character;
drop table if exists Race;
drop table if exists Character_Name;
drop table if exists Class;

create table Game_Character(
	ID int(10) not null auto_increment,
	primary key (ID)
);

create table race(
	ID int(10) not null auto_increment,
	Game_Character_ID int(10) not null,
	race varchar(40) not null,
	primary key (ID),
	foreign key (Game_Character_ID) references Game_Character(ID)
);

create table Character_Name(
	ID int(10) not null auto_increment,
	Game_Character_id int(10) not null,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	primary key (ID),
	foreign key (Game_Character_id) references game_Character(ID)
);

Create table class(
	ID int (10) not null auto_increment,
	Game_Character_ID int (10) not null,
	Class varchar (40) not null,
	Primary key (ID),
	Foreign key (Game_Character_ID) references Game_Character(ID)
);