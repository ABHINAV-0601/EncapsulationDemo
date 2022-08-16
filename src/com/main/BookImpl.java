package com.main;
import com.data.Book;
public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Five Point Someone");
        book.setAuthorName("Chetan Bhagat");
        book.setYearOfPublication(2004);
        book.setPrice(250.64);
        book.setISBN(458745821422L);

        System.out.println("book.getTitle() = " + book.getTitle());
        System.out.println("book.getAuthorName() = " + book.getAuthorName());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println("book.getISBN() = " + book.getISBN());
        System.out.println("book.getPrice() = " + book.getPrice());
    }


}
