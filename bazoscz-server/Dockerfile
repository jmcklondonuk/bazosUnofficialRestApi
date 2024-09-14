FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY build/libs/bazosczserver-v0.9.2.jar /app/bazosczserver.jar
RUN mkdir -p /app/cookies
VOLUME ["/app/cookies"]
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/bazosczserver.jar"]
