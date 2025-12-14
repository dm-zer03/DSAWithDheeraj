import Product from "./Product";

function ProductTab() {
    let options=["Hi-tech","Durable","AI"];
    //let options=[<li>"Hi-tech"</li>,<li>"Durable"</li>,<li>"AI"</li>];

    //let options2={a:"Hi-tech",b:"Durable",c:"fast"};
   
  return (
    <>
      <Product title="Laptop" price={100000} features={options} />
      <Product title="Phone" price={25000}/>
      <Product  title="Mobile" price={1} />
    </>
  );
}

export default ProductTab;
