import React from 'react';

//Props - varaible to the components
function UserGreeting({name, city}){

  return (
    <div>
  <h1>Hello, {name}!</h1>
  <p> Welcome to {city}</p>
  </div>
  );
};

export default UserGreeting;
