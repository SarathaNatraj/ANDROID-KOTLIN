import logo from './logo.svg';
import './App.css';
import ProductList from './components/productlist';
import { useState } from 'react';
import Weather from './components/weather';
import WeatherApp from './components/weatherdays';

function App() {
  const[selectedProduct,setSelectedProduct]=useState(null);

  return (
    <div className="App">
      <header className="App-header">
        <ProductList />
        <WeatherApp />
      </header>
    </div>
  );
}

export default App;
