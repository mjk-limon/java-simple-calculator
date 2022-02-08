package com.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorButtons implements ActionListener {
    private final Calculator Calc;

    public OperatorButtons(Calculator calc) {
        this.Calc = calc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Calc.opt = button.getText();
        Calc.num1 = Integer.parseInt(Calc.screen.getText());
        Calc.screen.setText("");
    }
}
