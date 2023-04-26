# Comparing Strings in Java

To compare the equalities of strings, Java provides various methods to help us do so.

## Using ```.equals()```
```java
String myStr1 = "Hello";
String myStr2 = "Hello";
String myStr3 = "Another String";
System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
System.out.println(myStr1.equals(myStr3)); // false
```

## Using ```.comparesTo()```
```java
String myStr1 = "Hello";
String myStr2 = "Hello";
System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
```

## SOURCES
- w3schools -- [w3schools.com/java/ref_string_equals.asp](w3schools.com/java/ref_string_equals.asp)
- w3schools -- [https://www.w3schools.com/java/ref_string_compareto.asp](https://www.w3schools.com/java/ref_string_compareto.asp)
## [Curriculum Document Reference](https://www.edu.gov.on.ca/eng/curriculum/secondary/computer10to12_2008.pdf)
- __B1.6:__ describe the function of Boolean operators, comparison operators, and arithmetic operators
