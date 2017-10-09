#!/usr/bin/env bash

command=$1
url="${DB_DEFAULT_URL:-jdbc:mysql://localhost:3306/s_k_sample?characterEncoding=utf8&useSSL=false}"
user="${DB_DEFAULT_USERNAME:-s_k_user}"
password="${DB_DEFAULT_PASSWORD:-s_k_user}"

./flyway -user=${user} -password=${password} -driver=com.mysql.cj.jdbc.Driver -url=${url} ${command}
