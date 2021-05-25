package it.unitn.lingprogmod1.rogergheser.slotMachine;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class SMButton extends Button implements EventHandler<MouseEvent> {
    boolean isActive;
    public SMButton(String s) {
        super(s);
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, this);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        switch (((SMButton) mouseEvent.getSource()).getText()){
            case ("RESET"): // reset the fucking game
                break;
            case ("SPIN"): // DJ SPIN THAT SHIT
                break;
            case ("PAY"): // PAY UP
                break;
            default:
                System.out.println("Unexpected click detected");
                break;
        }

    }
}
