package org.newfische.recapproject;

//Create a Java application together to apply the knowledge learned.
//Step 1: Create a class 'Book' with the properties 'title', 'author', and 'isbn'. Implement getter and setter methods for these properties.
//Step 2: Override the toString method of the 'Book' class to display the book information in a readable format.
//Step 3: Create a class 'Library' with an array of 'Book' objects.
//Step 4: Override the toString method of the 'Library' class to display the information of the 'Library' in a readable format.
//Step 5: Create an instance of the 'Library' class with an array of 'Book' objects. Print the library information to the console.

public class Book {
    private int BookId;
    private String title;
    private String author;
    private String isbn;

    public Book(int BookId, String title, String author, String isbn) {
        this.BookId = BookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public int getBookId() {
        return BookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "Book: title = " + title + ", author = " + author + ", isbn = " + isbn;
    }

}
