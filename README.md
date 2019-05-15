
# Database Migration

This project implements database migration on postgres

## Prerequisites

1. Maven 3.5 or newer
2. Java SE 8 or newer
3. Docker 17 or newer to build and run docker images

Verify prerequisites
```
java -version
mvn --version
docker --version
```

## Build and Run

```
mvn package exec:java -Dexec.mainClass=br.com.rodas.r2financas.db.App
```

## Create docker container for postgres

```
docker run -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres
```

## Create docker container for pgadmin

```
docker run -p 80:80 -e "PGADMIN_DEFAULT_EMAIL=user@gmail.com" -e "PGADMIN_DEFAULT_PASSWORD=mysecretpassword" -d dpage/pgadmin4
```
