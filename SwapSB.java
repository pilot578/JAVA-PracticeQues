public class SwapSB {
    public static void main(String[] args){
    StringBuffer sb = new StringBuffer("Yash");
char first = sb.charAt(0);
char last = sb.charAt((sb.length()-1));
sb.setCharAt(0,last);
sb.setCharAt(sb.length()-1, first);
System.out.println(sb);
    }}