
//FC - functional comp
function Login(){

    return (
        <form action="action_page.php" method="post">
    <div class="imgcontainer">
    </div>
  
    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="uname" required/>
  
      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required/>

  
      <button type="submit">Login</button>
      <label for="remember"> 
      
      
      </label>
      <input type="checkbox" checked="checked" name="remember"  />  Remember me
    </div>
  
    <div class="container" >
      <button type="button" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form>

    );

}

export default Login;