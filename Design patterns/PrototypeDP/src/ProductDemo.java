interface ProductPrototype {
    ProductPrototype clone();
    void display();
}

class Product implements ProductPrototype {
    public String name;
    public Integer price;

    Product(String n, Integer p) {
        name = n;
        price = p;
    }

    @Override
    public ProductPrototype clone() {
        return new Product(name, price);
    }

    @Override
    public void display() {
        System.out.println("This is Product with name=" + name + "  price=" + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        ProductPrototype p1 = new Product("abc", 123);
        p1.display();

        ProductPrototype p2 = p1.clone();
        ProductPrototype p3 = p2.clone();
        p2.display();
        p3.display();
    }
}
