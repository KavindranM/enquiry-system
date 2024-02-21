
import './App.css'
import LoginPage from './pages/user/userlogin'
import './assets/css/userlogin.css'
import './assets/css/navbar.css'
import {BrowserRouter , Route,Routes} from 'react-router-dom';
import NavigationBar from './components/navbar'
import ProfileWindow from './components/profile';
function App() {
 

  return (
    <>
    <ProfileWindow/>

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
