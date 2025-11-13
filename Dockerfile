# Estágio de Build (Compilação)
FROM openjdk:17-jdk-slim as build
WORKDIR /app
# Copia arquivos necessários para o Maven
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
# Executa o build (compilação) e pula os testes para agilizar este passo.
RUN ./mvnw clean package -DskipTests

# Estágio de Runtime (Execução)
FROM openjdk:17-jre-slim
WORKDIR /app
# Expõe a porta obrigatória 8081 [cite: 28]
EXPOSE 8081
# Copia o JAR compilado do estágio anterior
COPY --from=build /app/target/*.jar app.jar
# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]