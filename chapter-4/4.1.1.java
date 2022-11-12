import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("pear");
    for (int i = 0; i < fruits.size(); i++) {
        System.out.println(fruits.get(i));
    }
    System.out.println("there are " + fruits.size() + " elements in fruits");


}
}
