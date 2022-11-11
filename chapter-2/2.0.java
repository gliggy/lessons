public class Program
{
    public static double average(double x, double y, double z) {
        //'twould be funny if it was double-u (w)
        double avg = (x + y + z) / 3;
        return avg;
    }
    public static void main(String[] args) {
        double output = average(3, 4.5, 17.5);
        System.out.println(output);
    }
}

