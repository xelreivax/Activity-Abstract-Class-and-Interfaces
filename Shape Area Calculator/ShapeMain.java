package Shape_Area_Calculator;

import javax.swing.JOptionPane;
import java.awt.Color;

public class ShapeMain {
    public static void main(String[] args) {
        javax.swing.UIManager.put("OptionPane.background", Color.BLACK);
        javax.swing.UIManager.put("Panel.background", Color.BLACK);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.ORANGE);

        String type = JOptionPane.showInputDialog(
            null,
            "Enter shape (circle / rectangle):",
            "🎃 Shape Area Calculator 🎃",
            JOptionPane.QUESTION_MESSAGE
        );

        if (type == null) {
            JOptionPane.showMessageDialog(
                null,
                "👻 You backed out? Even ghosts are braver than that!",
                "Spooky Warning",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        Shape s = null;

        if (type.equalsIgnoreCase("circle")) {
            double r = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
            s = new Circle(r);

        } else if (type.equalsIgnoreCase("rectangle")) {
            double w = Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
            double h = Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));
            s = new Rectangle(w, h);

        } else {
            JOptionPane.showMessageDialog(
                null,
                "💀 Wrong input! The spirits are displeased...\nType only 'circle' or 'rectangle' next time!",
                "Shape Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        double area = s.calculateArea();

        JOptionPane.showMessageDialog(
            null,
            "🧮 The area is: " + String.format("%.2f", area) + " sq. units",
            "🎃 Area Result 🎃",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}