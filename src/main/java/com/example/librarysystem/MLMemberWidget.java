package com.example.librarysystem;
import Entities.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MLMemberWidget {

    @FXML
    public Button returnButton, renewButton;

    @FXML
    public Label name, id, email, username, barcode, phone, active, borrowedBooks;

    private Member member;

    private ApplicationController controller = new ApplicationController();

    public void cancelMembership(ActionEvent event) throws IOException {
        //Delete sql query.
       Pane pane = (Pane)((Node) event.getSource()).getParent();
       ((FlowPane) pane.getParent()).getChildren().remove(pane);
    }

    public void initialize() {
        member = ApplicationController.getMember();
        name.setText(member.getFirstName() + " " + member.getLastName());
        id.setText(member.getId() + "");
        email.setText(member.getEmail());
        username.setText(member.getUsername());
        barcode.setText(member.getBarcode() + "");
        phone.setText(member.getPhoneNum());
        active.setText(member.isActive()+"");
        borrowedBooks.setText(member.getBorrowedBooks()+"");
    }
}
