class A {
    void display() {
        System.out.println("Scene is beautiful");
    }
}

class B extends A {
    void display() {
        System.out.println("Scene not beautiful");
    }
}

public class dynamic {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}