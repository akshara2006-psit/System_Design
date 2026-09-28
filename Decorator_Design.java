interface Coffee {
    String getDescription();
    int getCost();
}
class PlainCoffee implements Coffee {
    public String getDescription() {
        return "Plain Coffee";
    }

    public int getCost() {
        return 50;
    }
}
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // the coffee being wrapped

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
class Milk extends CoffeeDecorator {
    Milk(Coffee coffee) { super(coffee); }

    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }

    public int getCost() {
        return coffee.getCost() + 10;
    }
}

class Sugar extends CoffeeDecorator {
    Sugar(Coffee coffee) { super(coffee); }

    public String getDescription() {
        return coffee.getDescription() + " + Sugar";
    }

    public int getCost() {
        return coffee.getCost() + 5;
    }
}

class Chocolate extends CoffeeDecorator {
    Chocolate(Coffee coffee) { super(coffee); }

    public String getDescription() {
        return coffee.getDescription() + " + Chocolate";
    }

    public int getCost() {
        return coffee.getCost() + 20;
    }
}
public class Decorator_Design{
    public static void main(String[] args) {
        Coffee myCoffee = new PlainCoffee();
        myCoffee = new Milk(myCoffee);       // wrap with milk
        myCoffee = new Sugar(myCoffee);      // wrap with sugar
        myCoffee = new Chocolate(myCoffee);  // wrap with chocolate

        System.out.println(myCoffee.getDescription());
        System.out.println("Total: Rs. " + myCoffee.getCost());
    }
}