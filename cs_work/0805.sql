SELECT * FROM highschool.students;

use highschool;

CREATE TABLE lesson(
l_id integer auto_increment primary key,
t_id varchar(45) not null,
l_name VARCHAR(45) NOT NULL,
l_year DATE NOT NULL,
l_grade DATE NOT NULL,
l_class VARCHAR(45) NOT NULL,
l_day char(1) not null,
l_time VARCHAR(2) NOT NULL,
l_room VARCHAR(45) NULL,
foreign key(t_id) references teacher(t_id)
);

CREATE TABLE ATEND(
primary key(l_id, s_id),
foreign key(s_id) references student(s_id),
foreign key(l_id) references lesson(l_id),
l_id integer not null,
s_id integer not null
);

create table perform(
p_id integer auto_increment primary key,
p_title varchar(100) not null,
p_type char(1) null,
p_content tinytext not null,
p_kijun varchar(100) null,
p_startdate date not null,
p_enddate date not null,
l_id integer not null,
foreign key(l_id) references lesson(l_id)
);

create table evaluation(
l_id integer not null,
s_id integer not null,
p_id integer not null,
e_score integer not null,
e_check char(1) null,
e_checkdate date null,
primary key(p_id, s_id),
foreign key(l_id) references lesson(l_id),
foreign key(p_id) references perform(p_id),
foreign key(s_id) references students(s_id)
); 
