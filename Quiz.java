import java.util.Scanner;
public class Quiz {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String[] ques = {"What is aviation?",
                     "When 1st aeroplane was invented",
                    "who was first Indian pilot?"};
String[][] options = {{"1. About aeroplane", "2. About motorcycle", "3. About ships"},
                      {"1. 1903", "2. 1905", "3. 1910", "4. 19920"}, 
                      {"1. JRD Tata", "2. Orville Wright", "3. Rakhi Banot", "4. Kalpana Chawla"}};
int[] ans = {1, 1, 1};  
int score = 0;
int guess;
System.out.println("Welcome to Java Quiz Game!");
for(int i=0;i<ques.length;i++){
    System.out.println(ques[i]);
    for(String option : options[i]){
        System.out.println(option);
    }
    System.out.print("Enter your guess");
guess = sc.nextInt();
if(guess == ans[i]){
System.out.println("CORRECT!");
score++;
}
else{
    System.out.println("WRONG!");
}
}
System.out.println("Your final score is: " + score);
sc.close();             
    }  
}
