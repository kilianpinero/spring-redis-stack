# CRUD with Spring Boot and Redis

### Introduction

Crud application with Spring Boot and Redis. Data is stored in Redis using ReJSON module. This means we can store data
in JSON format and query it using JSON format.

### Database

In order to run this application, you need to have Redis installed. This application has a yaml file with docker info to
build a Redis container.
You can install Redis using Docker:

```shell
docker compose up
```

### Access Data in Redis

To access data using redis CLI:

```shell
 docker exec -it RedisSrping redis-cli
```

Also you can install RedisInsight to access data in Redis.

### Run the application

To run the application, you can use the following command:

```shell
./gradlew bootRun
```

### Access the application

You can access the application using the following endpoints:

GET - Get all countries:

```shell
http://localhost:8080/country
```

GET - Get a country by id:

```shell
http://localhost:8080/country/{id}
```

POST - Create bunch of countries:

```shell
http://localhost:8080/country/all
```

* Example:

```json
  [
  {
    "id": "1",
    "name": "Brazil"
  },
  {
    "id": "2",
    "name": "USA"
  }
  ]
  ```

POST - Create a country:

```shell
http://localhost:8080/country
```

* Example:

```json
  [
  {
    "id": "1",
    "name": "Brazil"
  }
]
  ```

PUT - Update a country:

```shell
http://localhost:8080/country
```

DEL - Delete a country:

```shell
http://localhost:8080/country/{id}
```