package com.calculator;

import javax.swing.*;

class Calculator extends MyCalculator {
    protected String opt;
    protected double num1, num2;

    public final JButton[] MainButtons = {buttonC,buttonAC,eqButton};
    public final JButton[] OperatorButtons = {plusButton,minusButton,divButton,mulButton};
    public final JButton[] NumberButtons = {a0Button,a1Button,a2Button,a3Button,a4Button,a5Button,a6Button,a7Button,a8Button,a9Button,dotButton};

    public Calculator() {
        for (int i = 0; i < NumberButtons.length; i++) {
            NumberButtons[i].addActionListener(new NumericButtons(this));
        }

        for (int i = 0; i < OperatorButtons.length; i++) {
            OperatorButtons[i].addActionListener(new OperatorButtons(this));
        }

        for (int i = 0; i < MainButtons.length; i++) {
            MainButtons[i].addActionListener(new MainButtons(this));
        }
    }
}
