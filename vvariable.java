class SuperClass {
    int variableA;

    SuperClass(int variableA) {
        this.variableA = variableA;
    }
}

class SubClass extends SuperClass {
    int variableB;

    SubClass(int variableA) {
        super(variableA);
        variableB = super.variableA * 2;
    }

    void displayVariables() {
        System.out.println("The value of SuperClass: " + super.variableA);
        System.out.println("The value of SubClass: " + variableB);
    }
}
class vvariable{
    public static void main(String[] args) {

        SubClass obj = new SubClass(10);
        obj.displayVariables();

    }
}