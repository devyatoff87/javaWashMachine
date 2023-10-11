package washmachine;

public class Siemens_ABC1 extends WashMachine {
    private int timer;

    enum washMachineRuntime {
        FAST,
        AVERAGE,
        EXTENSIVE,
        SOAK
    }

    public Siemens_ABC1(String washMachineModelName) {
        super(washMachineModelName);
    }

    public Siemens_ABC1(String washMachineModelName, double washMachinePowderAmount, String washMachinePowder) {
        super(washMachineModelName, washMachinePowderAmount, washMachinePowder);
    }

    public Siemens_ABC1(String washMachineModelName, double washMachinePowderAmount, String washMachinePowder, int timer) {
        super(washMachineModelName, washMachinePowderAmount, washMachinePowder);
        this.timer = timer;
    }

    public int getTimer() {
        return this.timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
