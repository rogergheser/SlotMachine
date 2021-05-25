package it.unitn.lingprogmod1.rogergheser.slotMachine;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class SlotMachine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        DigitalCounter credit = new DigitalCounter(6);

        // Slot Wheels
        HBox slotWheels = new HBox();
        // CoinHolder
        VBox coinStack = new VBox();
        for (int i=0; i<3; i++) {
            slotWheels.getChildren().add(new SymbolWheel());
            coinStack.getChildren().add(new Coin(credit, coinStack));
        }
        // Buttons
        HBox buttons = new HBox();
        // add SMButtons

        SlotMachineInterface slotmachine = new SlotMachineInterface(slotWheels, new Label(), null , buttons, null);
        HBox root = new HBox(slotmachine, coinStack);
        primaryStage.setTitle("Amir Gheser");
        primaryStage.setScene(new Scene(root,500, 500));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}