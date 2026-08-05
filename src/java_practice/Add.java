package java_practice;
import java.util.Scanner;
public class Add {
    public static void main(String[] args){
        System.out.println("Addition of numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
