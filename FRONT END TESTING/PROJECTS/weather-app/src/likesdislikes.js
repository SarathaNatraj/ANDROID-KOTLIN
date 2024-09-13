import React, { useState } from 'react';

const LikesOrDislikes = () => {
  const [likes, setLikes] = useState(0);
  const [dislikes, setDislikes] = useState(0);

  const handleLike = () => setLikes(likes + 1);
  const handleDislike = () => setDislikes(dislikes + 1);

  return (
    <div>
      <img 
        src="https://via.placeholder.com/150" 
        alt="Placeholder" 
        data-testid="image"
      />
      <div>
        <button onClick={handleLike} data-testid="like-btn">Like</button>
        <span data-testid="likes-count">{likes}</span>
      </div>
      <div>
        <button onClick={handleDislike} data-testid="dislike-btn">Dislike</button>
        <span data-testid="dislikes-count">{dislikes}</span>
      </div>
    </div>
  );
};

export default LikesOrDislikes;
