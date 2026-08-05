package java_practice;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        int age ;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are going to become an adult:");
                break;
            case 23:
                System.out.println("you are going to join a job:");
                break;
            case 60:
                System.out.println("you ar going to get retired:");
        }
    }
}
