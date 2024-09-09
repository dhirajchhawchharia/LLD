import java.util.*;

public class BookIterator implements IteratorInterface {
    List<Book> bookList;
    int index;

    public BookIterator(List<Book> list) {
        this.bookList = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookList.size())
            return true;
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()) {
            return bookList.get(index++);
        }
        return null;
    }
}