package java_practice;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = sc.nextInt();
        if(year %4 == 0 || year % 400 ==0) {
            System.out.println("it's a leap year:");
        } else {
            System.out.println("it's not a leap year:");
        }
    }
}
