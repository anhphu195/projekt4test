FROM mysql

ENV MYSQL_ROOT_PASSWORD="root"
ENV MYSQL_DATABASE="projekt4"

ADD files/persondb.sql /docker-entrypoint-initdb.d/persondb.sql
