public class Program
{
    public static int max(int[] array) {
        int result = array[0];
        for (int elem: array) {
            if (elem > result) {
                result = elem;
            }
        }
        return result;
    }
    public static int min(int[] array) {
        int result = array[0];
        for (int elem: array) {
            if (elem < result) {
                result = elem;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] intArray = new int[] {9, 0, 3, -5, 11};
        System.out.println("min: " + min(intArray));
        System.out.println("max: " + max(intArray));
    }
}
