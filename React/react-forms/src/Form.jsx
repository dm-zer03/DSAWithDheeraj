import { useState } from "react";
export default function Form() {
  /*let [fullName, setFullName] = useState("");
  let [userName, setUserName] = useState("");
  let handleNameChange = (event) => {
    setFullName(event.target.value);
  };
  let handleUserChange = (event) => {
    setUserName(event.target.value);
  };
  return (
    <form>
      <label htmlFor="fullName"> Enter Full Name :</label>
      <input
        placeholder="Enter full name"
        type="text"
        id="fullName"
        value={fullName}
        onChange={handleNameChange}
      ></input>
      <br></br>

      <label htmlFor="userName"> Enter User name :</label>
      <input
        placeholder="Enter User name"
        type="text"
        id="userName"
        value={userName}
        onChange={handleUserChange}
      ></input>
      <button>Submit</button>
    </form>
  );*/

  let [formData, setFormData] = useState({
    fullName: "",
    userName: "",
    passWord:"",
  });

  let handleInputChange = (event) => {
    let fieldName = event.target.name;
    let newValue = event.target.value;
    /* console.log(fieldName);
    console.log(newValue);*/

    setFormData((currData) => {
      /* currData[fieldName] = newValue;
      return { ...currData };*/
      return { ...currData, [fieldName]: newValue };
    });
  };

  let handleSubmit = (event) => {
    console.log(formData);
    event.preventDefault();
    setFormData({
      fullName: "",
      userName: "",
      passWord:"",
    });
  };

  return (
    <form onSubmit={handleSubmit}>
      <label htmlFor="fullName"> Enter Full Name :</label>
      <input
        placeholder="Enter full name"
        type="text"
        id="fullName"
        value={formData.fullName}
        onChange={handleInputChange}
        name="fullName"
      ></input>
      <br></br>

      <label htmlFor="userName"> Enter User name :</label>
      <input
        placeholder="Enter User name"
        type="text"
        id="userName"
        value={formData.userName}
        onChange={handleInputChange}
        name="userName"
      ></input>
      <br></br>
      <label htmlFor="passWord"> Enter Password :</label>
      <input
        placeholder="Enter password"
        type="password"
        id="passWord"
        value={formData.passWord}
        onChange={handleInputChange}
        name="passWord"
      ></input>
      <br></br>
      <button>Submit</button>
    </form>
  );
}
