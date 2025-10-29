package Printer_System;

import javax.swing.JOptionPane;

class TextPrinter implements Printable {
    public void print(String content) {
        JOptionPane.showMessageDialog(
            null,
            "📝 Printing text: " + content + "\nThe haunted typewriter clacks in the night...",
            "🎃 Text Printer Activated 🎃",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}