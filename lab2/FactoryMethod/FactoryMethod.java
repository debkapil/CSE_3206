//Product Interface
interface Product {
    void doStuff();
}

// Concrete Products
class ConcreteProductA implements Product {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA is doing stuff.");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB is doing stuff.");
    }
}

// Creator (Abstract Class)
abstract class Creator {
    // Factory Method
    public abstract Product createProduct();

    public void someOperation() {
        Product product = createProduct();
        product.doStuff();
    }
}

// Concrete Creators
class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

// Main Class to Test the Pattern
public class FactoryMethod {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation(); // Output: ConcreteProductA is doing stuff.

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation(); // Output: ConcreteProductB is doing stuff.
    }
}