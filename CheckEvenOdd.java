//EVEN ODD NUMBERi
import java.util.Scanner;
class CheckEvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
//  //BANK PROGRAM
// import java.util.Scanner;
// class Main {
//     static double balance = 1000;
//     static void Balance(){
//         System.out.println("Your balance: " + balance);
//     }
//     static void Deposit(double amount){
//         balance += amount;
//         System.out.println("Deposited: " + amount);
//     }
//     static void withdraw(double amount){
//         if(amount>balance){
//             System.out.println("Insufficient balance");
//         }
//         else{
//             balance -= amount;
//             System.out.println("Withdrawn: ");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int choice = 0;
//         while(choice <=4){
//         System.out.println("BANK PROGRAM");
//         System.out.println("1. Balance");
//         System.out.println("2. Deposit");
//         System.out.println("3. Withdraw");
//         System.out.println("4. Exit");
//         System.out.println("Enter number(1-4): ");
//         choice = sc.nextInt();
//         switch(choice){
//             case 1: Balance(); break;
//                 case 2: System.out.println("Enter amount: ");
//                 Deposit(sc.nextDouble());break;
//                     case 3: System.out.println("Enter amount: ");
//                     withdraw(sc.nextDouble());break;
//                         case 4:System.out.println("Thankyou for using the bank!");break;
//                         default:
//                         System.out.println("Invalid choice");
//         }
//     }
//     sc.close();
//     }
// }