import javax.swing.JOptionPane;

public class DrivingCar {
    public static void main(String[] args) {

        double distance = Double.parseDouble(JOptionPane.showInputDialog("Insert the driving distance : "));
        double milesPerGallon = Double.parseDouble(JOptionPane.showInputDialog("Insert KM per gallon : "));
        double pricePerGallon = Double.parseDouble(JOptionPane.showInputDialog("Insert price per gallon : "));

        double gallonsUsed = distance / milesPerGallon;

        double cost = gallonsUsed * pricePerGallon;

        String result = String.format("The cost of driving is P%.2f", cost);
        JOptionPane.showMessageDialog(null, result);
    }
}
