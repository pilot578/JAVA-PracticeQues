import java.util.Scanner;
class Employee{
    Scanner sc = new Scanner(System.in);
    int empID;
    String name;
    double bal;
    Employee(){}
    Employee(int empID, String name, double bal){
        this.empID = empID;
        this.name = name;
        this.bal = bal;
    }
    void getData(){
        System.out.println("Enter ID: ");
        empID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter balance: ");
        bal = sc.nextDouble();
    }
    void deposit(double x){
        bal += x;
        System.out.println( x + " added to " + empID);
    }
    void withdraw(double x){
        if(x>bal){
            System.out.println("Insufficient");
        }
        else{
            bal -= x;
            System.out.println(x + " withdrawn from " + empID);
        }
    }
    void display(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee name: " + name);
        System.out.println("Employee balance: " + bal);
    }
}
class TestEmployee{
    public static void main(String[] args){
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        obj1.getData();
        obj2.getData();
        obj1.deposit(1000);
        obj2.withdraw(2000);
        obj1.display();
        obj2.display(); 
    }
}