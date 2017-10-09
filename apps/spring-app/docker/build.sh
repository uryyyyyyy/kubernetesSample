#!/usr/bin/env bash

cd `pwd`/`git rev-parse --show-cdup`
cd apps/spring-app

GIT_HASH=`git rev-parse --short HEAD`
echo "git hash ${GIT_HASH}"

echo "package app-jar ${GIT_HASH}"
./gradlew clean && ./gradlew bootDistZip

echo "build docker image uryyyyyyy/spring-app-boot:${GIT_HASH}"
unzip ./build/distributions/spring-app-boot-0.1.0.zip -d ./build/distributions/
cp -r ./build/distributions/spring-app-boot-0.1.0 ./docker/

docker build --tag uryyyyyyy/spring-app-boot:${GIT_HASH} ./docker/

# check
docker run --rm uryyyyyyy/spring-app-boot:${GIT_HASH} java -version

echo "build docker image uryyyyyyy/spring-app-boot:${GIT_HASH}"
rm -rf ./docker/spring-app-boot-0.1.0