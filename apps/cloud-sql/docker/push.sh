#!/usr/bin/env bash

cd `pwd`/`git rev-parse --show-cdup`

PROJECT_ID=${GCP_PROJECT_ID}
VERSION=0.2

docker tag uryyyyyyy/cloud-sql:${VERSION} gcr.io/${PROJECT_ID}/cloud-sql:${VERSION}
gcloud docker -- push gcr.io/${PROJECT_ID}/cloud-sql:${VERSION}