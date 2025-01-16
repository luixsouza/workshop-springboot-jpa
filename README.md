# E-Commerce System API

Este repositório contém o desenvolvimento de uma API para gerenciamento de um sistema de e-commerce, incluindo funcionalidades de cadastro, atualização e manipulação de usuários, pedidos, produtos e associações entre eles. O projeto foi desenvolvido em **Java** utilizando **Spring Boot**, com integração de **JPA** e um banco de dados em memória **H2**.

## Funcionalidades

### Usuários
- **User Entity and Resource**: Criação da entidade `User` e exposição dos endpoints para CRUD.
- **User insert - POST**: Adição de usuários via requisição POST.
- **User update**: Atualização de dados de usuários.
- **User delete**: Remoção de usuários.

### Pedidos
- **Order Entity**: Implementação da entidade `Order` com suporte a timestamps usando o padrão ISO 8601.
- **OrderStatus Enum**: Enumeração para representar o status dos pedidos (Pendente, Processado, etc.).
- **OrderItem**: Relação many-to-many com atributos extras para associar itens ao pedido.
- **Subtotal & Total methods**: Métodos para cálculo de subtotal e total dos pedidos.

### Produtos e Categorias
- **Product**: Implementação da entidade `Product`.
- **Category**: Criação de categorias para organização dos produtos.
- **Product-OrderItem association**: Associação one-to-many entre produtos e itens do pedido.

### Associações
- **Many-to-many association with JoinTable**: Configuração de tabelas intermediárias para gerenciar associações entre entidades.
- **OrderItem, many-to-many association with extra attributes**: Configuração adicional de atributos extras em associações many-to-many.

### Pagamento
- **Payment and one-to-one association**: Implementação do pagamento com associação one-to-one ao pedido.

### Exceções
- **Exception handling - findById**: Tratamento de exceções ao buscar entidades pelo ID.
- **Exception handling - UPDATE**: Gerenciamento de exceções durante operações de atualização.
- **Exception handling - DELETE**: Tratamento de exceções durante exclusões.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **JPA / Hibernate**
- **H2 Database**
- **RESTful API**
- **Maven**
- **Postman**

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/luixsouza/workshop-springboot-jpa.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd ecommerce-system-api
   ```
3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
4. Teste a API com o Postman.

## Estrutura de Entidades
- **User**: Representa os usuários do sistema.
- **Order**: Representa os pedidos realizados.
- **Product**: Produtos disponíveis no sistema.
- **Category**: Categorias para organização de produtos.
- **Payment**: Informações sobre os pagamentos realizados.