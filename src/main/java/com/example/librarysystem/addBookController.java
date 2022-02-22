package com.example.librarysystem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class addBookController {

    @FXML
    public TextField title, ISBN, volume, rDate, pName, categories, language, barcode, authors, rackNum;

    private ApplicationController controller = new ApplicationController();

    public void addBook(ActionEvent event) throws IOException {
        //take data from text fields above then assign it to queries.
        //add member sql query.
        controller.aBCScreen(event);
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
