package com.IlnurSh;

public class Calculator {

    public Calculator() {
    }

    public int calculate(int num1, int num2, char operation) {

        int result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
                case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
               break;
            case '/':
                result = num1 / num2;
                break;
                default:
               throw new IllegalArgumentException("Операция не распознана. Повторите ввод.");

        }
        return result;
    }

}
