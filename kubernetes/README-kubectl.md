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

## deployment

```
kubectl create -f ~~.yaml
kubectl apply -f ~~.yaml
kubectl rollout history deployment ~~~
kubectl rollout history deployment ~~~ --revision=2
kubectl rollout undo deployment ~~~ --to-revision=1
```

## command

```
kubectl create -f ~~.yaml
kubectl delete ~~~ ~~~
kubectl apply -f ~~.yaml
```

## show status

```
kubectl get pods
```

## pod access

```
kubectl port-forward sample-deployment-217828376-b45vs 8080:8080
```