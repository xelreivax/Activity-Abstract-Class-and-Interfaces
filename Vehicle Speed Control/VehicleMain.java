package Vehicle_Speed_Control;

import javax.swing.JOptionPane;
import java.awt.Color;

public class VehicleMain {
    public static void main(String[] args) {

        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        AbstractVehicle vehicle = new Car();
        vehicle.start();

        try {
            String input = JOptionPane.showInputDialog(
                null,
                "Enter how much to increase the speed (km/h):",
                "🎃 Haunted Speed Boost 🎃",
                JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) {
                JOptionPane.showMessageDialog(
                    null,
                    "👻 You ignored the car’s roar... It idles sadly in the mist.",
                    "Spooky Warning",
                    JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            int increment = Integer.parseInt(input);
            vehicle.speedUp(increment);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "💀 That’s not a valid number! Even skeletons know how to count!",
                "Cursed Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}