# Instagram Validator

This is a non-official Instagram validator.

Since Instagram doesn't provide an official one, this library serves as an alternative.


## Install

It currently supports Maven.

```xml
# pom.xml
...
  <dependencies>
    ...
    <dependency>
      <groupId>io.github.johnlinp</groupId>
      <artifactId>instagram-validator</artifactId>
      <version>0.1</version>
    </dependency>
    ...
  </dependencies>
...
```


## Usage

```java
InstagramValidator.isValidHashtag('#hello'); // true

InstagramValidator.isValidHashtag('#hello.world'); // false

InstagramValidator.isValidHashtag('#5566'); // true
```


## Test

```
$ mvn test
```
