///******************************************** part 3 ****************************************************
class Professor extends UniversityEmployee implements Evaluatable {
    private int publishedPapers;
    public Professor(String employeeId, String fullName,
                     double baseSalary, int publishedPapers) {

        super(employeeId, fullName, baseSalary);

        this.publishedPapers = publishedPapers;
    }

    @Override
    public void evaluatePerformance(double score) {
        if (score < 0.0 || score > 100.0){
            throw new IllegalArgumentException ("You have an Error !" );
        }

    }



    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary() + (publishedPapers * 150.00) ;
    }

    @Override
    public void conductDuties() {
        System.out.println("Professor ["+ getEmployeeId() + "] is delivering advanced curriculum lectures and supervising graduate theses.");
    }

}