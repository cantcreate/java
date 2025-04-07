public class Over {
    void display(int a) {
        System.out.println("integer" + a);
    }

    void display(int a, int b) {
        System.out.println("Sum" + (a + b));
    }

    void display(double a) {
        System.out.println("Double" + a);
    }

    public static void main(String[] args) {
        Over obj = new Over();
        obj.display(23);
        obj.display(67, 56);
        obj.display(89.78);
    }

}
