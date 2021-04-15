#FROM gradle:jdk11 AS builder
#WORKDIR /home/root/build/
#COPY . .
#RUN ./gradlew build

#FROM openjdk:11-jre-slim
#ARG ARG_PROFILE=local
#ENV ENV_PROFILE=$ARG_PROFILE
#ENV ARTIFACT_NAME=demo-kubernetes-spring-db-0.0.1-SNAPSHOT.jar

#WORKDIR /home/root/demo-kubernetes-spring-db/
#COPY --from=builder /home/root/build/build/libs/*.jar /home/root/demo-kubernetes-spring-db/app.jar
#ENTRYPOINT ["java","-Dspring.profiles.active=${ENV_PROFILE}","-jar","app.jar"]

FROM openjdk:11
ARG JAR_FILE=target/*.jar
ARG ARG_PROFILE=local
ENV ENV_PROFILE=$ARG_PROFILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=${ENV_PROFILE}","-jar","app.jar"]

