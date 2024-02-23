import { useState } from 'react';

const SignupPage = () => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');

  const handleSignup = () => {
    // Implement your signup logic here, such as sending data to a server
    console.log('Signing up with:', { email, password });
    // Reset form fields after signup
    setEmail('');
    setPassword('');
    setConfirmPassword('');
  };

  return (
    <div className='signupbox'>
    <div className='signup'>
      <h2>Sign Up</h2>
      <form onSubmit={handleSignup}>
        <label>UserName:</label>
        <input
          type="name"
          placeholder='Enter your UserName'
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />
        <label>Email:</label>
        <input
          type="email"
          placeholder='Enter your email'
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
        <label>Password:</label>
        <input
          type="password"
          placeholder='Enter your password'
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
        <label>Confirm Password:</label>
        <input
          type="password"
          placeholder='Re-Enter your password'
          value={confirmPassword}
          onChange={(e) => setConfirmPassword(e.target.value)}
          required
        />
        <br/>
        <button type="submit">Sign Up</button>
      </form>
    </div>
    </div>
  );
};

export default SignupPage;
