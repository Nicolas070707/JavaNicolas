import java.util.Random;

public class Projekt1 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) ;
        System.out.println(randomNumber);

        if (randomNumber < 20) {
            System.out.println("Mini");
        } else if (randomNumber < 50) {
            System.out.println("Medium");
        } else {
            System.out.println("Large");
        }
    }
}
    // Gib die Zufallszahl aus

    // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
    // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
    // Wenn die Zahl größer als 50 ist gib aus "Large"




