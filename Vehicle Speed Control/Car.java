package Vehicle_Speed_Control;


import javax.swing.JOptionPane;

class Car extends AbstractVehicle {

    public void start() {
        JOptionPane.showMessageDialog(
            null,
            "🚗💀 The haunted car roars to life! Its headlights glow like ghostly eyes...",
            "Car Started",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void speedUp(int increment) {
        speed += increment;
        showSpeed();
    }

    void showSpeed() {
        JOptionPane.showMessageDialog(
            null,
            "🏎️ The car zooms through the fog at " + speed + " km/h! 🎃",
            "Speed Status",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}