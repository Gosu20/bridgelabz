public class carobjects {
    String brand;
    int speed;

    static int wheels = 4; 

    public static void main(String[] args) {
        
        carobjects car1 = new carobjects();
        car1.brand = "Toyota";
        car1.speed = 120;

      
        carobjects car2 = new carobjects();
        car2.brand = "Honda";
        car2.speed = 150;

      
        carobjects car3 = new carobjects();
        car3.brand = "Ford";
        car3.speed = 140;

       
        System.out.println(car1.brand + " | Speed: " + car1.speed + " km/h | Wheels: " + carobjects.wheels);
        System.out.println(car2.brand + " | Speed: " + car2.speed + " km/h | Wheels: " + carobjects.wheels);
        System.out.println(car3.brand + " | Speed: " + car3.speed + " km/h | Wheels: " + carobjects.wheels);
    }
}