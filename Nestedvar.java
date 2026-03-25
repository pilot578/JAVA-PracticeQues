class OuterClass {
    static int varx = 20;
    static class NestedClass{
        void print(){
            System.out.println("Static var: " + varx);
        }
    }
    public static void main(String[] args){
        NestedClass obj = new NestedClass();
        obj.print();
    }
}
