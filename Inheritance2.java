class Area{
    int l,b;
    Area(int l, int b){
this.l = l;
this.b = b;
    }
    void computeArea(){
        System.out.println("Area is: " + (l*b));
    }
}
class Volume extends Area{
    int h;
    Volume(int l, int b, int h){
       super(l,b);
       this.h = h;
    }
    void computeVolume(){
        System.out.println("Volume is: " + (l*b*h));
    }
}
class Inheritance2{
    public static void Main(String args[]){
       Volume obj = new Volume(2,3,5);
       obj.computeArea();
       obj.computeVolume();
    }
}
