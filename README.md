# Projeto Intermediario BackEnd - API de Placar de Jogos

---

## Descrição do Projeto

A **API de Placar de Jogos** é um projeto que consome dados da API externa SofaScore para exibir informações sobre placares de jogos de futebol. O objetivo do projeto é fornecer endpoints que permitam obter resultados em tempo real de partidas, além de listar categorias e informações relacionadas ao futebol brasileiro, como campeonatos e eventos.

---

## Requisitos

Antes de executar o projeto, certifique-se de que você possui os seguintes softwares instalados e configurados:

### Programas Necessários
- **Java JDK 17**: Para compilar e executar o projeto.
- **Apache Maven 3.8+**: Para gerenciamento de dependências e build do projeto.
- **Docker**: Para rodar a aplicação em containers, se necessário.
- **Insomnia ou Postman**: Para realizar testes de requisições HTTP.
- **RapidAPI Account**: Para obter a chave de API necessária para consumir os dados da SofaScore.

### Dependências Necessárias
- **Spring Boot 3.0.0**: Framework principal para desenvolvimento do serviço web.
- **Spring Web**: Para a criação dos endpoints REST.
- **Jackson**: Para manipulação de dados JSON.
- **Apache HttpClient**: Para fazer requisições HTTP para a API SofaScore.
- **Lombok**: Facilita a criação de getters, setters, e construtores.
- **JUnit e Mockito**: Para testes unitários (opcional).

### Configurações API (SofaScore)
- **X-RapidAPI-Key**: Chave de API fornecida pela plataforma RapidAPI.
- **X-RapidAPI-Host**: `sofascore.p.rapidapi.com`.

---

## Passo a Passo para Execução do Projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/JogadorZero/projeto-intermediario.git
````

### 2. Configurar a chave da API
Verifique a chave da API no arquivo `PlacarService.java` localizado em `src/main/java/com/exemplo/placar_jogos/service`.

#### Localização (linha 15)
```java
private static final String API_KEY = "660cb15b8emsh2dc778c7a8ebab1p13a0e0jsna2d62aab87c6";
```

### 3. Build e execução do projeto

#### Build usando Maven
```bash
mvn clean package
```

#### Executar via Docker
```bash
docker build -t placar-jogos .
```
```bash
docker-compose up
```

### 4. Testar os endpoints
Utilize ferramentas como Insomnia ou Postman para testar as requisições à API.

---

## Endpoints

### 1. `placar/jogos`
Retorna tofos os jogos sendo transmitidos em tempo real ao redor do mundo.
- **Método:** **GET**
- **URL:** `http://localhost:8080/placar/jogos`

### 2. `placar/sobre`
Retorna as informações sobre o projeto.
- **Método:** **GET**
- **URL:** `http://localhost:8080/placar/sobre`

---

## Pesquisando campeonatos
É possível pesquisar um campeonato específico pelo seu nome.
### 1. `placar/jogos?campeonato=NOMEDOCAMPEONATO`
Retorna todos os jogos sendo transmitidos em tempo real, de acordo com o campeonato pesquisado.
- **Método:** **GET**
- **Exemplo**
  - **URL:** `http://localhost:8080/placar/jogos?campeonato=brasileirao`

---

Seguindo as instruções deste arquivo será possível executar o projeto eu seu computador e fazer as requisições desejadas.