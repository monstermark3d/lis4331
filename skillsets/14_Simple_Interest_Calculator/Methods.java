//
// Written by: Mark Trombly
//
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Methods
{

    static final Scanner sc = new Scanner(System.in);

    //create method without returning any value
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("\nDeveloper: Mark Trombly");
        System.out.println("Program performs the following functions:\n" +
        "1. Calculates amount of money saved for a period of years, at a specified interest rate (i.e., yearly, non-compounded);\n" +    
        "2. Returned amount is formatted in U.S. currency, and rounded to two decimal places.\n\n" +
        "***Note:*** Program checks for non-numeric values, as well as only integer values for years.\n");
    }

    public static double getPrincipal()
    {
        double principal = 0.0;

        System.out.print("\nCurrent principal: $");
        while (!sc.hasNextDouble())
        {
            System.out.println("Not valid number!\n");
            sc.next();
            System.out.print("Please try again. Enter principal: $");
        }
        principal = sc.nextDouble();

        return principal;
    }

    public static double getRate()
    {
        double rate = 0.0;

        System.out.print("\nInterest Rate (per year): ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Not valid number!\n");
            sc.next();
            System.out.print("Please try again. Enter interest rate: ");
        }
        rate = sc.nextDouble();
        rate = rate / 100;

        return rate;
    }

    public static int getTime()
    {
        int time = 0;

        System.out.print("\nTotal time (in years): ");
        while (!sc.hasNextInt())
        {
            System.out.println("Not valid integer!\n");
            sc.next();
            System.out.print("Please try again. Enter years: ");
        }
        time = sc.nextInt();

        return time;
    }

    public static void calculateInterest(double principal, double rate, int time)
    {
        double amount = 0.0;

        double futureDailyValue = 0.0;
        double totalDailyInterest = 0.0;

        double futureWeeklyValue = 0.0;
        double totalWeeklyInterest = 0.0;

        double futureMonthlyValue = 0.0;
        double totalMonthlyInterest = 0.0;

        double futureQuarterlyValue = 0.0;
        double totalQuarterlyInterest = 0.0;

        double futureYearlyValue = 0.0;
        double totalYearlyInterest = 0.0;

        amount = principal * (1 + rate * time);
        rate = rate * 100;

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("\n\n**********Simple Interest**********");
        System.out.println("\nYou will have saved " + nf.format(amount) + " in " + time + " years, at an interest rate of " + rate + "%");

        //compound interest
        rate = rate / 100;
        //daily
        futureDailyValue = principal * Math.pow(1 + (rate / 365), 365 * time);
        totalDailyInterest = futureDailyValue - principal;

        //weekly
        futureWeeklyValue = principal * Math.pow(1 + (rate / 52), 52 * time);
        totalWeeklyInterest = futureWeeklyValue - principal;

        //monthly
        futureMonthlyValue = principal * Math.pow(1 + (rate / 12), 12 * time);
        totalMonthlyInterest = futureMonthlyValue - principal;

        //quarterly
        futureQuarterlyValue = principal * Math.pow(1 + (rate / 4), 4 * time);
        totalQuarterlyInterest = futureQuarterlyValue - principal;

        //yearly
        futureYearlyValue = principal * Math.pow(1 + (rate / 1), 1 * time);
        totalYearlyInterest = futureYearlyValue - principal;

        rate = rate * 100;

        System.out.println("\n\n**********Compound Interest**********");
        System.out.println("\nDaily: ");
        System.out.println("You will have earned " + nf.format(totalDailyInterest) + " interest for a total return of: ");
        System.out.print("\t" + nf.format(futureDailyValue) + " in " + time + " years, at an interest rate of " + rate + "%\n");
        System.out.println("\nWeekly: ");
        System.out.println("You will have earned " + nf.format(totalWeeklyInterest) + " interest for a total return of: ");
        System.out.print("\t" + nf.format(futureWeeklyValue) + " in " + time + " years, at an interest rate of " + rate + "%\n");
        System.out.println("\nMonthly: ");
        System.out.println("You will have earned " + nf.format(totalMonthlyInterest) + " interest for a total return of: ");
        System.out.print("\t" + nf.format(futureMonthlyValue) + " in " + time + " years, at an interest rate of " + rate + "%\n");
        System.out.println("\nQuarterly: ");
        System.out.println("You will have earned " + nf.format(totalQuarterlyInterest) + " interest for a total return of: ");
        System.out.print("\t" + nf.format(futureQuarterlyValue) + " in " + time + " years, at an interest rate of " + rate + "%\n");
        System.out.println("\nYearly: ");
        System.out.println("You will have earned " + nf.format(totalYearlyInterest) + " interest for a total return of: ");
        System.out.print("\t" + nf.format(futureYearlyValue) + " in " + time + " years, at an interest rate of " + rate + "%\n");
    }
    
}