import java.util.ArrayList;

public class Main {

public static Comparable findLargest(Comparable obj1)
{
    Comparable index = obj1.get(0);
    int result;
    for (int i = 0; i < obj1.size(); i++) {
        if (obj1.get(i).compareTo(result) == ) {
            
        }
            case 0:
                return null;
                break;
            case (obj1.get(i).compareTo(result) > 0):
                result = obj1.get(i);
                break;
            case (obj1.get(i).compareTo(result) < 0):
                break;
        }
    }
    return result;
}

public static void main(String[] args) {
    ArrayList<Comparable> numbers = new ArrayList<Comparable>();
    numbers.add(7);
    numbers.add(12);
    numbers.add(4);
    System.out.println(findLargest(numbers));
}

}

/*
Create a better version of the findLargest method that takes in an ArrayList of type Comparable and returns the largest element in that ArrayList
*/
