import java.util.Random;

public class loop_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        int summe = 0;

        for (int i = 0; i <= 1000; i = i+ 2) {
            summe +=i;
            System.out.println(summe);
        }
    }
}