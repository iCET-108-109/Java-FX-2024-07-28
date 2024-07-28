package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {
    public Label lblSample;

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        lblSample.setText("Hello Java-FX");

    }
}
