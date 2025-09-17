public class StaticBlockExample {
    static int number;

    // static block
    static {
        number = 100;   // initialize static variable
        System.out.println("Static block executed! number = " + number);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");
        System.out.println("Value of number: " + number);
    }
}