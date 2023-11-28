# Java ANSI text colorizer

## Description
Very simple Java library that modifies Strings in the way they are colored when printed to terminal.
It uses ANSI codes to do the job.

Tested with OSes:
 - Linux - different distributions
 - MacOS
 - Windows 10 and 11 (in Windows 10 coloring is off)


## Installation

The compiled libraries are deployed to Maven Central.

Usage with maven:

```xml
<dependency>
    <groupId>io.github.kamilszewc</groupId>
    <artifactId>java-ansi-text-colorizer</artifactId>
    <version>1.4</version>
</dependency>
```

Usage with gradle:

```groovy
implementation 'io.github.kamilszewc:java-ansi-text-colorizer:1.4'
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
Copyright 2022 Kamil Szewc
