import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class Würfelgame {

    public static void main(String[] args) {

        System.out.println("Play VS me in my Game :)");
        JButton button = new JButton("Change new colors");
        button.addActionListener();


        Random random = new Random();
        int randomNumber = random.nextInt(6)+1;
        System.out.println(randomNumber);


    }
}