
import javax.swing.JOptionPane;

import java.util.Random;

public class CardGame{
    public static void main(String[] args) {
        Random random = new Random();

        int firstCard = random.nextInt(13) + 1; //  randomize card number between 1 and 13
        int secondCard = random.nextInt(13) + 1;

        boolean sameCards = (firstCard == secondCard);

        String[] options = {"DEAL", "NO DEAL"};
        String[] hlOptions = {"HIGHER", "LOWER"};
        int userChoice;

        if (sameCards) {
            userChoice = JOptionPane.showOptionDialog(
                    null,
                    "First card: " + firstCard + "\nSecond card: " + secondCard + "\n\nPick HIGHER or LOWER:",
                    "In-Between Game",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    hlOptions,
                    hlOptions[0]
            );
        } else {
            userChoice = JOptionPane.showOptionDialog(
                    null,
                    "First card: " + firstCard + "\nSecond card: " + secondCard + "\n\nPick DEAL or NO DEAL:",
                    "In-Between Game",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );
        }

        int thirdCard = random.nextInt(13) + 1;

        String resultMessage = "First card: " + firstCard + "\nSecond card: " + secondCard + "\nThird card: " + thirdCard;

        boolean win = (thirdCard > Math.min(firstCard, secondCard)) && (thirdCard < Math.max(firstCard, secondCard));

        if (userChoice == JOptionPane.YES_OPTION) { // User chose DEAL
            if (sameCards) {
                if ((userChoice == 0 && win) || (userChoice == 1 && !win)) {
                    resultMessage += "\nCongratulations! You win!";
                } else {
                    resultMessage += "\nSorry, you lost.";
                }
            } else {
                if (win) {
                    resultMessage += "\nCongratulations! You win!";
                } else {
                    resultMessage += "\nSorry, you lost.";
                }
            }
        } else {
            resultMessage += "\nYou chose NO DEAL. You lost.";
        }

        JOptionPane.showMessageDialog(null, resultMessage);
    }
}


