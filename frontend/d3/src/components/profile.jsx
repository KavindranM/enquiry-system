import { useState } from "react";
import '../assets/css/profileWindow.css';

const ProfileWindow = () => {
  // State for editable fields
  const [name, setName] = useState("John Doe");
  const [bio, setBio] = useState("Web Developer");

  // Function to handle field changes
  const handleNameChange = (e) => {
    setName(e.target.value);
  };

  const handleBioChange = (e) => {
    setBio(e.target.value);
  };

  return (
    <div className="profile">
    <div className="profile-window">
      <div className="imag">
        <br/>
        <br/>
      <img
        src="profile-image.jpg"
        alt="User Profile"
        className="profile-picture"
      />
      </div>
      <br/>
      <br/>
      <h2>{name}</h2>
      <br/>
      <p>{bio}</p>
      <br/>
      
      {/* Editable fields */}
      <input
        type="text"
        value={name}
        onChange={handleNameChange}
        placeholder="Enter your name"
      />
      <textarea
        value={bio}
        onChange={handleBioChange}
        placeholder="Write a short bio"
      />
      {/* Other profile details */}
    <button >update</button>
    </div>
    </div>
  );
};

export default ProfileWindow;
