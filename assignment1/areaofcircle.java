import java.util.*;
public class areaofcircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        int r=sc.nextInt();
        int area= (int) (3.14*r*r);
        System.out.println("the area of the circle is: " + area);

    }
    
}
