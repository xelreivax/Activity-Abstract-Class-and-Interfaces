package Printer_System;

import javax.swing.JOptionPane;

class ImagePrinter implements Printable {
    public void print(String content) {
        JOptionPane.showMessageDialog(
            null,
            "🖼️ Printing image: " + content + "\nThe eerie image slowly appears from the mist...",
            "👻 Image Printer Activated 👻",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}