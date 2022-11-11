public class Main {
    public static void main(String[] args) {
        Point3D test = new Point3D(2, 4.6, 7);
        Point3D sum = test.add(test);
        Point3D difference = test.subtract(test);
        sum.print();
        difference.print();
    }
}

class Point3D {
    public double x;
    public double y;
    public double z;
    public Point3D(double p_x, double p_y, double p_z) {
        x = p_x;
        y = p_y;
        z = p_z;
    }
    public Point3D add(Point3D other) {
        Point3D sum = new Point3D(this.x + other.x, this.y + other.y, this.z + other.z);
        return sum;
    }
    public Point3D subtract(Point3D other) {
        Point3D difference = new Point3D(this.x - other.x, this.y - other.y, this.z - other.z);
        return difference;
    }
    public void print() {
        System.out.println("(" + this.x + "," + this.y + "," + this.z + ")");
    }
}

/*
Define a Point3D class with three doubles, "x", "y", and "z", with a constructor, and two methods .add(Point3D other) and .subtract(Point3D other) which create a new Point3D whose x, y,
and z values are the sum or difference of those of this and other respectively.
*/
