
import javax.swing.JOptionPane;

public class LawTax {

    public static double calculateIncomeTax(double monthlySalary) {
        double annualSalary = monthlySalary * 12;
        double tax;

        if (annualSalary <= 250000) {
            tax = 0;
        } else if (annualSalary <= 400000) {
            tax = (annualSalary - 250000) * 0.20;
        } else if (annualSalary <= 800000) {
            tax = 30000 + (annualSalary - 400000) * 0.25;
        } else if (annualSalary <= 2000000) {
            tax = 130000 + (annualSalary - 800000) * 0.30;
        } else if (annualSalary <= 8000000) {
            tax = 490000 + (annualSalary - 2000000) * 0.32;
        } else {
            tax = 2410000 + (annualSalary - 8000000) * 0.35;
        }

        double monthlyTax = tax / 12;
        return monthlyTax;
    }

    public static void main(String[] args) {
    
        String input = JOptionPane.showInputDialog("Insert the monthly salary:");
        double monthlySalary = Double.parseDouble(input);
        
        double monthlyTax = calculateIncomeTax(monthlySalary);
        
        String output = String.format("Monthly Income Tax: %.2f", monthlyTax);
        JOptionPane.showMessageDialog(null, output);
    }
}


