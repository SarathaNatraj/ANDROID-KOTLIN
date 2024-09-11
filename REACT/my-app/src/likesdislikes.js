import { useState } from "react";

function LikesOrDislikes(){

    const[likes,setLikes]=useState(0);
    const[dislikes,setdisLikes]=useState(0);
    const[liked,setLiked]=useState(false);
    const[disliked,setDisLiked]=useState(false);
    

    const handleLike = () =>{
        if(!liked){
            setLikes(likes+1);
            setLiked(!true);
            if(disliked){
                setdisLikes(dislikes - 1);
               setDisLiked(!false);
            }
        }

    }

    const handleDislike = () =>{
        if(!disliked){
            setdisLikes(dislikes+1);
            setDisLiked(!true);
            if(liked){
                setLikes(likes-1);
                setLiked(!false);
            }
        }
        
    }


    return(
        <div>
            <img src="iphone.jpeg" alt="iphone"/>
            <p> Likes:  {likes}</p>
            <p> Dislikes: {dislikes}</p>
            <button onClick={handleLike}>Like</button>
            <button onClick={handleDislike}>DisLike</button>

        </div>
    );

    


}

export default LikesOrDislikes;