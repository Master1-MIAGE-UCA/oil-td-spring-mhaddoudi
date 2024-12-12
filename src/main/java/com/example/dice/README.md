Application de Lancés de dés

Description

Cette application simule des lancés de dés et gére un historique des résultats en base de données. Elle fournit des endpoints REST pour lancer un dé unique, plusieurs dés, et consulter l'historique des lancés. Le projet est développé avec Spring Boot et utilise JPA pour l'interaction avec la base de données.

Fonctionnalités

Lancer un dé unique.

Lancer plusieurs dés (spécifiez le nombre de dés).

Consulter l'historique des lancés, incluant le nombre de dés, les résultats et un horodatage.

Technologies utilisées

Java 17

Spring Boot

Spring Web

Spring Data JPA

Base de données H2 (ou une autre base relationnelle)

Gradle pour la gestion des dépendances

Démarrage

1. Cloner le dépôt

git clone https://github.com/Master1-MIAGE-UCA/oil-td-spring-mhaddoudi.git
cd dice


Configuration par défaut dans src/main/resources/application.properties :

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true

3. Construire et exécuter l'application

mvn clean install
mvn spring-boot:run

4. Accéder à l'application

L'application sera accessible à http://localhost:8081.

Description : Lance un dé et retourne le résultat.

J'ai ajouté la dépendance dans build.gradle

implementation 'org.springdoc:springdoc-openapi-ui:1.6.15'

ensuite j'ai exécuter cette commande pour que Gradle télécharge les dépendances nécessaires:

./gradlew build

J'ai ajouté la dépendance de Lombok avec cette commande :

compileOnly 'org.projectlombok:lombok:1.18.24'
annotationProcessor 'org.projectlombok:lombok:1.18.24'

J'ai activé l'option Enable annotation processing pour simplifiez les classes en utilisant les annotations Lombok :

@Getter, @Setter, @AllArgsConstructor, @NoArgsConstructor, etc.