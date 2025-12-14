import { useState } from "react";
import Button from "@mui/material/Button";
import DeleteIcon from "@mui/icons-material/Delete";
import SearchBox from "./SearchBox";
import InfoBox from "./InfoBox";
import "./App.css";
import WeatherApp from "./WeatherApp";

function App() {
  let handleClick = () => {
    console.log("Button was clicked!");
  };
  /* return (
    <>
      <Button variant="text" onClick={handleClick} color="success" size="large">
        Text
      </Button>
      <Button variant="outlined" startIcon={<DeleteIcon />}>
        Delete
      </Button>
      <Button variant="contained" disabled>
        Contained
      </Button>
      <Button variant="outlined" size="large">
        Outlined
      </Button>
    </>
  );*/
 /* return (
    <div>
      <SearchBox />
      <InfoBox />
    </div>
  );*/

  return (
    <div>
      <WeatherApp/>;
    </div>
  );
}

export default App;
