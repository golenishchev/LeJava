package com.sseraphim.javalessons;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    private double resultValue;
    private double divResultValue;
    private double numberBeforeSquareRootExtraction;
    private double squareRootCalcResult;
    private double angleBeforeSineCalc;
    private double sineCalcResult;
    private double operand1;
    private String operation;
    private double operand2;
    private boolean computerStatus;


    public double getSum(double operand1, double operand2) {
        return resultValue = operand1 + operand2;
    }

    public void printResult(double resultValue) {
        System.out.println("Result value: " + resultValue);
    }

    public double getDiv(double firstNumber, double secondNumber) {
        return divResultValue = firstNumber / secondNumber;
    }

    /* BEGIN methods of Math class */

    public double getSqrt(double numberBeforeSquareRootExtraction) {
        this.numberBeforeSquareRootExtraction = numberBeforeSquareRootExtraction;
        return squareRootCalcResult = Math.sqrt(numberBeforeSquareRootExtraction);
    }

    public double getSine(double angleBeforeSineCalc) {
        this.angleBeforeSineCalc = angleBeforeSineCalc;
        return sineCalcResult = Math.sin(angleBeforeSineCalc);
    }

    public void runCalculator(boolean computerStatus) throws ComputerAccessException {
        this.computerStatus = computerStatus;
        if (computerStatus) {
            System.out.println("Computer works");
        } else {
            throw new ComputerAccessException("You can't use this program because computer is off\n");
        }
    }
    /* Array */

    public void findMaxInAnArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Maximum in an array: " + max);
    }

    public void storeResultInAnArray(Object[][] twoDimArray) {
        for (int row = 0; row < twoDimArray.length; row++) {
            for (int column = 0; column < twoDimArray.length; column++) {
                System.out.print(twoDimArray[row][column] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        try {
            myCalc.runCalculator(false);
        } catch (ComputerAccessException e) {
            System.err.print(e);
        }
        double resultValue = myCalc.getSum(myCalc.operand1, myCalc.operand2);
        myCalc.printResult(resultValue);
        myCalc.getDiv(10, 2);
        myCalc.getSqrt(100.0);
        myCalc.getSine(30.0);
        int[] array = {12, 1, 5, -11, 7, 13, -1, -5};
        myCalc.findMaxInAnArray(array);
        System.out.println("The square root of \"" + myCalc.numberBeforeSquareRootExtraction + "\" is: " + myCalc.squareRootCalcResult);
        System.out.println("The sine of \"" + myCalc.angleBeforeSineCalc + "\" is: " + myCalc.sineCalcResult);
        System.out.println("\nType two numbers with symbol betwin them. For example 10 + 5. You can use: + - * /");
        Scanner dataInput = new Scanner(System.in);
        try {
            dataInput.useLocale(Locale.ENGLISH);
            myCalc.operand1 = dataInput.nextDouble();
            myCalc.operation = dataInput.next();
            myCalc.operand2 = dataInput.nextDouble();
        } catch (Exception e) {
            dataInput.useLocale(Locale.FRANCE);
            myCalc.operand1 = dataInput.nextDouble();
            myCalc.operation = dataInput.next();
            myCalc.operand2 = dataInput.nextDouble();
        }
        switch (myCalc.operation) {
            case "+": {
                myCalc.getSum(myCalc.operand1, myCalc.operand2);
                myCalc.printResult(myCalc.resultValue);
            }
            break;
            case "-":
                System.out.println(myCalc.operand1 + " - " + myCalc.operand2 + " = " + (myCalc.operand1 - myCalc.operand2));
                break;
            case "*":
                System.out.println(myCalc.operand1 + " * " + myCalc.operand2 + " = " + (myCalc.operand1 * myCalc.operand2));
                break;
            case "/":
                System.out.println(myCalc.operand1 + " / " + myCalc.operand2 + " = " + (myCalc.operand1 / myCalc.operand2));
                break;
            default:
                System.out.println("You have a typo, try again");
                break;
        }
        Object[][] twoDimArray = new Object[2][2];
        twoDimArray[0] = new String[]{"sum", "division"};
        twoDimArray[1] = new Double[]{myCalc.resultValue, myCalc.divResultValue};
        myCalc.storeResultInAnArray(twoDimArray);
    }

}
