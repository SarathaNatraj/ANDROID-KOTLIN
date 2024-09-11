import logo from './logo.svg';
import './App.css';

import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './pages/home';
import Dashboard from './pages/dashboard';
import Register from './components/register';
import Workouts from './components/workout';
import ProgressTracking from './components/progress';
import GoalSetting
 from './components/goals';
function App() {
  return (
    <Router>
      <div>
        <div >
        <h1>Fitness Tracker App </h1>
        </div>
        <nav className='headermenu'>
          <a href="/">Home</a> <br />
          <a href="/dashboard">Dashboard</a> <br />
          <a href="/workout">Workouts</a> <br />
          <a href="/progress">Progess Tracking</a>
          <a href="/goals">Goal Setting</a>
          <a href="/register">Register</a> <br />
        </nav>
      </div>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/workout" element={<Workouts />} />
        <Route path="/progress" element={<ProgressTracking />} />
        <Route path="/goals" element={<GoalSetting />} />
        <Route path="/register" element={<Register />} />
      </Routes>
    </Router>
  );
}

export default App;
