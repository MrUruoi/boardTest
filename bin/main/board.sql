use testDB;

create table testMember(
	userid varchar(200) not null,
    userpwd varchar(200) not null,
    username varchar(200) not null,
    email varchar(200) not null,
    primary key(userid)
);

