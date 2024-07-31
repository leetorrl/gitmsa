use madangdb;

select bookname , name
from book , customer , orders
where customer.custid = orders.custid and orders.bookid = book.bookid and name not in ('박지성') ;

