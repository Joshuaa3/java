
import javax.swing.JOptionPane;

public class MP {
    public static void main(String[] args) {
        int sumGreaterThan10 = 0;
        int productLessThan5 = 1;
        int countDivisibleBy3 = 0;
        int countDivisibleBy5 = 0;
        int thriceProductEvenNumbers = 1;

        while (true) {
            String inputStr = JOptionPane.showInputDialog("Insert a positive integer (or 0 to leave):");

            try {
                int number = Integer.parseInt(inputStr);

                if (number == 0) {
                    break; 
                }

                if (number > 10) {
                    sumGreaterThan10 += number;
                }

                if (number < 5) {
                    productLessThan5 *= number;
                }

                if (number % 3 == 0) {
                    countDivisibleBy3++;
                }

                if (number % 5 == 0) {
                    countDivisibleBy5++;
                }

                if (number % 2 == 0) {
                    thriceProductEvenNumbers *= number;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not valid input. Please insert a positive integer or 0 to leave.");
            }
        }

        // Display the results
        String message = "Sum of all numbers greater than 10: " + sumGreaterThan10 + "\n" +
                "Product of all numbers less than 5: " + productLessThan5 + "\n" +
                "Count of numbers divisible by 3: " + countDivisibleBy3 + "\n" +
                "Count of numbers divisible by 5: " + countDivisibleBy5 + "\n" +
                "Thrice the product of all even numbers: " + thriceProductEvenNumbers;

        JOptionPane.showMessageDialog(null, message, "Outcome", JOptionPane.INFORMATION_MESSAGE);
    }
}

