FROM openjdk:14-alpine
COPY build/libs/micronaut-tomcat-*-all.jar micronaut-tomcat.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-tomcat.jar"]