import Card from "@mui/material/Card";
import CardContent from "@mui/material/CardContent";
import CardMedia from "@mui/material/CardMedia";
import Typography from "@mui/material/Typography";
import ThunderstormIcon from '@mui/icons-material/Thunderstorm';
import SevereColdIcon from '@mui/icons-material/SevereCold';
import WhatshotIcon from '@mui/icons-material/Whatshot';

export default function InfoBox({ info }) {
  const INIT_URL =
    "https://images.unsplash.com/photo-1641970304289-77c942a40292?q=80&w=1035&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D";

  const HOT_URL =
    "https://media.istockphoto.com/id/1322096928/photo/hot-summer-sunlight-rays-pouring-through-human-hand-hand-covering-sun-light-heat-temperature.jpg?s=2048x2048&w=is&k=20&c=iUUyyr7Eh92XLWDA23RQVEVoLU7vviTOc-38E4NYCjQ=";
  const COLD_URL =
    "https://media.istockphoto.com/id/1289449088/photo/branches-covered-with-ice-after-freezing-rain-sparkling-ice-covered-everything-after-ice.jpg?s=2048x2048&w=is&k=20&c=x1Zrk6290YKvVN5Yt_IrRncXltrCTYlMgmJH-2HwXTc=";
  const RAIN_URL =
    "https://media.istockphoto.com/id/1429701799/photo/raindrops-on-asphalt-rain-rainy-weather-downpour.jpg?s=2048x2048&w=is&k=20&c=5-0cwKyftzKvHbxdXfJLyvV7Ijm0-lrB1DryXtJcpfg=";
  return (
    <div className="InfoBox">
      <Card sx={{ maxWidth: 345 }}>
        <CardMedia
          component="img"
          alt="green iguana"
          height="140"
          image={
            info.humidity > 80
              ? RAIN_URL
              : info.temp > 15
              ? HOT_URL
              : COLD_URL
          }
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="div">
            {info.city}{
            info.humidity > 80
              ? <ThunderstormIcon/>
              : info.temp > 15
              ? <WhatshotIcon/>
              : <SevereColdIcon/>
          }
          </Typography>
          <Typography variant="body2" color="text.secondary" component={"span"}>
            <div>Temperature={info.temp}&deg;C</div>
            <div>Humidity={info.humidity}</div>
            <div>TempMax={info.tempMax}&deg;C</div>
            <div>TempMin={info.tempMin}&deg;C</div>
            <div>weather={info.weather}</div>
            <p>
              The weather can be described as <i>{info.weather}</i> and feels
              like {info.feelsLike}.
            </p>
          </Typography>
        </CardContent>
      </Card>
    </div>
  );
}
