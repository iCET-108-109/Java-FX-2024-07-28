package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
    public Label lblSample;
    public TextField txtUserName;
    public TextField txtPassword;

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        String userName = txtUserName.getText();

        String password = txtPassword.getText();
        System.out.println("User Name : "+userName+"\n"+"Password : "+password);
    }
}
