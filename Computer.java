package com.example.javalessons;

import java.util.Scanner;

public class Computer implements java.io.Serializable { // Creating class Computer
    private int powerSupply; // fields
    private float processor;
    private int videoCard;
    private String motherBoard;
    boolean computerStatusOn;

    public Computer() { // default constructor
    }

    /* getter and setter methods
    BEGIN powerSupply */
    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    // BEGIN processor
    public float getProcessor() {
        return processor;
    }

    public void setProcessor(float processor) {
        this.processor = processor;
    }

    // BEGIN videoCard
    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    // BEGIN motherBoard
    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void turnOnComputer() {
        System.out.println("Type 1 and press Enter to turn me on");
        System.out.println("Type 2 if don't wanna please me");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.println("It's alive!");
                chooseWhatToDoNext();
                break;
            case 2:
                System.out.println("Give me the power and nobody gets hurt! Please!");
                System.out.println("Computer power not turned on. Do you know what \"eien\" means in Japanese?\n"); // it means "eternity"
                turnOnComputer();
                break;
            default:
                System.out.println("You can choose only between 1 and 2");
                turnOnComputer();
                break;
        }

    }

    public void chooseWhatToDoNext() {
        System.out.println("What do you want to do next?");
        System.out.println("Type 1 to shut down. Type 2 to install operating system");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                turnOffComputer();
                break;
            case 2:
                chooseOSToInstall();
                break;
            default:
                System.out.println("You can choose only between 1 and 2");
                chooseWhatToDoNext();
                break;
        }
    }

    public void turnOffComputer() {
        System.out.println("Shutting down. Done.");
    }

    public void chooseOSToInstall() {
        System.out.println("What OS do you want to install?");
        System.out.println("\t 1 Apple OS X \n\t 2 FreeBSD \n\t 3 GNU/Linux \n\t 4 Windows \n\t 5 To go back");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
            case 2:
            case 3:
            case 4:
                installOS();
                break;
            case 5:
                chooseWhatToDoNext();
                break;
            case 6:

            default:
                chooseOSToInstall();
                break;
        }
    }

    public void installOS() {
        System.out.println("Installed");
        System.out.println("Do you want to boot OS and install some software?");
        System.out.println("Type 1 to boot OS. Type 2 to shut down.");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                bootOS();
                break;
            case 2:
                turnOffComputer();
                break;
        }
    }

    public void bootOS() {
        System.out.println("Booted");
        System.out.println("You can install Calculator and FileManager.");
        System.out.println("\t 1 Install both; \n\t 2 Install Calculator \n\t 3 Install FileManager");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                installCalculator();
                installFileManager();
                break;
            case 2:

                installCalculator();
                break;
            case 3:
                installFileManager();
                break;
            case 4:
                turnOffComputer();
                break;
            default:
                System.out.println("You can choose only between 1 and 2");
                bootOS();
                break;
        }
    }

    public void installCalculator() {
        System.out.println("Calculator installed");
    }

    public void installFileManager() {
        System.out.println("FileManager installed");
    }

    public Calculator runCalculator() throws ComputerAccessException {
        this.computerStatusOn = computerStatusOn;

        if (computerStatusOn) {
            System.out.println("Computer is On and Calculator can run");
        } else {
            throw new ComputerAccessException("You can't use this program because computer is off\n");
        }
        return null;
    }
}

