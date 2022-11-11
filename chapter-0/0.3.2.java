public class Program {
public static void main(String[] args) {
	double x = 1;
	double y = 0.5;
	if (x > y) {
		System.out.println("x is greater than y");
	}
	if (x == 1 && !(y == 1)) {
		System.out.println("x is equal to 1 and y is not equal to 1");
	}
	if (x == 1 && y == 1) {
		System.out.println("x and y are equal to 1");
	} else if (x == 1 || y == 1) {
		System.out.println("either x or y is equal to 1, but not both");
	} else {
		System.out.println("neither x nor y are equal to 1");
	}
}
}
