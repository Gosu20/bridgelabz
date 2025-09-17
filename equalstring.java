import java.util.*;
public class equalstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string: ");
        String s1=sc.next();
        System.out.println("enter the second string: ");
        String s2=sc.next();
        if(s1.equals(s2)){
            System.out.println("yes the two strings are equal");
        }else{
            System.out.println("the two strings are not equal");
        }

    }
    
}
