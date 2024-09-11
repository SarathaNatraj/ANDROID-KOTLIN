import { useDebugValue, useEffect, useState } from "react";
//arrow functions
const FunctionLifeCycle = () => {

    const[count,setCount] = useState(0);
    const[data,setData] = useState(null);
    

    useEffect(()=>{
        console.log("Component mounted!!");
        fetchData();
    });

    const fetchData = async () => {
        const fetchedData = await  new Promise((resolve) => 
            setTimeout(()=> resolve({message:'Hello, world'}),2000)
            );
            setData(fetchedData);

        }

        return(
            <div>
                    <h1>React Functional Component LifeCycle  </h1>
                    <p>Button clicked {count} times</p>
                    <button onClick={()=> setCount(count+1)}>Click Me</button>
                    {data ? <p> Data fetched : {data.message}</p> : <p>Loading Data ....</p>}

            </div>
        );
    }


export default FunctionLifeCycle;