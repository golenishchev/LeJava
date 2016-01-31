package com.example.javalessons;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {
        Computer myComp = new Computer(); //  object myComp
        myComp.computerStatusOn = true;
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
            myComp.runCalculator();
        } catch (ComputerAccessException e) {
            e.printStackTrace();
        }

        System.out.println("\nType two numbers with symbol betwin them. For example 10 + 5. You can use: + - * /");
        Scanner dataInput = new Scanner(System.in);
        try {
            dataInput.useLocale(Locale.ENGLISH);
            myCalc.setOperand1(dataInput.nextDouble());
            myCalc.setOperation(dataInput.next());
            myCalc.setOperand2(dataInput.nextDouble());
        } catch (Exception e) {
            dataInput.useLocale(Locale.FRANCE);
            myCalc.setOperand1(dataInput.nextDouble());
            myCalc.setOperation(dataInput.next());
            myCalc.setOperand2(dataInput.nextDouble());
        }
        switch (myCalc.getOperation()) {
            case "+":
                myCalc.getSum();
                myCalc.printResult(myCalc.getResultValue());
                break;
            case "-":
                System.out.println(myCalc.getOperand1() + " - " + myCalc.getOperand2() + " = " + (myCalc.getOperand1() - myCalc.getOperand2()));
                break;
            case "*":
                System.out.println(myCalc.getOperand1() + " * " + myCalc.getOperand2() + " = " + (myCalc.getOperand1() * myCalc.getOperand2()));
                break;
            case "/":
                System.out.println(myCalc.getOperand1() + " / " + myCalc.getOperand2() + " = " + (myCalc.getOperand1() / myCalc.getOperand2()));
                break;
            default:
                System.out.println("You have a typo, try again");
                break;
        }
        Object[][] twoDimArray = new Object[2][2];
        twoDimArray[0] = new String[]{"sum", "\t", "division"};
        twoDimArray[1] = new Double[]{myCalc.getResultValue(), myCalc.getDivResultValue()};
        myCalc.storeResultInAnArray(twoDimArray);
    }
}