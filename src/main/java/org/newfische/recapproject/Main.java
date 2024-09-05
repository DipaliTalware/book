package org.newfische.recapproject;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Jeffrey Archer", "The Grass is Always Greener", "1-86092-049-7");
        System.out.println(book1.toString());

        Book book2 = new Book("The Great Switcheroo","Roald Dahl","1-86092-034-9");

        Book[] books = {book1, book2};
        Library library = new Library(books);
        System.out.println(library.toString());

    }
}