import java.util.Scanner;
public class AtmTransaction{
    public static void main(String[] args) {

        int balance = 1000,withdraw = 0,deposit;
        Scanner sc= new Scanner(System.in);

        while(true) {
            System.out.println("Welcome my Schatzi your ATM :)");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for exit");
            System.out.println("Choose the operation what you want");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter money to be withdraw :");
                    if (balance >= withdraw) {
                        withdraw = sc.nextInt();
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println(" ");
                    }
                        else{
                            System.out.println("Insufficient Money");
                        }
                        System.out.println("");

                        break;

                case 2:
                    System.out.println("Enter money to be deposited : ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money successfully deposited");
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println(" ");
                    break;

                case 4:
                    System.exit(0);
            }

        }
    }
}

