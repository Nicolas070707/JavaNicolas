import java.util.Random;

public class Loop {
    public static void main(String[] args) {
        //Erstelle eine Zufallszahl zwischen o und 100
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        int summe = 0;

        for (int i = 1; i <= 100; i ++) {
            summe +=i;
            System.out.println(summe);
        }
    }
}
