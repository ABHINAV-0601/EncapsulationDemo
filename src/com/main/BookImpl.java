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
        //getting and printing the values
        System.out.println("Title = " + book.getTitle());
        System.out.println("Author Name = " + book.getAuthorName());
        System.out.println("Year Of Publication = " + book.getYearOfPublication());
        System.out.println("ISBN = " + book.getISBN());
        System.out.println("Price = " + book.getPrice());
    }


}
