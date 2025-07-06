# learn_maven
Learn Maven Commit By Commit

# Simple Java Program

This repository contains a simple Java program that prints "Hello, World!" to the console.


## Steps to Compile

```
mvn clean compile
```

## Steps to Create a JAR File 

```
mvn clean package
```

## Steps to Execute the JAR File

1. Run the JAR file using the following command:
   ```
   java -jar helloworld/target/helloworld-1.0-SNAPSHOT.jar
   ```

## Steps to Install to Local Repository

To install your built artifacts to your local Maven repository (so other local projects can use them):

```
mvn clean install
```

## Configuring Distribution Management

To deploy to a remote Maven repository, add a `<distributionManagement>` section to your `pom.xml`:

```xml
<distributionManagement>
    <repository>
        <id>my-releases</id>
        <url>https://your.repo.url/repository/maven-releases/</url>
    </repository>
    <snapshotRepository>
        <id>my-snapshots</id>
        <url>https://your.repo.url/repository/maven-snapshots/</url>
    </snapshotRepository>
</distributionManagement>
```

Replace the URLs and IDs with those for your repository.

## Configuring Credentials in settings.xml

To authenticate with your remote repository, add your credentials to your Maven `settings.xml` (usually in `~/.m2/settings.xml`):

```xml
<servers>
    <server>
        <id>my-releases</id>
        <username>your-username</username>
        <password>your-password</password>
    </server>
    <server>
        <id>my-snapshots</id>
        <username>your-username</username>
        <password>your-password</password>
    </server>
</servers>
```

The `<id>` values must match those in your `distributionManagement` section.

## Steps to Deploy to Remote Repository

To deploy your artifacts to a remote Maven repository (requires configuration in pom.xml and credentials in settings.xml):

```
mvn clean deploy
```

This will upload your built JARs to the remote repository specified in the `distributionManagement` section of your pom.xml. Make sure your credentials are set in `settings.xml`.

## Release and Tagging

To prepare and perform a release (with version bumping and git tags):

```
mvn release:prepare
mvn release:perform
```

> Make sure your SCM and distribution management are configured in your pom.xml.

## Folders to Watch

- `module/target`: All the build artifacts will be generated inside this folder
