import NavigationBar from "./navbar";
import english from '../assets/images/englishc.jpg'

const HomePage = () => {
  return (
    <>
    {/* <NavigationBar/> */}
        <div className="topbox">
        <p className="p">This is a paragraph.</p>
        </div>
        <div className="imgs">
    <img src= {english}
        alt="coaching"
        className="coach"
      />
      </div>
    <div className="container">
      <header>
        <h1>Welcome to Our Website</h1>
      </header>
      <main>
        <section>
          <h2>About Us</h2>
          <div className="content">
            <div className="text">
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla quam velit, vulputate eu pharetra nec, mattis ac neque.</p>
            </div>
            <div className="image">
              {/* Add your image here */}
            </div>
          </div>
        </section>
        <section>
          <h2>Services</h2>
          <div className="content">
            <div className="text">
              <ul>
                <li>Service 1</li>
                <li>Service 2</li>
                <li>Service 3</li>
              </ul>
            </div>
            <div className="image">
              {/* Add your image here */}
            </div>
          </div>
        </section>
        <section>
          <h2>Contact Us</h2>
          <div className="content">
            <div className="text">
              <p>Email: info@example.com</p>
              <p>Phone: 123-456-7890</p>
            </div>
            <div className="image">
              {/* Add your image here */}
            </div>
          </div>
        </section>
      </main>
      <footer>
        <p>&copy; 2024 Our Website. All rights reserved.</p>
      </footer>
    </div>
    </>
  );
};

export default HomePage;
