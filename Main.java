package com.sseraphim.javalessons;

public class Main {

    public static void main(String args[]) {
        Computer myComp = new Computer(); //  object myComp
        myComp.setPowerSupply(450);
        myComp.setProcessor(2.4f);
        myComp.setVideoCard(11);
        myComp.setMotherBoard("Asus P5K");
        myComp.turnOnComputer();
        System.out.println(myComp.getPowerSupply() + "\n" + myComp.getProcessor()
                + "\n" + myComp.getVideoCard() + "\n" + myComp.getMotherBoard());
    }
}

