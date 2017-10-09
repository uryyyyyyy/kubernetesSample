#!/usr/bin/env bash

cd `pwd`/`git rev-parse --show-cdup`

GIT_HASH=`git rev-parse --short HEAD`
PROJECT_ID=${GCP_PROJECT_ID}

docker tag uryyyyyyy/spring-app-boot:${GIT_HASH} gcr.io/${PROJECT_ID}/spring-app-boot:${GIT_HASH}
gcloud docker -- push gcr.io/${PROJECT_ID}/spring-app-boot:${GIT_HASH}