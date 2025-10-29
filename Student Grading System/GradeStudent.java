package Student_Grading_System;

import javax.swing.JOptionPane;

class GradeStudent extends Student {

    double computeAverage(double g1, double g2, double g3) {
        return (g1 + g2 + g3) / 3.0;
    }

    void showResult(double avg) {
        String message;

        if (avg >= 90) {
            message = "🧠 Excellent! Average: " + avg + "\nTop of the haunted class!";
        } else if (avg >= 75) {
            message = "🎃 Good work! Average: " + avg + "\nYou passed... the spirits nod approvingly.";
        } else {
            message = "💀 Average: " + avg + "\nYou failed! The ghosts whisper 'study harder...'";
        }

        JOptionPane.showMessageDialog(
            null,
            message,
            "💀 Haunted Grade Result 💀",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}