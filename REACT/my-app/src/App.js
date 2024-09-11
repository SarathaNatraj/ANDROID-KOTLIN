import logo from './logo.svg';
import './App.css';
import Message from './message';
import Greeting from './greeting';
import UserGreeting from './usergreeting';
import News from './news';
import Counter from './counter';
import LikesOrDislikes from './likesdislikes';
import ChatApp from './chatapp';
import RealTimeEvent from './realtime';
import ClassGreeting from './classcomponents/greetingclas';
import Headline from './classcomponents/headline';
import CounterClass from './classcomponents/counterclass';
import RealtimeClass from './classcomponents/realtimeclass';
import LifeCycle from './classcomponents/lifecycle';
import FunctionLifeCycle from './functionallifecycle';
import ShoppingList from './functional/shoppinglist';
import UserList from './useeffect';
import TodosList from './todoslist';
import UseRefCounter from './functional/useref';
import Factorial from './functional/usememo';

function App() {
  const groceries = ['broccoli', 'carrots', 'chicken', 'garlic']; 
  return (
    
    <div className="App">
      <header className="App-header">
        {/* <Message/>
        <Greeting/>
        <UserGreeting name="Harsha"  city="Hyderabad"/> */}
        {/* <Counter/>
        <LikesOrDislikes /> */}
        {/* <ChatApp/> 
           <RealTimeEvent/>
            <Greeting/>
             <Headline title="Apple Event 2024" message="iPhone 16 Pro Launched In India And Other Countries With A18 Pro Chip, 48MP Fusion Camera And 5x Telephoto Lens; Check Price, Specs
" />
        */}
         
        
         {/* <ClassGreeting/>
        
  <Headline title="Kalindi Express mishap" message="14 Suspects Detained As Probe Uncovers Plot To Blow Up Railway Tracks, Set Fire To Train" />
          <CounterClass />
          <RealtimeClass/> */}
          {/* <FunctionLifeCycle />

          <ShoppingList items={groceries} /> 
          <UserList/>
          <TodosList/> */}

          <Factorial/>
      </header>
    </div>
  );
}

export default App;
