# Run locally

Run once (and every time you change something in the `war` directory):

```
mvn package       # generate a .war package ready to deploy
```

Run debug mode:

```
mvn gwt:run       # run development mode
```

Run tests:

```
mvn test          # run all the tests (gwt and junit)
```

Clean temp files:

```
mvn clean         # delete temporary stuff
```



mvn clean         # delete temporary stuff
mvn test          # run all the tests (gwt and junit)
mvn gwt:run       # run development mode
mvn package       # generate a .war package ready to deploy

For more information about other available goals, read [Maven](http://maven.apache.org) and [gwt-maven-plugin](http://mojo.codehaus.org/gwt-maven-plugin) documentation.

# Deploy

```
mvn package
```
