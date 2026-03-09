import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();
   String reverse = "";
   String original = s;
   for(int i=s.length()-1;i>=0;i--){
    reverse += s.charAt(i);
   }
   if(reverse == original){
    System.out.println("String is a palindrome!.");
   }
   else{
    System.out.println("String is not a palindrome!");
   }
        sc.close();
    }
}
