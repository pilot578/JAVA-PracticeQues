class Animal{//base class
    void eat(){
        System.out.println("This animal eats");
    }
}
class Dog extends Animal{ //inherited class
void bark(){
    System.out.println("Dog barks");
}
}
class Inheritance1{
    public static void main(String[] args){
    Dog d = new Dog();//object creation
    d.bark();//own method
    d.eat();//inherited method
}
}
