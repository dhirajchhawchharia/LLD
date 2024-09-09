public class Book {
    int price;
    String name;

    public Book(int price, String bookName) {
        this.price = price;
        name = bookName;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
