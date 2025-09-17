public class Car {  
    String brand;
    int speed;

    static int wheels = 4;

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 120;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.speed = 150;

        System.out.println(car1.brand + " | Speed: " + car1.speed + " km/h | Wheels: " + Car.wheels);
        System.out.println(car2.brand + " | Speed: " + car2.speed + " km/h | Wheels: " + Car.wheels);
    }
}