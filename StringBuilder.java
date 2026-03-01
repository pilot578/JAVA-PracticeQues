import java.util.Scanner;

class SB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstString = sc.nextLine();
        String secondString = sc.nextLine();

        StringBuilder result = new StringBuilder();

        String combined = firstString + secondString;

        for (int i = 0; i < combined.length(); i++) {
            char ch = combined.charAt(i);

            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());

        sc.close();
    }
}