# comparer

A small Maven-based Java project configured with TestNG. This repository demonstrates a simple project structure and CI-friendly build using Maven.

## Prerequisites
- Java Development Kit (JDK) 8 or newer (11+ recommended)
- Apache Maven 3.6+ (3.8+ recommended)

Check your versions:
```
java -version
mvn -version
```

## Project layout
```
.
├── pom.xml                 # Maven build descriptor (artifactId: comparer)
├── src
│   ├── main/java           # Application sources
│   └── test                # Tests (TestNG)
├── version.txt             # Project version marker
└── (optional) lib/
    └── shared-1.0-SNAPSHOT.jar  # Required by system-scoped dependency in pom.xml
```

Note on the `shared` dependency:
- The `pom.xml` declares a system-scoped dependency pointing to `lib/shared-1.0-SNAPSHOT.jar`.
- If you don’t have this jar, create a `lib/` folder at the project root and place the jar there, or remove/replace the system-scoped dependency as appropriate for your environment.

## Build
- Compile and package the project:
```
mvn -q -DskipTests package
```
- Compile, run tests, and package:
```
mvn -q clean verify
```

The default Surefire config in `pom.xml` is set to ignore test failures (`testFailureIgnore=true`). Adjust it if you want builds to fail on test failures.

## Running tests
```
mvn -q test
```

## Useful Maven commands
- Clean previous outputs: `mvn clean`
- Run tests only: `mvn test`
- Package jar: `mvn package`
- Full check (clean + tests + package): `mvn verify`

## Troubleshooting
- Missing shared jar: Ensure `lib/shared-1.0-SNAPSHOT.jar` exists or update `pom.xml` to use a repository-managed dependency instead of `system` scope.
- Java/Maven not found: Verify your PATH and JAVA_HOME settings.
- Permission issues on Unix/macOS: You may need to make scripts executable, e.g., `chmod +x update.sh`.

## License
This repository may contain example code for demonstrations. Provide licensing information here if applicable.