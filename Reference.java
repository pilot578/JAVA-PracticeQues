class Animal {
    void eat(){
        System.out.println("This animal eats!");
    }
}
class Reference{
    public static void main(String[] args){
        Animal a = new Animal(); //reference variable
        a.eat();//method calling
    }
}
