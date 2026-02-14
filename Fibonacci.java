import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int terms = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series: ");
        for(int i=0;i<terms;i++){
            System.out.print(a + " ");
           int fibo =a+b;
            a = b;
            b = fibo;
        }
        sc.close();
    }
}