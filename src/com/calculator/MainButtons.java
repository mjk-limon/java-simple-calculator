package com.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainButtons implements ActionListener {
    private final Calculator Calc;

    public MainButtons(Calculator calc) {
        this.Calc = calc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Calc.buttonC) {
            Calc.screen.setText("");
        } else if (e.getSource() == Calc.buttonAC) {
            Calc.opt = "";
            Calc.num1 = 0;
            Calc.screen.setText("");
        } else if (e.getSource() == Calc.eqButton) {
            double result;
            Calc.num2 = Integer.valueOf(Calc.screen.getText());

            System.out.println(Calc.num1);
            System.out.println(Calc.num2);

            switch (Calc.opt) {
                case "+":
                    result = Calc.num1 + Calc.num2;
                    break;
                case "-":
                    result = Calc.num1 - Calc.num2;
                    break;
                case "*":
                    result = Calc.num1 * Calc.num2;
                    break;
                case "/":
                    result = Calc.num1 / Calc.num2;
                    break;
                default:
                    result = 0;
            }

            Calc.screen.setText(String.valueOf(result));
        }
    }
}
