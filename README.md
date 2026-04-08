# Mini-Projeto-1-CRUD

Este projeto é um CRUD simples desenvolvido em Java utilizando o framework Spring Boot. Trata-se do primeiro de uma série de pequenos projetos criados com o objetivo de exercitar, praticar e evoluir no desenvolvimento backend com Java, aplicando boas práticas e a estrutura padrão de uma aplicação RESTful.

## Descrição

A aplicação implementa operações de Create, Read, Update e Delete (CRUD) sobre a entidade `User`. É composta pelas camadas convencionais de uma aplicação Spring Boot: Controller, Service e Model.

## Funcionalidades

- API REST para gerenciamento da entidade User
- Operações CRUD completas: criar, listar e remover usuários
- Estrutura em múltiplas camadas: Controller, Service e Model

## Entidade

A entidade principal deste projeto é o usuário (User), definida em:
[src/main/java/com/example/mini_crud/modal/User.java](https://github.com/leonel-the13/Mini-Projeto-1-CRUD/blob/main/src/main/java/com/example/mini_crud/modal/User.java)

Possui a seguinte estrutura:
- id: identificador único do usuário
- nome: nome do usuário
- emai;: email do usuário

## Camadas da aplicação

- `Controller`: expõe a API e trata as requisições HTTP ([UserController.java](https://github.com/leonel-the13/Mini-Projeto-1-CRUD/blob/main/src/main/java/com/example/mini_crud/controller/UserController.java))
- `Service`: lida com a lógica de negócio
- `Model`: define a entidade/objeto que será persistido (User)

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/leonel-the13/Mini-Projeto-1-CRUD.git
   cd Mini-Projeto-1-CRUD
   ```
2. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```
   Ou, se preferir, através do Gradle:
   ```bash
   ./gradlew bootRun
   ```
   O projeto, por padrão, utiliza o banco H2 em memória e está pronto para rodar sem configuração adicional.

3. Acesse a aplicação em:
   ```
   http://localhost:8080
   ```
   Os endpoints podem ser consultados no código-fonte do controller.

## Estrutura do Projeto

```
src/
 └─ main/
     ├─ java/
     │   └─ com/
     │       └─ example/
     │           └─ mini_crud/
     │               ├─ controller/
     │               ├─ modal/
     │               └─ service/
     └─ resources/
         └─ application.properties
```

- **controller/**: lógica dos endpoints REST
- **modal/**: definição da entidade de dados (User)
- **service/**: regras de negócio

---

Este repositório faz parte de uma sequência de pequenos projetos Java voltados à prática de desenvolvimento backend.
