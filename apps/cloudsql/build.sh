#!/usr/bin/env bash

VERSION=0.1

docker build --tag uryyyyyyy/cloud-sql:${VERSION} ./
echo "build docker image uryyyyyyy/cloud-sql:${VERSION}"
