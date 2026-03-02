 //Extract → Reverse → Replace
 public class ReverseSB {
     public static void main(String[] args){
 StringBuilder sb = new StringBuilder("abcder");
  int start = 0;
  int end = 4; //exclusive
  String sub = sb.substring(start, end); //substring method
 String reverse = new StringBuilder(sub).reverse().toString(); //reversesub(stringBuilder) then conevrt to string
 sb.replace(start,end,reverse);
 System.out.println(sb);
     }
 }

//2 POINTE SWAP

public class REVERSESB {
    public static void main(String[] args){
StringBuilder sb = new StringBuilder("abcder");
int left = 0;
int right = 4;
char temp = sb.charAt(left);
sb.setCharAt(left, sb.charAt(right));
sb.setCharAt(right, temp);
left++;
right--;
System.out.println(sb);
    }}

