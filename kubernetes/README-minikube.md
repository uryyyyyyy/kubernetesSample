# minikube


## setup

install minikube

https://github.com/kubernetes/minikube

## start

```
minikube start
```

## update docker env

```
eval $(minikube docker-env)
```

## access to minikube

```
minikube ssh
minikube ip
curl $(minikube ip):${ephemeral port}
```


## memo

nodePortは指定しなくていいかも
→ephemeralなものが割り当てられるため、割り当てられてから確認すれば十分そう。