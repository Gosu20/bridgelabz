import java.util.*;
public class averageofnumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter the second number: ");
        int b=sc.nextInt();
        System.out.println("enter the third number: ");
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("the average of three numbers are: " + avg);

    }
    
}
