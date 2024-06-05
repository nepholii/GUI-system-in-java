/**
 * This represents a TeacherGUI class
 *
 *
 *
 * @author (Nischay Poudel)
 * @version (1)
 */
package cw2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TeacherGUI {
    ArrayList<Teacher> teacherGui=new ArrayList<>();//creating array list of Teacher
    private  JLabel teacherId = new JLabel("Teacher ID");//creating label as class attribute to reuse the label
    private  JLabel teacherName = new JLabel("Teacher Name");
    private  JLabel address = new JLabel("Address");
    private  JLabel workingType = new JLabel("Working Type");
    private  JLabel employmentStatus = new JLabel("Employment Status");
    private  JLabel department= new JLabel("Department");
    private  JLabel gradedScore = new JLabel("Graded Score ");
    private  JLabel yearsOfExperience = new JLabel("Years of Experience");
    private  JLabel workingHours=new JLabel("Working Hours");
    private  JLabel salary = new JLabel("Salary");
    private  JLabel specialization = new JLabel("Specialization");
    private  JLabel academicQualifications = new JLabel("Academic Qualifications");
    private  JLabel performanceIndex = new JLabel("Performance Index");
    private  JLabel newSalary = new JLabel("New Salary");

    private  JTextField teacherIdTextField = new JTextField();//creating text field  as class attribute to reuse the text field
    private  JTextField teacherNameTextField = new JTextField();
    private  JTextField addressTextField = new JTextField();
    private  JTextField workingTypeTextField = new JTextField();
    private  JTextField employmentStatusTextField = new JTextField();
    private  JTextField workingHoursTextField = new JTextField();
    private  JTextField salaryTextField = new JTextField();
    private  JTextField specializationTextField = new JTextField();
    private  JTextField academicQualificationsTextField = new JTextField();
    private  JTextField performanceIndexTextField = new JTextField();
    private  JTextField departmentTextField = new JTextField();

    private JTextField gradedScoreTextField = new JTextField();
    private JTextField yearsOfExperienceTextField = new JTextField();
    private JTextField newSalaryTextField = new JTextField();
    private JTextField newPerformanceIndexTextField = new JTextField();

    private final int RED = 255; // Red component
    private final int GREEN = 163; // Green component
    private final int BLUE = 26; // Blue component
    private  Color backgroundColor = new Color(RED, GREEN, BLUE);// Create a new Color object with the specified RGB values for the background color
    private  Border border = BorderFactory.createLineBorder(Color.black, 2);// Create a black line border with a thickness of 2 pixels
    private  Font boldFont = new Font("Arial", Font.BOLD, 20);
    private  Font mediumBoldFont = new Font("Arial", Font.BOLD, 17);
    private  Font smallBoldFont = new Font("Arial", Font.BOLD, 15);
    private  GridBagLayout layout = new GridBagLayout();// Create a new GridBagLayout object for layout management
    private GridBagConstraints constraints = new GridBagConstraints();// Create GridBagConstraints for GridBagLayout constraints
    /**
     * Represents a graphical user interface (GUI) for managing teachers, including adding, displaying, and removing tutors and lecturers.
     * The GUI provides functionalities to add, display, and remove tutors and lecturers from the system.
     * It also allows grading assignments, setting salaries, and clearing input fields.
     * The GUI consists of multiple frames and buttons for performing different operations related to teacher management.
     */
    public TeacherGUI() {
        JFrame home = new JFrame("TeacherGUI");
        home.setSize(900, 900);// Creating a new JFrame with the title "TeacherGUI" and set its size to 900x900 pixels
        JLabel head = new JLabel("Choose a button");// Creating a JLabel with the text "Choose a button" and set its font to boldFont
        JButton addLecturer = new JButton("Add Lecturer");
        JButton addTutor = new JButton("Add Tutor");
        JButton gradeAssignments = new JButton("Grade Assignment");
        JButton setSalary = new JButton("Set Salary");
        JButton displayTutor = new JButton("Display Tutor");
        JButton displayLecturer = new JButton("Display Lecturer");
        JButton removeTutor = new JButton("Remove Tutor");
        // Creating JButtons for various actions and set their fonts and focusability

        head.setFont(boldFont);
        addLecturer.setFont(boldFont);
        addLecturer.setFocusable(false);
        addTutor.setFont(boldFont);
        addTutor.setFocusable(false);
        gradeAssignments.setFont(smallBoldFont);
        gradeAssignments.setFocusable(false);
        setSalary.setFont(boldFont);
        setSalary.setFocusable(false);
        displayTutor.setFont(boldFont);
        displayTutor.setFocusable(false);
        displayLecturer.setFont(boldFont);
        displayLecturer.setFocusable(false);
        removeTutor.setFont(boldFont);
        removeTutor.setFocusable(false);
        constraints.insets = new Insets(10, 10, 10, 10);// Set insets for GridBagConstraints
        home.setLayout(layout);
        constraints.gridy = 0;//row
        constraints.gridx = 0;//column
        constraints.gridwidth = 3;
        head.setPreferredSize(new Dimension(170, 50));
        home.add(head, constraints);
        constraints.gridwidth = 1;// Set the grid position
        // Add JButtons to the JFrame with specified properties and constraints
        constraints.gridy = 1; //row
        addLecturer.setBackground(backgroundColor);
        addLecturer.setPreferredSize(new Dimension(200, 50));
        addLecturer.setBorder(border);
        home.add(addLecturer, constraints);
        constraints.gridx = 1;
        addTutor.setBackground(backgroundColor);
        addTutor.setPreferredSize(new Dimension(200, 50));
        addTutor.setBorder(border);
        home.add(addTutor, constraints);
        constraints.gridx = 2;
        gradeAssignments.setBackground(backgroundColor);
        gradeAssignments.setPreferredSize(new Dimension(200, 50));
        gradeAssignments.setBorder(border);
        home.add(gradeAssignments, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        setSalary.setBackground(backgroundColor);
        setSalary.setPreferredSize(new Dimension(200, 50));
        setSalary.setBorder(border);
        home.add(setSalary, constraints);
        constraints.gridx = 1;
        displayTutor.setBackground(backgroundColor);
        displayTutor.setPreferredSize(new Dimension(200, 50));
        displayTutor.setBorder(border);
        home.add(displayTutor, constraints);
        constraints.gridx = 2;
        displayLecturer.setBackground(backgroundColor);
        displayLecturer.setPreferredSize(new Dimension(200, 50));
        displayLecturer.setBorder(border);
        home.add(displayLecturer, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 3;//take 3 columns
        removeTutor.setBackground(backgroundColor);
        removeTutor.setPreferredSize(new Dimension(620, 50));
        removeTutor.setBorder(border);
        home.add(removeTutor, constraints);
        home.setVisible(true);   // Set JFrame visible and set default close operation
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addLecturer.addActionListener(new ActionListener() {// Add ActionListeners to the JButtons to perform actions when clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                addLecturer();
            }
        });
        addTutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTutor();
            }
        });
        gradeAssignments.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gradeAssignment();
            }
        });
        setSalary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSalary();
            }
        });
        removeTutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeTutor();
            }
        });
        displayTutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayTutor();
            }
        });
        displayLecturer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLecturer();
            }
        });
    }

    /**
     * Opens a JFrame window for adding a new lecturer to the system. The method displays input fields for entering the lecturer's details such as ID, name, address, working type, employment status, department, years of experience, graded score, and working hours.
     * It includes buttons for adding the lecturer, displaying all lecturers, and clearing the input fields.
     * Upon clicking the "Add Lecturer" button, the method validates the input fields, creates a new Lecturer object with the entered details, sets the graded score and working hours, and adds it to the teacherGui list.
     * If any numeric input fields contain invalid data, an error message is displayed.
     * The method also provides functionality to display all added lecturers and clear the input fields.
     */
    public void addLecturer() {// Method to create a GUI for adding a new lecturer
        JFrame main = new JFrame("Add Lecturer");// Create a new JFrame for adding lecturer information
        main.setSize(900, 900);
        main.setVisible(true);

        JButton addLecturer = new JButton("Add lecturer");// Create buttons for adding lecturer, displaying, and clearing fields
        JButton display = new JButton("Display");
        JButton clear = new JButton("Clear");

        constraints.insets = new Insets(10, 10, 10, 10); // Add components to the JFrame using GridBagLayout constraints
        // Set grid constraints for each component
        main.setLayout(layout);
        constraints.gridy = 0;//row
        constraints.gridx = 0;//column
        constraints.gridwidth=1;
        main.add(teacherId);
        constraints.gridx = 1;
        teacherIdTextField.setPreferredSize(new Dimension(200, 20));
        main.add(teacherIdTextField, constraints);
        constraints.gridy = 1;
        constraints.gridx = 0;
        main.add(teacherName, constraints);
        constraints.gridx = 1;
        teacherNameTextField.setPreferredSize(new Dimension(200, 20));
        main.add(teacherNameTextField, constraints);
        constraints.gridy = 2;
        constraints.gridx = 0;
        main.add(address, constraints);
        constraints.gridx = 1;
        addressTextField.setPreferredSize(new Dimension(200, 20));
        main.add(addressTextField, constraints);
        constraints.gridy = 3;
        constraints.gridx = 0;
        main.add(workingType, constraints);
        constraints.gridx = 1;
        workingTypeTextField.setPreferredSize(new Dimension(200, 20));
        main.add(workingTypeTextField, constraints);
        constraints.gridy = 4;
        constraints.gridx = 0;
        main.add(employmentStatus, constraints);
        constraints.gridx = 1;
        employmentStatusTextField.setPreferredSize(new Dimension(200, 20));
        main.add(employmentStatusTextField, constraints);
        constraints.gridy = 5;
        constraints.gridx = 0;

        main.add(department, constraints);
        constraints.gridx = 1;
        departmentTextField.setPreferredSize(new Dimension(200, 20));
        main.add(departmentTextField, constraints);
        constraints.gridy = 6;
        constraints.gridx = 0;
        main.add(yearsOfExperience, constraints);
        constraints.gridx = 1;
        yearsOfExperienceTextField.setPreferredSize(new Dimension(200, 20));
        main.add(yearsOfExperienceTextField, constraints);
        constraints.gridy = 7;
        constraints.gridx = 0;
        main.add(gradedScore,constraints);
        constraints.gridx = 1;
        gradedScoreTextField.setPreferredSize(new Dimension(200, 20));
        main.add(gradedScoreTextField,constraints);
        constraints.gridy = 8;
        constraints.gridx = 0;
        main.add(workingHours,constraints);
        constraints.gridx=1;
        workingHoursTextField.setPreferredSize(new Dimension(200, 20));
        main.add(workingHoursTextField,constraints);
        constraints.gridy = 9;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        addLecturer.setPreferredSize(new Dimension(370, 40));
        addLecturer.setBorder(border);
        addLecturer.setBackground(backgroundColor);
        addLecturer.setFont(mediumBoldFont);
        main.add(addLecturer, constraints);
        constraints.gridwidth = 1;
        constraints.gridy = 10;
        display.setPreferredSize(new Dimension(150, 40));
        display.setBorder(border);
        display.setBackground(backgroundColor);
        display.setFont(mediumBoldFont);
        main.add(display, constraints);
        constraints.gridx = 1;
        clear.setFont(mediumBoldFont);
        clear.setBackground(backgroundColor);
        clear.setBorder(border);
        clear.setPreferredSize(new Dimension(190, 40));
        main.add(clear, constraints);
        clear.addActionListener(new ActionListener() { // ActionListener for clearing fields when "Clear" button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();// Method to clear text fields

            }
        });
        display.addActionListener(new ActionListener() {// ActionListener for displaying lecturer information when "Display" button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLecturer();
            }
        });
        addLecturer.addActionListener(new ActionListener() {// ActionListener for adding a new lecturer when "Add lecturer" button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId_ = Integer.parseInt(teacherIdTextField.getText());// Retrieve and parse input from text fields
                    String teacherName_ = teacherNameTextField.getText();
                    String address_ = addressTextField.getText();
                    String workingType_ = workingTypeTextField.getText();
                    String employmentStatus_ = employmentStatusTextField.getText();
                    String department_ = departmentTextField.getText();
                    int yearsOfExperience_ = Integer.parseInt(yearsOfExperienceTextField.getText());
                    int gradedScore_ = Integer.parseInt(gradedScoreTextField.getText());
                    int workingHours_ = Integer.parseInt(workingHoursTextField.getText());

                    if (teacherName_.isEmpty() || address_.isEmpty() || workingType_.isEmpty() || employmentStatus_.isEmpty() || department_.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error: Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Stop execution if any field is empty
                        }


                    Lecturer newLecturer = new Lecturer(teacherId_, teacherName_, address_, workingType_,// Create a new Lecturer object with the provided information
                            employmentStatus_, department_, yearsOfExperience_);
                    newLecturer.setGradedScore(gradedScore_);
                    newLecturer.setWorkingHours(workingHours_);
                    teacherGui.add(newLecturer);// Add the new lecturer to the GUI
                    JOptionPane.showMessageDialog(null, "Lecturer added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                } catch (NumberFormatException ex) {
                    // Handle the case where a number parsing fails
                    JOptionPane.showMessageDialog(null, "Error: Please enter a valid number for teacher ID, years of experience,working hours or graded Score.");
                }
            }
        });

        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Set default close operation for the JFrame
    }

    /**
     * Opens a JFrame window for adding a new tutor to the system. The method displays input fields for entering the tutor's details such as ID, name, address, working type, employment status, working hours, salary, specialization, academic qualifications, and performance index.
     * It includes buttons for adding the tutor and clearing the input fields.
     * Upon clicking the "Add Tutor" button, the method validates the input fields, creates a new Tutor object with the entered details, and adds it to the teacherGui list.
     * If any numeric input fields contain invalid data, an error message is displayed.
     * The method also provides functionality to display all added tutors and clear the input fields.
     */
    public void addTutor() {
        JFrame main = new JFrame("Add Tutor");
        main.setSize(900, 900);
        main.setVisible(true);

        JButton addTutor = new JButton("Add Tutor");// Create buttons for adding tutor, displaying, and clearing fields
        JButton display = new JButton("Display");
        JButton clear = new JButton("Clear");

        constraints.insets = new Insets(10, 10, 10, 10);// Set insets for GridBagConstraints
        main.setLayout(layout);
        constraints.gridy = 0;//row
        constraints.gridx = 0;//column
        constraints.gridwidth=1;

        main.add(teacherId, constraints);
        constraints.gridx = 1;
        teacherIdTextField.setPreferredSize(new Dimension(200, 20));
        main.add(teacherIdTextField, constraints);// Add components to the JFrame using GridBagLayout constraints
        constraints.gridy = 1;// Set grid constraints for each component
        constraints.gridx = 0;
        main.add(teacherName, constraints);
        constraints.gridx = 1;
        teacherNameTextField.setPreferredSize(new Dimension(200, 20));
        main.add(teacherNameTextField, constraints);
        constraints.gridy = 2;
        constraints.gridx = 0;
        main.add(address, constraints);
        constraints.gridx = 1;
        addressTextField.setPreferredSize(new Dimension(200, 20));
        main.add(addressTextField, constraints);
        constraints.gridy = 3;
        constraints.gridx = 0;
        main.add(workingType, constraints);
        constraints.gridx = 1;
        workingTypeTextField.setPreferredSize(new Dimension(200, 20));
        main.add(workingTypeTextField, constraints);
        constraints.gridy = 4;
        constraints.gridx = 0;
        main.add(employmentStatus, constraints);
        constraints.gridx = 1;
        employmentStatusTextField.setPreferredSize(new Dimension(200, 20));
        main.add(employmentStatusTextField, constraints);
        constraints.gridy = 5;
        constraints.gridx = 0;
        main.add(workingHours, constraints);
        constraints.gridx = 1;
        workingHoursTextField.setPreferredSize(new Dimension(200, 20));
        main.add(workingHoursTextField, constraints);
        constraints.gridy = 6;
        constraints.gridx = 0;
        main.add(salary, constraints);
        constraints.gridx = 1;
        salaryTextField.setPreferredSize(new Dimension(200, 20));
        main.add(salaryTextField, constraints);
        constraints.gridy = 7;
        constraints.gridx = 0;
        main.add(specialization, constraints);
        constraints.gridx = 1;
        specializationTextField.setPreferredSize(new Dimension(200, 20));
        main.add(specializationTextField, constraints);
        constraints.gridy = 8;
        constraints.gridx = 0;
        main.add(academicQualifications, constraints);
        constraints.gridx = 1;
        academicQualificationsTextField.setPreferredSize(new Dimension(200, 20));
        main.add(academicQualificationsTextField, constraints);
        constraints.gridy = 9;
        constraints.gridx = 0;
        main.add(performanceIndex, constraints);
        constraints.gridx = 1;
        performanceIndexTextField.setPreferredSize(new Dimension(200, 20));
        main.add(performanceIndexTextField, constraints);
        constraints.gridy = 10;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        addTutor.setPreferredSize(new Dimension(370, 40));
        addTutor.setBackground(backgroundColor);
        addTutor.setFont(mediumBoldFont);
        addTutor.setBorder(border);
        main.add(addTutor, constraints);
        constraints.gridy = 11;
        constraints.gridwidth = 1;
        display.setPreferredSize(new Dimension(150, 40));
        display.setBorder(border);
        display.setBackground(backgroundColor);
        display.setFont(mediumBoldFont);
        main.add(display, constraints);
        constraints.gridx = 1;
        clear.setFont(mediumBoldFont);
        clear.setBackground(backgroundColor);
        clear.setBorder(border);
        clear.setPreferredSize(new Dimension(190, 40));
        main.add(clear, constraints);
        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// Set default close operation for the JFrame
        clear.addActionListener(new ActionListener() { // ActionListener for clearing fields when "Clear" button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }

        });
        display.addActionListener(new ActionListener() {// ActionListener for displaying tutor information when "Display" button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                displayTutor();
            }// Method to display tutor information
        });
        addTutor.addActionListener(new ActionListener() {// ActionListener for adding a new tutor when "Add tutor" button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId_ = Integer.parseInt(teacherIdTextField.getText());// Retrieve and parse input from text fields
                    String teacherName_ = teacherNameTextField.getText();
                    String address_ = addressTextField.getText();
                    String workingType_ = workingTypeTextField.getText();
                    String employmentStatus_ = employmentStatusTextField.getText();
                    int workingHours_ = Integer.parseInt(workingHoursTextField.getText());
                    double salary_ = Double.parseDouble(salaryTextField.getText());
                    String specialization_ = specializationTextField.getText();
                    String academicQualifications_ = academicQualificationsTextField.getText();
                    int performanceIndex_ = Integer.parseInt(performanceIndexTextField.getText());

                    if (teacherName_.isEmpty() || address_.isEmpty() || workingType_.isEmpty() || employmentStatus_.isEmpty() || specialization_.isEmpty() || academicQualifications_.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error: Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Stop execution if any field is empty
                    }


                    Tutor newTutor = new Tutor(teacherId_, teacherName_, address_, workingType_,
                            employmentStatus_, workingHours_, salary_,
                            specialization_, academicQualifications_, performanceIndex_);
                    teacherGui.add(newTutor);
                    JOptionPane.showMessageDialog(null, "Tutor added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clear();// Clear the fields
                }
                catch(NumberFormatException ex){// Handle the case where number parsing fails
                    JOptionPane.showMessageDialog(null, "Error: Please enter valid details in numeric fields", "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch (Exception ex) { // Handle other unexpected errors
                    JOptionPane.showMessageDialog(null, "Error: An unexpected error occurred", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    /**
     * Opens a JFrame window for grading assignments of lecturers. The method displays input fields for entering the lecturer's ID, department, years of experience, and graded score for the assignment.
     * It includes buttons for grading the assignment and clearing the input fields.
     * Upon clicking the "Grade Assignment" button, the method validates the input fields, retrieves the lecturer by ID, and grades the assignment based on the provided information.
     * If the lecturer is not found, an error message is displayed. If any numeric input fields contain invalid data, an error message is displayed.
     * The method provides customized cell rendering for the table displaying the graded assignment information.
     */
    public void gradeAssignment() {
        JFrame main = new JFrame("Grade Assignment");// Create a new JFrame for grading assignments
        main.setSize(900, 900);
        main.setVisible(true);

        JButton gradeAssignment = new JButton("Grade Assignment"); // Create buttons for grading assignment and clearing fields
        JButton clear = new JButton("Clear");
        constraints.insets = new Insets(10, 10, 10, 10);
        main.setLayout(layout);
        constraints.gridy = 0;//row
        constraints.gridx = 0;//column
        constraints.gridwidth=1;// reset grid width
        main.add(teacherId, constraints); // Add components to the JFrame using GridBagLayout constraints
        constraints.gridx = 1;
        teacherIdTextField.setPreferredSize(new Dimension(200, 20));
        main.add(teacherIdTextField, constraints);
        constraints.gridy = 1;
        constraints.gridx = 0;
        main.add(department, constraints);
        constraints.gridx = 1;
        departmentTextField.setPreferredSize(new Dimension(200, 20));
        main.add(departmentTextField, constraints);
        constraints.gridy = 2;
        constraints.gridx = 0;
        main.add(yearsOfExperience, constraints);
        constraints.gridx = 1;
        yearsOfExperienceTextField.setPreferredSize(new Dimension(200, 20));
        main.add(yearsOfExperienceTextField, constraints);
        constraints.gridy = 3;
        constraints.gridx = 0;
        main.add(gradedScore, constraints);
        constraints.gridx = 1;
        gradedScoreTextField.setPreferredSize(new Dimension(200, 20));
        main.add(gradedScoreTextField, constraints);
        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        gradeAssignment.setPreferredSize(new Dimension(370, 40));
        gradeAssignment.setBackground(backgroundColor);
        gradeAssignment.setFont(mediumBoldFont);
        gradeAssignment.setBorder(border);
        main.add(gradeAssignment, constraints);
        constraints.gridy = 5;
        clear.setFont(mediumBoldFont);
        clear.setBackground(backgroundColor);
        clear.setBorder(border);
        clear.setPreferredSize(new Dimension(190, 40));
        main.add(clear, constraints);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              clear();
            }
        });

        gradeAssignment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId_ = Integer.parseInt(teacherIdTextField.getText());// Retrieve and parse input from text fields
                    String department_ = departmentTextField.getText();
                    int yearsOfExperience_ = Integer.parseInt(yearsOfExperienceTextField.getText());
                    int gradedScore_ = Integer.parseInt(gradedScoreTextField.getText());

                    // Check for empty fields
                    if (department_.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error: Please fill in the department field.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Stop execution if department field is empty
                    }

                    Teacher teacher = getTeacherById(teacherId_); // Get the teacher by ID

                    if (teacher != null) {// If the teacher is found, grade the assignment and display the result
                        for (Teacher teach : teacherGui) {
                            // Check if the teacher is a Lecturer
                            if (teach instanceof Lecturer) {
                                Lecturer lecturer = (Lecturer) teach;
                                String grade_message=lecturer.gradeAssignment(gradedScore_, department_, yearsOfExperience_);
                                String message = "Teacher ID: " + teacherId_ + "\n" +
                                        "Graded Score: " + gradedScore_ + "\n" +
                                        "Department: " + department_ + "\n" +
                                        "Years of Experience: " + yearsOfExperience_ + "\n" +
                                        grade_message;
                                JOptionPane.showMessageDialog(null, message, "Assignment graded", JOptionPane.INFORMATION_MESSAGE);
                                clear();
                            }
                        }
                    } else {
                        // Display an error message if the teacher ID is invalid
                        JOptionPane.showMessageDialog(null, "Invalid Teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Please enter valid details in numeric fields", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    /**
     * Opens a window to set the salary and performance index for a tutor.
     * The user can input the teacher ID, new salary, and new performance index.
     * The method provides buttons to set the salary and clear the input fields.
     * An action listener is attached to the "Set Salary" button to perform the salary setting operation.
     */
    public void setSalary() {
        JFrame main = new JFrame("Set Salary");
        main.setSize(900, 900);
        main.setVisible(true);

        JLabel newPerformanceIndex = new JLabel("New Performance Index");



        JButton setSalary = new JButton("Set  Salary");
        JButton clear = new JButton("Clear");
        constraints.insets = new Insets(10, 10, 10, 10);
        main.setLayout(layout);
        constraints.gridy = 0;//row
        constraints.gridx = 0;//column
        constraints.gridwidth=1;

        main.add(teacherId, constraints);
        constraints.gridx = 1;
        teacherIdTextField.setPreferredSize(new Dimension(220, 25));
        main.add(teacherIdTextField, constraints);
        constraints.gridy = 1;
        constraints.gridx = 0;
        newSalary.setFont(smallBoldFont);
        main.add(newSalary,constraints);
        constraints.gridx = 1;
        newSalaryTextField.setPreferredSize(new Dimension(220, 25));
        main.add(newSalaryTextField,constraints);
        constraints.gridy = 2;
        constraints.gridx = 0;
        newPerformanceIndex.setFont(smallBoldFont);
        main.add(newPerformanceIndex,constraints);
        constraints.gridx = 1;
        newPerformanceIndexTextField.setPreferredSize(new Dimension(220, 25));
        main.add(newPerformanceIndexTextField, constraints);
        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.gridwidth=2;
        setSalary.setPreferredSize(new Dimension(420, 40));
        setSalary.setBackground(backgroundColor);
        setSalary.setFont(mediumBoldFont);
        setSalary.setBorder(border);
        main.add(setSalary,constraints);
        constraints.gridy=4;
        clear.setFont(mediumBoldFont);
        clear.setBackground(backgroundColor);
        clear.setBorder(border);
        clear.setPreferredSize(new Dimension(210, 40));
        main.add(clear, constraints);
        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               clear();
            }

        });
        /*
         * ActionListener for setting salary when "Set Salary" button is clicked
         */
        setSalary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId_ = Integer.parseInt(teacherIdTextField.getText()); // Parse input from text fields
                    int newSalary_ = Integer.parseInt(newSalaryTextField.getText());
                    int newPerformanceIndex_ = Integer.parseInt(newPerformanceIndexTextField.getText());

                    // Check for empty fields
                    if (newSalaryTextField.getText().isEmpty() || newPerformanceIndexTextField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error: Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Stop execution if any field is empty
                    }

                    Teacher teacher = getTeacherById(teacherId_); // Get the teacher by ID
                    if (teacher != null) {
                        for (Teacher teach : teacherGui) {
                            // Check if the teacher is a Tutor
                            if (teach instanceof Tutor) {
                                Tutor tutor = (Tutor) teach; // Check if the teacher is a Tutor
                                String error=tutor.setSalary(newSalary_, newPerformanceIndex_); // Set salary and performance index for the tutor
                                String message = "Teacher ID: " + teacherId_ + "\n" +
                                        "New Salary: " + newSalary_ + "\n" +
                                        "New Performance Index: " + newPerformanceIndex_ + "\n"// Display the result
                                        + error;
                                JOptionPane.showMessageDialog(null, message, "New salary updated ", JOptionPane.INFORMATION_MESSAGE);
                                clear(); // Clear the fields
                            }
                        }
                    } else { // Display an error message if the teacher ID is invalid
                        JOptionPane.showMessageDialog(null, "Invalid Teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {// Handle the case where number parsing fails
                    JOptionPane.showMessageDialog(null, "Error: Please enter valid details in numeric fields", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    /*
     * Method to handle the removal of a tutor from the system
     */
     public void removeTutor(){
         JFrame main = new JFrame("Remove Tutor");// Create and configure the main JFrame
         main.setSize(900, 900);
         main.setVisible(true);
         JTextField teacherIdTextField = new JTextField();
         JButton removeTutor = new JButton("Remove Tutor");
         JButton clear = new JButton("Clear");

         constraints.insets = new Insets(10, 10, 10, 10);// Create necessary components
         main.setLayout(layout);
         constraints.gridy = 0;//row
         constraints.gridx = 0;//column
         constraints.gridwidth=1;
         main.add(teacherId, constraints);// Add teacher ID label and text field
         constraints.gridx = 1;
         teacherIdTextField.setPreferredSize(new Dimension(250, 30));
         main.add(teacherIdTextField, constraints);
         constraints.gridy = 1;
         constraints.gridx = 0;
         constraints.gridwidth=2;
         removeTutor.setPreferredSize(new Dimension(370, 40));
         removeTutor.setBackground(backgroundColor);
         removeTutor.setFont(mediumBoldFont);
         removeTutor.setBorder(border);
         main.add(removeTutor,constraints);
         constraints.gridy=2;
         clear.setFont(mediumBoldFont);
         clear.setBackground(backgroundColor);
         clear.setBorder(border);
         clear.setPreferredSize(new Dimension(190, 40));
         main.add(clear, constraints);
         removeTutor.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     int teacherId_ = Integer.parseInt(teacherIdTextField.getText());// Get teacher ID from text field
                     Teacher teacher = getTeacherById(teacherId_);// Get the teacher by ID

                     if (teacher != null) {
                         if (teacher instanceof Tutor) {  // Check if the teacher is a Tutor
                             int choice = JOptionPane.showConfirmDialog(main, "You won't be able to retrieve the teacher details if you remove it. Do you want to continue?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);// Confirm removal
                             if (choice == JOptionPane.YES_OPTION) {
                                 Tutor tutor = (Tutor) teacher;
                                 tutor.removeTutor();
                                 teacherGui.remove(tutor);// Remove the tutor from the system
                                 JOptionPane.showMessageDialog(main, "Teacher ID: " + teacherId_, "Tutor removed successfully", JOptionPane.INFORMATION_MESSAGE);
                                 clear();
                             }
                         } else {// Display error if the teacher is not a tutor
                             JOptionPane.showMessageDialog(main, "Error: Teacher with ID " + teacherId_ + " is not a tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                         }
                     } else {// Display error if the teacher does not exist
                         JOptionPane.showMessageDialog(main, "Error: Teacher with ID " + teacherId_ + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                 } catch (NumberFormatException ex) {// Handle invalid teacher ID format
                     JOptionPane.showMessageDialog(main, "Error: Invalid teacher ID format.", "Error", JOptionPane.ERROR_MESSAGE);
                 }}
         });
         clear.addActionListener(new ActionListener() { // ActionListener for clear button
             @Override
             public void actionPerformed(ActionEvent e) {
                 clear();

             }

         });

     }

    /**
     * Displays the information of all tutors in the teacher GUI.
     * This method iterates through the list of teachers in the GUI, checks if they are instances of Tutor,
     * and then displays their information.
     * It utilizes a custom cell renderer for rendering the table cells.
     */

     public void displayTutor(){
         JFrame main = new JFrame("Display Tutor");
         main.setSize(900, 900);
         main.setVisible(true);


         String[] columnNames = {"Teacher ID", "Teacher Name", "Address", "Working Type", "Employment Status", "Working hours", "Salary", "Specialization", "Academic Qualifications", "Performance Index"};


         DefaultTableModel model = new DefaultTableModel(columnNames, 0);

         for (Teacher teach : teacherGui) {
             // Check if the teacher is a Tutor
             if (teach instanceof Tutor) {
                 Tutor tutor = (Tutor) teach;
                 // Extract data from the Tutor object
                 Object[] rowData = {
                         tutor.getTeacherId(),
                         tutor.getTeacherName(),
                         tutor.getAddress(),
                         tutor.getWorkingType(),
                         tutor.getEmploymentStatus(),
                         tutor.getWorkingHours(),
                         tutor.getSalary(),
                         tutor.getSpecialization(),
                         tutor.getAcademicQualifications(),
                         tutor.getPerformanceIndex()
                 };
                 // Add the data to the table model
                 model.addRow(rowData);
             }
         }

         JTable table = new JTable(model);
         setCustomCellRenderer(table);

         // Set custom header renderer
         setCustomHeaderRenderer(table);

         // Adjust row height
         table.setRowHeight(30);
         main.add(new JScrollPane(table));
         main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * Displays the information of all lecturers in the teacher GUI.
     * This method iterates through the list of teachers in the GUI, checks if they are instances of Lecturer,
     * and then displays their information.
     * It utilizes a custom cell renderer for rendering the table cells.
     */
    public void displayLecturer(){

        JFrame main = new JFrame("Display Lecturer");
        main.setSize(900, 900);
        main.setVisible(true);


        String[] columnNames = {"Teacher ID", "Teacher Name", "Address", "Working Type", "Employment Status", "Department", "Years Of Experience", "Graded Score", "Working hours"};

        // Create a default table model
        DefaultTableModel model = new DefaultTableModel(columnNames, 0); // 0 for initial row count

       // Iterate through the list of teachers
        for (Teacher teach : teacherGui) {
            // Check if the teacher is a cw2.Lecturer
            if (teach instanceof Lecturer) {
                Lecturer lecturer = (Lecturer) teach;
                // Extract data from the cw2.Lecturer object
                Object[] rowData = {
                        lecturer.getTeacherId(),
                        lecturer.getTeacherName(),
                        lecturer.getAddress(),
                        lecturer.getWorkingType(),
                        lecturer.getEmploymentStatus(),
                        lecturer.getDepartment(),
                        lecturer.getYearsOfExperience(),
                        lecturer.getGradedScore(),
                        lecturer.getWorkingHours()
                };
                // Add the data to the table model
                model.addRow(rowData);
            }
        }
        JTable table = new JTable(model);
        setCustomCellRenderer(table);

        // Set custom header renderer
        setCustomHeaderRenderer(table);

        // Adjust row height
        table.setRowHeight(30);

        main.add(new JScrollPane(table));


        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /*
     * Method to clear all text fields in the GUI
     */
    public void clear(){// Clearing text fields
        teacherIdTextField.setText("");
        teacherNameTextField.setText("");
        addressTextField.setText("");
        workingTypeTextField.setText("");
        employmentStatusTextField.setText("");
        workingHoursTextField.setText("");
        salaryTextField.setText("");
        specializationTextField.setText("");
        academicQualificationsTextField.setText("");
        performanceIndexTextField.setText("");
        departmentTextField.setText("");
        gradedScoreTextField.setText("");
        yearsOfExperienceTextField.setText("");
        newSalaryTextField.setText("");
        newPerformanceIndexTextField.setText("");


    }
    /**
     * Sets a custom cell renderer for a JTable.
     * This renderer customizes the appearance of cells in the table.
     */
    private  void setCustomCellRenderer(JTable table) {
        table.setDefaultRenderer(Object.class, (table1, value, isSelected, hasFocus, row, column) -> {
            JLabel label = new JLabel();
            // Customize cell rendering here
            label.setForeground(Color.red);
            label.setFont(smallBoldFont);
            label.setBorder(border);
            label.setText((value == null) ? "" : value.toString());
            return label;
        });
    }
    /**
     * Sets a custom head renderer for a JTable.
     * This renderer customizes the appearance of head in the table.
     */
    private  void setCustomHeaderRenderer(JTable table) {
        table.getTableHeader().setDefaultRenderer((tableHeader, value, isSelected, hasFocus, row, column) -> {
            JLabel label = new JLabel();
            // Customize header rendering here
            label.setForeground(Color.black);// Set text color to black
            label.setBackground(Color.black);
            label.setFont(smallBoldFont);
            label.setText((value == null) ? "" : value.toString());
            return label;
        });
    }
    /**
     * Retrieves a teacher object from the teacherGui list based on the provided teacher ID.
     * @param teacherId The ID of the teacher to search for.
     * @return The teacher object if found, or null if not found.
     */
    public Teacher getTeacherById(int teacherId) {
        // Iterate through the list to find the teacher with the specified ID
        for (Teacher teacher : teacherGui) {
            if (teacher.getTeacherId()==teacherId) {
                return teacher; // Return the teacher object if found
            }
        }
        return null; // Return null if teacher with specified ID is not found
    }
    /**
     * The main method of the application.
     * This method is the entry point of the program.
     * It initializes a new instance of the TeacherGUI class, which launches the GUI interface.
     * @param args Command-line arguments (not used in this application).
     */
    public static void main (String[]args){
            //sth
            new TeacherGUI();
        }
}
