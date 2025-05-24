// Product interface
interface Animal {
    void speak();
}

// Concrete Product 1
class Dog implements Animal {
    public void speak() {
        System.out.println("This is sound of a dog:Woof!");
    }
}

// Concrete Product 2
class Cat implements Animal {
    public void speak() {
        System.out.println(" This is sound of a cat:Meow!");
    }
}

// Factory class
class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }
}

// Demo class
public class FactoryDemo {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.speak(); 

        Animal cat = AnimalFactory.getAnimal("cat");
        cat.speak(); 
    }
}