package it.unitn.lingprogmod1.rogergheser.slotMachine;

import javafx.scene.text.Text;

public class DigitalCounter extends Text {
    private int numberOfDigits;
    private String value;

    public DigitalCounter(int numberOfDigits) {
        this.value = "";
        this.numberOfDigits = numberOfDigits;
        for (int i=0; i<numberOfDigits; i++)
            this.value = this.value + "0";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
