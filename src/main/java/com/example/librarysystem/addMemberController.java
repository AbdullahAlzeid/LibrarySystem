package com.example.librarysystem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class addMemberController {

    @FXML
    public TextField fNameField, lNameField, phNumberField, emailField, userName,pass1Field, pass2Field, barcodeField, birthDate;

    private ApplicationController controller = new ApplicationController();

    public void addMember(ActionEvent event) throws IOException {
        if(!pass1Field.getText().equals(pass2Field.getText()) || pass1Field.getText().length() == 0 || pass2Field.getText().length() == 0){
            //not match
        } else {
            //take data from text fields above then assign it to queries.
            String fname = fNameField.getText();
            //add member sql query.
            controller.aMCScreen(event);
        }
    }

    public void switchToMLScreen(ActionEvent event) throws IOException {
        controller.switchToMLScreen(event);
    }

    public void switchToReportsScreen(ActionEvent event) throws IOException {
        controller.switchToReportsScreen1(event);
    }

    public void switchToLibrarianHomeScreen(ActionEvent event) throws IOException {
        controller.switchToLibrarianHomeScreen(event);
    }

    public void switchToBLScreen(ActionEvent event) throws IOException {
        controller.switchToBLScreen(event);
    }

    public void logOut(ActionEvent event) throws IOException {
        controller.logOut(event);
    }

}
