package com.example.javalessons;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {
        Computer myComp = new Computer(); //  object myComp
        myComp.setPowerSupply(450);
        myComp.setProcessor(2.4f);
        myComp.setVideoCard(11);
        myComp.setMotherBoard("Asus P5K");
        myComp.turnOnComputer();
        System.out.println(myComp.getPowerSupply() + "\n" + myComp.getProcessor()
                + "\n" + myComp.getVideoCard() + "\n" + myComp.getMotherBoard());

        FileManager myFileManager = new FileManager();
        String firstFile = "first.txt";
        String secondFile = "second3.txt";
        String fileToBeDeleted = "second3.txt";
        myFileManager.copyFile(firstFile, secondFile);
        myFileManager.deleteFile(fileToBeDeleted);

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