package Printer_System;

import javax.swing.JOptionPane;
import java.awt.Color;

public class PrinterMain {
    public static void main(String[] args) {

        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        String type = JOptionPane.showInputDialog(
            null,
            "Choose your haunted printer (text / image):",
            "🕯️ Haunted Printer Interface 🕯️",
            JOptionPane.QUESTION_MESSAGE
        );

        if (type == null) {
            JOptionPane.showMessageDialog(
                null,
                "👻 You vanished before printing anything! The ghosts are displeased...",
                "Cursed Escape",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        Printable printer;

        if (type.equalsIgnoreCase("text")) {
            printer = new TextPrinter();
        } else if (type.equalsIgnoreCase("image")) {
            printer = new ImagePrinter();
        } else {
            JOptionPane.showMessageDialog(
                null,
                "💀 Invalid printer type! The spirits whisper: 'Try text or image next time!'",
                "Unholy Input",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String content = JOptionPane.showInputDialog(
            null,
            "Enter what you want to print:",
            "🖨️ Haunted Printing Request 🖨️",
            JOptionPane.QUESTION_MESSAGE
        );

        if (content == null || content.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "☠️ The page remains blank... because you gave it nothing!",
                "Empty Scroll Warning",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        printer.print(content);
    }
}