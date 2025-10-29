package ApplianceControl;

import javax.swing.JOptionPane;
import java.awt.Color;

public class ApplianceMain {
    public static void main(String[] args) {
        
        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        String type = JOptionPane.showInputDialog(
            null,
            "Choose your appliance (fan / light):",
            "🎃 Haunted Appliance Control 🎃",
            JOptionPane.QUESTION_MESSAGE
        );

        if (type == null) {
            JOptionPane.showMessageDialog(
                null,
                "👻 You fled the haunted interface! Even ghosts don’t back out that fast.",
                "Spooky Warning",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        Appliance a = null;

        if (type.equalsIgnoreCase("fan")) {
            a = new Fan();
        } else if (type.equalsIgnoreCase("light")) {
            a = new Light();
        } else {
            JOptionPane.showMessageDialog(
                null,
                "💀 That’s not a valid appliance! The spirits are confused...\nTry typing 'fan' or 'light' next time!",
                "Haunted Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        a.turnOn();
        a.turnOff();
    }
}