FROM openjdk:17

COPY goc-0.0.1-SNAPSHOT.jar goc.jar

ENTRYPOINT ["java","-jar","/goc.jar"]