FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=password

COPY ./createDatabase.sql /docker-entrypoint-initdb.d/
