public class Staticdemo {
    String brand;
    int speed;

    static int wheels = 4; 

    public static void main(String[] args) {
        
        Staticdemo car1 = new Staticdemo();
        car1.brand = "Toyota";
        car1.speed = 120;

        
        Staticdemo car2 = new Staticdemo();
        car2.brand = "Honda";
        car2.speed = 150;

        
        car1.wheels = 6;

        
        System.out.println(car1.brand + " Wheels: " + car1.wheels);
        System.out.println(car2.brand + " Wheels: " + car2.wheels);

        
        car2.wheels = 8;

        System.out.println("After changing via car2:");
        System.out.println(car1.brand + " Wheels: " + car1.wheels);
        System.out.println(car2.brand + " Wheels: " + car2.wheels);
    }
    
}
