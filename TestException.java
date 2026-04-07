class MyException extends Exception{
MyException(String m){
    super(m);
}
}
 class TestException{
    public static void main(String[] args){
        try{
            throw new MyException("Too small");
        } catch(MyException e){
System.out.println(e.getMessage());
        }
    }
 }