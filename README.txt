Q1.
maven package must be run first to create the jar file that is used to make the image
Q2.
an image is has the code and describes how the container runs, the container is the running code
Q3.
8082:8082 maps the host port 8082 to the container's port 8082
Expose 8082 does not make the container accessible
Q4.
it fails as it doesn't map the container 8081 port to the host 8081 port, meaning the request never makes it to the catalog service
Q5.
The memory survived after the docker compose down and up -d because we store the data in a volume separate to the container.
if the h2 databasse was in memory, it would be lost when the container went down