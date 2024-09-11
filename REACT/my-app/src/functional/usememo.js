import { useState, useMemo } from 'react';
const factorialOf = (num) => {
    if (num < 0)
        return -1;
    else if (num === 0)
        return 1;
    else {
        return (num * factorialOf(num - 1));
    }
}

//useMemo - high expensive operation, precalculated results
export default function Factorial() {
    const [number, setNumber] = useState(0);
    const [bool, setBool] = useState(true);
    const clickHandler = () => setBool(!bool);
    const factorialNumber = useMemo(()=>factorialOf(number), [number]); // Computationally expensive 
    return (
        <div>
            <input type='text' onChange={(event) => setNumber(event.target.value)} />
            <h2>{factorialNumber}</h2>
            <button onClick={clickHandler}> re-render </button>
        </div>
    )
}