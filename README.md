

# Secure Spring Boot Microservices Healthcare Platform

---
**Project by:** Ansh Garg  
**Fullstack B3**  
**SAP ID:** 500105940
---

## Overview
This project is a secure healthcare platform built with Spring Boot microservices. It includes:
- **API Gateway** (Spring Cloud Gateway)
- **Auth Server** (OAuth2/JWT)
- **Patient Service**
- **Appointment Service**

All services use HTTPS, mTLS, and Spring Cloud Vault for secret management.

## Architecture & Security
- API Gateway routes requests and validates JWT tokens.
- Auth Server issues JWT tokens and manages authentication/authorization.
- Patient and Appointment services are resource servers protected by JWT and mTLS.
- Secrets (keystore passwords, tokens) are managed via Vault. No secrets are hardcoded.

## Prerequisites
- Docker & Docker Compose installed
- Java 17+ and Maven installed (for building JARs)
- Vault server running and secrets provisioned

## Build & Run
1. **Build all microservices:**
   ```powershell
   cd api-gateway; mvn clean package
   cd ../auth-server; mvn clean package
   cd ../appointment-service; mvn clean package
   cd ../patient-service; mvn clean package
   ```
2. **Start all services with Docker Compose:**
   ```powershell
   docker-compose up --build
   ```
   This will build and run all services. Each service exposes its own port (see `docker-compose.yml`).

## Configuration
- All sensitive data is managed via Vault. Ensure Vault is running and secrets are available before starting the services.
- Each service has its own configuration and keystore for HTTPS/mTLS.

## Notes
- If a port is already in use, stop the conflicting process or change the port in `docker-compose.yml`.
- For troubleshooting, use `docker-compose logs <service>`.

## Project Structure
- `api-gateway/`
- `auth-server/`
- `appointment-service/`
- `patient-service/`
- `docker-compose.yml`

---
This project follows best practices for secure healthcare microservices using Spring Boot, Spring Cloud Gateway, OAuth2/JWT, mTLS, and Vault.
