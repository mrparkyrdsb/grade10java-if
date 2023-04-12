# If Else Statements

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println('Enter the day: ')
        String day = in.nextLine();
        
        if (day == "Saturday" || day == "Sunday") {
            System.out.println("No school today!");
        }
        else {
            System.out.println("lol, you have school today.");  
        }
    }
}
```

## Making Binary Pathways

By using an ```else``` statement, we can handle for situation when an ```if``` statement's boolean expression is ```false```.

This allows us to react to a condition being ```false```, and it will allow our program to be more complex.

## Common Mistakes
```java
// BAD CODE BELOW
if (__CONDITIONA__) {
    // code A
}
if (__CONDITIONB__) {
    // code B
}
else {
    // code C
}
```
> the ```else``` statement is only related to ```__CONDITIONB__```

```java
// BAD CODE BELOW
else {
    // code C
}

if (__CONDITIONA__) {
    // code A 
}
```
> you cannot have a random ```else``` statement without it being attached an if statement prior to it

## [Curriculum Document Reference](https://www.edu.gov.on.ca/eng/curriculum/secondary/computer10to12_2008.pdf)
- __B2.4:__ write a program that includes a decision
structure for two or more choices