package it.unitn.lingprogmod1.rogergheser.slotMachine;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class SlotMachineInterface extends BorderPane {
    // TOP LABEL
    // HBOX OF WHEELS CENTRE
    // RIGHT COINS
    // BUTTONS BOTTOM
    // LEFT NOTHING


    public SlotMachineInterface(Node node, Node node1, Node node2, Node node3, Node node4) {
        super(node, node1, node2, node3, node4);
//        this.setCenter(node);
//        this.setTop(node1);
//        this.setRight(node2);
//        this.setBottom(node3);
//        this.setLeft(node4);
        this.setAlignment(node, Pos.CENTER);
        this.setAlignment(node1, Pos.TOP_CENTER);
    }
}
