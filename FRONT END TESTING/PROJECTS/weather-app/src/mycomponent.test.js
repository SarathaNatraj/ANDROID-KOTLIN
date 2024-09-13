import { render, screen } from '@testing-library/react';
import MyComponent from './mycomponent';


//Component testing
test('renders a button with correct text', () => {
  //loading my component
    render(<MyComponent />);
  //finding the button with click me text
  const buttonElement = screen.getByText(/click me/i);

  //button should be on the document
  expect(buttonElement).toBeInTheDocument();
});
