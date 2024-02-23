
const NavigationBar = () => {
    return (
        <div className="navbox">

        <nav className="navbar">
        <ul className="nav-list">
            <li><a href="#home">Home</a></li>
            <li><a href="#about">About Us</a></li>
            <li><a href="#services">Services</a></li>
            <li><a href="#contact">Contact</a></li>
        </ul>
        <div className="rightNav">
            <input type="text" name="search"
                   id="search" placeholder="Search"></input>
                   
            <button className="btn btn-sm">Search</button>
        </div>
    </nav>
        </div>
    );
};

export default NavigationBar;

