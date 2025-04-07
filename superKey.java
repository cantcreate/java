class baseClass {
    int value = 10;

    baseClass(String msg) {
        System.out.println("Message from Baseclass" + msg);
    }

    void display() {
        System.out.println("Displayfunction from baseClass");

    }
}

class ChildClass extends baseClass {

    ChildClass() {
        super("Calling from ChildClass");
        System.out.println("Value from Baseclass:" + super.value);
        super.display();
    }
}

public class superKey {
    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
    }

}
