# Library System

![Alt text](/images/DB.png)

## Overview
The Library System is a Java-based application designed to manage library operations efficiently. This system covers various functionalities such as book management, member management, and borrowing processes.

## Database Schema


## Features
- **Book Management**: Allows librarians to add, edit, and manage books.
- **Member Management**: Facilitates the addition and management of library members.
- **Borrowing System**: Enables members to borrow and renew books.

## How to Run
The application is built using JavaFX. To run the application:
1. Ensure Java and JavaFX are installed on your system.
2. Clone the repository.
3. Navigate to `src/main/java/com/example/librarysystem/` and run `ApplicationDriver.java`.

## Key Components
- **Entities**: Contains classes like `Book`, `Member`, representing the core data structures. ([Book.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/Book.java), [Member.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/Member.java))
- **Controllers**: Handle the application logic. For example, `addBookController` manages the addition of books. ([EditBookController.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/com/example/librarysystem/EditBookController.java))
- **FXML Files**: Define the user interface layout. ([add-book-screen.fxml](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/resources/com/example/librarysystem/add-book-screen.fxml))

## Database
The system uses SQL for data management. The database schema and initial setup are provided in the repository. ([Dump20220217.sql](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/Dump20220217.sql))

## Detailed Components
1. **Entity Classes**: 
   - `AudioBook`, `PhysicalBook`: Extensions of the `Book` class with specific attributes like audio length and physical book details. ([AudioBook.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/AudioBook.java), [PhysicalBook.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/PhysicalBook.java))
   - `Member`, `Librarian`: Represent library members and librarians with unique attributes. ([Member.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/Member.java), [Librarian.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/Librarian.java))
   - Other entities like `Borrowes`, `Category`, `Language`, `Publisher`, `Requests` provide a comprehensive model for the library system.

2. **Controllers and Widgets**: 
   - Controllers like `ApplicationController`, `EditBookController`, `addBookController`, `addMemberController` handle the application's logic and user interactions. ([ApplicationController.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/com/example/librarysystem/ApplicationController.java))
   - Widgets such as `MLMemberWidget`, `MSCWidgetController`, `MemberHomeWidgetController` provide specific functionalities within the application's GUI. ([MLMemberWidget.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/com/example/librarysystem/MLMemberWidget.java))

3. **FXML Files**: 
   - Define the layout of the user interface for different functionalities like borrowing books, adding members, and more. ([borrow-book-screen.fxml](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/resources/com/example/librarysystem/borrow-book-screen.fxml))

## License
This project is licensed under the [MIT License](LICENSE).
