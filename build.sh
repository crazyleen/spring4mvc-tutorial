#!/bin/sh
mvn clean
mvn package
docker cp target/*.war jetty:/var/lib/jetty/webapps
docker restart jetty
