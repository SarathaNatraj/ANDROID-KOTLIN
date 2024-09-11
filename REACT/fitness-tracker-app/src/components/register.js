import { useNavigate } from "react-router";

const { useState } = require("react")


const Register = () =>{

    const[email,setEmail]= useState('');
    const[password,setPassword]= useState('');
    const navigate = useNavigate();

    const handleLogin = (e) => {
        
        console.log(e.target.textContent);
        if(e.target.textContent === "Home"){
            navigate('/');
        }
      
    }




    return(
        <div className="App-header">
           
            <form  className="formcenter" id="loginform">
            <h2>Register</h2>
                <label>
                    Email:
                        <input 
                            type="email"
                            value={email}
                            onChange={(e) => setEmail(e.target.value)}/>
                </label>
                <label>
                    Password:
                        <input 
                            type="current-password"
                            value={password}
                            onChange={(e) => setPassword(e.target.value)}/>
                </label>
                <button type="button" onClick={handleLogin}>Register</button>
                <button type="button" onClick={handleLogin}>Home</button>

            </form>
        </div>
    )

}

export default Register;
