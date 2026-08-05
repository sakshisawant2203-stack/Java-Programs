package java_practice;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args){
        int total = 0;
        System.out.println("Welcome to CBSE percentage maker");
        Scanner sc = new Scanner(System.in);
        System.out.println("total marks of subjects (E.g.500):");
        int totalmarks = sc.nextInt();
        System.out.println("Enter marks of s1:");
        int s1 = sc.nextInt();
        total =total+ s1;
        System.out.println("Enter marks of s2:");
        int s2 = sc.nextInt();
        total =total+ s2;
        System.out.println("Enter marks of s3:");
        int s3 = sc.nextInt();
        total =total+ s3;
        System.out.println("Enter marks of s4:");
        int s4 = sc.nextInt();
        total =total+ s4;
        System.out.println("Enter marks of s5:");
        int s5 = sc.nextInt();
        total = total +s5;
        int grandtotal = total * 100 / (totalmarks);
        System.out.println(grandtotal);

    }
}
