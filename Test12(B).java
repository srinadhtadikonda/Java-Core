import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        // ----------- SIMPLE INTEREST -----------
        double siTotal = (p * t * r) / 100;
        double siPerYear = (p * r) / 100;
        double siPerMonth = siPerYear / 12;

        System.out.println("\n---- Simple Interest ----");
        System.out.println("Total SI = " + siTotal);
        System.out.println("SI Per Year = " + siPerYear);
        System.out.println("SI Per Month = " + siPerMonth);

        // ----------- COMPOUND INTEREST (Yearly) -----------
        double amountYearly = p * Math.pow(1 + r / 100, t);
        double ciYearly = amountYearly - p;

        // ----------- COMPOUND INTEREST (Monthly) -----------
        double amountMonthly = p * Math.pow(1 + r / (12 * 100), 12 * t);
        double ciMonthly = amountMonthly - p;

        System.out.println("\n---- Compound Interest ----");
        System.out.println("Total CI (Yearly Compounding) = " + ciYearly);
        System.out.println("Total CI (Monthly Compounding) = " + ciMonthly);

        sc.close();
    }
}

