/* eslint-disable react/prop-types */
import TicketNum from "./TicketNum";
import "./Ticket.css";
// eslint-disable-next-line react/prop-types
export default function Ticket({ ticket }) {
  return (
    <div className="Ticket">
        <p>Ticket No:</p>
      {ticket.map((num, idx) => (
        <TicketNum num={num} key={idx} />
      ))}
    </div>
  );
}
