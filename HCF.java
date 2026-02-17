import java.util.Scanner;
public class HCF {
    public static int HCF(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
            return a;
    }
        public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter num1: ");
int num1 = sc.nextInt();
System.out.println("Enter num2: ");
int num2 = sc.nextInt();
System.out.println("The HCF is: " + HCF(num1, num2));
sc.close();
    }
}
