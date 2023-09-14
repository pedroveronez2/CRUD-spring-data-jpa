# CRUD Simples com Spring Boot, Spring Data JPA e MySQL

Este é um projeto de exemplo de um aplicativo Spring Boot que demonstra operações CRUD (Create, Read, Update, Delete) em um banco de dados MySQL usando Spring Data JPA.

## Pré-requisitos

Antes de executar o aplicativo, verifique se você tem o seguinte configurado no seu ambiente:

- Java JDK 8 ou superior
- Maven
- Um servidor MySQL em execução
- IDE de sua escolha (por exemplo, Eclipse, IntelliJ IDEA) ou use a linha de comando

## Configuração do Banco de Dados

1. Crie um banco de dados MySQL chamado `crud_example`.
2. Crie uma tabela `pessoa` com as colunas `id` (chave primária), `nome` e `email`.

```sql
CREATE DATABASE crud_example;

USE crud_example;            

CREATE TABLE pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255)
);
```
## Executando o Aplicativo

- Clone este repositório:
    ```
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
- Navegue até o diretório do projeto:
    ```
    cd seu-repositorio
    ```
- Execute o aplicativo Spring Boot:
    ```
    mvn spring-boot:run
    ```
O aplicativo será iniciado na porta padrão 8080.

## Endpoints da API

Listar todas as pessoas:

Método: GET
URL: http://localhost:8080/pessoas
Obter uma pessoa por ID:

Método: GET
URL: http://localhost:8080/pessoas/{id}
Adicionar uma pessoa:

Método: POST
URL: http://localhost:8080/pessoas
Corpo da solicitação: JSON com dados da pessoa
Atualizar uma pessoa por ID:

Método: PUT
URL: http://localhost:8080/pessoas/{id}
Corpo da solicitação: JSON com dados atualizados da pessoa
Excluir uma pessoa por ID:

Método: DELETE
URL: http://localhost:8080/pessoas/{id}
 

