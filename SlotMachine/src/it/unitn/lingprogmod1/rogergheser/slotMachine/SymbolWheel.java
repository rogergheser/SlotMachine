package it.unitn.lingprogmod1.rogergheser.slotMachine;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.Random;

public class SymbolWheel extends StackPane {
    final private String[] symbols = {"🍇", "🍒", "🍊", "🍋", "🍕", "🍭"}; // fill with emoji
    //final private String[] symbols = {"a", "b", "c", "d"};
    public SymbolWheel() {
        Random random = new Random();
        int index = random.nextInt(symbols.length);
        Rectangle rect = new Rectangle();
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.DARKGRAY);
        rect.setArcHeight(2.5);
        rect.setArcWidth(2.5);
        Text text = new Text(symbols[index]);
        text.setFont(Font.font("Symbola",40));
        this.getChildren().addAll(rect, text);
    }

    public void spin(){
        Random random = new Random();
        int index = random.nextInt(symbols.length+1);
        Text text = new Text(symbols[index]);
        if (this.getChildren().get(1) instanceof Text)
            this.getChildren().remove(1);
        else
            System.out.println("Error detected");
        this.getChildren().add(text);

    }
}
