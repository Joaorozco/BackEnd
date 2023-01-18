FROM amazoncorretto: 17-alpine-jdk
MAINTAINER Joaquin Orozco
COPY target/Demo-0.0.1-SNAPSHOT.jar portfolio-app.jar
ENTRYPOINT ["java", "-jar", "/portfolio-app.jar"]