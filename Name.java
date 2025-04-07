class Name {
    static void display(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        display("Bishal", "Aryan", "Shikshya", "Prashamsa");
    }
}
