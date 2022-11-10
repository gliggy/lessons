public class Program
{
    public static void main(String[] args)
    {
	int[] nums = new int[] {0, 1, 2, 3, 4, 5};
	for (int i = 1; i < 101; i++) {
	    if (i % 5 == 0) {
		continue;
	    }
	    System.out.println(i);
	}
    }
}
