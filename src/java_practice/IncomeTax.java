package java_practice;
import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Income of employee:");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<2.5) {
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income<=10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax +0.20f * (10.0f - 5f);
            tax = tax +0.30f * (income - 10.f);
        }
        System.out.println("The total tax paid by employee:" + tax);

    }
}