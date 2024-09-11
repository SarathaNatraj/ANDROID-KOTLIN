import React from "react";

class RealtimeClass extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            text: '',
            isTyping: false,
            mousePosition : {x: 0, y : 0}
        };
    }


     handleChange = (e) =>{
        this.setState({
            text: e.target.value,
            isTyping: true
        });

       // setText(e.target.value)
        //setIsTyping(true);

    }

     handleBlur = () => {

        this.setState({
            isTyping: false
        });
        //setIsTyping(false);

    }
 //This will be getting called, after the component gets loaded - useEffect
    componentDidMount(){
        window.addEventListener('mousemove',  this.handleMouseMove);
    }

    handleMouseMove = (e) => {
        this.setState({
            mousePosition : {x: e.clientX, y: e.clientY}
        });


        //setMousePosition({x:e.clientX, y:e.clientY});
    }
    render(){
        return(
        <div>
        <h1> Real Time Event Handling</h1>
        <input 
            type="text"
            value={this.state.text}
            onChange={this.handleChange}
            onBlur={this.handleBlur}
            placeholder="Type something..."/>
        <p>{this.state.isTyping ? 'Typing ...' : 'Stopped Typing' }</p>
        <p>Mouse Position: X : {this.state.mousePosition.x}, Y : {this.state.mousePosition.y}</p>
    </div>
        );
    }
}

export default RealtimeClass;
