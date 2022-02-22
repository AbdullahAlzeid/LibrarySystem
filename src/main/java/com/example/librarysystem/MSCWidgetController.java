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

public class MSCWidgetController {

    @FXML
    public Button returnButton, renewButton;

    @FXML
    public Label title, ISBN, authors, publisher, volume, rackNumber, releaseDate, language;

    private PhysicalBook book;

    private ApplicationController controller = new ApplicationController();

    public void checkOut(ActionEvent event) throws IOException {
        //Update sql query.
       controller.borrowBook(event);
    }

    public void initialize() {
        book = ApplicationController.getBookData();
        title.setText(book.getTitle());
        ISBN.setText(book.getISBN()+"");
        authors.setText(book.getAuthors());
        publisher.setText(book.getPublisherName());
        volume.setText(book.getVolume()+"");
        rackNumber.setText(book.getRackNum()+"");
        releaseDate.setText(book.getReleaseDate());
        language.setText(book.getLanguage());
    }

}
