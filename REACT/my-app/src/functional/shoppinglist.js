const ShoppingList = ({items}) => { 
    return ( 
    <ul> 
    {items.map((item) => <li key={item}> {item} </li>)} 
    </ul> 
    ) 
   } 

export default ShoppingList;
   