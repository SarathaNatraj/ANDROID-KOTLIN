import { useState } from "react";

function ChatApp () {

    const[messages, setMessages] = useState([]);
    const[input,setInput] = useState("");

    //change event on input
    const handleChange = (e) => {
        setInput(e.target.value);


    }

    //key press event on input
    const handleKeyPress = (e) =>{
        if(e.key === "Enter"){
            handleSendMessage();
        }

    }

    //click event on button
    const handleSendMessage = () => {

        //fetching the input and adding in to messages array
        if(input.trim()!== ""){
            //maintaining previous messages and add new message at the end
            setMessages([...messages, input]);
            setInput("");
        }

    }


    return (
        <div>
            <h1> Chat Application</h1>
            <div>
                {messages.map((message, index)=>(
                    <p key={index}>{message}</p>
                ))}
            </div>
            <input type="text" 
                    value={input}
                    onChange={handleChange}
                    onKeyPress={handleKeyPress}
                    placeholder="Type a message..."/>
            <button onClick={handleSendMessage}>Send</button>
        </div>
    )
}

export default ChatApp;