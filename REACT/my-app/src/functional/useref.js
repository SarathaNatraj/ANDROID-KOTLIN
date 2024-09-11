import { useRef } from 'react';

//UseRef - prevent the re-rendering of components when variables gets updated.
export default function UseRefCounter() {
    let ref = useRef(0);

    function handleClick() {
      //  console.log(ref.current);    
        ref.current = ref.current + 1;
    }
    return (
        <>
            <h1>count: {ref.current} </h1>
            <button onClick={handleClick}>
                Click me!
            </button>
        </>
    );
}