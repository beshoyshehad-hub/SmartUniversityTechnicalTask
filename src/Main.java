import java.io.File;

public class Main {
    public static void main(String[] args) {
        AcademicAdvisor A1 = new AcademicAdvisor("123", "Besho Shahad", 4);

        try {
            A1.setAssignedStudents(75);
        } catch (InvalidAdvisingLoadException e) {
            System.out.println("Invalid Error! " + e.getMessage());
        }
        //**************************************************************************\
        UniversityEmployee[] E = new UniversityEmployee[4];
        E[0] = new Administrator("123", "Beshoy Shahad", 20.5, 2.4);
        E[1] = new Administrator("789", "Tony Mina", 789, 1.2);
        E[2] = new Professor("112", "Mark Emad", 451, 55);
        E[3] = new Professor("897", " Kero Fady", 461.5, 70);

        //***********************************************invoke_method *********************


        double totalPayroll = 0;

        for (int i = 0; i < E.length; i++) {

            E[i].displayProfile();

            double salary = E[i].calculateMonthlySalary();

            System.out.println("Net Salary at the month: " + salary + " $");

            totalPayroll += salary;

            E[i].conductDuties();

            if (E[i] instanceof Evaluatable) {
                try {
                    Evaluatable employee = (Evaluatable) E[i];
                    employee.evaluatePerformance(94.5);
                } catch (IllegalArgumentException e) {
                    System.out.println("Evaluation Error: " + e.getMessage());
                }
            }
        }

        System.out.println(
                "Combined Total Institutional Monthly Payroll: " + totalPayroll + " $"
        );


    }
}