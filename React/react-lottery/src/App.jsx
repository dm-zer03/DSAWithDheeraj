import { useState } from "react";
import Lottery from "./Lottery";
import TicketNum from "./TicketNum";
import Ticket from "./Ticket";
import {sum} from "./helper"
import "./App.css";

function App() {
  let winCondition = (ticket) => {
    return sum(ticket) === 15;
  };
  return (
    <>
      <Lottery n={3} winCondition={winCondition} />
      
    </>
  );

  // return (
  //   <>
  //     <TicketNum num={5} />
  //     <TicketNum num={4} />
  //     <TicketNum num={2} />
  //   </>
  // );

  // return (
  //   <>
  //     <Ticket ticket={[0, 3, 2]}/>
  //     <Ticket ticket={[0, 9, 2]}/>
  //   </>
  // );
}

export default App;
