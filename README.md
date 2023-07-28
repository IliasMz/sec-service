# Microservice d'Authentification

Le microservice d'authentification est responsable de la gestion de l'inscription, de la connexion et de l'authentification des utilisateurs dans l'application de gestion des rendez-vous. Il génère des JSON Web Tokens (JWT) pour les utilisateurs, qui sont utilisés pour l'authentification et l'autorisation dans les autres parties de l'application.

## Fonctionnalités

- Inscription des nouveaux utilisateurs avec leurs informations d'identification.
- Connexion des utilisateurs existants en vérifiant leurs informations d'identification.
- Génération de tokens JWT pour les utilisateurs connectés.
- Rafraîchissement des tokens d'accès lorsque nécessaire avec les tokens de rafraîchissement.
- Déconnexion des utilisateurs en invalidant les tokens d'accès.

## Technologies Utilisées

- Java EE (JEE) pour le backend du microservice.
- JSON Web Tokens (JWT) pour la gestion de l'authentification.
- Base de données SQL (ou NoSQL) pour stocker les informations des utilisateurs.
- API REST pour les appels depuis le frontend et les autres microservices.

## Installation et Exécution

1. Assurez-vous que Java (JDK) et un serveur Java EE (comme Apache Tomcat) sont installés sur votre machine.
2. Clonez ce dépôt sur votre machine locale.
3. Configurez la base de données en utilisant les scripts SQL fournis dans le dossier `database`.
4. Ouvrez le projet dans votre IDE Java et configurez le serveur Java EE.
5. Lancez le serveur pour déployer le microservice d'authentification.
6. Le microservice d'authentification sera accessible à l'URL `http://localhost:8080/auth-service`.

## Endpoints API

- `POST /api/register` : Permet aux utilisateurs de s'inscrire en fournissant leurs informations d'identification.
- `POST /api/login` : Permet aux utilisateurs de se connecter en fournissant leur nom d'utilisateur et leur mot de passe.
- `POST /api/logout` : Permet aux utilisateurs connectés de se déconnecter en invalidant leur token d'accès.
- `POST /api/refresh` : Permet de rafraîchir le token d'accès en fournissant un token de rafraîchissement valide.

## Sécurité

Ce microservice met en œuvre des mécanismes de sécurité pour protéger les informations des utilisateurs et éviter les vulnérabilités potentielles, tels que le hachage des mots de passe et la vérification des tokens lors des appels d'API.

## Contributeurs

- [Votre nom](lien-github)
- [Autre contributeur](lien-github-autre-contributeur)

## Licence

Ce microservice est sous licence MIT. Consultez le fichier `LICENSE` pour plus de détails.
