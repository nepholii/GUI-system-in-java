package cw2;

/**
 * This represents a Teacher Class, functioning as a superclass. It allows us to retrieve information,
 * update details, and showcase the information.
 *  
 * 
 * @author (Nischay Poudel)
 * @version (1)
 */
class Teacher{
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    // we created a constructor that updates the class attributes
    public Teacher(int teacherId,String teacherName,String address,String workingType,String employmentStatus){  
        this.teacherName=teacherName;
        this.teacherId=teacherId;
        this.address=address;
        this.workingType=workingType;
        this.employmentStatus=employmentStatus;
    }
    /*getter method for class attributes which helps the user to get the class attributes value from both parent and child class but mainly child class
     * Here getter method for attributes:teacherId,teacherName,address,workingType,employmentStatus,workingHours is made
     */
    public int getTeacherId(){
        return teacherId;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public String getAddress(){
        return address;
    }

    public String getWorkingType(){
        return workingType;
    }

    public String getEmploymentStatus(){
        return employmentStatus;
    }

    public int getWorkingHours(){
        return workingHours;
    }
    //setter method for workingHours which helps us to set new workingHours value
    public void setWorkingHours(int workingHours){
        this.workingHours=workingHours;
    }
    //display method that helps us to display the class attributes
    public void display(){
        System.out.println(teacherId);
        System.out.println(teacherName);
        System.out.println(address);
        System.out.println(workingType);
        System.out.println(employmentStatus);
        //if the workingHours is not assigned we print respective message else we display the workingHours
        if(workingHours<=0){
            System.out.println("no working hour assigned");
        }
        else{System.out.println(workingHours);
        }
    }
}