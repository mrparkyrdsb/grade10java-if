class Main {
    public static void main(String[] args) {
        System.out.println("Boolean Operations in Java.");

        int x = 10;
        int y = 15;

        System.out.println("Is x == y?: " + (x == y));
        System.out.println("Is x != y?: " + (x != y));
        System.out.println("Is x > y?: " + (x > y));
        System.out.println("Is x < y?: " + (x < y));
        System.out.println("Is x >= y?: " + (x >= y));
        System.out.println("Is x <= y?: " + (x <= y));

        int grade = 10;
        int average = 81;

        System.out.println("Are you in grade 10 and have an average higher than or equal to 80?: " + (grade == 10 && average >= 80));

        String fav_fruit = "blueberry";
        System.out.println("Is your favourite fruit blueberry or kiwi?: " + (fav_fruit == "blueberry" || fav_fruit == "kiki"));
        
        boolean weekday = true;
        System.out.println("Do you not go to school today?: " + (!(weekday)));
        
    }
}