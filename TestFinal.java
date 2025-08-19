public class TestFinal {
    final int x = 100;  // final variable

    public static void main(String[] args) {
        TestFinal obj = new TestFinal();
        System.out.println("Initial value of x: " + obj.x);

        // trying to change final variable
        obj.x = 200;   // ❌ ERROR here
        System.out.println("New value of x: " + obj.x);
    }
}