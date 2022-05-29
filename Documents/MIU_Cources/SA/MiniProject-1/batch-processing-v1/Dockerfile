FROM openjdk:11
EXPOSE 8080
ADD target/springbatch-docker.jar springbatch-docker.jar
ENTRYPOINT ["java", "-jar", "springbatch-docker.jar"]