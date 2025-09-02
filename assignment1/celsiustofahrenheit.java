import java.util.*;
public class celsiustofahrenheit {
    public static void main(String agrs[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the celsius temperature: ");
    int c=sc.nextInt();
    int f=(c * 9/5) + 32;
    System.out.println("the temperature in fahrenheit is: " + f);

    }
    
    
}
