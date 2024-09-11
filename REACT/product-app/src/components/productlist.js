import React, { useState, useEffect } from 'react';
import axios from 'axios';

const ProductList = () => {
  const [products, setProducts] = useState([]);
  const [name, setName] = useState('');
  const [price, setPrice] = useState('');
  const [isEditing, setIsEditing] = useState(false);
  const [editId, setEditId] = useState(null);

  const apiUrl = 'http://localhost:3000/products';

  // Fetch products from the JSON server
  useEffect(() => {
    axios.get(apiUrl)
      .then(response => setProducts(response.data))
      .catch(error => console.error('Error fetching products:', error));
  }, []);

  // Add product
  const addProduct = () => {
    const newProduct = { name, price: parseInt(price) };
    axios.post(apiUrl, newProduct)
      .then(response => {
        setProducts([...products, response.data]);
        setName('');
        setPrice('');
      })
      .catch(error => console.error('Error adding product:', error));
  };

  // Edit product
  const editProduct = (id) => {
    const product = products.find(product => product.id === id);
    setName(product.name);
    setPrice(product.price);
    setIsEditing(true);
    setEditId(id);
  };

  // Update product
  const updateProduct = () => {
    const updatedProduct = { name, price: parseInt(price) };
    axios.put(`${apiUrl}/${editId}`, updatedProduct)
      .then(response => {
        setProducts(products.map(product => 
          product.id === editId ? response.data : product
        ));
        setName('');
        setPrice('');
        setIsEditing(false);
        setEditId(null);
      })
      .catch(error => console.error('Error updating product:', error));
  };

  // Delete product
  const deleteProduct = (id) => {
    const confirm=window.confirm('Are you sure to delete the product ?');
    if(confirm){
    axios.delete(`${apiUrl}/${id}`)
      .then(() => {
        setProducts(products.filter(product => product.id !== id));
      })
      .catch(error => console.error('Error deleting product:', error));
    }
  };

  return (
    <div className="App">
      <h1>Product App</h1>
      <ul>
        {products.map(product => (
          <li key={product.id}>
            {product.name} - {product.price}
            <button onClick={() => editProduct(product.id)}>Edit</button>
            <button onClick={() => deleteProduct(product.id)}>Delete</button>
          </li>
        ))}
      </ul>

      <input
        type="text"
        placeholder="Product Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      /> <br/>
      <input
        type="number"
        placeholder="Product Price"
        value={price}
        onChange={(e) => setPrice(e.target.value)}
      /> <br/>
      <button onClick={isEditing ? updateProduct : addProduct}>
        {isEditing ? 'Update Product' : 'Add Product'}
      </button>

     
    </div>
  );
};

export default ProductList;
