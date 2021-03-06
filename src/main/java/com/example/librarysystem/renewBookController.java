package com.example.librarysystem;
import Entities.Borrowes;
import Entities.PhysicalBook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class renewBookController {

    @FXML
    public TextField rDate;

    private ApplicationController controller = new ApplicationController();

    private Borrowes borrowes;

    public void renewB(ActionEvent event) throws IOException {
        if(rDate.getText().length() != 0) {
            String returnDate = rDate.getText();
            //take data from text fields above then assign it to queries.
            //update book sql query.
            //add borrow sql query.
            controller.brrBCScreen(event);
        }
    }

    public void switchToBookListScreen(ActionEvent event) throws IOException {
        controller.switchToBookListScreen(event);
    }

    public void switchToReserveScreen(ActionEvent event) throws IOException {
        controller.switchToReserveScreen(event);
    }

    public void switchToMemberHomeScreen(ActionEvent event) throws IOException {
        controller.switchToMemberHomeScreen(event);
    }

    public void logOut(ActionEvent event) throws IOException {
        controller.logOut(event);
    }
    public void initialize() {
        borrowes = ApplicationController.getBorrowInfo();
        rDate.setText(borrowes.getReturnDate());
    }
}
