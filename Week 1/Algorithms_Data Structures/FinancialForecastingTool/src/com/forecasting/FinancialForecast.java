package com.forecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double currentValue, double rate, int years) 
    {
        // Base case: after 0 years, value remains the same
        if (years == 0) 
        {
            return currentValue;
        }
        // Recursive case
        return futureValueRecursive(currentValue, rate, years - 1) * (1 + rate);
    }

    // Optimized version using memoization
    public static double futureValueMemoized(double currentValue, double rate, int years, Double[] memo) 
    {
        if (years == 0) 
        {
            return currentValue;
        }

        if (memo[years] != null) 
        {
            return memo[years];
        }

        memo[years] = futureValueMemoized(currentValue, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) 
    {
        double initialValue = 10000;   // ₹10,000
        double growthRate = 0.08;      // 8% growth
        int years = 5;

        // Simple recursive
        double resultRecursive = futureValueRecursive(initialValue, growthRate, years);
        System.out.printf("Future value after %d years (recursive): ₹%.2f\n", years, resultRecursive);

        // Memoized recursive
        Double[] memo = new Double[years + 1];
        double resultMemoized = futureValueMemoized(initialValue, growthRate, years, memo);
        System.out.printf("Future value after %d years (memoized): ₹%.2f\n", years, resultMemoized);
    }
}
