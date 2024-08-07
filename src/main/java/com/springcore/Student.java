package com.springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    
    // Constructor with parameters
    public Student(int studentId, String studentName, String studentAddress) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    
    // Default constructor
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }
    
    // Setter for studentId
    public void setStudentId(int studentId) {
    	System.out.println("Setting student id");
        this.studentId = studentId;
    }
    
    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }
    
    // Setter for studentName
    public void setStudentName(String studentName) {
    	System.out.println("Setting Student name");
        this.studentName = studentName;
    }
    
    // Getter for studentAddress
    public String getStudentAddress() {
        return studentAddress;
    }
    
    // Setter for studentAddress
    public void setStudentAddress(String studentAddress) {
    	System.out.println("Setting student address");
        this.studentAddress = studentAddress;
    }
    
    // Override toString method
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
    }
}
