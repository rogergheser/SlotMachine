package it.unitn.lingprogmod1.rogergheser.slotMachine;

public class ConstrainedSMButton extends SMButton{ //for buttons that arent always available
    boolean isActive = true;
    public ConstrainedSMButton(String s) {
        super(s);
    }
}
