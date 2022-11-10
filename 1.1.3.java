public class Program
{
    public static void main(String[] args)
    {
        String hello = "Hello world!";
        int i = hello.length();
        System.out.println(hello);
        while (i > 0) {
            hello = hello.substring(0,i - 1);
            System.out.println(hello);
            i = hello.length();
        }
    }
}
