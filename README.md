# Java ANSI text colorizer

## Description



## Installation

The compiled libraries are deployed to Maven Central.

Usage with maven:

```xml
<dependency>
    <groupId>io.github.kamilszewc</groupId>
    <artifactId>java-ansi-text-colorizer</artifactId>
    <version>0.1</version>
</dependency>
```

Usage with gradle:

```groovy
implementation 'io.github.kamilszewc:java-ansi-text-colorizer:0.1'
```

## Usage

Currently, there are two static methods that can be used to color text or background printed to terminal

1. Text example:
    ```java
   System.out.println(Colorizer.color("Some text", Colorizer.Color.RED));
   ```
    will print the text in red color.
   
2. Backgound example:
    ```java
   System.out.println(Colorizer.color("Some text", Colorizer.BackgroundColor.RED));
   ```
    will print the background in red color.


## License

Apache License 2.0
Copyright 2022 Kamil Szewc (Computing Laboratory)