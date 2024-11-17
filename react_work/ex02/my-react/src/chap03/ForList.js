import React from "react";

export default function ForList({src}){

    return(
        <dl>
        {src.map((item, index) =>(
            <React.Fragment key={item.isbn}>
            <dt>
                <a href={`https://wikibook.co.kr/images/cover/s/${item.isbn}.jpg`}>
                {item.title}({item.price}원)
                </a>
                </dt>
                <div>{index+1}</div>
                <dd>{item.summary}</dd>
            </React.Fragment>
        ))}
        </dl>
    )
}