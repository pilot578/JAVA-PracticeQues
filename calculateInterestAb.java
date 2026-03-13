
abstract class Account{
    String accountHolder;
    double principalAmount;

    Account(String accountHolder,double principalAmount){
        this.accountHolder=accountHolder;
        this.principalAmount=principalAmount;
    }

    abstract double calculateInterest();
}

class FixedDeposit extends Account{
    int duration;
    double rate;

    FixedDeposit(String name,double principal,int duration,double rate){
        super(name,principal);
        this.duration=duration;
        this.rate=rate;
    }

    double calculateInterest(){
        return (principalAmount*duration*rate)/100;
    }
}

class RecurringDeposit extends Account{
    int monthlyDeposit;
    int duration;
    double rate;

    RecurringDeposit(String name,double principal,int monthlyDeposit,int duration,double rate){
        super(name,principal);
        this.monthlyDeposit=monthlyDeposit;
        this.duration=duration;
        this.rate=rate;
    }

    double calculateInterest(){
        double maturityAmount = monthlyDeposit*duration;
        return (maturityAmount*duration*rate)/(12*100);
    }
}
class calculateInterestAb{
    public static void main(String[] args){

        FixedDeposit fd = new FixedDeposit("Rahul", 50000, 2, 6.5);
        double fdInterest = fd.calculateInterest();
        System.out.println("Account Holder: " + fd.accountHolder);
        System.out.println("Fixed Deposit Interest: " + fdInterest);

        System.out.println();

        RecurringDeposit rd = new RecurringDeposit("Aman", 0, 2000, 12, 5.5);
        double rdInterest = rd.calculateInterest();
        System.out.println("Account Holder: " + rd.accountHolder);
        System.out.println("Recurring Deposit Interest: " + rdInterest);
    }
}

