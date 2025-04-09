class Sum {
    void add(int a, int b) {
        System.out.println("Sum from superclass" + (a + b));
    }
}

class subsum extends Sum {
    void add(int a, int b) {
        System.out.println("Sum from Sub class" + (a + b + 10));
    }
}

public class Main {

    public static void main(String[] args) {
        Sum obj1 = new Sum();
        obj1.add(1, 2);
        Sum obj2 = new subsum();
        obj2.add(1, 2);
    }

}