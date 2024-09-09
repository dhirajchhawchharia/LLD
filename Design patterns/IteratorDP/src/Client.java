import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(
                Arrays.asList(
                        new Book(100, "A"),
                        new Book(200, "B"),
                        new Book(300, "C"),
                        new Book(400, "D"),
                        new Book(500, "E")
                )
        );
        AggregateIterator aggregate = new LibraryAggregator(books);
        IteratorInterface bookIterator = aggregate.createIterator();
        while(bookIterator.hasNext()) {
            Book book = (Book) bookIterator.next();
            System.out.println(book.name + " " + book.price);
        }
    }
}