interface FoodItem{
    public String getDescription();
    public int getPrice();
}

class Pizza implements FoodItem {
    protected String name;
    protected int price;

    public Pizza(String name) {
        this.name = name;
        price = 200; 
    }

    @Override
    public String getDescription() {
        return this.name; 
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

abstract class Decorator implements FoodItem { // is a 
    protected FoodItem foodItem; // has a
    protected int price;

    protected Decorator(FoodItem foodItem, int price) {
        this.foodItem = foodItem;
        this.price = price;
    }
}

class ExtraCheeseDecorator extends Decorator {

    public ExtraCheeseDecorator(FoodItem foodItem, int price) {
        super(foodItem, price);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with Extra Cheese";
    }

    @Override
    public int getPrice() {
        return foodItem.getPrice() + price;
    }
}

class ExtraSauceDecorator extends Decorator {

    public ExtraSauceDecorator(FoodItem foodItem, int price) {
        super(foodItem, price);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with Extra Sauce"; 
    }

    @Override
    public int getPrice() {
        return foodItem.getPrice() + price;
    }
}

class ExtraPaneerDecorator extends Decorator {
    public ExtraPaneerDecorator(FoodItem foodItem, int price) {
        super(foodItem, price);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with Extra Paneer";
    }

    @Override
    public int getPrice() {
        return foodItem.getPrice() + price;
    }
    
}

public class MakeFastFood {
    public static void main(String[] args) {
        FoodItem pizza = new Pizza("Paneer Pizza");
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());

        pizza = new ExtraCheeseDecorator(pizza, 100);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());

        pizza = new ExtraPaneerDecorator(pizza, 160);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());

        pizza = new ExtraSauceDecorator(pizza, 80);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }
}
