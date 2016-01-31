package com.example.javalessons;

public class Calculator {
    private double resultValue;
    private double divResultValue;
    private double operand1;
    private String operation;
    private double operand2;

    //  private boolean computerStatus;


    public double getSum() {
        return resultValue = operand1 + operand2;
    }

    public double getResultValue() {
        return resultValue;
    }


    public double getDivResultValue() {
        divResultValue = operand1 / operand2;
        return divResultValue;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void printResult(double resultValue) {
        System.out.println("Result value: " + resultValue);
    }

    /* BEGIN methods of Math class */

    /* Array */

    public void storeResultInAnArray(Object[][] twoDimArray) {
        for (int row = 0; row < twoDimArray.length; row++) {
            for (int column = 0; column < twoDimArray.length; column++) {
                System.out.print(twoDimArray[row][column] + "\t");
            }
            System.out.println();
        }
    }


}


