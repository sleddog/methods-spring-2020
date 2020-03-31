To build docker image, run from app directory:
```
docker build .
```

To list images:
```
docker images
```

Find the id of the image you just created, and use it as part of the run command:
```
docker run -p 8080:8080 72d9b99c985c
```

Note the port 8080:8080 is required to expose and map that port externally into the docker container
