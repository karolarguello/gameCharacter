create database if not exists Game_Character;
USE Game_Character;

DROP TABLE IF EXISTS game_character;
DROP TABLE IF EXISTS character_name;
DROP TABLE IF EXISTS class;

create table races(
ID int(10) not null auto_increment,
race varchar(40) not null,
primary key (ID)
);

create table Character_Name(
ID int(10) not null auto_increment,
first_name varchar(30) not null,
last_name varchar(30) not null,
primary key (ID)
);

Create table classes(
ID int (10) not null auto_increment,
class varchar (40) not null,
Primary key (ID)
);
