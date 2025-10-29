package Payment_Gateway;

import javax.swing.JOptionPane;
import java.awt.Color;

public class PaymentMain {
    public static void main(String[] args) {

        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        String type = JOptionPane.showInputDialog(
            null,
            "Choose your haunted payment method (credit / gcash):",
            "💀 Haunted Payment Gateway 💀",
            JOptionPane.QUESTION_MESSAGE
        );

        if (type == null) {
            JOptionPane.showMessageDialog(
                null,
                "👻 You ran away before paying! Even ghosts settle their debts...",
                "Cursed Warning",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        Payment paymentMethod;

        if (type.equalsIgnoreCase("credit")) {
            paymentMethod = new CreditCard();
        } else if (type.equalsIgnoreCase("gcash")) {
            paymentMethod = new Gcash();
        } else {
            JOptionPane.showMessageDialog(
                null,
                "💀 Invalid payment type! The spirits demand either 'credit' or 'gcash'.",
                "Unholy Input",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        try {
            double amount = Double.parseDouble(
                JOptionPane.showInputDialog(
                    null,
                    "Enter the cursed amount to pay:",
                    "💰 Payment Amount 💰",
                    JOptionPane.QUESTION_MESSAGE
                )
            );

            if (amount <= 0) {
                JOptionPane.showMessageDialog(
                    null,
                    "☠️ You must pay more than nothing! Even ghosts need funds.",
                    "Invalid Amount",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            paymentMethod.processPayment(amount);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "🕸️ That’s not a valid number! The spirits can’t read nonsense.",
                "Cursed Input",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}