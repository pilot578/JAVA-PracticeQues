class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    void printColor(){
        System.out.println(super.color);
        System.out.println(color);
    }}
    class InheritanceS{
        public static void main(String[] args){
            Dog d = new Dog();
            d.printColor();
        }
    }

    
