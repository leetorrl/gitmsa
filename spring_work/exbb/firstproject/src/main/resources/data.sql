--  @GeneratedValue(strategy = GenerationType.IDENTITY) 로 인해 프라이머리키값 안써도됨
--insert into article(id, title, content) values(1, '가가가', '1111');
--insert into article(id, title, content) values(2, '나나나', '2222');
--insert into article(id, title, content) values(3, '다다다', '3333');


insert into article( title, content) values( '가가가', '1111');
insert into article( title, content) values( '나나나', '2222');
insert into article( title, content) values( '다다다', '3333');