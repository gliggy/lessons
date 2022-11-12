public class Main {
public static void main(String[] args) {
    Animal animal = new Animal("animal");
    Dog dog = new Dog();
    Cat cat = new Cat();
    System.out.print(animal.getType() + ": ");
    animal.speak();
    System.out.print(dog.getType() + ": ");
    dog.speak();
    System.out.print(cat.getType() + ": ");
    cat.speak();
}
}
class Animal {
    private String type;
    public Animal(String type) {
        this.type = type;
    }
    public void speak() {
        System.out.println("hi");
    }
    public String getType() {
        return type;
    }
}
class Dog extends Animal {
    public Dog() {
        super("dog");
    }
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    public Cat() {
        super("cat");
    }
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}

/*
Animal, Dog, and Cat where Dog and Cat are subclasses of Animal.
    • Animal class should have a speak method which prints "hi"
    • Dog class should have a speak method that overrides the speak method of Animal and prints "Bark"
    • Cat class should have a speak method that overrides the speak method of Animal and prints "Meow"
*/
