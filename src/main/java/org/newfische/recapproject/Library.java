package org.newfische.recapproject;
//Create a Java application together to apply the knowledge learned.
//Step 1: Create a class 'Book' with the properties 'title', 'author', and 'isbn'. Implement getter and setter methods for these properties.
//Step 2: Override the toString method of the 'Book' class to display the book information in a readable format.
//Step 3: Create a class 'Library' with an array of 'Book' objects.
//Step 4: Override the toString method of the 'Library' class to display the information of the 'Library' in a readable format.
//Step 5: Create an instance of the 'Library' class with an array of 'Book' objects. Print the library information to the console.

import java.util.Arrays;

public class Library {
   private Book[]  books;

    public Library(Book[] books) {
        this.books = books;

    }

    public String toString() {
        return "Library: " + Arrays.toString(books) ;
    }

    public Book[] addBook(Book newBook) {
        Book[] newBooks = new Book[this.books.length + 1];

        for(int i = 0; i < this.books.length; i++) {
            newBooks[i] = this.books[i];
        }
        newBooks[newBooks.length - 1] = newBook;

        this.books = newBooks;

        return this.books;
    }

    public Book[] deleteBook(Book newBook) {
        Book[] newBooks = new Book[this.books.length - 1];

        for(int i = 0; i < this.books.length; i++) {
            if(this.books[i].getBookId() != newBook.getBookId()) {
                newBooks[i] = this.books[i];
            }
        }

        this.books = newBooks;

        return this.books;
    }
}
