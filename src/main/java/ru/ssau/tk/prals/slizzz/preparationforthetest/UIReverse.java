package ru.ssau.tk.prals.slizzz.preparationforthetest;

import javax.swing.*;
import java.awt.*;

public class UIReverse extends JFrame {
    private JTextField textField;

    private UIReverse() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textField = new JTextField(15);
        JButton reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(event -> textField.setText(new StringBuffer(textField.getText()).reverse().toString()));
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(textField);
        contents.add(reverseButton);
        setContentPane(contents);
        setSize(400, 130);
    }

    public static void main(String[] args) {
        UIReverse window = new UIReverse();
        window.setVisible(true);
    }
}
