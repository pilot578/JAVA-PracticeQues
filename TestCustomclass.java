class Custom extends Exception{
    Custom(String msg){
        super(msg);
    }
}
class TestCustomclass{
    public static void main(String[] args){
        double a,b,c;
        try{
        a=3;
        b=2;
        c=a+b;
        if(c<4){
            System.out.println("Too small");
        }else{
System.out.println(c);
        }
    }catch(Exception e){
        System.out.println(e);
    }
}
}