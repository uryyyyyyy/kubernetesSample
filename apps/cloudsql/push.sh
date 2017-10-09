#!/usr/bin/env bash

VERSION=0.1
PROJECT_ID=teak-trainer-806


docker tag uryyyyyyy/cloud-sql:${VERSION} gcr.io/teak-trainer-806/cloud-sql:${VERSION}
gcloud docker -- push gcr.io/${PROJECT_ID}/cloud-sql:${VERSION}
