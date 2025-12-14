import { useState } from "react";
import SearchBox from "./SearchBox";
import InfoBox from "./InfoBox";
export default function WeatherApp() {
  const [weatherInfo, setWeatherInfo] = useState({
    city: "Delhi",
    feelsLike: "haze",
    humidity: 94,
    temp: 17.05,
    tempMax: 17.05,
    tempMin: 17.05,
    weather: "fog",
  });

  let updateInfo = (result) => {
    setWeatherInfo(result);
  };
  return (
    <div>
      <h3>Weather App by Delta</h3>
      <SearchBox update={updateInfo} />
      <br></br>
      <InfoBox info={weatherInfo} />
    </div>
  );
}
