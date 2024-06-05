package cw2;

/**
 * This represents a Tutor class i.e. the child class of cw2.Teacher
 * 
 *  
 * 
 * @author (Nischay Poudel)
 * @version (1)
 */
public class Tutor extends Teacher{//creates a child class of cw2.Teacher named tutor
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    //constructor cw2.Tutor first calls parent class constructor and then calls parent class method setWorkingHours
    public Tutor(int teacherId,String teacherName,String address,String workingType,String employmentStatus,int workingHours,double salary,
    String specialization,String academicQualifications,int performanceIndex){
        super(teacherId,teacherName,address,workingType,employmentStatus);
        super.setWorkingHours(workingHours);
        //updating class attributes with respective values
        this.salary=salary;
        this.specialization=specialization;
        this.academicQualifications=academicQualifications;
        this.performanceIndex=performanceIndex;
        this.isCertified=false;
    }

    /*getter methods for class attributes getSalary,getSpecialization,getAcademicQualification,
     * getPerformanceIndex,hasIsCertified
    */
    public double getSalary(){
        return this.salary;
    }

    public String getSpecialization(){
        return this.specialization;
    }

    public String getAcademicQualifications(){
        return  this.academicQualifications;
    }

    public int getPerformanceIndex(){
        return this.performanceIndex;
    }
    
    public boolean hasIsCertified(){
        return this.isCertified;
    }
    
    //method to set salary 

    public String setSalary(double newSalary,int performanceIndex){
        if (performanceIndex>=5 && super.getWorkingHours()>20){//checks the criteria i.e. valid performance index and workingHours
            //here parent class method is called inorder to get the value of workingHours
            if(performanceIndex<8){
                this.salary=newSalary+(0.05*newSalary);
            }
            else if(performanceIndex<=9){
                this.salary=newSalary+(0.10*newSalary);
            }
            else if(performanceIndex == 10){
                this.salary=newSalary+(0.20*newSalary);
            }
            this.isCertified=true;
        }
        else{
            return("salary has not been approved");
        }
        this.performanceIndex=performanceIndex;//updating class attribute performance index with new value
        return ("salary approved");
    }
    public void removeTutor(){//method to reset class attribute if isCertified is false
        if(isCertified==false){
            this.salary=0.0;
            this.specialization="";
            this.academicQualifications="";
            this.performanceIndex=0;
            this.isCertified=false;
        }
        else{
            System.out.print("cannot remove the tutor cause isCertified is true");
        }
    }
    @Override
    public void display(){
        if(isCertified==false){
        super.display();
    }
    else {
        super.display();
        System.out.println(salary);
        System.out.println(specialization);
        System.out.println(academicQualifications);
        System.out.println(performanceIndex);
    }
    }
    }