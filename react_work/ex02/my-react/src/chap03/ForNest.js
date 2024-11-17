import ForItem from "./ForItem";

export default function ForNest({src}){
    return(
        <dl>
            <h1>상황연산</h1>
            {src.map(item =>
                <ForItem book={item} key={item.isbn}/>
             )}
        </dl>
    )
}