FROM openjdk:11
EXPOSE 8010
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} randomquotesjava.jar
ENTRYPOINT ["java","-jar","randomquotesjava.jar"]