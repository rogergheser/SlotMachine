package it.unitn.lingprogmod1.rogergheser.slotMachine;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Coin extends StackPane {
    private final String text = "€1";
    private DigitalCounter creditValue;
    private VBox coinStack;
    // add the coin container Node to ease interaction and removal of the Node
    public Coin(DigitalCounter creditValue, VBox coinStack) {
        this.creditValue = creditValue;
        this.coinStack = coinStack;
        Circle circle = new Circle(30, Color.YELLOW);
        circle.setStroke(Color.BLACK);
        Text textBox = new Text(text);
        textBox.setFont(Font.font("Arial", circle.getRadius()*0.83));
        this.getChildren().addAll(circle, textBox);

        EventHandler<MouseEvent> consumeCoin = (MouseEvent e) -> {

            coinStack.getChildren().remove(1);
            int value = Integer.parseInt(creditValue.getValue());
            creditValue.setValue((value+100) + "");
            //check if the value does update

        };
    }
}
