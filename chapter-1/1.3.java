public class Program
{
    public static void main(String[] args)
    {
        boolean greaterThanZero = true;
        //set it to true so that a single number can ruin it FOREVER
        double[] numbers = new double[] {0, 0.5, 1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5};
        for (double number : numbers) {
            if (number > 10) {
                System.out.println(number + " is greater than 10");
            } else {
                System.out.println(number + " is not greater than 10");
            }
            if (number <= 0) {
                greaterThanZero = false;
            } //a single number flips the variable
        }
        if (greaterThanZero) {
            System.out.println("the numbers are all greater than 0");
        } //this is where we actally end up using it
    }
}
