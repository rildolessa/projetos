const fs = require('fs') //importação do fs - responsável por trabalhar com o sistema de arquivos
const { join } = require('path')

const filePath = join(__dirname, 'user.json') //Caminho do diretório e nome do arquivo que terá os usuários

//método para buscasr usuário. Usa o fs para verificar se o arquivo existe, se sim ler o mesmo se não retorna um objeto vazia
const getUsers = () => {
    const data = fs.existsSync(filePath) ? fs.readFileSync(filePath) : []
    try {
        return JSON.parse(data) //Se tudo der ok, transforma o data em json
    } catch (error) {
        []
    }
}

//Método salvar. Escreve no arquivo do path acima, transforma o objeto que estamos recebendo no parâmentro em json e tabula \t. users "dados do usuário"
const saveUser = (users) => fs.writeFileSync(filePath, JSON.stringify(users, null, '\t'))

//Função rout user - criação da rota
const userRoute = (app) => {
    app.route('/users/:id?')
        .get((req, res) => {
            const users = getUsers()
            
            res.send({ users })

        })
}

module.exports = userRoute // exporta esse módulo para ser acessado externamento