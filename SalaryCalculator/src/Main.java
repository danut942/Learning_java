import java.util.Scanner;

public class Main {

    public static double SalaryCalculatorPerWeek (double numberOfHoursPerWeek,double howMuchEmpMakerPerHour, int vacationDays){
        if(numberOfHoursPerWeek < 0){
            return -1;
        }

        if (howMuchEmpMakerPerHour < 0){
            return -1;
        }

       double grossSalary = (numberOfHoursPerWeek - vacationDays * 8) * howMuchEmpMakerPerHour;
       return  grossSalary;
    }

    public static void main(String[] args) {

        double weeklySalary = SalaryCalculatorPerWeek(40,10,0);
        System.out.println("Employee makes " + weeklySalary + " per week");
        weeklySalary = SalaryCalculatorPerWeek(40,10,1);
        System.out.println("Employee makes " + weeklySalary + " per week");
        weeklySalary = SalaryCalculatorPerWeek(40,10,2);
        System.out.println("Employee makes " + weeklySalary + " per week");

    }
}
