import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //String[] fruits = {"apple", "orange", "pineapple"};
       // System.out.println(fruits[2]);
        //int numOfFruits = fruits.length;
       // System.out.println(numOfFruits);
//for(int i=0;i<fruits.length;i++){
  //  System.out.println(fruits[i]);
//}
// for(String fruit : fruits){
//     System.out.println(fruit);
// }
// Arrays.sort(fruits);
// System.out.println(fruits);
// Arrays.fill(fruits, "pineapple");
// for(String fruit : fruits){
//     System.out.println(fruit);
// }

Scanner sc = new Scanner(System.in);
String foods[];
int size;
System.out.println("What no. of food you want?");
size = sc.nextInt();
sc.nextLine();
foods = new String[size];
for(int i=0;i<foods.length;i++){
    System.out.println("Enter a food:");
    foods[i] = sc.nextLine();
}
for(String food: foods){
    System.out.println(food);
}
}}
