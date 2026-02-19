import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
String reverse = "";
for(int i=s.length()-1;i>=0;i--){//length-1 = last index, i till comes to 0, backwrd 
reverse += s.charAt(i);
}
System.out.println("Reversed string is: " + reverse);
        sc.close();
    }
}
