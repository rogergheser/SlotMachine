package it.unitn.lingprogmod1.rogergheser.slotMachine;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Label extends StackPane { // extension must be fixed
    // just graphics

    public Label() {
        Rectangle rect = new Rectangle(340, 100, Color.RED);
        rect.setStroke(Color.GRAY);

        Text text2 = new Text("super");
        text2.setFont(Font.font(25));
        text2.setFill(Color.ORANGE);

        Text text1 = new Text("SLOTS");
        text1.setFill(Color.ORANGE);
        text1.setFont(Font.font("Verdana", FontWeight.BOLD, 40));
        VBox text = new VBox(text2, text1);
        text.setAlignment(Pos.TOP_CENTER);

        this.getChildren().addAll(rect, text);
    }

}
