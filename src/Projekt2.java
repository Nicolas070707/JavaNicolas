import java.util.Random;

public class Projekt2 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) ;
        System.out.println(randomNumber);

        if (randomNumber < 20) {
            System.out.println("Mini");
        } else if ((randomNumber > 20) && (randomNumber > 50)) {
            System.out.println("Medium");
        } else {
            System.out.println("Large");
        }
    }
}


// Erstelle zwei Zufallszahl zwischen 0 und 100

// Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
// dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

// Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
// dann gib aus "Eine der beiden ist kleiner als 30"

// Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
// dann gib aus "Erste Zahl klein, zweite kein 50iger"

