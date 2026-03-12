 interface Area {
     public final float PI = 3.14f;
     double compute(double a, double b);//abstract method
}
class Rect implements Area{
 public double compute(double a, double b){//overidden
return (a*b);
}}
class Circle implements Area{
    public double compute(double a, double b){
        return (PI*a*a);
    }
}
class TestInterface{
    public static void main(String[] args){
        Rect obj = new Rect();
        Circle obj2 = new Circle();
        System.out.println(obj.compute(2,4));
        System.out.println(obj2.compute(1,8));
    }
}

