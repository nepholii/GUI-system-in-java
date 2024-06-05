package cw2;

/**
 * This represents a cw2.Lecturer class i.e. the child class of cw2.Teacher
 * 
 *  
 * 
 * @author (Nischay Poudel)
 * @version (1)
 */
public class Lecturer extends Teacher{
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //constructor first calls parent class constructor and then updates the class attributes
    public Lecturer(int teacherId,String teacherName,String address,String workingType,String employmentStatus,String department,int yearsOfExperience){
        super(teacherId,teacherName,address,workingType,employmentStatus);
        this.gradedScore = 0;
        this.yearsOfExperience = yearsOfExperience;
        this.hasGraded=false;
        this.department=department;

    }
    //getter method for class attributes which helps the user to get the class attributes value from both parent and child class
    public String getDepartment(){
        return this.department;
    }

    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }

    public int getGradedScore(){
        return this.gradedScore;
    }
    //getter method for hasGraded attribute and this has is instead of get because of boolean return type
    public boolean isHasGraded(){
        return this.hasGraded;
    }
    //setter method for workingHours which helps us to set new workingHours value

    public void setGradedScore(int gradedScore){
        this.gradedScore=gradedScore;
    }
    //method grade assignment grades according to your gradedScore if the given criteria is meet


    public void setDepartment(String department) {
        this.department = department;
    }

    public String gradeAssignment(int gradedScore, String department, int yearsOfExperience){
        if(yearsOfExperience>=5 && this.department.equals(department)){ /*Checks the validity to grade the assignment i.e. if the yearsOfExperience
            is greater than or equals to 5 and class attribute department should equal to department
            */
            this.gradedScore=gradedScore;
            hasGraded=true;
            if(gradedScore>100 || gradedScore<0){ //checks for invalid grade i.e. anything above 100 and below 0
                return "invalid grade";
            }
            else if(gradedScore>=70){ //prints your grade is A if the score is above or equals to 70
                return "your grade is A";
            }
            else if(gradedScore>=60){//prints your grade is B if the score is above or equals to 60
                return "your grade is B";
            }
            else if(gradedScore>=50){//prints your grade is C if the score is above or equals to 50
                return "your grade is C";
            }
            else if(gradedScore>=40){//prints your grade is D if the score is above or equals to 40
                return "your grade is D";
            }
            else if(gradedScore<40){//prints your grade is B if the score is below 40
                return "your grade is E";
            }

            //sets the class attribute gradedScore to new gradedScore

        }
        else{
            return "the teacher has not graded yet";
        }
        return "";
    }
    @Override
    public void display(){
        super.display();//calls the parent method display
        System.out.println(department);
        System.out.println(yearsOfExperience);
        if(hasGraded==true){//if hasGraded is true then only prints true
           System.out.println(this.gradedScore);
        }
        else{
            System.out.println("the score has not been graded yet");
        }

    }
}