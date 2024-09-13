import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect'; // for additional matchers
import Counter from './counter';

test('renders counter component and handles button clicks', () => {
  render(<Counter />);

  // Check initial count value
  const countElement = screen.getByTestId('count');
  expect(countElement).toHaveTextContent('0');

  // Increment button
  const incrementButton = screen.getByTestId('increment-btn');
  fireEvent.click(incrementButton);
  expect(countElement).toHaveTextContent('1');

  // Decrement button
  const decrementButton = screen.getByTestId('decrement-btn');
  fireEvent.click(decrementButton);
  expect(countElement).toHaveTextContent('0');
});
