class outerClass{
class innerClass{
    void display(){
        System.out.println("This is inner class non-static");
    }
}
public static void main(String[] args){
    outerClass obj = new outerClass();
outerClass.innerClass obj2 = obj.new innerClass();
obj2.display();
}}  

