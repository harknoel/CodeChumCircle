import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class CircleGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfRadius;
    private JTextField tfArea;
    private JTextField tfCircumference;
    private JButton btnClear;
    private JButton btnCompute;

    double getArea() {
        String rad = tfRadius.getText();
        double radius = Double.parseDouble(rad);
        return Math.PI * (radius * radius);
    }

    double getCircumference() {
        String rad = tfRadius.getText();
        double radius = Double.parseDouble(rad);
        return 2 * Math.PI * radius;
    }

    public CircleGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfRadius.getText().equals("")) {
                    return;
                }
                changeText();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfRadius.getText().equals("")) {
                    return;
                }
                clear();
            }
        });

    }

    void changeText() {
        tfArea.setText(String.format("%.2f", getArea()));
        tfCircumference.setText(String.format("%.2f", getCircumference()));
    }

    void clear() {
        tfRadius.setText("");
        tfArea.setText("");
        tfCircumference.setText("");
    }
    public static void main(String[] args) {
        CircleGUI app = new CircleGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
