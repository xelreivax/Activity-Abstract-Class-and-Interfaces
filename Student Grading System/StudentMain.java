package Student_Grading_System;

import javax.swing.JOptionPane;
import java.awt.Color;

public class StudentMain {
    public static void main(String[] args) {

        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        try {
            double g1 = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter Grade 1:",
                "🎃 Haunted Grading System 🎃",
                JOptionPane.QUESTION_MESSAGE
            ));

            double g2 = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter Grade 2:",
                "💀 Haunted Grading System 💀",
                JOptionPane.QUESTION_MESSAGE
            ));

            double g3 = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter Grade 3:",
                "👻 Haunted Grading System 👻",
                JOptionPane.QUESTION_MESSAGE
            ));

            if (g1 < 0 || g2 < 0 || g3 < 0 || g1 > 100 || g2 > 100 || g3 > 100) {
                JOptionPane.showMessageDialog(
                    null,
                    "☠️ Invalid grade! Only 0–100 allowed — even ghosts follow rules!",
                    "Cursed Input",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            Student s = new GradeStudent();
            double avg = s.computeAverage(g1, g2, g3);
            ((GradeStudent) s).showResult(avg);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "👀 That’s not a valid number! Even zombies can type digits!",
                "Cursed Error",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(
                null,
                "👻 You fled the grading ritual... the spirits are disappointed!",
                "Haunted Warning",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }
}