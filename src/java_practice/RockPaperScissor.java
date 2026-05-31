import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Hellow sir,welcome to our rock,paper,Scissor game\n" + "Enter 1 for rock\n" + "Enter 2 for paper\n" + "Enter 3 for Scissor");
       int userinput = sc.nextInt();
       Random var = new Random();
       int computerinput = var.nextInt(1,3);
       switch(userinput){
           case 1->System.out.println("You choose Rock:");
           case 2->System.out.println("You choose Paper:");
           case 3->System.out.println("You choose Scissor:");
       }
           if(userinput<=3) {
               switch (computerinput) {
                   case 1 -> System.out.println("computer choose Rock:");
                   case 2 -> System.out.println("computer choose Paper:");
                   case 3 -> System.out.println("computer choose Scissor:");
               }
           }
           if (userinput == 1 && computerinput == 3) {
               System.out.println("You won");
           } else if (userinput == 2 && computerinput == 1) {
               System.out.println("You won");
           } else if (userinput == 3 && computerinput == 2) {
               System.out.println("You won");
           } else if (userinput > 3) {
               System.out.println("It is an invalid input game cant proceed further:");
           } else {
               System.out.println("computer won:");
           }
       }
    }



