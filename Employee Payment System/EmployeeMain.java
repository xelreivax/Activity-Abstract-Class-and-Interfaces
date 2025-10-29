package Employee_Payment_System;

import javax.swing.JOptionPane;
import java.awt.Color;

public class EmployeeMain {
    public static void main(String[] args) {

        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        String name = JOptionPane.showInputDialog(
            null,
            "Enter employee name:",
            "🎃 Haunted Payroll System 🎃",
            JOptionPane.QUESTION_MESSAGE
        );

        if (name == null || name.isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "👻 You vanished before entering your name! The haunted payroll waits for no one...",
                "Ghostly Warning",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        String type = JOptionPane.showInputDialog(
            null,
            "Enter employee type (fulltime / parttime):",
            "🎃 Haunted Payroll System 🎃",
            JOptionPane.QUESTION_MESSAGE
        );

        if (type == null) {
            JOptionPane.showMessageDialog(
                null,
                "👻 You vanished before entering type! The haunted payroll waits for no one...",
                "Ghostly Warning",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        Employee employee = null;

        if (type.equalsIgnoreCase("fulltime")) {
            employee = new FullTimeEmployee(name);
        } else if (type.equalsIgnoreCase("parttime")) {
            employee = new PartTimeEmployee(name);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "💀 Invalid employee type! The spirits don’t pay the unworthy.\nTry 'fulltime' or 'parttime' next time!",
                "Haunted Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        try {
            double hours = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter hours worked:",
                "⏰ Work Hours ⏰",
                JOptionPane.QUESTION_MESSAGE
            ));

            double rate = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter hourly rate:",
                "💸 Hourly Rate 💸",
                JOptionPane.QUESTION_MESSAGE
            ));

            employee.calculatePay(hours, rate);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "🩸 That’s not a valid number! Even the calculator trembles in fear!",
                "Haunted Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}