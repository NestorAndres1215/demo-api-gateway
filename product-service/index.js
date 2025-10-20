const express = require('express');
const cors = require('cors');
const swaggerUi = require('swagger-ui-express');
const swaggerDocument = require('./swagger.json');

const app = express();
app.use(cors());
app.use(express.json());

const products = [
    { id: 1, name: 'Laptop', price: 1200 },
    { id: 2, name: 'Mouse', price: 25 }
];

app.get('/api/products', (req, res) => res.json(products));

app.post('/api/products', (req, res) => {
    const product = req.body;
    product.id = products.length + 1;
    products.push(product);
    res.status(201).json(product);
});

app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerDocument));
app.get('/swagger.json', (req, res) => {
    res.sendFile(__dirname + '/swagger.json');
});

app.listen(8082, () => {
    console.log('✅ Product Service running on port 8082');
    console.log('📘 Swagger: http://localhost:8082/api-docs');
});
