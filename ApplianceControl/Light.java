package ApplianceControl;

import javax.swing.JOptionPane;

class Light implements Appliance {

    public void turnOn() {
        JOptionPane.showMessageDialog(
            null,
            "💡 The light flickers ON... revealing the cobwebs and shadows!",
            "Light On",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void turnOff() {
        JOptionPane.showMessageDialog(
            null,
            "🌑 The light goes OUT. Something moves in the darkness...",
            "Light Off",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}