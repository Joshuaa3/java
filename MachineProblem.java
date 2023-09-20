
import javax.swing.JOptionPane;

public class MachineProblem {
    
    public static void main(String[] args) {
        String startStr = JOptionPane.showInputDialog("Insert the first number:");
        String endStr = JOptionPane.showInputDialog("Insert the last number:");

        int start = Integer.parseInt(startStr);
        int end = Integer.parseInt(endStr);

        int divisibleBy2Count = 0;
        int divisibleBy3Count = 0;
        int divisibleByBothCount = 0;

        for (int num = start; num <= end; num++) {
            if (num % 2 == 0) {
                divisibleBy2Count++;
            }
            if (num % 3 == 0) {
                divisibleBy3Count++;
            }
            if (num % 2 == 0 && num % 3 == 0) {
                divisibleByBothCount++;
            }
        }

        String message = "Count of numbers divisible by 2: " + divisibleBy2Count + "\n" +
                         "Count of numbers divisible by 3: " + divisibleBy3Count + "\n" +
                         "Count of numbers divisible by both 2 and 3: " + divisibleByBothCount;

        // Display the results
        JOptionPane.showMessageDialog(null, message, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}


