interface Area{
    public final float PI = 3.14f;
    double compute(double a, double b);
}

class Rect implements Area{
    public double compute(double a, double b){
return a*b;
    }
}
    class Circle implements Area{
        public double compute(double a, double b){
            return (PI*a*a);
        }
    }
    class Testinterfacee{
    public static void main(String[] args) {
  Rect obj = new Rect();
  Area  = (a,b)-> (a*b);
  System.out.println(obj.compute(8,5));      
    
}
}