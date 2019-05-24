//테이블 생성
create table users(
    users_id           varchar(10) CONSTRAINT users_id_pk primary key,
    password integer not null, 
    name      varchar(10) constraint users_name not null,
    role        varchar(4) constraint users_role unique
);
create table board(
	seq        integer constraint borad_seq_pk primary key,
	title       varchar2(20) not null,
	content  varchar2(100) ,
	regdate  date default sysdate,
	cnt         number(20),
	board_id       varchar(10)
)
alter table board add CONSTRAINT board_seq_pk foreign key (board_id) references users;

//회원정보 등록
insert into users(users_id,password,name,role) values('aaaa',1111,'김철수');
insert into users(users_id,password,name,role) values('bbbb',1111,'김철수');
insert into users(users_id,password,name,role) values('ccccc',2222,'홍철수');
insert into users(users_id,password,name,role) values('dddd',1111,'김철수','a');
//회원정보 수정
update users set password = 2222 where users_id = 'aaaa'; 
update users set password = 1515 , role = 'b' where users_id = 'ccccc'; 
//게시판 글등록

insert into board(seq,title,content,regdate,cnt,board_id)
values((select nvl(max(seq) , 0)+1 from board),'bads','asbef',sysdate,default,'aaaa')
insert into board(seq,title,content,regdate,cnt,board_id)
values((select nvl(max(seq) , 0)+1 from board),'efew','hewg',sysdate,default,'aaaa')
insert into board(seq,title,content,regdate,cnt,board_id)
values((select nvl(max(seq) , 0)+1 from board),'gweg','asagaf',sysdate,default,'bbbb')

//글수정
update board set title = 'abcd' where board_id = 'aaaa' and title = 'bads';
update board set title = 'abcd', content = 'aaabbb'  where board_id = 'aaaa' and title = 'efew';
//게시판 글 삭제
delete 



 drop table book;
create table book(
	bookno number(5) CONSTRAINT scott_book_pk primary key,
	title     varchar2(12) CONSTRAINT book_title_unique unique,
	author  varchar2(12)CONSTRAINT,
	price    number(5) CONSTRAINT book_price_check check(price>0),
	pubdate date default sysdate
);