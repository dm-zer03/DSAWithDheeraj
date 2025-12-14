import { useState } from "react";
 function init(){
  return Math.random();
 }


export default function Counter() {
 // let [stateVarible,setStateVariable] = useState(0);
  //let [count,setCount]=useState(0);
  //init() -> Wrong ,init -> Right  in useState.
  let [count,setCount]=useState(init);

 // let arr=useState(0);
  //console.log(arr);
  /* let count = 0;
  function incCount() {
    count += 1;
    console.log(count);
  }
*/

  let incCount=()=>{

    //Case:1
   setCount((currCount)=>{
       return currCount+1;
    });

    setCount((currCount)=>{
      return currCount+1;
   });

    //Case:2
   // setCount(25);
    //console.log(count);
  }
  return (
    <div>
      {/*<h3>Count={count}</h3>
      <button onClick={incCount}>Increase Count</button>*/}
      <h3>Count={count}</h3>
      <button onClick={incCount}>Increase Count</button>
    </div>
  );
}
