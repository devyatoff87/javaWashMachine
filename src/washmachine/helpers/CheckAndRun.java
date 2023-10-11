package washmachine.helpers;

import washmachine.WashMachine;

import java.util.Scanner;

public class CheckAndRun {
    public static boolean checkTheName(String name) {
        int index = 0;
        if(!name.trim().isEmpty() && name.length() > 3) {
            System.out.println("Alright. You can switch on your \"" + name + "\" now. Please type \"switch on\" for that.");
            return true;
        }
        System.out.println("Whether you typed a non exist model or nothing. Please improve!");
        name = new Scanner(System.in).nextLine();
        checkTheName(name);
        return false;
    }
    public static boolean checkForUserInput(String inp, WashMachine washMachine ) {
        if(inp.equals("switch on") && !inp.trim().isEmpty()) {
            washMachine.setWashMachineON();
            System.out.println("The wash machine is on now.");
        }else {
            System.out.println("ERROR. You typed a wrong command. Type \"switch on\" for switching the machine on please.");
            inp = new Scanner(System.in).nextLine();
            checkForUserInput(inp, washMachine);
        }
        return true;
    }

    public static boolean chooseProgram(WashMachine washMachine) {
        int index = 1;
        System.out.println("The " + washMachine.getWashMachineModelName() + " has next programs: ");

        for(washmachine.helpers.Enums.WashMachineSpecificFunction program: washmachine.helpers.Enums.WashMachineSpecificFunction.values()) {
            System.out.println(program + " (Program " + index++  + ")");
        }
        System.out.println("Chose the number of a program you want to wish with:");

        int inp = new Scanner(System.in).nextInt();

        if(inp > 0 && inp < index) {
            System.out.println("Your machine has been started washing with " + washmachine.helpers.Enums.WashMachineSpecificFunction.values()[index-2] + " program number " + (index-1));
        } else {
            System.out.println("ERROR. Your chosen program doesn't exist");
            chooseProgram(washMachine);
        }
        return true;
    }
}
