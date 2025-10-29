package BankSystem;

import javax.swing.JOptionPane;
import java.awt.Color;

public class BankMain {
    public static void main(String[] args) {
     
        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        JOptionPane.showMessageDialog(
            null,
            "💀 Welcome to the Haunted Bank of the Damned 💀\nProceed... if you dare.",
            "🎃 Spooky Banking System 🎃",
            JOptionPane.INFORMATION_MESSAGE
        );

        MyBank b = new MyBank();

        try {
            double dep = Double.parseDouble(
                JOptionPane.showInputDialog(
                    null,
                    "Enter deposit amount (₱):",
                    "💰 Deposit",
                    JOptionPane.QUESTION_MESSAGE
                )
            );
            b.deposit(dep);

            double wd = Double.parseDouble(
                JOptionPane.showInputDialog(
                    null,
                    "Enter withdrawal amount (₱):",
                    "🏦 Withdraw",
                    JOptionPane.QUESTION_MESSAGE
                )
            );
            b.withdraw(wd);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "💀 That’s not even a number! The spirits are displeased with your nonsense!",
                "Cursed Input Error",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "👻 Something spooky happened: " + e.getMessage(),
                "Unknown Haunting",
                JOptionPane.ERROR_MESSAGE
            );
        }

        JOptionPane.showMessageDialog(
            null,
            "🕯️ Thank you for banking with us… forever. 🕯️",
            "Session Ended",
            JOptionPane.PLAIN_MESSAGE
        );
    }
}