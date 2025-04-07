public class Person {
    void showPerson() {
        System.out.println("I  am a person");
    }
}

class Student extends Person {
    void showStudent() {
        System.out.println("I am a student");
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.showPerson();
        s.showStudent();
    }
}