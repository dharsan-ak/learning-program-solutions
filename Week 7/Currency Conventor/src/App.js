import React, { useState } from 'react';
import './App.css';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);

  const handleSubmit = () => {
    const conversionRate = 0.011; // Example: 1 INR = 0.011 EUR
    const converted = parseFloat(rupees) * conversionRate;
    setEuros(converted.toFixed(2));
  };

  return (
    <div style={{ marginTop: '20px' }}>
      <h3>Currency Convertor</h3>
      <input
        type="number"
        placeholder="Enter INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euros && <p>{rupees} INR = {euros} EUR</p>}
    </div>
  );
}

function App() {
  const [count, setCount] = useState(0);

  // Multiple method handler for Increment
  const handleIncrement = () => {
    setCount(prev => prev + 1);
    sayHello();
    showMessage();
  };

  const handleDecrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    alert("Hello from React!");
  };

  const showMessage = () => {
    console.log("This is a static message after incrementing.");
  };

  const sayWelcome = (msg) => {
    alert("You said: " + msg);
  };

  const handleClick = (event) => {
    alert("I was clicked!");
    console.log("Synthetic Event:", event);
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h2>React Event Handling Lab</h2>

      <h3>Counter: {count}</h3>
      <button onClick={handleIncrement}>Increment</button>&nbsp;
      <button onClick={handleDecrement}>Decrement</button>

      <br /><br />
      <button onClick={() => sayWelcome("welcome")}>Say Welcome</button>

      <br /><br />
      <button onClick={handleClick}>Synthetic Event (OnPress)</button>

      <CurrencyConvertor />
    </div>
  );
}

export default App;