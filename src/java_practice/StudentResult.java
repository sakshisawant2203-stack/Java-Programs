package java_practice;
import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
            byte m1, m2, m3;
            int total = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks of maths:");
            m1 = sc.nextByte();
            total = total + m1;
            System.out.println("Enter marks of LR:");
            m2 = sc.nextByte();
            total = total + m2;
            System.out.println("Enter marks of english:");
            m3 = sc.nextByte();
            total = total + m3;
            double avg = total / 3.0;
            System.out.println("your total percentage is:" + avg);
            if (avg >= 40 && m1 > 33 && m2 > 33 && m3 > 33) {
                System.out.println("congratulations! you have been promoted:");
            } else {
                System.out.println("you have not been promoted,try once again:");
            }
        }
    }
