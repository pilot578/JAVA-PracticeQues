import java.util.Scanner;
public class LCMjava{
   static int findGCD(int a, int b){
        while(b!=0){
           int temp = b;
           b = a % b;
           a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter first number : ");
int num1 = sc.nextInt();
System.out.println("Enter Second number : ");
int num2 = sc.nextInt();
int gcd = findGCD(num1, num2);
int Lcm = (num1 * num2)/gcd;
System.out.println("LCM IS: " + Lcm);,
sc.close();
    }
}