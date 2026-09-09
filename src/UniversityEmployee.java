//********************************************* Part 1 *********************************
abstract class UniversityEmployee implements Evaluatable {
    private String employeeId;
    private String fullName;
    private double baseSalary;

    //****************************************************************
    public UniversityEmployee(String employeeId, String fullName, double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException(" Base salary cannot be negative ");
        }
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.baseSalary = baseSalary;

    }

    //********************************************************************************************
    public String getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //*******************************************************
    public void displayProfile() {
        System.out.println("Full name is : " + fullName);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Base Salary = " + baseSalary);
    }

    //*********************************************************
    public abstract double calculateMonthlySalary();

    public abstract void conductDuties();

//*********************************************************************
@Override
public void evaluatePerformance(double score) {
if (score < 0.0 || score > 100.0){
    throw new IllegalArgumentException ("You have an Error !" );
       }


}


}