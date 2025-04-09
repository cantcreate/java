class ZuperClass {
    void display() {
        System.out.println("Display from ZuperClass");
    }
}

class Sum extends ZuperClass {
    void display() {
        System.out.println("Sum :");
    }
}

public class Main2 { // yesma ma main snga vayako 2 hatayo vane kaam garxa autai ko 2 ota name vayara
                     // 2 rakhya matra ho 2 hataunai parxa run garna
    public static void main(String args[]) {
        ZuperClass zuperclass = new ZuperClass();
        zuperclass.display();
        Sum sum = new Sum();
        sum.display();
        ZuperClass obj = new Sum();
        obj.display();

    }
}