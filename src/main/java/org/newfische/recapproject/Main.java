package org.newfische.recapproject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Jeffrey Archer", "The Grass is Always Greener", "1-86092-049-7");
        Book book2 = new Book(2,"The Great Switcheroo","Roald Dahl","1-86092-034-9");
        Book newBook = new Book(3,"The Speckled Band","Sir Arthur Conan Doyle","1-86092-003-9");

//        System.out.println(book1.toString());

        Book[] books = {book1, book2};

        Library library = new Library(books);

//        System.out.println(library.toString());
        System.out.println("Add 3rd book: " + Arrays.toString(library.addBook(newBook)));
        System.out.println("---------");
        System.out.println("Remove book: " + Arrays.toString(library.deleteBook(newBook)));

    }
}