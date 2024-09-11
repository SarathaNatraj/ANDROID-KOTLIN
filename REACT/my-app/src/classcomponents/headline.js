import React from "react";
class Headline extends React.Component{


    render(){
        const {title,message} = this.props;
        return(
            <div>
                 <h1>{title}</h1>
                 <p>{message}</p>
            </div>
        )
    }
}

export default  Headline;