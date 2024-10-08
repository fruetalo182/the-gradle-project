

<div align="left">

![Hoppus](src/main/resources/travis.png)

<h1>Travis Gradle</h1>

  [![CI Status](https://img.shields.io/github/actions/workflow/status/fruetalo182/travis-gradle/ci.yaml?branch=main&label=CI%20Status)](https://github.com/fruetalo182/travis-gradle/actions/workflows/ci.yaml)
  
![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=spring&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=flat&logo=junit&logoColor=white)
![REST API](https://img.shields.io/badge/REST%20API-00BFFF?style=flat&logo=api&logoColor=white)

</div>

```Travis Gradle``` is one of the three members deployed on ```cluster182```

## 📋 Requirements

- **Java version:** 11 or higher
- **Maven version:** 3.6 or higher


## ⚙️ Local setup

1. Clone this repository:
    ```bash
    git clone https://github.com/fruetalo182/travis-gradle.git
    cd travis-gradle
    ```
2. Test the application:
    ```bash
    ./gradlew test
    ```
3. Run the application:
    ```bash
    ./gradlew bootRun
    ```
4. Open your browser at [http://localhost:8080](http://localhost:8080) to access.


## 🐳 Docker setup

To run the Travis Gradle application using Docker, follow these steps:

1. **Pull the Docker image**:

    ```bash
    docker pull ghcr.io/fruetalo182/travis-gradle:latest
    ```

2. **Run the Docker container**:

    ```bash
    docker run -p 8080:8080 travis-gradle
    ```

3. **Access the application** at [http://localhost:8080](http://localhost:8080).

## 📸 Screenshots
![Hoppus](src/main/resources/travis_real.png)

