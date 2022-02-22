package com.example.librarysystem;
import Entities.Book;
import Entities.PhysicalBook;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class EditBookController {

    @FXML
    public TextField title, ISBN, volume, rDate, pName, categories, language, barcode, authors, rackNum;

    private ApplicationController controller = new ApplicationController();

    private PhysicalBook book;

    public void edit(ActionEvent event) throws IOException {
        //take data from text fields above then assign it to queries.
        //update book sql query.
        controller.eBCScreen(event);
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
    public void initialize() {
        book = ApplicationController.getBookData();
        title.setText(book.getTitle());
        ISBN.setText(book.getISBN()+"");
        authors.setText(book.getAuthors());
        pName.setText(book.getPublisherName());
        volume.setText(book.getVolume()+"");
        rackNum.setText(book.getRackNum()+"");
        rDate.setText(book.getReleaseDate());
        language.setText(book.getLanguage());
        barcode.setText(book.getBarcode()+ "");
    }
}
