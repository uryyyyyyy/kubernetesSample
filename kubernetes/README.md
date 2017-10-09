# kubectl

## install

```
gcloud components install kubectl
```

## version

```
kubectl version
```

## context

```
#check
kubectl config current-context

# contexts
kubectl config view

# switch
kubectl config use-context minikube
```

## dashboard

```
kubectl proxy
# then open http://localhost:8001/api/
```

## command

```
kubectl create -f ~~.yaml
kubectl delete ~~~ ~~~
```

## show status

```
kubectl get pods
```

## pod access

```
kubectl port-forward sample-deployment-217828376-b45vs 8080:8080
```