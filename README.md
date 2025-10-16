# tc-demo/comparer

A small Maven-based Java project used for demonstration and CI exercises. The module artifact is `tc-demo:comparer:1.0-SNAPSHOT` and it depends on a prebuilt helper JAR called `tc-demo:shared:1.0-SNAPSHOT`.

## Repo layout
- `pom.xml` — main Maven project descriptor for `comparer`.
- `install_pom.xml` — a helper POM you can use to install the `shared` JAR into your local Maven repository (optional).
- `src/main/java` — production sources.
- `src/test` — tests (uses TestNG 6.8.1).
- `version.txt`, `update.sh` — auxiliary files used by CI scripts.

## Prerequisites
- Java 8 or newer (JDK).
- Maven 3.6+.

## Building and testing
Most scenarios work out of the box using the system-scoped `shared` JAR referenced at `lib/shared-1.0-SNAPSHOT.jar`.

- Run tests:
  ```bash
  mvn -q -e -DskipTests=false test
  ```
- Package the project:
  ```bash
  mvn -q -e -DskipTests package
  ```

## Optional: install the `shared` dependency into your local repo
If you prefer resolving `tc-demo:shared:1.0-SNAPSHOT` from the local Maven repository instead of the system path, you can install it using the provided helper POM.

1. Ensure the file `tmp/shared-1.0-SNAPSHOT.jar` exists. If the JAR is available under `lib/shared-1.0-SNAPSHOT.jar`, copy it:
   ```bash
   mkdir -p tmp
   cp lib/shared-1.0-SNAPSHOT.jar tmp/
   ```
2. Install to your local repo:
   ```bash
   mvn -f install_pom.xml install
   ```

After that, you may update `pom.xml` to use a normal dependency (without `<scope>system</scope>`) if desired. The current configuration continues to work as-is.

## Notes
- Tests are configured to continue even on failures (`testFailureIgnore=true`) via the Maven Surefire Plugin.
- This repository is intended for CI demos; adjust settings as needed for production use.
