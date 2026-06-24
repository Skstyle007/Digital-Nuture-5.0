import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double currentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive call
        return futureValue(currentValue * (1 + growthRate / 100), growthRate, years - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Value: ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double result = futureValue(currentValue, growthRate, years);

        System.out.printf("\nPredicted Future Value after %d years = %.2f\n",
                years, result);

        sc.close();
    }
}