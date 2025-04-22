package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Model.DonneeTemp;
import Controller.*;

public class ViewF extends JFrame implements ViewObser {
    private DonneeTemp model;
    private JTextField tempField;
    private JButton plusBtn, minusBtn;

    public ViewF(DonneeTemp model) {
        this.model = model;
        model.ajouter(this);

        setTitle("Temperature Fahrenheit");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tempField = new JTextField(5);
        tempField.setEditable(false);
        add(new JLabel("Temperature Fahrenheit"));
        add(tempField);

        minusBtn = new JButton("-");
        plusBtn = new JButton("+");

        add(minusBtn);
        add(plusBtn);

        minusBtn.setFocusable(false);
        plusBtn.setFocusable(false);

        pack();
        setVisible(true);
    }

    public void changeAff() {
        tempField.setText(String.format("%.1f", model.convertiTemp()));
    }

    public void drawnCtrl() {
        minusBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                model.setStrategie(new ContDiminue());
                model.traiterEvent();
            }
        });

        plusBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                model.setStrategie(new ControlAugm());
                model.traiterEvent();
            }
        });
    }
}