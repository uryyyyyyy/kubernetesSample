#!/usr/bin/env bash

GIT_HASH=`git rev-parse --short HEAD`
PROJECT_ID=teak-trainer-806


docker tag uryyyyyyy/spring-boot:${GIT_HASH} gcr.io/teak-trainer-806/spring-boot:${GIT_HASH}
gcloud docker -- push gcr.io/${PROJECT_ID}/spring-boot:${GIT_HASH}
