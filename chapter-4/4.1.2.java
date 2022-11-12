import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> prices = new HashMap<String, Double>();
        prices.put("beans", 1.82);
        prices.put("spaghetti", 3.12);
        prices.put("weetabix", 5.36);
        System.out.println("the price of beans is $" + prices.get("beans"));
        System.out.println("the price of spaghetti is $" + prices.get("spaghetti"));
        System.out.println("the price of weetabix is $" + prices.get("weetabix"));
    }
}
