## Markus hello service
Super excited project, located at: https://quarkus.io
In short: Quarkus tailors your application for GraalVM and HotSpot. Amazingly fast boot time, incredibly low RSS memory (not just heap size!) offering near instant scale up and high density memory utilization in container orchestration platforms like Kubernetes. We use a technique we call compile time boot

A Kubernetes Native Java stack tailored for OpenJDK HotSpot and GraalVM, crafted from the best of breed Java libraries and standards.
## Run it
```bash
mvn compile quarkus:dev
```

### Cool features:
 
* hot-code replacement supported
* test supported

## Some notes
* Test will be run on port 8081, need to ensure that port is free or exception thrown.