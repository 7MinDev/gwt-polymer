# What’s it all about?

We’re trying to combine GWT and Polymer like in this project: https://github.com/7MinDev/polymergwt

(Work in progress)

# Adding Polymer elements

New elements are installed using Bower, e.g. the `core-toolbar` element:

```
cd src/main/webapp/polymer
bower install --save Polymer/core-toolbar
```

Running it with `--save` will add the dependencies to the `src/main/webapp/polymer/bower.json` file.

The component has to be added to the `src/main/webapp/GWTPolymer.html`, here:

```
<link rel="import" href="/polymer/bower_components/core-toolbar/core-toolbar.html">
```

TODO: add manual for writing java polymer stub (like `CoreIconButton`)

# Run Locally

## Install / Update

Install / update polymer via Bower (has to be run each time the Bower dependencies change):

TODO put this step into the `package` Maven task

```
cd src/main/webapp/polymer
bower update
```

Run once (and every time you change something in the `war` directory):

```
mvn package       # generate a .war package ready to deploy
```

## Run Debug Mode

```
mvn gwt:run       # run development mode
```

A window will appear. Hit the "Launch Default Browser" button or "Copy to clipboard" and use another browser. If you changed something, you need to reload the page to recompile.

## Run Tests

```
mvn test          # run all the tests (gwt and junit)
```

## Clean Temp Files

```
mvn clean         # delete temporary stuff
```

## Other Stuff

For more information about other available goals, read [Maven](http://maven.apache.org) and [gwt-maven-plugin](http://mojo.codehaus.org/gwt-maven-plugin) documentation.

# Deploy

```
mvn package
```
