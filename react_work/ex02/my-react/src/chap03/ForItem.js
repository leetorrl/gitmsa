import Download from "./Download"

export default function ForItem({book}){


    // let dd;

    // if(book.download){
    //     dd= <dd>{book.sumary}<Download slug={book.slug}/></dd>
    // }else{
    //     dd= <dd>{book.sumary}</dd>
    // }

    return(
<>
<dt>
    <a href={`https://wikibook.co.kr/images/cover/s/${book.isbn}.jpg`}>
    {book.title} ({book.price}원)
    </a>
</dt>
<dd>
    {book.summary}
    {book.download ? <Download isbn={book.isbn} /> : null}
    {/* {book.download && <Download isbn={book.isbn} />} */}
    {/* {book.download || 'x'} */}
</dd>

{/* {(()=>{
    if(book.download){
        return <dd>{book.summary}<Download slug={book.slug} /></dd>
    }else{
        return <dd>{book.summary}</dd>
    }
})()} */}

</>
)
}