import javax.swing.JOptionPane;

public class TuitionFee {
    public static void main(String[] args) {
        // Prompt the user for the initial tuition fee
        String initialTuitionInput = JOptionPane.showInputDialog("Enter the initial tuition fee (PHP):");
        double initialTuition = Double.parseDouble(initialTuitionInput);

        // Prompt the user for the annual increase rate as a percentage
        String annualIncreaseRateInput = JOptionPane.showInputDialog("Enter the annual increase rate (%):");
        double annualIncreaseRate = Double.parseDouble(annualIncreaseRateInput);

        // Convert the annual increase rate from percentage to decimal
        annualIncreaseRate /= 100;

        StringBuilder resultMessage = new StringBuilder("Tuition for the next nine years:\n");

        for (int year = 1; year <= 9; year++) {
            initialTuition += initialTuition * annualIncreaseRate;
            resultMessage.append("Year ").append(year).append(": PHP ").append(String.format("%.2f", initialTuition)).append("\n");
        }

        // Display the result using JOptionPane
        JOptionPane.showMessageDialog(null, resultMessage.toString());
    }
}