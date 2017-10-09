#!/usr/bin/env bash

GIT_HASH=`git rev-parse --short HEAD`
echo "git hash ${GIT_HASH}"

cp ./build/distributions/spring-boot.zip ./docker/
unzip ./docker/spring-boot.zip -d ./docker/
rm -rf ./docker/spring-boot.zip

docker build --tag uryyyyyyy/spring-boot:${GIT_HASH} ./docker/

# check
docker run --rm uryyyyyyy/spring-boot:${GIT_HASH} java -version

echo "build docker image uryyyyyyy/spring-boot:${GIT_HASH}"
rm -rf ./docker/spring-boot