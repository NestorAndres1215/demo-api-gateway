const express = require('express');
const cors = require('cors');
const swaggerUi = require('swagger-ui-express');
const path = require('path');
const swaggerDocument = require('./swagger.json');

const app = express();
const PORT = 8082;


app.use(express.json());
app.use(cors({
  origin: 'http://localhost:4200',
  methods: ['GET', 'POST', 'PUT', 'DELETE'],
  allowedHeaders: ['Content-Type', 'Authorization'],
  credentials: true
}));


let products = [
  { id: 1, name: 'Laptop', price: 1200 },
  { id: 2, name: 'Mouse', price: 25 }
];


app.get('/api/products', (req, res) => res.json(products));

app.post('/api/products', (req, res) => {
  const product = req.body;
  if (!product.name || !product.price) {
    return res.status(400).json({ message: 'Nombre y precio son obligatorios' });
  }
  product.id = products.length + 1;
  products.push(product);
  res.status(201).json(product);
});


app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerDocument));


app.get('/swagger.json', (req, res) => {
  res.sendFile(path.join(__dirname, 'swagger.json'));
});


app.listen(PORT, () => {
  console.log(`✅ Product Service running on port ${PORT}`);
  console.log(`📘 Swagger disponible en: http://localhost:${PORT}/api-docs`);
});
