public class Program
{
    public static void main(String[] args)
    {
	int[] nums = new int[] {0, 1, 2, 3, 4};
	int i = 0;
	int sum = 0;
	while (i < nums.length) {
	    sum += nums[i];
	    i++;
	}
	System.out.println(sum);

    }
}
