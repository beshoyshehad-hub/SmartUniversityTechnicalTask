//******************************************* part 3 *******************************************
public class Administrator extends UniversityEmployee implements Evaluatable {
    private double overtimeHours;

    public Administrator(String employeeId, String fullName, double baseSalary ,double overtimeHours) {
        super(employeeId, fullName, baseSalary );
        this.overtimeHours=overtimeHours;
    }
//******************************************************************************************************

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary() + (overtimeHours * 45.00);
    }

    @Override
    public void conductDuties() {
        System.out.println("Administrator " + getEmployeeId() + " is managing institutional budgets and admissions workflows.");
    }

    @Override
    public void evaluatePerformance(double score) {
        if (score < 0.0 || score > 100.0){
            throw new IllegalArgumentException ("You have an Error !" );
        }

    }


    //*****************************************************************

}