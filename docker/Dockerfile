FROM openjdk:8-alpine
VOLUME /tmp
ADD target/docker-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 80
ENV SPRING_OPTS="-Dspring.config.location=classpath:application.properties"
ENV JAVA_OPTS="-Xmx128m -Djava.security.egd=file:/dev/./urandom $SPRING_OPTS"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /demo.jar" ]