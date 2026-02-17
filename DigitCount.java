import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int count = 0;
while(num!=0){
num /= 10;
count++;

}
System.out.println("No. of digits in given number is : " + count);
        sc.close();
    }
}
