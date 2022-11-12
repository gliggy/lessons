public class Main {
    public static void main(String[] args) {
        Dog doggy = new Dog("doggy");
        doggy.run(18);
        doggy.eat("kibble");
        doggy.sleep(12);
    }
}

interface Actions {
    void run(int speed);
    void eat(String food);
    void sleep(int time);
}
class Dog implements Actions {
    String name;
    public Dog(String name) {
        this.name = name;
    }
    public void run(int speed) {
        System.out.println(name + " can run at " + speed + " mph");
    }
    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }
    public void sleep(int hours) {
        System.out.println(name + " sleeps for " + hours + " hours");
    }

}

/*
Create an interface that lists the actions that a certain type of animal can do. Then create a basic class of an animal that would implement this interface.
*/
