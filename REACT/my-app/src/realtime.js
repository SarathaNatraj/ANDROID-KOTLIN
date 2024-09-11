import { useEffect, useState } from "react";

function RealTimeEvent(){

    //initialising the function components     
    const[text,setText] = useState('');
    const[isTyping,setIsTyping] = useState(false);
    const[mousePosition,setMousePosition] =useState({x:0, y:0});


    //This will be getting called, before the component gets loaded - useEffect
    //useEffect(()=>{
        const handleMouseMove = (e) => {
            setMousePosition({x:e.clientX, y:e.clientY});
        }
        window.addEventListener('mousemove',handleMouseMove);

    //})

    const handleChange = (e) =>{
        setText(e.target.value)
        setIsTyping(true);

    }

    const handleBlur = () => {
        setIsTyping(false);

    }


    return(
        <div>
            <h1> Real Time Event Handling</h1>
            <input 
                type="text"
                value={text}
                onChange={handleChange}
                onBlur={handleBlur}
                placeholder="Type something..."/>
            <p>{isTyping ? 'Typing ...' : 'Stopped Typing' }</p>
            <p>Mouse Position: X : {mousePosition.x}, Y : {mousePosition.y}</p>
        </div>
    )
}

export default RealTimeEvent;