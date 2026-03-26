interface Area {
public final float PI = 3.23f;
public double compute(double a, double b);
}
class TestAnnony{
    public static void main(String[] args){
    Area rec = new Area(){
        public double compute(double a, double b){
        return a*b;
    }
};
System.out.println(rec.compute(2,6));
    }
}