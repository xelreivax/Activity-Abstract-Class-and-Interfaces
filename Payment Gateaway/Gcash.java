package Payment_Gateway;

import javax.swing.JOptionPane;

class Gcash implements Payment {
    public void processPayment(double amount) {
        JOptionPane.showMessageDialog(
            null,
            "📱 You sent ₱" + amount + " through Gcash!\nA ghostly signal confirms your payment...",
            "🕯️ Gcash Payment 🕯️",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}