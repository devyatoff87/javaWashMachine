import washmachine.Siemens_ABC1;
import washmachine.helpers.CheckAndRun;

import java.util.Scanner;  // Import the Scanner class


public class Main {
    public static void main(String[] args) {
        String inputString;
        int inputInt;
        double inputDouble;
        boolean flag = false;
        Siemens_ABC1 siemens_abc1;
        System.out.println("Hello. Please type yours wash machine model name in.");

        inputString = new Scanner(System.in).nextLine();

        if(CheckAndRun.checkTheName(inputString)) {
            flag = true;
        }

        siemens_abc1 = new Siemens_ABC1(inputString);

        inputString = new Scanner(System.in).nextLine();

        CheckAndRun.checkForUserInput(inputString, siemens_abc1);

        CheckAndRun.chooseProgram(siemens_abc1);
     }
}