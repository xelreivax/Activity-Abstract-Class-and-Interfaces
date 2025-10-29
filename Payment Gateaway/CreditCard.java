package Payment_Gateway;

import javax.swing.JOptionPane;

class CreditCard implements Payment {
    public void processPayment(double amount) {
        JOptionPane.showMessageDialog(
            null,
            "💳 You paid ₱" + amount + " using your cursed Credit Card!\nThe spirits approve this transaction...",
            "🎃 Credit Card Payment 🎃",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}