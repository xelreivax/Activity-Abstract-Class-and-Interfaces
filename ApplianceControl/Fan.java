package ApplianceControl;

import javax.swing.JOptionPane;

class Fan implements Appliance {

    public void turnOn() {
        JOptionPane.showMessageDialog(
            null,
            "🌀 The fan is now ON! A chilling breeze fills the haunted room...",
            "Fan Activated",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void turnOff() {
        JOptionPane.showMessageDialog(
            null,
            "💨 The fan is OFF. Silence... too quiet.",
            "Fan Deactivated",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}