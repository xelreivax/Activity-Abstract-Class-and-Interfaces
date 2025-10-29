package BankSystem;

import javax.swing.JOptionPane;

class MyBank implements BankAccount {
    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        JOptionPane.showMessageDialog(
            null,
            "💰 You deposited ₱" + amount + "!\n" +
            "🎃 Current haunted balance: ₱" + balance,
            "Deposit Complete",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            JOptionPane.showMessageDialog(
                null,
                "💀 Insufficient funds! The spirits deny your withdrawal.\n" +
                "Your balance is only ₱" + balance,
                "Cursed Transaction",
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            balance -= amount;
            JOptionPane.showMessageDialog(
                null,
                "👻 You withdrew ₱" + amount + "!\n" +
                "Remaining cursed balance: ₱" + balance,
                "Withdrawal Complete",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}