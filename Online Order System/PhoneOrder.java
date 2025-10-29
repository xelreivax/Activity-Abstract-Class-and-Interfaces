package Online_Order_System;

import javax.swing.JOptionPane;

class PhoneOrder implements Order {
    public void placeOrder(String item) {
        JOptionPane.showMessageDialog(
            null,
            "📞🔮 You’ve placed a PHONE order for " + item.toUpperCase() + "!\n" +
            "The operator’s voice fades into static... ‘Your order will arrive soon...’",
            "Phone Order Placed",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}