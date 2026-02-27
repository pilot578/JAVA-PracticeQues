import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int num= sc.nextInt();
int og = num;
int rev = 0;
while(num>0){
    int digit  = num % 10;
    rev = rev*10+digit;
    num/=10;
}
if(rev == og){
    System.out.println("Yes number is palindrome!");
}
else{
    System.out.println("No number is not palindrome!");
}
sc.close();
    }   
}
