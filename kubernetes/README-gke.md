# GKE


## setup

TBD

## set kubectl

```
gcloud container clusters get-credentials cluster-1 --zone asia-northeast1-a --project ${PROJECT_ID}
```

## ingress

static IPに紐付ける

```
gcloud compute addresses create test-ip --global
```