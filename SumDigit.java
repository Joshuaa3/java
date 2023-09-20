import javax.swing.JOptionPane;

public class SumDigit {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert an integer:");
        
        long number = Long.parseLong(input);
        
        int result = sumDigits(number);
        
        JOptionPane.showMessageDialog(null, "Sum of digits: " + result);
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; 
            n /= 10;      
        }
        return sum;
    }
}