import java.util.Arrays;
//import java.util.ArrayList;
public class Program
{
    public static double[] binarySort(double[] array) {
        double[] sortedArray = new double[0];
        return sortedArray;
    }
    public static int binarySearch(double[] array, double target, int start, int end) {
        int half = (start + end) / 2;
        if (end < start) {
            return -1;
        }
        if (array[half] == target) {
            return half;
        } else if (array[half] > target) {
            return binarySearch(array, target, start, half - 1);
        } else {
            return binarySearch(array, target, half + 1, end);
        }
    }
    public static void main(String[] args)
    {
        double[] numbers = new double[] {0, 0.5, 1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5};
        System.out.println(Arrays.toString(binarySort(numbers)));
        System.out.println(binarySearch(numbers, 492.6, 0, numbers.length - 1));
    }
}
