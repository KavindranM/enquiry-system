import  { useState } from 'react';
// import {useHistory} from 'react-router-dom';
import { Link } from 'react-router-dom';

function LoginPage() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [isLoggedIn, setIsLoggedIn] = useState(false);


  const handleLogin = () => {
    
    if (username === 'user' && password === 'password') {
      setIsLoggedIn(true);
     
    } else {
      alert('Invalid username or password');
    }
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
    setUsername('');
    setPassword('');
  };

  return (
    <div className='good' >
      {isLoggedIn ? (
        <div>
          <h2>Welcome, {username}!</h2>
          <button onClick={handleLogout}>Logout</button>
        </div>
      ) : (
        <div id='box'>
          <h2>Login</h2>
          <Link to="/home">login</Link>
          <br/>
          <br/>
          <input
            type="text"
            placeholder="Username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />
          <br />
          <br/>
          <br/>
          <input
            type="password"
            placeholder="Password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
          <br />
          <br/>
          <br/>
          <button  onClick={handleLogin}>Login</button>
        </div>
      )}
    </div>
  );
}

export default LoginPage;
