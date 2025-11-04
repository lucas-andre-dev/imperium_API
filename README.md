Imperium API

O Imperium API é o backend do sistema Imperium, desenvolvido em Java com o Spring Boot.
Seu objetivo é fornecer uma API RESTful estável e segura para o gerenciamento de chamados de suporte de TI, controle de usuários, administração de estoque e envio de sugestões de melhoria.

Tecnologias utilizadas

Java 17+

Spring Boot

Maven

MySQL

Spring Data JPA

Spring Web

Funcionalidades principais

Criação e gerenciamento de chamados de suporte de TI.

Cadastro, autenticação e gerenciamento de usuários.

Controle de estoque e recursos de TI.

Envio e administração de sugestões de melhoria.

Integração com o frontend via API REST.

Como executar o projeto localmente
1. Clonar o repositório
git clone https://github.com/lucas-andre-dev/imperium-backend.git

2. Abrir o projeto

Abra o projeto em uma IDE compatível, como IntelliJ IDEA ou VS Code.

3. Criar o banco de dados MySQL
CREATE DATABASE imperium_db;

4. Configurar o arquivo application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/imperium_db
spring.datasource.username=root
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

5. Executar o projeto
mvn spring-boot:run

6. Acessar a API
http://localhost:8080

Estrutura do projeto
src/
 ├── main/
 │    ├── java/
 │    │    └── com.imperium/
 │    │         ├── controller/
 │    │         ├── service/
 │    │         ├── repository/
 │    │         └── model/
 │    └── resources/
 │         ├── application.properties
 │         └── static/
 └── test/

Licença

Este projeto é de uso interno e educativo.
Distribuição ou reprodução não autorizada sem o devido crédito é proibida.
