class outerClass{
    static class NestedClass{
void display(){
    System.out.println("This is nested class");
}
    }
    public static void main(String[] args){
        NestedClass obj = new NestedClass();
        obj.display();
    }
}
