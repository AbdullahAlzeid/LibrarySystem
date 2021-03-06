package com.example.librarysystem;
import Entities.Book;
import Entities.Borrowes;
import Entities.PhysicalBook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MemberHomeWidgetController{

    @FXML
    public Button returnButton, renewButton;

    @FXML
    public Label title, ISBN, authors, publisher, volume, rackNumber, releaseDate, ReturnDate, borrowDate,language;

    private Borrowes borrowes;

    private ApplicationController controller = new ApplicationController();


    public void renewBook(ActionEvent event) throws IOException {
        //Update sql query.
        ApplicationController.setBorrowInfo(borrowes);
        controller.renewBook(event);
    }

    public void returnBook(ActionEvent event) throws IOException {
        //Update sql query.
       Pane pane = (Pane)((Node) event.getSource()).getParent();
       ((FlowPane) pane.getParent()).getChildren().remove(pane);
    }

    public void initialize() {
        borrowes = ApplicationController.getBorrowInfo();
        title.setText(borrowes.getBook().getTitle());
        ISBN.setText(borrowes.getBook().getISBN()+"");
        authors.setText(borrowes.getBook().getAuthors());
        publisher.setText(borrowes.getBook().getPublisherName());
        volume.setText(borrowes.getBook().getVolume()+"");
        rackNumber.setText(((PhysicalBook) borrowes.getBook()).getRackNum()+"");
        releaseDate.setText(borrowes.getBook().getReleaseDate());
        language.setText(borrowes.getBook().getLanguage());
        borrowDate.setText(borrowes.getStartDate());
        ReturnDate.setText(borrowes.getReturnDate());
    }
}
