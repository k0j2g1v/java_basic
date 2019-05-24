drop table board;
drop table users;

create table users(
    id           varchar2(10) CONSTRAINT users_id_pk primary key,
    password varchar2(10) not null, 
    name      varchar2(20) constraint users_name not null,
    role        varchar2(5) default 'user'
);
create table board(
	seq        number(5) constraint borad_seq_pk primary key,
	title       varchar2(20) not null,
	content  varchar2(800)not null ,
	regdate  date 		default sysdate,
	cnt         number(5) default 0,
	id varchar2(10) references users
);

// alter table board add CONSTRAINT board_seq_pk foreign key (board_id) references users;

회원등록
insert into users (id,password,name) values('','','');
insert into users (id,password,name) values('java01','1234','홍길동');
insert into users (id,password,name) values('java02','1234','홍길동');

insert into users (id,password,name,role) values('admin','1234','admin','admin');
commit;


게시판 등록

insert into board (seq,title,content,regdate,cnt,board_id) 
values((select nvl(max(seq),0)+1 from board),
					'공지사항','~~~',default,default,'admin');

insert into board (seq,title,content,board_id) 
values((select nvl(max(seq),0)+1 from board),'공지사항','~~~','admin');

insert into board (seq,title,content,board_id) 
values((select nvl(max(seq),0)+1 from board),'연습용1','~~~','java01');

insert into board (seq,title,content,board_id) 
values((select nvl(max(seq),0)+1 from board),'연습용1','~~~','java09');

insert into board (seq,title,content,board_id) 
values((select nvl(max(seq),0)+1 from board),'연습용2','~~~','java01');

글 찾기

select * from board;
                                     // return 타입이 많을수도 적을수도 있다 많을경우 collection으로감                                 
select * from board where board_id='java01';
                                     // 게시물 1번의 내용보기 값이올경우 한개만옴
select * from board where seq=1;

select to_char(regdate,'mm'),count(*) 
from board group by to_char(regdate,'mm');

글 삭제

delete from board where board_id = 'java01' and seq = 3;
delete from board where board_id = 'java01';


로그인

select * from users where id='' and password='';
select * from users where id='java01' and password='1234';
select * from users where id='java01' and password='0000';
select * from users where id='admin' and password='1234';



글 수정

update board set title='메모장' where board_id = 'java01' and seq = 2 ;

데이터 검색

select * from board where board_id = 'java01';

전체 등록글 수

select nvl(max(board),0) +1 from board;

컴파일 타임에 올라가는 클래스가 결정이 되어버린다

