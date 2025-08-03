# GovApp - Application Gouvernementale

## Description
GovApp est une application gouvernementale développée avec Spring Boot 3.1.12 et Java 17, structurée en architecture multimodule pour une meilleure organisation et maintenabilité du code.

## Architecture Multimodule

Le projet est organisé en 4 modules principaux :

### 📦 govapp-common
- **Description** : Module contenant les utilitaires et classes partagées
- **Contenu** : Classes utilitaires, constantes, helpers
- **Exemple** : `DateUtils` pour la gestion des dates

### 🏗️ govapp-core
- **Description** : Module core contenant la logique métier
- **Contenu** : Entités JPA, repositories, services, configuration
- **Exemple** : `User`, `UserService`, `UserRepository`, `SecurityConfig`

### 🌐 govapp-api
- **Description** : Module API REST
- **Contenu** : Contrôleurs REST, DTOs, documentation Swagger
- **Exemple** : `UserController` avec endpoints CRUD

### 🖥️ govapp-web
- **Description** : Module web principal (point d'entrée)
- **Contenu** : Application principale, configuration web
- **Exemple** : `GovAppApplication` (classe main)

## Technologies Utilisées

- **Java** : 17
- **Spring Boot** : 3.1.12
- **Spring Security** : Authentification et autorisation
- **Spring Data JPA** : Persistance des données
- **PostgreSQL** : Base de données relationnelle
- **Maven** : Gestionnaire de dépendances
- **Swagger/OpenAPI** : Documentation API
- **Spring Boot Actuator** : Monitoring

## Prérequis

- Java 17 ou supérieur
- Maven 3.6 ou supérieur

## Installation et Démarrage

### 1. Cloner le projet
```bash
git clone <repository-url>
cd GovApp
```

### 2. Compiler le projet
```bash
mvn clean compile
```

### 3. Exécuter les tests
```bash
mvn test
```

### 4. Démarrer l'application
```bash
mvn spring-boot:run -pl govapp-web
```

Ou depuis le module web :
```bash
cd govapp-web
mvn spring-boot:run
```

## Accès à l'Application

- **Application** : http://localhost:8080/govapp
- **Base de données** : PostgreSQL sur localhost:5432
  - Base : `govapp_db`
  - Utilisateur : `govapp_user`
  - Mot de passe : `GovApp`
- **Swagger UI** : http://localhost:8080/govapp/swagger-ui.html
- **API Docs** : http://localhost:8080/govapp/api-docs
- **Actuator Health** : http://localhost:8080/govapp/actuator/health

## Authentification

### Utilisateur par défaut
- **Nom d'utilisateur** : `admin`
- **Mot de passe** : `admin123`
- **Rôle** : `ADMIN`

## API Endpoints

### Utilisateurs (`/api/users`)
- `GET /api/users` - Récupérer tous les utilisateurs
- `GET /api/users/{id}` - Récupérer un utilisateur par ID
- `POST /api/users` - Créer un nouvel utilisateur
- `PUT /api/users/{id}` - Mettre à jour un utilisateur
- `DELETE /api/users/{id}` - Supprimer un utilisateur
- `GET /api/users/active` - Récupérer les utilisateurs actifs
- `GET /api/users/role/{role}` - Récupérer les utilisateurs par rôle
- `GET /api/users/search?q={term}` - Rechercher des utilisateurs
- `PATCH /api/users/{id}/activate` - Activer un utilisateur
- `PATCH /api/users/{id}/deactivate` - Désactiver un utilisateur

## Structure des Packages

```
com.govapp/
├── common/
│   └── util/           # Utilitaires partagés
├── core/
│   ├── entity/         # Entités JPA
│   ├── repository/     # Repositories Spring Data
│   ├── service/        # Services métier
│   └── config/         # Configuration Spring
├── api/
│   ├── controller/     # Contrôleurs REST
│   ├── dto/           # Data Transfer Objects
│   └── config/        # Configuration API
└── web/               # Application principale
```

## Configuration

La configuration principale se trouve dans `govapp-web/src/main/resources/application.yml`.

### Profils disponibles
- **default** : Configuration de développement avec H2

## Logs

Les logs sont configurés pour :
- **Console** : Niveau DEBUG pour com.govapp
- **Fichier** : `logs/govapp.log`

## Développement

### Ajouter un nouveau module
1. Créer le répertoire du module
2. Ajouter le `pom.xml` avec le parent `govapp-parent`
3. Ajouter le module dans le `pom.xml` parent
4. Créer la structure des packages

### Bonnes pratiques
- Utiliser les annotations de validation Jakarta
- Documenter les APIs avec Swagger
- Respecter l'architecture en couches
- Écrire des tests unitaires

## Contribution

1. Fork le projet
2. Créer une branche feature (`git checkout -b feature/AmazingFeature`)
3. Commit les changements (`git commit -m 'Add some AmazingFeature'`)
4. Push vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrir une Pull Request

## Licence

Ce projet est sous licence [MIT](LICENSE).