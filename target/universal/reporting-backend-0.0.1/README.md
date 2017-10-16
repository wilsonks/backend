# Backend Reporting System


## Staring point

You Must First Perform the PostgreSQL part below to use the Application.

### Installing PostgreSQL First Time

1) Reinstall the postgres complete package once

First find all the postgres related packages,
wilson@wilson:~$ dpkg -l | grep postgres

wilson@wilson:~$ sudo apt-get --purge remove postgresql postgresql-9.6 postgresql-client postgresql-client-9.6 postgresql-client-common postgresql-common postgresql-contrib postgresql-contrib-9.6
wilson@wilson:~$sudo rm -rf /var/lib/postgresql/
wilson@wilson:~$sudo rm -rf /var/log/postgresql/
wilson@wilson:~$sudo rm -rf /etc/postgresql/

wilson@wilson:~$ sudo apt-get install postgresql postgresql-9.6 postgresql-client postgresql-client-9.6 postgresql-client-common postgresql-common postgresql-contrib postgresql-contrib-9.6



wilson@wilson:~$sudo -u postgres psql --command "CREATE USER scalauser WITH SUPERUSER PASSWORD 'scalapass';"

wilson@wilson:~$sudo -u postgres createdb -O scalauser scaladb

Here we’re creating a new user called scalauser and a database called scaladb .

Now,The JDBC driver supports the trust, ident, password, md5, and crypt authentication methods.

sudo gedit /etc/postgresql/9.6/main/pg_hba.conf
Change following line 

local  all            postgres                                peer

to 

local  all            postgres                                md5

Restart the postgres service by sudo service postgresql restart

## Versions used

The code uses Play 2.6 and Scala 2.12.2 along with sbt 0.13.15.
