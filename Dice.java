import java.util.Scanner;
import java.util.Random;
public class Dice {

    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Random ra = new Random();
int numOfDice;
int total = 0;
System.out.println("Enter no. of dice to roll: ");
numOfDice = sc.nextInt();
if(numOfDice > 0){
    for(int i=0;i<numOfDice;i++){
        int roll = ra.nextInt(1,7);
        System.out.println("You rolled: " + roll);
        total += roll;
    }
    System.out.println("Total: " + total);
    }
    else{
        System.out.println("no. of dice must be greater than 0.");
    }
    sc.close();
}
}