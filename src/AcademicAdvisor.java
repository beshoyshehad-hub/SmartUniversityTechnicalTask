//**************************************************** Part 2 *********************************************
public class AcademicAdvisor {
    private String advisorId ;
    private String department;
    private int assignedStudents ;
    private  boolean isActive;
    //**************************************************************************
    public  AcademicAdvisor (String advisorId ,String department,int assignedStudents )throws  InvalidAdvisingLoadException {
        isActive = true;
        this.advisorId=advisorId;
        this.assignedStudents=assignedStudents;
        this.department=department;
    }
//***************************************************************************************************************

    public String getAdvisorId() {
        return advisorId;
    }
    public String getDepartment (){
        return department ;
    }
    public int getAssignedStudents(){
        return assignedStudents ;
    }
    public boolean getisActive(){
        return isActive ;
    }
    //**************************************************************************
    public void setAssignedStudents(int count) throws InvalidAdvisingLoadException  {
        if (count<1 || count > 50){
throw new InvalidAdvisingLoadException("Assigned students count  "+ count + " must be between 1 and 50.");
        }
            this.assignedStudents = count;
    }
    public void setActive(boolean active){
        this.isActive=active;
    }



    }


