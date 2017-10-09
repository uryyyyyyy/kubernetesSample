#!/usr/bin/env bash

cd `pwd`/`git rev-parse --show-cdup`
cd apps/cloud-sql

VERSION=0.2

cp sql-user_service-account.json ./docker/
docker build --tag uryyyyyyy/cloud-sql:${VERSION} ./docker/
echo "build docker image uryyyyyyy/cloud-sql:${VERSION}"
rm ./docker/sql-user_service-account.json