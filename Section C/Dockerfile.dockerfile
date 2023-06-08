# Use a Java runtime as the base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Java class files and the isbnJava.java source code to the container
COPY isbnJava.java /app/

# Compile the Java source code
RUN javac isbnJava.java

# Set the entry point to run the application
CMD ["java", "isbnJava"]

