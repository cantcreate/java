public class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of integer" + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of double" + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three interger" + (a + b + c));
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(23.1, 2.2);
        obj.add(1, 2, 4);
        obj.add(3, 2);
    }
}