
import './App.css'
import LoginPage from './pages/user/userlogin'
import './assets/css/userlogin.css'
import './assets/css/navbar.css'
import {BrowserRouter , Route,Routes} from 'react-router-dom';
import NavigationBar from './components/navbar'
import ProfileWindow from './components/profile';
import SignupPage from './pages/user/userReg';
import './assets/css/signup.css'
import HomePage from './components/home';
import './assets/css/home.css'
function App() {
 

  return (
    <>
    <HomePage/>
    {/* <SignupPage/> */}
    {/* <ProfileWindow/> */}

    {/* <BrowserRouter>
    <Routes>
      <Route path="/" exact element={<LoginPage />} /> */}
      {/* <Route path="/SignUp" exact element={<SignUp />} /> */}
      {/* <Route path="/home" exact element={<NavigationBar/>} /> */}
      {/* </Routes>
      </BrowserRouter> */}


     

      
      
     
    </>
  )
}

export default App
