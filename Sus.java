public class Sus {
    void display(int a, int b) {
        System.out.println("Sum of two number" + (a + b));
    }

    void display(int a, int b, int c) {
        System.out.println("Sum of three number" + (a + b + c));
    }

    public static void main(String args[]) {
        Sus obj = new Sus();
        obj.display(35, 5);
        obj.display(5, 5, 5);
    }
}
