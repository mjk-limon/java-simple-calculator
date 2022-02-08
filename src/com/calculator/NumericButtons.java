package com.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumericButtons implements ActionListener {
    private final MyCalculator MyCalc;

    public NumericButtons(MyCalculator myCalc) {
        this.MyCalc = myCalc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        MyCalc.screen.setText(MyCalc.screen.getText().concat(button.getText()));
    }
}
