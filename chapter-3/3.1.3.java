public class Main {
public enum Animals {
    COW("moo"),
    SHEEP("baa"),
    DOG("woof"),
    CAT("meow");

    private String sound;

    //the constructor MUST be private
    private Animals(String sound) {
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }
}

public static void main(String[] args) {
    for (Animals animal : Animals.values()) {
        System.out.println(animal + ": " + animal.getSound());
    }
}
}
