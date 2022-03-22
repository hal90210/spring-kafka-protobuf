# spring-kafka-protobuf

Example App Using Spring Boot, Kafka, ProtoBuf, Gradle, Docker.  Th purpose of this app is to show the configuration,
and code needed to build and deploy an application to produce and consume kafka messages using protobuf.  It will also
demonstrate protobuf schema evolution; adding and removing fields fom the schema.

This is not a complete app, it goes over the basics and the fact that the producer and consumer live in the same app
is not a real world example.  For example, the protobuf schema and generated java files should live in a different repo,
that allows versioning/releasing.  To replicate the schema evolution I cheated and created the genrated files then changed
the java package from v1 to v2 and generated again.

From the .proto files

`option java_package = "com.improving.springprotobuf.generated.v1.model";`

`option java_package = "com.improving.springprotobuf.generated.v2.model";`

The protobuf schema is a WebsiteMessage, which has an Author and Comments.  The protobuf schema can be found in src/main/proto.

This app has 2 endpoints which will use the generated java files to construct a protobuf message for a specific version.
There are 2 Message producers and 2 message consumers.  They import either `com.improving.springprotobuf.generated.v1.model`
or `com.improving.springprotobuf.generated.v2.model`  This will allow us to build/log the version specific fields.

to run locally

- `gradle clean build && docker-compose build`
- `docker-compose up -d`

Logs

`docker logs -f spring-kafka-protobuf_app_1`

Then Post the following json to the 2 different endpoints

*V1*

````
curl -X POST http://localhost:8080/v1/message/publish \
   -H 'Content-Type: application/json' \
   -d '{"content": "hey this is a v1 message",
        "author": {
         "firstName": "Scott", "lastName": "Strzynski"
        }
       }'
````

*V2*

````
curl -X POST http://localhost:8080/v2/message/publish \
   -H 'Content-Type: application/json' \
   -d '{"content": "Look at this is a v2 message",
        "author": {
         "firstName": "Scott", "lastName": "Strzynski"
        }
       }'
````

Both consumers will handle the posted messages, but because they use different versions of the schema they will log different fields.

V1 has a topic field on WebsiteMessage, which is removed in V2. V2 has a Version Enum that doesn't exist in V1.




