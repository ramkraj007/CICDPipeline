FROM maven:3.9.0 AS build
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:resolve
COPY /app 4
RUN mvn clean
RUN mvn package -DskipTests -X
FROM openjdk
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8088
CMD ("java", "-jar", "app.jar"]
