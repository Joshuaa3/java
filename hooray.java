//Hep-Hep Hooray
import javax.swing.JOptionPane;
public class hooray {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert a number:");
        try {
            int num = Integer.parseInt(input);

            if (num % 3 == 0 && num % 5 == 0) {
                JOptionPane.showMessageDialog(null, "HEP-HEP HOORAY");
            } else if (num % 5 == 0) {
                JOptionPane.showMessageDialog(null, "HOORAY");
            } else if (num % 3 == 0) {
                JOptionPane.showMessageDialog(null, "HEP-HEP");
            } else {
                JOptionPane.showMessageDialog(null, "Oh no!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Incorrect Input. Please enter a correct number.");
        }
    }
}




