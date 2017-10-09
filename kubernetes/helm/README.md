# helm

## initialize

helm init

(clientとTillerがインストールされる)

## create

```
helm create mychart
```

## install

```
helm install -f local-values.yaml ./spring-app-chart
```

## upgrade

```
helm upgrade ~~~ -f local-values.yaml ./spring-app-chart --install
```

## delete 

```
helm delete fashionable-bumblebee
```

## dry-run

```
helm upgrade ~~~ -f stg-values.yaml ./spring-app-chart --install --dry-run --debug
```