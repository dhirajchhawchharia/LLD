import java.util.*;

public class LibraryAggregator implements AggregateIterator {
    List<Book> bookList;

    public LibraryAggregator(List<Book> list) {
        this.bookList = list;
    }

    @Override
    public IteratorInterface createIterator() {
        return new BookIterator(bookList);
    }
}