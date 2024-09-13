import { render, screen,fireEvent } from '@testing-library/react';
import userEvent from '@testing-library/user-event';

import axios from 'axios';
import MockAdapter from 'axios-mock-adapter';

import WeatherApp from './weatherapp';

const mock = new MockAdapter(axios);
const apiUrl = `http://api.openweathermap.org/data/2.5/forecast?q=${city}&appid=${apiKey}&units=metric`;
const apiKey = '87655c9e85dfdc79596e239bf82090a3'; 

describe('Weather Component with 5 days forecast', () => {

    beforeEach(() => {
        mock.reset();
    })


    it('should render weather data', async () => {

        const data = {
            list: [
                {
                    dt: 1633072800,
                    weather: [{ main: 'Clear' }],
                    main: { temp: 20 }
                }

            ]
        }

        mock.onGet(apiUrl).reply(200,data);

        render(<WeatherApp />);


        const inputElement = screen.getByTestId('city');
        userEvent.type(inputElement, "London");

        const buttonElement = screen.getAllByTestId('getweather')
        fireEvent.click(buttonElement);

        await waitFor(()=>{
            expect(screen.getByText(/20 C/i)).toBeInTheDocument();
            expect(screen.getByText(/Clear/i)).toBeInTheDocument();

        })

    })



});