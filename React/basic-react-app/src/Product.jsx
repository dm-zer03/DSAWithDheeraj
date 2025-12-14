import "./Product.css";

function Product({ title, price,features }) {
  //console.log(features);

 // const list = features.map((feature) => <li>{feature}</li>);
  let styles ={backgroundColor:price>30000 ?"yellow":"blue"};
  return (
    <div className="Product" style={{backgroundColor:"red"}} >
      <h3 style={styles}>{title}</h3>
      <h5>Price: {price}</h5>
     {/* <ul>{list}</ul>*/}
    </div>
  );
}

export default Product;
