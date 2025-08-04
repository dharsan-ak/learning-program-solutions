import React, { useState } from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Toggle login/logout
  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ textAlign: 'center', marginTop: '100px' }}>
      {
        isLoggedIn ? (
          <>
            <h1>Welcome back</h1>
            <button onClick={handleLogout}>Logout</button>
          </>
        ) : (
          <>
            <h1>Please sign up.</h1>
            <button onClick={handleLogin}>Login</button>
          </>
        )
      }
    </div>
  );
}

export default App;
