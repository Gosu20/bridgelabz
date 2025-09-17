import java.util.*;
public class volumeofcylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the cylinder: ");
        int r=sc.nextInt();
        System.out.println("enter the height of the cylinder: ");
        int h=sc.nextInt();
        int volume=(int)(3.14*r*r*h);
        System.out.println("the volume of the cylinder is: " + volume);

    }
    
}
