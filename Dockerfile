FROM openjdk:13

LABEL maintainer "Thomas Borel tomborel5@gmail.com"

COPY ./build/libs/dw-hello-world-1.0-SNAPSHOT-all.jar application.jar

EXPOSE 80 81
ENTRYPOINT ["java", "-jar", "/application.jar", "server", "/home/config.yaml"]
