import java.util.*;
public class convertkilometers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the distance in kilometers: ");
        float k=sc.nextInt();
        float miles=(float)(k*0.621371);
        System.out.println("the distance in miles is: " + miles);

    }
    
}
