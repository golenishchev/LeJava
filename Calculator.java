package com.example.javalessons;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public double resultValue;
    public double divResultValue;
    public double numberBeforeSquareRootExtraction;
    public double squareRootCalcResult;
    public double angleBeforeSineCalc;
    public double sineCalcResult;
    public double operand1;
    public String operation;
    public double operand2;
    public boolean computerStatus;

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
}