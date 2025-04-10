class single {
    public void display() {
        System.out.println("Inside display");
    }
}

class inheritance extends single {
    public void area() {
        System.out.println("inside area");
    }
}

public class Tester {
    public static void main(String[] args) {
        inheritance inh = new inheritance();
        inh.display();
        inh.area();
    }
}
