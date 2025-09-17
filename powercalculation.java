import java.util.*;
public class powercalculation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base: ");
        int b = sc.nextInt();
        System.out.println("enter the exponent: ");
        int e=sc.nextInt();
        System.out.println("the answer is: " + (int)(Math.pow(b,e)));

    }
    
}
