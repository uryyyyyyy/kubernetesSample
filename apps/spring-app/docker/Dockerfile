FROM ubuntu:16.04

# java8
RUN set -x && \
  apt-get update && \
  apt-get install -y software-properties-common && \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update

RUN set -x && \
  echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | debconf-set-selections && \
  echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 seen true" | debconf-set-selections && \
  apt-get install -y oracle-java8-installer

RUN apt-get install -y net-tools curl
ADD spring-app-boot-0.1.0 /tmp/spring-boot/
RUN ls /tmp/spring-boot/bin/
RUN chmod 700 /tmp/spring-boot/bin/spring-app
CMD ["sh","/tmp/spring-boot/bin/spring-app"]