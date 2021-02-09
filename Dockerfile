FROM java:8

EXPOSE 8080

ADD build/libs/springboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar

ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]