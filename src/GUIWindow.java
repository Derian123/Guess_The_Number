import javax.swing.*;
import java.awt.*;

public class GUIWindow {

    /**
     * This class is solely for the JFRAME and user input
     * There will be a button for user input so they can implement their own ranges
     *
     * @param args
     */

    public static void main(String[] args) {
        Guesser guess = new Guesser(10,40);
        JFrame frame = new JFrame("Guess The Number");
        frame.setSize(300,200);
        frame.setLocation(300,200);
        JButton button = new JButton("Input Ranges");
        JTextArea textArea = new JTextArea(10, 40);
        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        textArea.setText("TRY TO GUESS THE NUMBER I AM THINKING OF");
        frame.setVisible(true);
    }


}
