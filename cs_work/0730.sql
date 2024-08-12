SELECT * FROM madangdb.book;

-- 1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
-- 2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
-- 3) 전체 고객의 30%이상이 구매한 도서


select publisher
from book , customer , orders 
where  book.bookid= orders.bookid 
and customer.custid= orders.custid and name = '박지성' ;



select publisher , name
from book, customer, orders
where book.bookid=orders.bookid 
and customer.custid=orders.custid 
and publisher in (select publisher
from book , customer , orders 
where  book.bookid= orders.bookid 
and customer.custid= orders.custid and name = '박지성' 
);

select publisher
                     from book
					  group by publisher;

-- 두종류이상의 퍼블리셔에서 도서를 구매한 사람들 이름
select name ,count(distinct publisher) as 종류
from book, customer, orders
where book.bookid=orders.bookid
and customer.custid= orders.custid
group by name
having count(distinct publisher)>1;





select name , count(publisher)
from book, customer , orders
where book.bookid = orders.bookid
and customer.custid=orders.custid
group by name;


select abs(-78);

select round(4.875, 2);




