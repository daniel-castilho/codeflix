# Codeflix - Admin de Catálogo de Vídeos

[![Java Version](https://img.shields.io/badge/Java-21-007396?logo=java)](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.5-6DB33F?logo=spring)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?logo=mysql&logoColor=white)](https://www.mysql.com/)

Bem-vindo ao Codeflix, uma aplicação de gerenciamento de catálogo de vídeos desenvolvida com arquitetura limpa (Clean Architecture) e Spring Boot.

## 🚀 Tecnologias

- **Java 21** - Linguagem de programação
- **Spring Boot 3.1.5** - Framework para aplicações Java
- **MySQL 8.0** - Banco de dados relacional
- **Flyway** - Controle de versão de banco de dados
- **Maven** - Gerenciamento de dependências
- **Docker** - Containerização

## 🏗️ Estrutura do Projeto

O projeto está organizado seguindo os princípios da Clean Architecture:

```
codeflix/
├── application/    # Casos de uso e regras de aplicação
├── domain/         # Entidades e regras de negócio
├── infrastructure/ # Implementações concretas, controladores, repositórios
└── docker/         # Configurações do Docker
```

## 🛠️ Pré-requisitos

- Java 21 ou superior
- Maven 3.6+
- Docker e Docker Compose
- MySQL 8.0 (opcional, pode usar o container Docker)

## 🚀 Como Executar

### Usando Docker (Recomendado)

1. Inicie os serviços necessários:
   ```bash
   docker-compose -f docker/docker-compose.yaml up -d
   ```

2. Construa e execute a aplicação:
   ```bash
   mvn clean install
   mvn spring-boot:run -pl infrastructure
   ```

### Configuração Manual

1. Crie um banco de dados MySQL chamado `adm_videos`
2. Configure as credenciais no arquivo `infrastructure/src/main/resources/application.yaml`
3. Execute a aplicação:
   ```bash
   mvn spring-boot:run -pl infrastructure
   ```

A aplicação estará disponível em: http://localhost:8080

## 🔧 Configuração

As principais configurações podem ser ajustadas no arquivo `application.yaml`:

- **Porta do servidor**: 8080
- **Banco de dados**: MySQL em localhost:3306
- **Usuário padrão**: root/123456
- **Flyway**: Ativado para migrações de banco de dados

## 📚 Documentação da API

A documentação da API estará disponível em:
- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI**: http://localhost:8080/v3/api-docs

## 🧪 Testes

Para executar os testes:

```bash
mvn test
```

## 🤝 Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas alterações (`git commit -m 'Add some AmazingFeature'`)
4. Faça o push da branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter mais detalhes.

---

Desenvolvido com ❤️ por [Seu Nome] - [@seuusername]
