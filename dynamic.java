class A {
    void display() {
        System.out.println("Display A");
    }
}

class B extends A {
    void display() {
        System.out.println("Display B");
    }
}

public class dynamic {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}