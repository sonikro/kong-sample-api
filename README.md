# Kong Sample Api

This API is supossed to be used along with the [Kont Experiment](https://github.com/sonikro/kong-experiment) environment

Please check that project first

## Building the docker image

```shell script
./gradlew clean assemble
docker build -t kong-sample-api:0.0.1 .
```

## Running the API

After building the image, run the container with the command

```shell script
docker run --name kong-sample-api -d -p 8080:8080 kong-sample-api:0.0.1
```

## Testing your API

```shell script
curl -X GET http://localhost:8080/hello
```

This should print **Hello World**