FROM openjdk:17
EXPOSE 8080

# Copy jar and rename to a fixed name inside container
ADD target/PassportServiceToPerson-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
