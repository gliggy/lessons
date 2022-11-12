public class Main {
    public static void main(String[] args) {
        Point myPoint = new Point();
        Point2D myPoint2D = new Point2D(3,5);
        Point3D myPoint3D = new Point3D(7,2,4);

        System.out.print("point: ");
            myPoint.print();
        System.out.print("point2D: ");
            myPoint2D.print();
        System.out.print("point3D: ");
            myPoint3D.print();
    }
}

class Point {
    public Point() {}
    public void print() {
        System.out.println("This is a point");
    }
}

class Point2D extends Point {
    int x;
    int y;
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class Point3D extends Point2D {
    int z;
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    @Override
    public void print() {
        System.out.println("(" + x + "," + y + "," + z + ")");
    }
}

/*
This assignment asks that you create 3 Classes: Point, Point2D, and Point3D, where Point2D is a subclass of Point and Point3D is a subclass of Point2D
    • Point, Point2D, and Point3D all have print methods
    • Point's print should print "This is a point"
    • Point2D should have 2 instance variables x and y, and its print should print (x, y)
    • Point3D should have an instance variable z and its print should print(x, y, z)
*/
