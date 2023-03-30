# Making Multiple Decisions

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println('Enter your age: ')
        int age = in.nextInt();
        
        if (age > 17) {
            System.out.println("You can watch any movies.");
        }
        else if (age > =13) {
            System.out.println("You can watch any rated movies except: ");
            System.out.println("You cannot watch NC-17.");
            System.out.println("You require parent/adult guaradian supervision to watch R rated movies.");
            
        }
        else {
            System.out.println("You can watch G rated movies and you also need parental guidance for PG and PG-13 rated movies.");  
        }
    }
}
```

## Multiple Decisions

