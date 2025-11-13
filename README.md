# [cite_start]gs-3-wellbeing-monitor - Global Solution Microservices and Web Engineering 3SIR [cite: 3]

## 🧠 Tema

[cite_start]**Ferramentas de monitoramento de bem-estar e saúde mental** [cite: 22]

## 📝 Membros e RMs

* [cite_start]**Membro 1**: Matheus da Silva Cerqueira (RM: 99996) [cite: 100, 101]
* [cite_start]**Membro 2**: Gabriel Fernando Gimenez (RM: 92957) [cite: 100, 101]

## 💡 Resumo da API e Tema

[cite_start]**Descrição do Tema:** Criação de ferramentas para acompanhar o estado emocional e psicológico dos colaboradores. [cite: 102]

[cite_start]**Finalidade da API:** Servir como um microserviço de integração para fornecer metadados do projeto através do endpoint GET /info, utilizando Java + Spring Boot e preparado para implantação em nuvem. [cite: 7, 26, 103]

Última verificação de versão para entrega final.

## [cite_start]⚙️ Execução Local [cite: 104]

1.  **Pré-requisitos**: Java 17+ e Maven.
2.  **Executar**: `./mvnw spring-boot:run`
3.  **Endpoint**: Acesse `http://localhost:8081/info`
4.  [cite_start]**Documentação Swagger**: Acesse `http://localhost:8081/swagger-ui/index.html` [cite: 42, 45]

## 🐳 Docker Hub

* [cite_start]**URL da Imagem**: `https://hub.docker.com/r/mdasilvacerq/gs-3-wellbeing-monitor` [cite: 105]

## [cite_start]🔁 Workflows CI/CD Implementados [cite: 106]

| Workflow | Requisito | Gatilho |
| :--- | :--- | :--- |
| **Versioning (6.1)** | [cite_start]Gerar tags automáticas. [cite: 57] | [cite_start]`push` na branch `main`. [cite: 58] |
| **Continuous Integration (CI) (6.2)** | [cite_start]Executar Build, Testes Unitários e Build Docker. [cite: 65, 66, 67] | [cite_start]`push` nas branches `feature/**`, `develop`, `release`, `hotfix`. [cite: 68, 71, 72] |
| **Continuous Delivery (CD) (6.3)** | [cite_start]Enviar imagem ao Docker Hub. [cite: 78] | [cite_start]`pull_request` mesclado na branch `develop`. [cite: 80] |

PRONTO PARA ENTREGA FINAL.
