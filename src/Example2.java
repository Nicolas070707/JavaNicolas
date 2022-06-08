import java.util.Random;

public class Example2 {
    public static void  main(String[] args){
        Random random = new Random();
        int summe = 0;
        while ( true ){
            int randomNumber1 = random.nextInt(10);
            System.out.println(randomNumber1);
            if (randomNumber1 == 5) {
                break;
            } if (randomNumber1 == 7){
                break;
            }
            else{
                summe += randomNumber1;

            }
        }
        System.out.println(summe);
    }
}

