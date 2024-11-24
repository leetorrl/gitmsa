import React from "react"
import { BrowserRouter as useNavigate } from "react-router-dom";


export default function Siderbar({testnum}){

    const navigate = useNavigate()

    const goabout = () => {
        navigate('/about')
    }

    return(
        <>
            <ul style={{listStyle: "none"}}>
            <li style={{ margin: '10px', backgroundColor: testnum % 2 === 0 ? 'lightgreen' : 'lightblue' }}>1</li>
            <li style={{ margin: '10px', backgroundColor: testnum % 2 === 0 ? 'lightgreen' : 'lightblue' }}>2</li>
            <li style={{ margin: '10px', backgroundColor: testnum % 2 === 0 ? 'lightgreen' : 'lightblue' }}>3</li>
            <li style={{ margin: '10px', backgroundColor: testnum % 2 === 0 ? 'lightgreen' : 'lightblue' }}>4</li>
           <li style={{ margin: '10px', backgroundColor: testnum % 2 === 0 ? 'lightgreen' : 'lightblue' }}>{testnum}</li>
           <button onClick={goabout}>클릭</button>
        </ul>
        </>
    
    )
}

