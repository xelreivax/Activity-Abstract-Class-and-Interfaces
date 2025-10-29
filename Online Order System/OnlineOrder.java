package Online_Order_System;

import javax.swing.JOptionPane;

class OnlineOrder implements Order {
    public void placeOrder(String item) {
        JOptionPane.showMessageDialog(
            null,
            "💻🕷️ You’ve placed an ONLINE order for " + item.toUpperCase() + "!\n" +
            "A mysterious courier in the dark web is on their way...",
            "Online Order Placed",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
