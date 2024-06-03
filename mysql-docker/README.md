# docker for mysql compose
docker compose -f docker-compose.yml up --build -d

# extract root password
docker logs mysqldbs-mysql-db-1 2>&1 | grep GENERATED

# user bash
root: (use thats specified in the docker compose)

# root: sayplease
http://localhost:8086/
