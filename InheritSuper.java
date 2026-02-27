import java.util.Scanner;
class Area {
    Scanner sc = new Scanner(System.in);
    int l, b;
    Area(){
        l = 0;
        b = 0;
}
Area(int l, int b){
    this.l = l;
    this.b = b;
}
void getData(){
    System.out.println("Enter length: ");
    l=sc.nextInt();
    System.out.println("Enter breadth: ")
    b=sc.nextInt();
}
void ComputeArea(){
    System.out,println("Area is: " + (l*b));
}
}
class Volume extends Area{
    Scanner sc1 = new Scanner(System.in);
    int p,q,r;
    Volume(){
        super();
        p=0;
        q=0;
        r=0;
    }
    Volume(int p, int q, int r){
        super(p, q);
        this.p = p;
        this.q = q;
        this.r = r;
    }
    void getData(){
        super.getData();
        System.out.println("Enter length: ");
        p=sc1.nextInt();
        System.out.println("Enter breadth: ");
        q=sc1.nextInt();
        System.out.println("Enter height: ");
        r=sc1.nextInt();
    }
    void ComputeVolume(){
        System.out.println("The volume is: " + p*q*r);
    }
}
class InheritSuper{
    public static void main(String[] args){
        Volume obj = new Volume(1,2,3);
        obj.getData();
        obj.ComputeVolume();
        obj.ComputeArea();
    }
}
