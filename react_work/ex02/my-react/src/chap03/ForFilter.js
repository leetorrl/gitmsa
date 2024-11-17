import React from "react";

export default function ForFilter({src}){
const lowPrice = src.filter(book =>book.price < 25000)
    return(

        <dl>
             <h1>중간연산</h1>
            {lowPrice.map((item,index) => (
                    <React.Fragment key={item.isbn}>
                    <dt>
                        <a href={`https://wikibook.co.kr/images/cover/s/${item.isbn}.jpg`}>
                        {item.title}({item.price}원)
                        <div>{index+1}</div>
                        </a>
                        </dt>
                       
                        <dd>{item.summary}</dd>
                    </React.Fragment>
            )
            )}
        </dl>
)

}