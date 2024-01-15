# Library System

![Alt text](/images/DB.png)

## Overview
The Library System is a Java-based application designed to manage library operations efficiently. This system covers various functionalities such as book management, member management, and borrowing processes.

## Database Schema
![Alt text](/images/Schema.png)

## Features
- **Book Management**: Allows librarians to add, edit, and manage books.
- **Member Management**: Facilitates the addition and management of library members.
- **Borrowing System**: Enables members to borrow and renew books.


## Components
1. **Entity Classes**: 
   - `AudioBook`, `PhysicalBook`: Extensions of the `Book` class with specific attributes like audio length and physical book details. ([AudioBook.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/AudioBook.java), [PhysicalBook.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/PhysicalBook.java))
   - `Member`, `Librarian`: Represent library members and librarians with unique attributes. ([Member.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/Member.java), [Librarian.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/Entities/Librarian.java))
   - Other entities like `Borrowes`, `Category`, `Language`, `Publisher`, `Requests` provide a comprehensive model for the library system.

2. **Controllers and Widgets**: 
   - Controllers like `ApplicationController`, `EditBookController`, `addBookController`, `addMemberController` handle the application's logic and user interactions. ([ApplicationController.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/com/example/librarysystem/ApplicationController.java))
   - Widgets such as `MLMemberWidget`, `MSCWidgetController`, `MemberHomeWidgetController` provide specific functionalities within the application's GUI. ([MLMemberWidget.java](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/java/com/example/librarysystem/MLMemberWidget.java))

3. **FXML Files**: 
   - Define the layout of the user interface for different functionalities like borrowing books, adding members, and more. ([borrow-book-screen.fxml](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/src/main/resources/com/example/librarysystem/borrow-book-screen.fxml))


## How to Run
The application is built using JavaFX. To run the application:
1. Ensure Java and JavaFX are installed on your system.
2. Clone the repository.
3. Navigate to `src/main/java/com/example/librarysystem/` and run `ApplicationDriver.java`.

## Database
The system uses SQL for data management. The database schema and initial setup are provided in the repository. ([Dump20220217.sql](https://github.com/AbdullahAlzeid/LibrarySystem/blob/main/Dump20220217.sql))

## Authors
- [AbdullahAlzeid](https://github.com/AbdullahAlzeid)
- [Yaarob988](https://github.com/Yaarob988)
- [Omarjsg](https://github.com/Omarjsg)

## License
This project is licensed under the [MIT License](LICENSE).
