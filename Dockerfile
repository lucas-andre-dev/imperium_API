# Etapa 1: build
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copia somente o pom.xml primeiro
COPY imperium/pom.xml .

# Baixa dependências
RUN mvn dependency:go-offline

# Copia o restante do código
COPY imperium .

# Build do projeto
RUN mvn clean package -DskipTests

# Etapa 2: imagem final
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copia o JAR gerado
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
