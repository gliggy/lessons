public class Point {
    public int x;
    public int y;
    public Point(int p_x, int p_y) {
        x = p_x;
        y = p_y;
    }
    public static void main(String[] args) {
        Point p = new Point(5,3);
        System.out.println("the coords are (" + p.x + "," + p.y + ")");
    }
}
