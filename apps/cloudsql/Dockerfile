FROM ubuntu:16.04

RUN apt-get update

RUN apt-get install -y net-tools curl wget

# java8
RUN wget https://dl.google.com/cloudsql/cloud_sql_proxy.linux.amd64
RUN mv cloud_sql_proxy.linux.amd64 cloud_sql_proxy
RUN chmod +x cloud_sql_proxy

ADD sql-user_service-account.json /tmp/
ENV GOOGLE_APPLICATION_CREDENTIALS="/tmp/sql-user_service-account.json"
CMD ./cloud_sql_proxy -instances=$CLOUD_SQL_INSTANCE=tcp:3306
