function doSomething(event) {
  alert("Hello I am Clicked!");
  console.log(event);
}

export default function Button() {
  return (
    <div>
      <button  onClick={doSomething}>Hello!</button>
      <button  onMouseOver={doSomething}>Hovered!</button>
    </div>
  );
}
