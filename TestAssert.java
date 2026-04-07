import java.util.Scanner;
class TestAssert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter age: ");
        age = sc.nextInt();
        
        assert age > 0 : "Age not negative.";
        sc.close();
    }
}