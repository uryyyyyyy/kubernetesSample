
# Spring-boot & kotlin

## about

- spring-boot: 1.5
- Spring: 4.X
- Gradle: 4.X

## setup

set up database.

```
cd flyway
## execute command/initialize.sql to your DB

./commands/flyway.sh migrate
./commands/flyway-test.sh migrate
```

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
./gradlew distZip
```

check `./build/distributions/SpringBoot-Kotlin.zip`

## deploy & run

```
unzip ./build/distributions/SpringBoot-Kotlin.zip -d ./build/distributions/
./build/distributions/SpringBoot-Kotlin/bin/SpringBoot-Kotlin
```

## Licence

MIT