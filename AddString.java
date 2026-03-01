import java.util.Scanner;

class AddString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        System.out.println(sb.toString());
    sc.close();
    }}