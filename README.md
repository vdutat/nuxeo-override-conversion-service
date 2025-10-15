# nuxeo-override-conversion-service

## About / Synopsis

This plugin demonstrates how to define a service based on the **Conversion Service**'s implementation.

Note: LTS 2025 brings a new configuration for the service's caching in extension point `configuration`.

It was generated with the following commands:
```
mkdir nuxeo-override-conversion-service && cd $_
nuxeo bootstrap multi-module
nuxeo bootstrap service
# Edit service's XML files and java class
mvn eclipse:eclipse
mvn clean package -T6 -nsu

nuxeo bootstrap package
mvn install -nsu

nuxeo b docker
mvn install -nsu

nuxeo b docker-compose
# Edit docker-compose.yml (image version, CLID, package dependencies, volumes)
docker-compose up -d; docker-compose logs -f ; docker-compose down -v
```

## Requirements

Building requires the following software:

* git
* maven

## Build

```
git clone ...
cd nuxeo-override-conversion-service

mvn clean install
```

## Installation

```
nuxeoctl mp-install nuxeo-override-conversion-service/nuxeo-override-conversion-service-package/target/nuxeo-override-conversion-service-*.zip
```

## Build and run with Docker and Docker Compose

### Requirements

* access to Nuxeo Nexus for the *LTS 2021/2023/2025 Nuxeo Docker** image
* maven
* docker
* docker-compose

### Build

```
mvn clean install
```

### Start Nuxeo instance

* start the **Docker** container:
```
docker-compose up
```
* stop the **Docker** container:
```
docker-compose down -v
```

## Support

**These features are not part of the Nuxeo Production platform, they are not supported**

These solutions are provided for inspiration and we encourage customers to use them as code samples and learning resources.

This is a moving project (no API maintenance, no deprecation process, etc.) If any of these solutions are found to be useful for the Nuxeo Platform in general, they will be integrated directly into platform, not maintained here.


## License

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

## About Nuxeo

Nuxeo Platform is an open source Content Services platform, written in Java. Data can be stored in both SQL & NoSQL databases.

The development of the Nuxeo Platform is mostly done by Nuxeo employees with an open development model.

The source code, documentation, roadmap, issue tracker, testing, benchmarks are all public.

Typically, Nuxeo users build different types of information management solutions for [document management](https://www.nuxeo.com/solutions/document-management/), [case management](https://www.nuxeo.com/solutions/case-management/), and [digital asset management](https://www.nuxeo.com/solutions/dam-digital-asset-management/), use cases. It uses schema-flexible metadata & content models that allows content to be repurposed to fulfill future use cases.

More information is available at [www.nuxeo.com](https://www.nuxeo.com).

