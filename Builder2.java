import java.util.Scanner;

class Builder2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
String original = sc.nextLine();
String target = sc.nextLine();
String replacement = sc.nextLine();

StringBuilder sb = new StringBuilder(original);
int index = sb.indexOf(target);

while(index != -1){
    sb.replace(index, index + target.length(), replacement);
    index = sb.indexOf(target, index + replacement.length());
}

System.out.println(original);
System.out.println(sb.toString());

sc.close();
}
}