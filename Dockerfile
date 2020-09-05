FROM adoptopenjdk/openjdk8

MAINTAINER Neha Gupta <gpt.neha10@gmail.com>

COPY /target/JavaPractice-1.0-SNAPSHOT.jar /deployments/

EXPOSE 8080

CMD ["echo","Hello World..this is my first docker image"]
CMD java ${JAVA_OPTS} -jar /deployments/JavaPractice-1.0-SNAPSHOT.jar