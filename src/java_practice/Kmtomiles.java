package java_practice;
import java.util.Scanner;
public class Kmtomiles {
    public static void main(String[] args){
        System.out.println("convert km to miles");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Km for to convert into miles");
        float km = sc.nextFloat();
        float miles = km * 0.621371f;
        System.out.println(" The value of km into miles is:");
        System.out.println(miles);
    }
}