 import java.util.Scanner;
 class Subscription {
    double monthlyCost;
    double serviceTax;
    double extraFeatureCost;
}
class PremiumSubscription extends Subscription {

    PremiumSubscription(double monthlyCost, double serviceTax, double extraFeatureCost) {
        this.monthlyCost = monthlyCost;
        this.serviceTax = serviceTax;
        this.extraFeatureCost = extraFeatureCost;
    }
    double calculateMonthlyCost() {
        return monthlyCost + serviceTax + extraFeatureCost;
    }
}
public class Inheritance1Neo{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double baseMonthlyCost = scanner.nextDouble();
        double serviceTax = scanner.nextDouble();
        double extraFeatureCost = scanner.nextDouble();

        PremiumSubscription p = new PremiumSubscription(baseMonthlyCost, serviceTax, extraFeatureCost);

        double total = p.calculateMonthlyCost();

        System.out.printf("Total Rs. %.2f", total);
        scanner.close();
    }
}