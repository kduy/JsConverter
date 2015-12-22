How to run
==========
Build and pack

```bash
mvn clean
mvn package
```

Run

```bash
java -jar <jar path> <input> <output> <PropertyFilePath>
```

Example
```bash
java -jar target/JsonConverter-1.0-SNAPSHOT-jar-with-dependencies.jar input.md output.md ./config.properties
```