public class FinancialForecasting {

    public static double futureValue(double P, double r, int n) {
        if (n == 0) {
            return P;
        }
        return (1 + r) * futureValue(P, r, n - 1);
    }
    public static void main(String[] args) {
        double currentValue = 1000.0;
        double growthRate = 0.05;
        int years = 10;

        double predictedValue = futureValue(currentValue, growthRate, years);
        System.out.println("The predicted future value after " + years + " years is: " + predictedValue);
    }
}
