var express = require('express');
var app = express();

app.listen(3000, () => {
    console.log('listening on port 3000.');
})

app.get('/', (req, res, next) => {
    res.json('alive!');
})

app.get('/test', (req, res, next) => {
    res.json('hello!');
})