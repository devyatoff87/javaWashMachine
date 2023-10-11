package washmachine;

public class WashMachine {
    private String washMachinePowder;
    private double washMachinePowderAmount;

    private String washMachineModelName;
    private boolean washMachineState = false;

    WashMachine(String washMachineModelName) {
        this.washMachineModelName = washMachineModelName;
    }

    WashMachine(String washMachineModelName, double washMachinePowderAmount, String washMachinePowder) {
        this.washMachinePowderAmount = washMachinePowderAmount;
        this.washMachinePowder = washMachinePowder;
        this.washMachineModelName = washMachineModelName;
    }

    public String getWashMachineModelName() {
        return this.washMachineModelName;
    }

    public String getWashMachinePowder() {
        return this.washMachinePowder;
    }

    public double getWashMachinePowderAmount() {
        return washMachinePowderAmount;
    }

    public void setWashMachineModelName(String washMachineModelName) {
        this.washMachineModelName = washMachineModelName;
    }

    public void setWashMachinePowder(String washMachinePowder) {
        this.washMachinePowder = washMachinePowder;
    }

    public void setWashMachinePowderAmount(double washMachinePowderAmount) {
        this.washMachinePowderAmount = washMachinePowderAmount;
    }

    public void setWashMachineON() {
        this.washMachineState = true;
    }
    public void setWashMachineOFF() {
        this.washMachineState = false;
    }

    public boolean getWashMachineState() {
        return this.washMachineState;
    }
}









