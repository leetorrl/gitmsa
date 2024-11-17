import React from "react";

export default function ForSort({src}){

    src.sort((m, n) => 
        m.price - n.price)

    return(
        <dl>
            <h1>오름차순</h1>
              {src.map((item,index) => (
                    <React.Fragment key={item.isbn}>
                    <dt>
                  
                        <a href={`https://wikibook.co.kr/images/cover/s/${item.isbn}.jpg`}>
                        {item.title}({item.price}원)
                        <div>{index+1}</div>
                        </a>
                        </dt>
                       
                        <dd>{item.summary}</dd>
                    </React.Fragment>
            ))}
        </dl>
    )
}