import React, { useState, useEffect } from 'react';
import axios from 'axios';

const WeatherApp = () => {
  const [city, setCity] = useState('');
  const[cityData,setCityData]=useState('');
  const [weatherData, setWeatherData] = useState([]);
  const [error, setError] = useState('');
  const apiKey = '87655c9e85dfdc79596e239bf82090a3'; // Replace with your OpenWeatherMap API key

  // Fetch weather data from OpenWeatherMap API
  const fetchWeatherData = async () => {
    if (!city) return;
    
    const apiUrl = `http://api.openweathermap.org/data/2.5/forecast?q=${city}&appid=${apiKey}&units=metric`;

    try {
      const response = await axios.get(apiUrl);
      setCityData(response.data.city);
      console.log(response.data.city);
      setWeatherData(response.data.list.filter((_, index) => index % 8 === 0)); // Get data for every 24 hours
      setError('');
    } catch (err) {
      setError('Unable to fetch weather data. Please check the city name.');
      setWeatherData([]);
    }
  };

  return (
    <div className="WeatherApp">
      <h1>5-Day Weather Forecast</h1>

      <input
        type="text"
        placeholder="Enter city"
        value={city}
        onChange={(e) => setCity(e.target.value)}
      />
      <button onClick={fetchWeatherData}>Get Weather</button>

      {error && <p style={{ color: 'red' }}>{error}</p>}

      <div style={{display:'flex'}}>
      <h1 style={{alignItems:'center'}}>{cityData.name},{cityData.country}</h1> <br/> <br/>
        {weatherData.map((day, index) => (
            
          <div key={index} style={{display:'block', margin:'20px'}}>
           <br/>
            <h3>{new Date(day.dt_txt).toLocaleDateString()}</h3>
            <img
              src={`http://openweathermap.org/img/wn/${day.weather[0].icon}@2x.png`}
              alt={day.weather[0].description}
            />
            <p>{day.weather[0].description}</p>
            <p>Temp: {day.main.temp}°C</p>
            <p>Humidity: {day.main.humidity}%</p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default WeatherApp;
