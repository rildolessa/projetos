const express = require('express') //importação do express pra aplicaão corrente
const app = express() //Aplicação propriamente dita
const port = 3000 //Porta que a aplicação irá usa
const userRoute = require('./routes/userRoutes') //Modularização

userRoute(app)

app.get('/', (req, res) => res.send('Alá mundo no Express')) //Verificar se express tá rodando
app.listen(port, () => console.log('Api rodando na porta 3000')) //Disponibilizar a execução da aplicaçã com callback de log