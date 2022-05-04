import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int selection;
        int amount;
        int kontostand = 1000;


        Scanner eingabewert = new Scanner(System.in);
        System.out.println("Good morning! What do you want to do \n 1) Pay in \n 2) Pay out \n 3) Bank balance \n 4) End");
        selection = eingabewert.nextInt();
        switch (selection) {
            case 1:
                System.out.println("enter the desired amount");
                amount = eingabewert.nextInt();
                kontostand = kontostand + amount;
                break;
            case 2:
                System.out.println("enter the amount you wish to withdraw:");
                amount = eingabewert.nextInt();
                kontostand = kontostand - amount;

                break;
            case 3:
                System.out.println("Your account balance is: " + kontostand + "€");
                break;
            case 4:
                System.out.println("Thank you for your visit, GOOD BYE!");
                break;
        }
    }

}