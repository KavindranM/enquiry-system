import { useState } from "react";
import '../assets/css/profileWindow.css';
import profileImage from '../assets/images/profile.jpg';
import NavigationBar from "./navbar";
import '../assets/css/navbar.css'

const ProfileWindow = () => {
  // State for editable fields
  const [name, setName] = useState("Kavindran M");
  const [Age, setAge] = useState("20");
  const [qualification, setQualif] = useState("B.E");
  const [skills, setSkill] = useState("Java,C++");
  const [bio, setBio] = useState("Web Developer");
  const [Address, setAddress] = useState("");

  // Function to handle field changes
  const handleNameChange = (e) => {
    setName(e.target.value);
  };

  const handleBioChange = (e) => {
    setBio(e.target.value);
  };
  const handleQualiChange = (e) => {
    setQualif(e.target.value);
  };
  const handleAgeChange = (e) => {
    setAge(e.target.value);
  };
  const handleSkillChange = (e) => {
    setSkill(e.target.value);
  };
  const handleAddressChange = (e) => {
    setAddress(e.target.value);
  };

  return (
    <>
    <NavigationBar/>
   
    <div className="profile">
    <div className="profile-window">
     
        <br/>
        <br/>
      <img src= {profileImage}
        alt="User Profile"
        className="profile-picture"
      />
      {/* </div> */}
      <br/>
      <br/>
      <h2>{name}</h2>
      <br/>
      <p>{Age}</p>
      <br/>
      <p>{qualification}</p>
      <br/>
      <p>{skills}</p>
      <br/>
      <p>{Address}</p>
      <br/>
      
      
      <input
        type="text"
        value={name}
        onChange={handleNameChange}
        placeholder="Enter your name"
      />
      <input
        type="text"
        value={qualification}
        onChange={handleQualiChange}
        placeholder="Enter your Qualification"
      />
      <input
        type="text"
        value={Age}
        onChange={handleAgeChange}
        placeholder="Enter your Age"
      />

      <textarea
        value={skills}
        onChange={handleSkillChange}
        placeholder="tell us about your skills"
      />
      <textarea
        value={bio}
        onChange={handleBioChange}
        placeholder="write your bio"
      />
      <textarea
        value={Address}
        onChange={handleAddressChange}
        placeholder="Enter your Address"
      />
      {/* Other profile details */}
    <button >update</button>
    </div>
    </div>
    </>
  );
};

export default ProfileWindow;
