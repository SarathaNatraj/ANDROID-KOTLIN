import React from "react";

class CounterClass extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            count:0
        }
    }

     handleIncrement = () => {
       this.setState((prevState) => ({
        count:prevState.count + 1
       }));
    }
    
     handleDecrement = () => {
        this.setState((prevState) => ({
            count:prevState.count - 1
           }));
    }

    render(){
        return(
            <div>
                <p>Count:{this.state.count}</p>
                <button onClick={this.handleIncrement}>+</button>
                <button onClick={this.handleDecrement}>-</button>
            </div>
        );
    }


}

export default CounterClass;