import javax.swing.JOptionPane;

import java.util.Random;

public class GuessNum {
    
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(11); 
        int numberOfTries = 0;

        JOptionPane.showMessageDialog(null, "Welcome to the Guessing Game!");

        while (true) {
            String userInput = JOptionPane.showInputDialog("Guess the number (0 - 10):");
            int userGuess = Integer.parseInt(userInput);
            numberOfTries++;

            if (userGuess == secretNumber) {
                String message = "Congratulations! You guessed it.\n";
                message += "Number of tries: " + numberOfTries + "\n";
                
                // Diplay player rank based on the number of tries
                String playerRank;
                if (numberOfTries == 1) {
                    playerRank = "Pro";
                
                } else if (numberOfTries >= 2 && numberOfTries <= 4) {
                    playerRank = "Expert";
                
                } else if (numberOfTries >= 5 && numberOfTries <= 6) {
                    playerRank = "Beginner";
                
                } else {
                    playerRank = "Novice";
                }
                
                message += "Player rank: " + playerRank;
                
                JOptionPane.showMessageDialog(null, message);
                break;
            } else if (userGuess < secretNumber) {
                JOptionPane.showMessageDialog(null, "Higher! Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Lower! Try again.");
            }
        }
    }
}


