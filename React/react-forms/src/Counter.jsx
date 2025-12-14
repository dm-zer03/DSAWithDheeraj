import { useState, useEffect } from "react";

export default function Counter() {
  let [countx, setCountX] = useState(0);
  let [county, setCountY] = useState(0);

  let incCountX = () => {
    setCountX((currCount) => currCount + 1);
  };

  let incCountY = () => {
    setCountY((currCount) => currCount + 1);
  };

  // useEffect() as side effect with only setUp
 /* useEffect(function printSomething() {
    console.log("This is side effect...");
  });*/

  //useEffect(setUp,dependencies?) ? Optional
   useEffect(
    function sideEffect() {
      console.log("This is side effect...");
    },
   // [countx]
  // [countx,county]
  []
  );

  return (
    <div>
      <h3>Count={countx}</h3>
      <button onClick={incCountX}> +1</button>

      <h3>Count={county}</h3>
      <button onClick={incCountY}> +1</button>
    </div>
  );
}
