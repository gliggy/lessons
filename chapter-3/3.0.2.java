public class Person
{
    public String name;
    public int age;
    public double weight;

    public Person(String p_name, int p_age, double p_weight)
    {
        name   = p_name;
        age    = p_age;
        weight = p_weight;
    }
    public void print() {
        System.out.println("The person's name is " + this.name);
        System.out.println("The person's age is " + this.age);
    }
    public static void main(String[] args) {
        Person leo = new Person("leo", -42, 0);
        leo.print();
    }

}
