package demo;

import java.util.ArrayList;

/**
 * Created by 152658F on 10/24/2016.
 */
public class BookDBAO {
    // get book details given the bookId
    // this method is dummy for now
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }
    public ArrayList<BookDetails> getAllBookDetails() {
        return getAllBooks();
    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }

    private ArrayList<BookDetails> getAllBooks(){
        ArrayList<BookDetails>bookArr = new ArrayList();
        BookDetails details = new BookDetails();
        details.setBookId("100");
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Oak");
        details.setSurname("Benaza");
        details.setInventory(6);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("From Oak to Java");
        details.setYear(2015);
        bookArr.add(details);

        BookDetails details2 = new BookDetails();
        details2.setBookId("105");
        details2.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details2.setFirstName("Linus");
        details2.setSurname("XxXx");
        details2.setInventory(5);
        details2.setOnSale(false);
        details2.setPrice(5.9f);
        details2.setTitle("All About Linux");
        details2.setYear(2015);
        bookArr.add(details2);

        BookDetails details3 = new BookDetails();
        details3.setBookId("105");
        details3.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details3.setFirstName("Linus");
        details3.setSurname("XxXx");
        details3.setInventory(5);
        details3.setOnSale(false);
        details3.setPrice(5.9f);
        details3.setTitle("All About Linux");
        details3.setYear(2015);
        bookArr.add(details3);

        return bookArr;
    }
}
