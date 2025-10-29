package Online_Order_System;

import javax.swing.JOptionPane;
import java.awt.Color;

public class OrderMain {
    public static void main(String[] args) {

        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        String type = JOptionPane.showInputDialog(
            null,
            "Choose your order type (online / phone):",
            "🎃 Haunted Order System 🎃",
            JOptionPane.QUESTION_MESSAGE
        );

        if (type == null) {
            JOptionPane.showMessageDialog(
                null,
                "👻 You vanished before placing an order! The spirits are displeased...",
                "Spooky Warning",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        String item = JOptionPane.showInputDialog(
            null,
            "What cursed item would you like to order?",
            "🕸️ Item Selection 🕸️",
            JOptionPane.QUESTION_MESSAGE
        );

        if (item == null || item.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "💀 You must choose an item! The haunted warehouse refuses empty requests!",
                "Haunted Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        Order order = null;

        if (type.equalsIgnoreCase("online")) {
            order = new OnlineOrder();
        } else if (type.equalsIgnoreCase("phone")) {
            order = new PhoneOrder();
        } else {
            JOptionPane.showMessageDialog(
                null,
                "💀 Invalid choice! The spirits don’t recognize that type of order.\nTry 'online' or 'phone' next time!",
                "Haunted Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        order.placeOrder(item);

        JOptionPane.showMessageDialog(
            null,
            "🎁 The order for " + item.toUpperCase() + " has been sent to the underworld’s delivery service!\nBeware the knock at midnight...",
            "Order Complete",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}