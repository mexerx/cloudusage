# Verwende ein Basis-Image mit OpenJDK 17
FROM openjdk:17-jdk-slim

# Setze das Arbeitsverzeichnis innerhalb des Containers
WORKDIR /app

# Kopiere das JAR-File aus dem Build-Ordner in das Image
COPY target/cloud-usage.jar cloud-usage.jar

# Exponiere den Port 8080, auf dem die Anwendung läuft
EXPOSE 8080

# Der Befehl zum Starten der Anwendung
ENTRYPOINT ["java", "-jar", "cloud-usage.jar"]
