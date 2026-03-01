import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<input.length();i++){
        if(input.charAt(i) != ' '){
            sb.append(input.charAt(i));
        }
       }
       System.out.println(sb.toString());
    sc.close();
    }
}