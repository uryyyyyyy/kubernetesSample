#!/usr/bin/env bash

cd `pwd`/`git rev-parse --show-cdup`
cd apps/cloud-sql

VERSION=0.1

docker build --tag uryyyyyyy/cloud-sql:${VERSION} ./
echo "build docker image uryyyyyyy/cloud-sql:${VERSION}"