use testDB;

create table testBoard(
	bno int not null auto_increment,
	userid varchar(50) not null,
    title varchar(200) not null,
    content text null,
    viewcnt int default 0,
    regdate timestamp not null default now(),
    originalfile varchar(200),
    savedfile varchar(200),
    primary key(bno)
)

alter table testBoard add constraint fk_board_member foreign key(userid) references testmember(userid);

INSERT INTO testboard (userid, title, content)
VALUES ('user1', 'titititi', 'conconcon');