class StrPalindrome{
public static void main(String[] args){
    String str = "madam";
    StringBuffer sb = new StringBuffer(str);
sb.reverse();
if(str.equals(sb.toString())){
    System.out.println("The String is Palindrome!");
}else{
    System.out.println("The String is not Palindrome");
}
}
}