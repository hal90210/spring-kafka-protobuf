FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
RUN apk --no-cache add curl
ENTRYPOINT ["java", "-jar","/app.jar"]