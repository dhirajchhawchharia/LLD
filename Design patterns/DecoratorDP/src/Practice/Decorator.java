package Practice;

interface FoodItem {
    public String getDescription();
    public int getPrice();
}

class Pizza implements FoodItem {
    String name;
    int price;

    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

abstract class DecoratorItem implements FoodItem {
    FoodItem foodItem;
    int price;

    protected DecoratorItem(FoodItem foodItem, int price) {
        this.foodItem = foodItem;
        this.price = price;
    }
}

class CheeseDecorator extends DecoratorItem {
    public CheeseDecorator(FoodItem foodItem) {
        super(foodItem, 100);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with Cheese";
    }

    @Override
    public int getPrice() {
        return foodItem.getPrice() + price;
    }
}

class SauceDecorator extends DecoratorItem {
    public SauceDecorator(FoodItem foodItem) {
        super(foodItem, 50);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with Extra sauce";
    }

    @Override
    public int getPrice() {
        return foodItem.getPrice() + price;
    }
}

public class Decorator {
    public static void main(String[] args) {
        FoodItem pizza = new Pizza("Cheese Paneer Pizza", 200);
        System.out.println(pizza.getDescription() + " " + pizza.getPrice());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " " + pizza.getPrice());

        pizza = new SauceDecorator(pizza);
        System.out.println(pizza.getDescription() + " " + pizza.getPrice());
    }
}
