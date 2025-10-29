package Employee_Payment_System;

import javax.swing.JOptionPane;

class PartTimeEmployee extends Employee {

    PartTimeEmployee(String name) {
        super(name);
    }

    void calculatePay(double hours, double rate) {
        double salary = hours * rate;
        JOptionPane.showMessageDialog(
            null,
            "🕸️ Part-Time Employee: " + name + "\n" +
            "Hours Worked: " + hours + "\n" +
            "Hourly Rate: ₱" + rate + "\n" +
            "Total Pay: ₱" + salary + "\n\n" +
            "☠️ The night shift workers whisper their thanks...",
            "Part-Time Pay",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}