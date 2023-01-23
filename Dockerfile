FROM amazoncorretto:17
MAINTAINER Joaquin Orozco
COPY target/Demo-0.0.1-SNAPSHOT.jar Demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Demo-0.0.1-SNAPSHOT.jar"]