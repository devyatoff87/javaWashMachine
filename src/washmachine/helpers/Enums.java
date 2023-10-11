package washmachine.helpers;

public class Enums {
    public enum washMachineState {
        ON, OFF
    }
    public enum washMachineBasicFunction {
        WASH,
        FLUSH,
        SPIN
    }

    public enum WashMachineRuntime {
        FAST,
        AVERAGE,
        EXTENSIVE
    }

    public enum WashMachineSpecificFunction {
        MULTICOLORED_30,
        MULTICOLORED_40,
        MULTICOLORED_60,
        DELICATE,
        BOILED,
        SYNTHETIC
    }

    public enum WashMachineLoad {
        FULL,
        HALF,
        THIRD
    }
}
