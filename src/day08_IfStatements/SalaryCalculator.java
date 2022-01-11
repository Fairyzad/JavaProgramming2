package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50,
            weeklyHours = 45;

        double stateTaxRate = 6.5,
                federalTax =26.2;

        //----------------------------------
        int salaryBeforeTax = hourlyRate *  weeklyHours* 52; //salary is equal to one week's salary *52
        double stateTax = salaryBeforeTax * stateTaxRate/100;
        double federalTaxRate = salaryBeforeTax * federalTax/100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is  $" + salaryBeforeTax);
        System.out.println("State tax = $" + stateTax);
        System.out.println("federal tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("salaryAfterTax= $" + salaryAfterTax);


    }
}
