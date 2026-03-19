import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int original = num;
        int digit;
        int sum = 0;
        while(num>0){
       digit=num % 10;
       sum += (digit*digit*digit);
       num /= 10;
        }
        if(sum == original){
            System.out.println("Number is Amstrong!");
        }
        else{
            System.out.println("Number is not Armstrong!");
        }
        sc.close();
    }
}
