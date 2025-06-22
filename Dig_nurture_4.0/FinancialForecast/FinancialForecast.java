// FinancialForecast.java
public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + growthRate) * forecastValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0; // Rs. 10,000
        double annualGrowthRate = 0.10; // 10%
        int forecastYears = 5;

        double futureValue = forecastValue(presentValue, annualGrowthRate, forecastYears);

        System.out.printf("Future Value after %d years: ₹%.2f%n", forecastYears, futureValue);
    }

    public static double forecastValueIterative(double presentValue, double growthRate, int years) {
        double futureValue = presentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
