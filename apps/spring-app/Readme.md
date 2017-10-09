
# Spring-boot-web & kotlin

## about

- spring-boot-starter-web: 2.0-M4
- Gradle: 4.2
- Kotlin: 1.1.X

## dev run

```
./gradlew bootRun
```

with hot reload

```
./gradlew --continuous compileJava
```

it can work with spring-boot-dev-tools at bootRun(not in executable jar)

## test

```
./gradlew test
```

## build & run

```
./gradlew bootDistZip
cd build/distributions
unzip SpringBoot-Kotlin-boot-0.0.1-SNAPSHOT
cd SpringBoot-Kotlin-boot-0.0.1-SNAPSHOT
./bin/SpringBoot-Kotlin
```

## Licence

MIT