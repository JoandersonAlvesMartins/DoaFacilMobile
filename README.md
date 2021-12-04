# Doa Fácil.org - Joanderson

## link diFigma 
#### https://www.figma.com/file/oiRZ0r5VKcYPux7JAh4K0M/Doa-F%C3%A1cil.org?node-id=4%3A2

##  Instruções de testes TDD com Jest TesteDoaFacilJoanderson
#### https://github.com/JoandersonAlvesMartins/TesteDoafacilJoanderson/tree/master

### * npm init -y 
#### -> para iniciar o projeto, Obs: É preciso ter o node.js instalado em seu pc.

### * npm (i ou install) (--save-dev ou -D) node.js
####-> comando para instalar o node, apenas em ambiente de desenvolvimento

### * npm (i ou install) (--save-dev ou -D) jest
####-> comando para instalar o Jest, apenas em ambiente de desenvolvimento

### * No arquivo package.json, na opção "test": "echo \"Error: no test specified\" && exit 1" mudar para "test": "jest"

### * No terminal, para executar o teste, basta digitar npx jest

## Formas de executar  os testes

### * npx jest
#### -> Sempre que você implementar uma nova funcionalidade ao seu teste, terá que executar este código no terminal.

### * npx jest --watchAll
#### -> Automatizando os teste TDD em tempo real com o parâmetro watchAll digitado no terminal.

## Criando as pastas SRC e Test

### * mkdir src 
### * mkdir Teste

## Criando scripts

### * touch RegrasTesteDoaFacil.md
#### -> Regras e instruções dos testes TDD, criados para o projeto DoaFacil.org

### * touch Teste/login.test.js
#### -> Script de teste para login

### * touch src/login.js
#### -> Função que construtora para o login

## Testando as seguintes regras na função de login

### * Se o campo email está vazio null
### * Se o email informado possui @
### * Se o email informado possui .org

### * Se o campo senha está vazio
### * Se a senha informado contem espaço

