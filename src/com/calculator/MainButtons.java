package com.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

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
            DecimalFormat numFormat = new DecimalFormat("0.#");
            Calc.num2 = Double.valueOf(Calc.screen.getText());

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
                    result = Calc.num2;
            }

            Calc.screen.setText(numFormat.format(result));
        }
    }
}
