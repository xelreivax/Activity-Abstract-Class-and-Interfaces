package Employee_Payment_System;

import javax.swing.JOptionPane;

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name) {
        super(name);
    }

    void calculatePay(double hours, double rate) {
        double salary = hours * rate;
        JOptionPane.showMessageDialog(
            null,
            "🎃 Full-Time Employee: " + name + "\n" +
            "Hours Worked: " + hours + "\n" +
            "Hourly Rate: ₱" + rate + "\n" +
            "Total Pay: ₱" + salary + "\n\n" +
            "💼 A hardworking soul reaps full rewards... or curses!",
            "Full-Time Pay",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}