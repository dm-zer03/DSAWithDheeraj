import { useState } from "react";
import "./Lottery.css";
import { genTicket, sum } from "./helper";
import Ticket from "./Ticket";

export default function Lottery({ n, winCondition }) {
  let [ticket, setTicket] = useState(genTicket(n));
 // let isWinning = sum(ticket) === winningsum;
  let isWinning =winCondition(ticket);

  let buyTicket = () => {
    setTicket(genTicket(n));
  };
  /*
  let [ticket, setTicket] = useState(genTicket(3));
  let isWinning = sum(ticket) === 15;
  let buyTicket = () => {
    setTicket(genTicket(3));
  };
  return (
    <div>
      <h1> Lottery Game!</h1>
      <div className="ticket">
        <span>{ticket[0]}</span>
        <span>{ticket[1]}</span>
        <span>{ticket[2]}</span>
      </div>
      <br></br>
      <button onClick={buyTicket}>Buy Ticket</button>
      &nbsp;
      <h3>{isWinning && "Congratulations,you Won!"}</h3>
    </div>
  );*/

  return (
    <div>
      <h1> Lottery Game!</h1>
      <Ticket ticket={ticket}/>
      <br></br>
      <button onClick={buyTicket}>Buy Ticket</button>
      &nbsp;
      <h3>{isWinning && "Congratulations,you Won!"}</h3>
    </div>
  );
}
