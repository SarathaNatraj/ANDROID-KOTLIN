import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect'; // for additional matchers
import LikesOrDislikes from './likesdislikes';

test('renders image and handles like and dislike button clicks', () => {
  render(<LikesOrDislikes />);

  // Check image is rendered
  const image = screen.getByTestId('image');
  expect(image).toBeInTheDocument();

  // Check initial counts
  const likesCount = screen.getByTestId('likes-count');
  const dislikesCount = screen.getByTestId('dislikes-count');
  expect(likesCount).toHaveTextContent('0');
  expect(dislikesCount).toHaveTextContent('0');

  // Like button
  const likeButton = screen.getByTestId('like-btn');
  fireEvent.click(likeButton);
  expect(likesCount).toHaveTextContent('1');

  // Dislike button
  const dislikeButton = screen.getByTestId('dislike-btn');
  fireEvent.click(dislikeButton);
  expect(dislikesCount).toHaveTextContent('1');

  // Click like again
  fireEvent.click(likeButton);
  expect(likesCount).toHaveTextContent('2');

  // Click dislike again
  fireEvent.click(dislikeButton);
  expect(dislikesCount).toHaveTextContent('2');
});
