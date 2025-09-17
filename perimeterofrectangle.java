import java.util.*;
public class perimeterofrectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length: ");
        int l=sc.nextInt();
        System.out.println("enter the breadth: ");
        int b=sc.nextInt();
        int perimeter=2*(l+b);
        System.out.println("the perimeter is: " + perimeter);

    }
    
}
