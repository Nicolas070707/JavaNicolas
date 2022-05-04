import java.sql.SQLOutput;
import java.util.Random;

public class While {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;


        while(!isFinished){
            int randomValue = random.nextInt( 20) +10;
            System.out.println("Nr" + randomValue);


            if ((randomValue==15) || (randomValue==25)){
                isFinished=true;
            }
        }
        System.out.println("Finished");






    }
}
