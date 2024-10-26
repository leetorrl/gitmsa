--  @GeneratedValue(strategy = GenerationType.IDENTITY) 로 인해 프라이머리키값 안써도됨
--insert into article(id, title, content) values(1, '가가가', '1111');
--insert into article(id, title, content) values(2, '나나나', '2222');
--insert into article(id, title, content) values(3, '다다다', '3333');


insert into article( title, content) values( '가가가', '1111');
insert into article( title, content) values( '나나나', '2222');
insert into article( title, content) values( '다다다', '3333');

insert into article( title, content) values('당신의 인생 영화는?' , '댓글 고');
insert into article( title, content) values('당신의 소울 푸드는?' , '댓글 고고');
insert into article( title, content) values('당신의 취미는?' , '댓글 고고고');

insert into comment(article_id, nickname, body) values(4, 'Park', '굿 월 헌팅');
insert into comment(article_id, nickname, body) values(4, 'Kim', '아이 엠 샘');
insert into comment(article_id, nickname, body) values(4, 'Choi', '초밥');

insert into comment(article_id, nickname, body) values(5, 'Park', '치킨');
insert into comment(article_id, nickname, body) values(5, 'Kim', '샤브샤브');
insert into comment(article_id, nickname, body) values(5, 'Choi', '초밥');

insert into comment(article_id, nickname, body) values(6, 'Park', '조깅');
insert into comment(article_id, nickname, body) values(6, 'Kim', '유튜브 시청');
insert into comment(article_id, nickname, body) values(6, 'Choi', '독서');