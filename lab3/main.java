// Abstract class defining the template method
abstract class main {
    // Template method defining the overall process
    public final void makeBeverage() {
        boilWater();
        addMainIngredient();
        pourInCup();
        addCondiments();
    }

    // Abstract methods to be implemented by subclasses
    abstract void addMainIngredient();
    abstract void addCondiments();

    // Common methods
    void boilWater() {
        System.out.println("Boiling water");
    }
    
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

// Concrete subclass for making tea
class TeaMaker extends main {
    // Implementing abstract methods
    @Override
    void addMainIngredient() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}

// Concrete subclass for making coffee
class CoffeeMaker extends main {
    // Implementing abstract methods
    @Override
    void addMainIngredient() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Making tea:");
        main teaMaker = new TeaMaker();
        teaMaker.makeBeverage();
    
        System.out.println("\nMaking coffee:");
        main coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();
    }
}

