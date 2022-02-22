package com.example.librarysystem;

import Entities.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationController {
    private Stage stage;
    private Scene scene;
    private AnchorPane root;
    private static PhysicalBook book;
    private static Member member;
    private static Librarian librarian;
    private static Person currentAccount;
    private static Borrowes borrowes;
    public static String choice;
    private static Requests requests;

    @FXML
    public TextField catalogTF, reserveTF;
    @FXML
    public ComboBox sCombo;

    /*
    ################################    Member and Librarian    ################################
     */

    public void auth(ActionEvent event) throws IOException {
        String type = "librarian";
        if (type.equals("librarian")) {
            switchToLibrarianHomeScreen(event);
        } else if (type.equals("member")){
            switchToMemberHomeScreen(event);
        }
    }

    public void logOut(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("log-in.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        member = null;
        librarian = null;
        currentAccount = null;
    }

    public static Member getMember() {
        return member;
    }

    public static void setMember(Member member) {
        ApplicationController.member = member;
    }

    public static Librarian getLibrarian() {
        return librarian;
    }

    public static void setLibrarian(Librarian librarian) {
        ApplicationController.librarian = librarian;
    }

    public static Person getCurrentAccount() {
        return currentAccount;
    }

    public static void setCurrentAccount(Person currentAccount) {
        ApplicationController.currentAccount = currentAccount;
    }

    public static Requests getRequests() {
        return requests;
    }

    public static void setRequests(Requests requests) {
        ApplicationController.requests = requests;
    }

    /*
    ################################    Member    ################################
    */

    public void switchToMemberHomeScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("member-home-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        sCombo = ((ComboBox) root.getChildren().get(2));
        ObservableList<String> list = FXCollections.observableArrayList("Title", "Author", "Category", "Release date");
        addHomeWidgets((ScrollPane) root.getChildren().get(root.getChildren().size() - 1));
        sCombo.setItems(list);
        stage.setScene(scene);
        stage.show();
    }

    public void searchCatalog(ActionEvent event) throws IOException {
        if (choice != null){
            root = FXMLLoader.load(getClass().getResource("search-catalog-screen.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            addSearchedBWidgets((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
            stage.setScene(scene);
            stage.show();
            choice = null;
        }
    }

    public void switchToReserveScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("reserve-book-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToBookListScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("books-list-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        sCombo = ((ComboBox) root.getChildren().get(2));
        ObservableList<String> list = FXCollections.observableArrayList("Title", "Author", "Category", "Release date");
        sCombo.setItems(list);
        addSearchedBWidgets((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
        stage.setScene(scene);
        stage.show();
    }



    public void switchToResConfirmScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("reserve-confirm-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void reserve(ActionEvent event) throws IOException {
        if(!reserveTF.getText().isEmpty()){
            String bookTitle = reserveTF.getText();
            //sql new record in request table.
            switchToResConfirmScreen(event);

        }
    }

    public void borrowBook(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("borrow-book-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void brrBCScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("brrBCScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void renewBook(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("renew-book-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void rnuBCScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("rnuBCScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    private void addHomeWidgets(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String type = "physical", format= "Test format", title = "Test title", publisherName = "Test publisher name", language = "Test language", releaseDate = "Test release date", audioLength = "Test audio length", startDate = "Test start date", returnDate = "Test return date", authors = "Test authors";
        int ISBN = 999, volume = 999, barcode = 999, copyNumber = 999, rackNum = 999;

        //I put 5 for experiment change it to records number.
        for(int i = 0; i < 5; i++) {
            //Retrieve sql data here and assign them to decide which type of book should be constructed.
            if (type == "physical"){
                this.borrowes = new Borrowes(new PhysicalBook(ISBN, volume, title, publisherName, language, releaseDate, barcode, copyNumber, rackNum,format, authors), member, startDate, returnDate, 20.0);
                pane = FXMLLoader.load(getClass().getResource("borrowed-book-widgit.fxml"));
                fp.getChildren().add(pane);
            } else {
                //this.borrowes = new Borrowes(new AudioBook(), this.memberAccount, startDate, returnDate, 0.0);
                //pane = FXMLLoader.load(getClass().getResource("borrowed-book-widgit.fxml"));
                //fp.getChildren().add(pane);
            }
        }
    }

    private void addSearchedBWidgets(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String type = "physical", format= "Test format", title = "Test title", publisherName = "Test publisher name", language = "Test language", releaseDate = "Test release date", audioLength = "Test audio length", startDate = "Test start date", returnDate = "Test return date", authors = "Test authors";
        int ISBN = 999, volume = 999, barcode = 999, copyNumber = 999, rackNum = 999;

        //I put 5 for experiment change it to records number.
        for(int i = 0; i < 5; i++) {
            //Retrieve sql data here and assign them to decide which type of book should be constructed.
            book = new PhysicalBook(ISBN, volume, title, publisherName, language, releaseDate, barcode, copyNumber, rackNum,format, authors);
            pane = FXMLLoader.load(getClass().getResource("searched-book-widgit.fxml"));
            fp.getChildren().add(pane);
        }
    }

    public void selectCB(ActionEvent event){
        choice = sCombo.getSelectionModel().getSelectedItem().toString();
        System.out.println(choice);
    }

    public static Borrowes getBorrowInfo(){
        return borrowes;
    }

    public static void setBorrowInfo(Borrowes borrowes) {
        ApplicationController.borrowes = borrowes;
    }

    public static void setBook(PhysicalBook book){
        ApplicationController.book = book;
    }

    public static PhysicalBook getBookData(){
        return book;
    }

    /*
    ################################    Librarian    ################################
    */

    public void switchToLibrarianHomeScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("librarian-home-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        addRQWidget((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
        stage.setScene(scene);
        stage.show();
    }

    public void switchToBLScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("librarian-bl-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        addBLWidgets((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
        stage.setScene(scene);
        stage.show();
    }

    public void editBook(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("edit-bbok-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void eBCScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("eBCScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void addBLWidgets(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String type = "physical", format= "Test format", title = "Test title", publisherName = "Test publisher name", language = "Test language", releaseDate = "Test release date", audioLength = "Test audio length", startDate = "Test start date", returnDate = "Test return date", authors = "Test authors";
        int ISBN = 999, volume = 999, barcode = 999, copyNumber = 999, rackNum = 999;
        //I put 20 for experiment change it to records number.
        for(int i = 0; i <= 20; i++) {
            //Retrieve sql data here and assign them to decide which type of book should be constructed.
            if (type == "physical"){
                book = new PhysicalBook(ISBN, volume, title, publisherName, language, releaseDate, barcode, copyNumber, rackNum, format, authors);
                pane = FXMLLoader.load(getClass().getResource("librarian-book-widgit.fxml"));
                fp.getChildren().add(pane);
            } else {
                //book = new AudioBook();
                //pane = FXMLLoader.load(getClass().getResource("borrowed-book-widgit.fxml"));
                //fp.getChildren().add(pane);
            }
        }
    }

    private void addRQWidget(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String title = "Test title", requestDate = "Test request date";
        String firstName = "Test first name", lastName = "Test last name", userName = "Username", email = "Test email", phoneNum = "Phone phone number", joinDate = "Test join date", birthDate = "Test birth date";
        int id = 999, barcode = 999, borrowedBooks = 999;
        boolean active = true, status = true;
        //I put 20 for experiment change it to records number.
        for(int i = 0; i <= 20; i++) {
            //Retrieve sql data here and assign them to decide which type of book should be constructed.

            requests = new Requests(new Member(firstName, lastName, userName, email, phoneNum, id, joinDate, birthDate, barcode, borrowedBooks, status, active), title, requestDate);
            pane = FXMLLoader.load(getClass().getResource("book-request-widget.fxml"));
            fp.getChildren().add(pane);
        }
    }

    public void switchToMLScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("librarian-ml-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        memberListWidget((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
        stage.setScene(scene);
        stage.show();
    }

    private void memberListWidget(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String firstName = "Test first name", lastName = "Test last name", userName = "Username", email = "Test email", phoneNum = "Phone number", joinDate = "Test join date", birthDate = "Test birth date";
        int id = 999, barcode = 999, borrowedBooks = 999;
        boolean active = true, status = true;
        //I put 20 for experiment change it to records number.
        for(int i = 0; i <= 20; i++) {
            //Retrieve sql data here and assign them to decide which type of book should be constructed.

            member = new Member(firstName, lastName, userName, email, phoneNum, id, joinDate, birthDate, barcode, borrowedBooks, status, active);
            pane = FXMLLoader.load(getClass().getResource("edit-member-widgit.fxml"));
            fp.getChildren().add(pane);
        }
    }

    public void addMemberScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("add-member-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void aMCScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("aMCSreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addBookScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("add-book-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void aBCScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("aBCScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void requestLoanScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("request-loan-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void rLCScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("rLCScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToReportsScreen1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("report-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        reports1SWidgets((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
        stage.setScene(scene);
        stage.show();
    }

    private void reports1SWidgets(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String firstName = "Test first name", lastName = "Test last name", userName = "Username", email = "Test email", phoneNum = "Phone number", joinDate = "Test join date", birthDate = "Test birth date";
        int id = 999, barcode = 999, borrowedBooks = 999;
        boolean active = true, status = true;
        //I put 20 for experiment change it to records number.
        for(int i = 0; i <= 20; i++) {
            //Retrieve sql data here and assign them to decide which type of member should be constructed.
            member = new Member(firstName, lastName, userName, email, phoneNum, id, joinDate, birthDate, barcode, borrowedBooks, status, active);
            pane = FXMLLoader.load(getClass().getResource("reports1-widget.fxml"));
            fp.getChildren().add(pane);
        }
    }

    //List all members and their penalty amounts.
    public void switchToReportsScreen2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("report-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        reports2SWidgets((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
        stage.setScene(scene);
        stage.show();
    }

    private void reports2SWidgets(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String firstName = "Test first name", lastName = "Test last name", userName = "Username", email = "Test email", phoneNum = "Phone number", joinDate = "Test join date", birthDate = "Test birth date", type = "physical", format= "Test format", title = "Test title", publisherName = "Test publisher name", language = "Test language", releaseDate = "Test release date", audioLength = "Test audio length", startDate = "Test start date", returnDate = "Test return date", authors = "Test authors";
        boolean active = true, status = true;
        int id = 999, barcode = 999, borrowedBooks = 999, ISBN = 999, volume = 999, bBbarcode = 999, copyNumber = 999, rackNum = 999;;
        //I put 20 for experiment change it to records number.
        for(int i = 0; i <= 20; i++) {
            //Retrieve sql data here and assign them to decide which type of borrow should be constructed.
            this.borrowes = new Borrowes(new PhysicalBook(ISBN, volume, title, publisherName, language, releaseDate, barcode, copyNumber, rackNum,format, authors), new Member(firstName, lastName, userName, email, phoneNum, id, joinDate, birthDate, barcode, borrowedBooks, status, active), startDate, returnDate, 20.0);
            pane = FXMLLoader.load(getClass().getResource("reports2-widget.fxml"));
            fp.getChildren().add(pane);
        }
    }

    //List members who more than 3 books and who have exceeded 120 days for at least one book.
    public void switchToReportsScreen3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("report-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        reports3SWidgets((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
        stage.setScene(scene);
        stage.show();
    }

    private void reports3SWidgets(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String firstName = "Test first name", lastName = "Test last name", userName = "Username", email = "Test email", phoneNum = "Phone number", joinDate = "Test join date", birthDate = "Test birth date", type = "physical", format= "Test format", title = "Test title", publisherName = "Test publisher name", language = "Test language", releaseDate = "Test release date", audioLength = "Test audio length", startDate = "Test start date", returnDate = "Test return date", authors = "Test authors";
        boolean active = true, status = true;
        int id = 999, barcode = 999, borrowedBooks = 999, ISBN = 999, volume = 999, bBbarcode = 999, copyNumber = 999, rackNum = 999;;
        //I put 20 for experiment change it to records number.
        for(int i = 0; i <= 20; i++) {
            //Retrieve sql data here and assign them to decide which type of book should be constructed.
            borrowes = new Borrowes(new PhysicalBook(ISBN, volume, title, publisherName, language, releaseDate, barcode, copyNumber, rackNum,format, authors), new Member(firstName, lastName, userName, email, phoneNum, id, joinDate, birthDate, barcode, borrowedBooks, status, active), startDate, returnDate, 20.0);
            pane = FXMLLoader.load(getClass().getResource("reports3-widget.fxml"));
            fp.getChildren().add(pane);
        }
    }

    //List members who check out books but return them at least one day before due date.
    public void switchToReportsScreen4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("report-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        reports4SWidgets((ScrollPane) root.getChildren().get(root.getChildren().size()-1));
        stage.setScene(scene);
        stage.show();
    }

    private void reports4SWidgets(ScrollPane sp) throws IOException {
        FlowPane fp;
        Pane pane;
        fp = (FlowPane) sp.getContent();
        fp.getChildren().clear();
        String firstName = "Test first name", lastName = "Test last name", userName = "Username", email = "Test email", phoneNum = "Phone number", joinDate = "Test join date", birthDate = "Test birth date", type = "physical", format= "Test format", title = "Test title", publisherName = "Test publisher name", language = "Test language", releaseDate = "Test release date", audioLength = "Test audio length", startDate = "Test start date", returnDate = "Test return date", authors = "Test authors";
        boolean active = true, status = true;
        int id = 999, barcode = 999, borrowedBooks = 999, ISBN = 999, volume = 999, bBbarcode = 999, copyNumber = 999, rackNum = 999;;
        //I put 20 for experiment change it to records number.
        for(int i = 0; i <= 20; i++) {
            //Retrieve sql data here and assign them to decide which type of book should be constructed.
            this.borrowes = new Borrowes(new PhysicalBook(ISBN, volume, title, publisherName, language, releaseDate, barcode, copyNumber, rackNum,format, authors), new Member(firstName, lastName, userName, email, phoneNum, id, joinDate, birthDate, barcode, borrowedBooks, status, active), startDate, returnDate, 20.0);
            pane = FXMLLoader.load(getClass().getResource("reports4-widget.fxml"));
            fp.getChildren().add(pane);
        }
    }


}