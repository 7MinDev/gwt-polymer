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

For more information about other available goals, read Maven and gwt-maven-plugin documentation (http://maven.apache.org, http://mojo.codehaus.org/gwt-maven-plugin)

# Deploy

```
mvn package
```