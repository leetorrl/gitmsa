//sfc

import { useState } from "react";

const Person = ({name:personName,age:personAge}) => {


    const [name, namevalue]= useState(personName);
    const [age, agevalue]= useState(personAge);


    const doName = () => {
        namevalue(name+"!")

        console.log(name)
    }
    const doAge = () => {
       agevalue(age+1)
        console.log(age)
    }


    console.log("props.name = "+name)
    console.log("props.age = "+age)

    return ( <div>

<h1>Person</h1>
<p>This is a person component.</p>
<h2>이름은 = {name}</h2>
<h2>나이는 = {age}</h2>
<button onClick={doName} >이름증가</button>
<button  onClick={doAge}>나이증가</button>

<>================================</>
    </div> );
}
 
export default Person; //import Person

